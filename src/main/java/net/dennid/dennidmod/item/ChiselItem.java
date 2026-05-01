package net.dennid.dennidmod.item;


import net.dennid.dennidmod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.NetherrackBlock;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Util;
import net.minecraft.world.World;

import java.util.Map;
import net.dennid.dennidmod.DennidMods;
import net.dennid.dennidmod.DennidMods;import net.dennid.dennidmod.DennidMods;import net.dennid.dennidmod.DennidMods;
import net.dennid.dennidmod.DennidMods;import net.dennid.dennidmod.DennidMods;import net.dennid.dennidmod.DennidMods;import net.dennid.dennidmod.DennidMods;import net.dennid.dennidmod.DennidMods;import net.dennid.dennidmod.DennidMods;import net.dennid.dennidmod.DennidMods;

public class ChiselItem extends Item {
    public static int i = 100;
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    Blocks.DIAMOND_BLOCK, Blocks.AIR,
                    Blocks.NETHERITE_BLOCK, Blocks.AIR,
                    Blocks.GOLD_BLOCK, Blocks.AIR,
                    ModBlocks.RRUBIE, Blocks.AIR


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
                    System.out.println(i);
                    o(a);

                }
                if(block == Blocks.NETHERITE_BLOCK){
                    PlayerEntity a = context.getPlayer();
                    i = i+100;
                    System.out.println(i);
                    o(a);
                }
                if(block == Blocks.GOLD_BLOCK){
                    PlayerEntity a = context.getPlayer();
                    i = i+30;
                    System.out.println(i);
                   o(a);

                }
                if(block == ModBlocks.RRUBIE_BLOCK){
                    PlayerEntity a = context.getPlayer();
                    i = i+400;
                    System.out.println(i);
                    o(a);
                }



            }



        }
        return ActionResult.SUCCESS;
    }
    public static void o(PlayerEntity a){
        if(i > 500){

            a.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE , 9999, 1, true, true));
        }}
}


