package net.dennid.dennidmod.item;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChainBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class ChiselItem extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    Blocks.STONE, Blocks.STONE_BRICKS,
                    Blocks.OAK_LOG, Blocks.BIRCH_LOG,
                    Blocks.STONE_BUTTON, Blocks.VOID_AIR,
                    Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG,
                    Blocks.OAK_PLANKS, Blocks.OAK_LOG,
                    Blocks.BAMBOO_PLANKS, Blocks.BAMBOO,
                    Blocks.CHERRY_PLANKS, Blocks.CHERRY_WOOD

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
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND)
                );

            }

        }
        return ActionResult.SUCCESS;
    }

}
