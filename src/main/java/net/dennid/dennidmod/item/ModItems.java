package net.dennid.dennidmod.item;

import net.dennid.dennidmod.DennidMods;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroups;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
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
    public static Item SOUVLAKI = registermoditems("souvlaki", new Item(new Item.Settings()
            .food(new FoodComponent.Builder().nutrition(10).saturationModifier(12).build())));
    public static Item GUROS = registermoditems("gyros", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5)
            .saturationModifier(5).build()
    )));
    public static Item POT = registermoditems("cut_potato", new Item(new Item.Settings().food(FoodComponents.BAKED_POTATO)));
    public static Item PIT = registermoditems("pita", new Item(new Item.Settings().food(FoodComponents.SWEET_BERRIES)));
    public static Item CHISEL = registermoditems("chisel", new ChiselItem(new Item.Settings().maxDamage(80)));
    public static Item ENRRUBIE = registermoditems("enchanted_rainbow_rubie", new Item(new Item.Settings()));
    public static Item RUBIE_PIC = registermoditems("rubie_pickaxe", new PickaxeItem(ModToolMaterials.RUBIE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBIE, 4
    , -2.4f))));
    public static Item RUBIE_SWO = registermoditems("rubie_sword", new SwordItem(ModToolMaterials.RUBIE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials
                    .RUBIE, 6, -2.6f))));
    public static Item RUBIE_AXE = registermoditems("rubie_axe", new AxeItem(ModToolMaterials.RUBIE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials
            .RUBIE, 7, -2.3f))));





    public static void register(){
       DennidMods.LOGGER.info("Registing item " + DennidMods.MOD_ID);


       };
   }









