package com.fzzkill.boardbrick.Items.Food;

import com.fzzkill.boardbrick.boardbrick;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class BoardBrickFood_Plus extends Item {

    public BoardBrickFood_Plus() {
        super(new Item.Settings().group(boardbrick.BoardGroup.ITEM_GROUP).food(new FoodComponent.Builder().alwaysEdible().snack().hunger(Integer.MAX_VALUE).saturationModifier(Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 1, 255),Float.MAX_VALUE)
                .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 1, 255),Float.MAX_VALUE)
                .build()));
    }
}
