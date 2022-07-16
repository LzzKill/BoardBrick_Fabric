package com.fzzkill.boardbrick;

import com.fzzkill.boardbrick.Items.BoardBrick;
import com.fzzkill.boardbrick.Items.Food.*;
import com.fzzkill.boardbrick.Tools.Gen.*;
import com.fzzkill.boardbrick.Tools.Super.SuperItems;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

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

    public static final Item SuperSword = new SuperItems.SuperSword();
    public static final Item SuperPickaxe = new SuperItems.SuperPickaxe();
    public static final Item SuperAxe = new SuperItems.SuperAxe();
    public static final Item SuperShovel = new SuperItems.SuperShovel();
    public static final Item SuperHoe = new SuperItems.SuperHoe();

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "boardbrick"), boardbrick);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_brick_food"), BoardBrickFood);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_brick_food_plus"), BoardBrickFoodPlus);

        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_brick_sword"), GenSword);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_brick_pickaxe"), GenPickaxe);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_brick_axe"), GenAxe);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_brick_shovel"), GenShovel);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_brick_hoe"), GenHoe);

        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "sword_super"), SuperSword);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "pickaxe_super"), SuperPickaxe);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "axe_super"), SuperAxe);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "shovel_super"), SuperShovel);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "hoe_super"), SuperHoe);

    }

}
