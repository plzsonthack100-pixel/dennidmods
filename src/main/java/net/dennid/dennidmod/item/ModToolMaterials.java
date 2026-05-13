package net.dennid.dennidmod.item;

import com.google.common.base.Suppliers;
import net.dennid.dennidmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Objects;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    RUBIE(ModTags.Blocks.INCORECT, 1861, 8.60F, 3.50F, 22, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.RUBIE})),
    BRUBIE(ModTags.Blocks.INCORECT, 1991, 9.0F, 4.50F, 25, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.BLUER})),
    GRUBIE(ModTags.Blocks.INCORECT, 2000, 10.0F, 4.60F, 27, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.GREENR})),
    YRUBIE(ModTags.Blocks.INCORECT, 2100, 11.0F, 5.00F, 30, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.RYELLOW})),
    BBRUBIE(ModTags.Blocks.INCORECT, 2200, 12.0F, 6.00F, 35, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.BLACKR})),
    RRUBIE(ModTags.Blocks.INCORECT, 2300, 13.0F, 7.00F, 40, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.RAINBOWR})),
    ENRRUBIE(ModTags.Blocks.INCORECT, 99999999, 5.0F, 7.00F, 40, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.RAINBOWR})),

    ;

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        Objects.requireNonNull(repairIngredient);
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
