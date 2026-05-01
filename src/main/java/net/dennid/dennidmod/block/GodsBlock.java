package net.dennid.dennidmod.block;

import net.dennid.dennidmod.DennidMods;
import net.dennid.dennidmod.item.ChiselItem;
import net.dennid.dennidmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.dennid.dennidmod.item.ChiselItem;

public class GodsBlock extends Block {
    public GodsBlock(Settings settings) {
        super(settings);
    }


    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.BLOCKS, 9f , 3f);
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {


    if(entity instanceof ItemEntity item){
        if(ChiselItem.i > 50){
            ChiselItem.i = ChiselItem.i -10;
            System.out.println(ChiselItem.i);
            if(item.getStack().getItem() == ModItems.RAINBOWR){
                item.setStack(new ItemStack(ModItems.ENRRUBIE, item.getStack().getCount()));
            }

        }}








        super.onSteppedOn(world, pos, state, entity);
    }
}
