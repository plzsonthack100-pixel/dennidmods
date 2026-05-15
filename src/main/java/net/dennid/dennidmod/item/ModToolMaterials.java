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

    RUBIE(ModTags.Blocks.INCORECT, 250, 5.0F, 1.5F, 10, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.RUBIE})),
    BRUBIE(ModTags.Blocks.INCORECT, 500, 6.0F, 2.0F, 11, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.BLUER})),
    GRUBIE(ModTags.Blocks.INCORECT, 750, 7.0F, 2.5F, 12, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.GREENR})),
    YRUBIE(ModTags.Blocks.INCORECT, 1000, 7.5F, 2.5F, 13, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.RYELLOW})),
    BBRUBIE(ModTags.Blocks.INCORECT, 1400, 8.0F, 3.0F, 14, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.BLACKR})),
    RRUBIE(ModTags.Blocks.INCORECT, 1700, 8.5F, 3.0F, 14, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.RAINBOWR})),
    ENRRUBIE(ModTags.Blocks.INCORECT, 2000, 9.0F, 3.5F, 15, () -> Ingredient.ofItems(new ItemConvertible[]{ModItems.RAINBOWR})),

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
