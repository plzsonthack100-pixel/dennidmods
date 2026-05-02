package net.dennid.dennidmod.item;


import net.dennid.dennidmod.OTJS.Curses;
import net.dennid.dennidmod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class ChiselItem extends Item {
    public static int i = 100;
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    Blocks.DIAMOND_BLOCK, Blocks.AIR,
                    Blocks.NETHERITE_BLOCK, Blocks.AIR,
                    Blocks.GOLD_BLOCK, Blocks.AIR,
                    Blocks.DIRT, Blocks.AIR,
                    Blocks.GRASS_BLOCK, Blocks.AIR


    );

    public ChiselItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        World world = context.getWorld();
        Block block = world.getBlockState(context.getBlockPos()).getBlock();
        if(CHISEL_MAP.containsKey(block)){
            if(!world.isClient){
                world.setBlockState(context.getBlockPos(), CHISEL_MAP.get(block).getDefaultState());
                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                if(block == Blocks.DIAMOND_BLOCK){
                    PlayerEntity a = context.getPlayer();
                    i = i+60;
                    Curses.o(a);

                }
                if(block == Blocks.NETHERITE_BLOCK){
                    PlayerEntity a = context.getPlayer();
                    i = i+100;
                    Curses.o(a);
                }
                if(block == Blocks.GOLD_BLOCK){
                    PlayerEntity a = context.getPlayer();
                    i = i+30;
                    Curses.o(a);

                }

                if(block == Blocks.GRASS_BLOCK){
                    PlayerEntity a = context.getPlayer();
                    i = i-40;
                    Curses.o(a);

                }
                if(block == Blocks.DIRT){
                    PlayerEntity a = context.getPlayer();
                    i = i-40;
                    Curses.o(a);

                }



            }




        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.dennidmods.ChiselItem.tooltipsift"));
            tooltip.add(Text.translatable("tooltip.dennidmods.ChiselItem.tooltipsifts"));

        }else{
            tooltip.add(Text.translatable("tooltip.dennidmods.ChiselItem.tooltipsi"));
        }



        super.appendTooltip(stack, context, tooltip, type);
    }
}


