package com.fzzkill.boardbrick.Items.Food;

import com.fzzkill.boardbrick.boardbrick;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class BoardBrickFood extends Item {

    public BoardBrickFood() {
        super(new Item.Settings().group(boardbrick.BoardGroup.ITEM_GROUP).food(new FoodComponent.Builder().alwaysEdible().snack().hunger(Integer.MAX_VALUE).saturationModifier(Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 12000, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 12000, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 12000, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 12000, 4),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12000, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 12000, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 12000, 255),Float.MAX_VALUE)
                .build()));
    }

}
