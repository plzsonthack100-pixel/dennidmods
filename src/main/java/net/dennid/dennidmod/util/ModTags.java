package net.dennid.dennidmod.util;

import net.dennid.dennidmod.DennidMods;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {


    public static class Items{
        public static final TagKey<Item> TITEMS = createTag("trans_items");



        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(DennidMods.MOD_ID, name ));
        }
    }
    public static class Blocks{
        public static final TagKey<Block> NEEDS_RUBIE_TOOL = createTag("needs_rubie_tool");
        public static final TagKey<Block> INCORECT = createTag("incorect");


        public static final TagKey<Block> TBLOCKS = createTag("trans_blocks");



        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(DennidMods.MOD_ID, name ));

    }

}}
