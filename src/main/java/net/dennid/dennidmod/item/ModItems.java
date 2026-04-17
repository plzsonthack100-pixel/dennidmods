package net.dennid.dennidmod.item;

import net.dennid.dennidmod.DennidMods;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
   private static Item registermoditems(String name,Item item){
       return Registry.register(Registries.ITEM , Identifier.of(DennidMods.MOD_ID, name), item);
   }
   public static Item RUBIE = registermoditems("rubie", new  Item(new Item.Settings()));
   public static Item BLACKR = registermoditems("blackr", new  Item(new Item.Settings().fireproof()));
   public static Item BLUER = registermoditems("bluer", new  Item(new Item.Settings()));
    public static Item GREENR = registermoditems("greenr", new  Item(new Item.Settings()));
    public static Item RAINBOWR = registermoditems("rainbowr", new  Item(new Item.Settings().fireproof()));
    public static Item RYELLOW = registermoditems("ryellow", new Item(new Item.Settings()));



    public static void register(){
       DennidMods.LOGGER.info("Registing item " + DennidMods.MOD_ID);


       };
   }









