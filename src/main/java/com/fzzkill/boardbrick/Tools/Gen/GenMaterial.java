package com.fzzkill.boardbrick.Tools.Gen;

import com.fzzkill.boardbrick.Objects;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GenMaterial implements ToolMaterial {

    public static final GenMaterial GenTools = new GenMaterial();

    @Override
    public int getDurability() {
        return 114514;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 114514;
    }

    @Override
    public float getAttackDamage() {
        return 114513;
    }

    @Override
    public int getMiningLevel() {
        return 114514;
    }

    @Override
    public int getEnchantability() {
        return 11;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Objects.boardbrick);
    }
}
