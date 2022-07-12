package com.fzzkill.boardbrick.Tools.Super;

import com.fzzkill.boardbrick.Objects;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SuperMaterial implements ToolMaterial {

    SuperMaterial superMaterial = new SuperMaterial();

    @Override
    public int getDurability() {
        return Integer.MAX_VALUE;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return Integer.MAX_VALUE;
    }

    @Override
    public float getAttackDamage() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMiningLevel() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getEnchantability() {
        return Integer.MAX_VALUE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Objects.boardbrick);
    }
}
