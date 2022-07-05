package com.fzzkill.boardbrick;

import com.fzzkill.boardbrick.Items.BoardBrick;
import com.fzzkill.boardbrick.Items.Food.*;
import com.fzzkill.boardbrick.Tools.Gen.*;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;

public class Objects {

    public static final Item boardbrick = new BoardBrick();
    public static final Item BoardBrickFood = new BoardBrickFood();
    public static final Item BoardBrickFoodPlus = new BoardBrickFood_Plus();

    // Tools
    public static final ToolItem GenSword = new GenItems.Sword(GenMaterial.GenTools, 1919810, 0, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final ToolItem GenPickaxe = new GenItems.Pickaxe(GenMaterial.GenTools, 1919810, 0, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final ToolItem GenAxe = new GenItems.Axe(GenMaterial.GenTools, 1919810, 0, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final ToolItem GenShovel = new GenItems.Shovel(GenMaterial.GenTools, 1919810, 0, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final ToolItem GenHoe = new GenItems.Hoe(GenMaterial.GenTools, 1919810, 0, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));

}
