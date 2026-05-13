package net.dennid.dennidmod.item;

import net.dennid.dennidmod.DennidMods;
import net.dennid.dennidmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup DENNIDMOD = Registry.register(Registries.ITEM_GROUP, Identifier.of(DennidMods.MOD_ID, "dennid_mod")
    , FabricItemGroup.builder()
                            .icon(() -> new ItemStack(ModBlocks.RRUBIE_BLOCK))
                            .displayName(Text.translatable("itemgroup.dennidmods.dennid_mod"))
                            .entries((displayContext, entries) -> {
                                entries.add(ModBlocks.GRUBIEB);
                                entries.add(ModBlocks.RRUBIE_BLOCK);
                                entries.add((ModBlocks.RRUBIE));
                                entries.add((ModBlocks.BBLOCK));
                                entries.add((ModBlocks.YRUBIE));
                                entries.add((ModBlocks.BRUBIE));
                                entries.add(ModBlocks.GBLOCK);
                                entries.add(ModItems.RUBIE);
                                entries.add(ModItems.BLUER);
                                entries.add(ModItems.BLACKR);
                                entries.add(ModItems.GREENR);
                                entries.add(ModItems.RAINBOWR);
                                entries.add(ModItems.RYELLOW);
                                entries.add(ModItems.SOUVLAKI);
                                entries.add(ModItems.GUROS);
                                entries.add(ModItems.PIT);
                                entries.add(ModItems.POT);
                                entries.add(ModItems.CHISEL);
                                entries.add(ModItems.ENRRUBIE);
                                entries.add(ModItems.RUBIE_PIC);
                                entries.add(ModItems.RUBIE_SWO);
                                entries.add(ModItems.RUBIE_AXE);
                                entries.add(ModItems.BLUE_RUBIE_PIC);
                                entries.add(ModItems.BLUE_RUBIE_AXE);
                                entries.add(ModItems.BLUE_RUBIE_SWO);
                               entries.add(ModItems.GREEN_RUBIE_AXE);
                                entries.add(ModItems.GREEN_RUBIE_PIC);
                                entries.add(ModItems.GREEN_RUBIE_SWORD);
                                entries.add(ModItems.YELLOW_RUBIE_AXE);
                                entries.add(ModItems.YELLOW_RUBIE_PIC);
                                entries.add(ModItems.YELLOW_RUBIE_SWORD);
                                entries.add(ModItems.BLACK_RUBIE_AXE);
                                entries.add(ModItems.BLACK_RUBIE_SWORD);
                                entries.add(ModItems.BLACK_RUBIE_PIC);
                                entries.add(ModItems.RAIBOW_RUBIE_AXE);
                                entries.add(ModItems.RAINBOW_RUBIE_SWORD);
                                entries.add(ModItems.RAINBOW_RUBIE_PIC);
                                entries.add(ModItems.ENRAINBOW_RUBIE_AXE);
                                entries.add(ModItems.ENRAINBOW_RUBIE_PIC);
                                entries.add(ModItems.ENRAINBOW_RUBIE_SWORD);





                            })



                    .build());
    public static void RegisterItemGroup(){
        DennidMods.LOGGER.info("Restring modgroups for " + DennidMods.MOD_ID);
    }
}
