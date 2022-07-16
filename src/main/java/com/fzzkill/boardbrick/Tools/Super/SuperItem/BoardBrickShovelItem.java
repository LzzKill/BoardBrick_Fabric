package com.fzzkill.boardbrick.Tools.Super.SuperItem;

import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;

public class BoardBrickShovelItem extends MiningToolItem {
    public BoardBrickShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.SHOVEL_MINEABLE, settings);
    }

}
