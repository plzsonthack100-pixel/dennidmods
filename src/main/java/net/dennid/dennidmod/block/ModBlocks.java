package net.dennid.dennidmod.block;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.dennid.dennidmod.DennidMods;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RRUBIE_BLOCK = RegisterBM("red_rubie_block", new Block(AbstractBlock.Settings.create().strength(0.707f).requiresTool().
            sounds(BlockSoundGroup.AMETHYST_BLOCK)
            ));
    public static final Block GRUBIEB = RegisterBM("green_rubie_block", new Block(AbstractBlock.Settings.copy(RRUBIE_BLOCK)));
    public static final Block RRUBIE = RegisterBM("rainbow_rubie_block", new Block(AbstractBlock.Settings.copy(GRUBIEB)));
    public static final Block YRUBIE = RegisterBM("yellow_rubie", new Block(AbstractBlock.Settings.copy(GRUBIEB)));
    public static final Block BRUBIE = RegisterBM("black_rubieb", new Block(AbstractBlock.Settings.copy(GRUBIEB)));
    public static final Block BBLOCK = RegisterBM("blue_rubieb", new Block(AbstractBlock.Settings.copy(GRUBIEB)));
    public static void RMB(){
        DennidMods.LOGGER.info("Registring blocks for " + DennidMods.MOD_ID);


    }
    private static Block RegisterBM(String name,Block block){
        RBI(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DennidMods.MOD_ID, name), block);

    }
    private static void RBI(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(DennidMods.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }


}
