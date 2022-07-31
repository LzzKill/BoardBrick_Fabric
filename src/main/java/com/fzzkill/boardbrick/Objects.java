package com.fzzkill.boardbrick;

import com.fzzkill.boardbrick.Items.BoardBrick;
import com.fzzkill.boardbrick.Items.Food.*;
import com.fzzkill.boardbrick.Tools.Gen.*;
import com.fzzkill.boardbrick.Tools.Super.SuperItems;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
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


    // Blocks
    public static final Block BoardBlockFirst = new Block(FabricBlockSettings.of(Material.METAL).strength(0, 100).luminance(0));
    public static final Block BoardBlockSecond = new Block(FabricBlockSettings.of(Material.METAL).strength(2, 200).luminance(2));
    public static final Block BoardBlockThird = new Block(FabricBlockSettings.of(Material.METAL).strength(4, 300).luminance(4));
    public static final Block BoardBlockFourth = new Block(FabricBlockSettings.of(Material.METAL).strength(8, 400).luminance(6));
    public static final Block BoardBlockFifth = new Block(FabricBlockSettings.of(Material.METAL).strength(16, 500).luminance(8));
    public static final Block BoardBlockSixth = new Block(FabricBlockSettings.of(Material.METAL).strength(32, 600).luminance(10));
    public static final Block BoardBlockSeventh = new Block(FabricBlockSettings.of(Material.METAL).strength(64, 700).luminance(12));
    public static final Block BoardBlockEighth = new Block(FabricBlockSettings.of(Material.METAL).strength(128, 800).luminance(14));
    public static final Block BoardBlockNinth = new Block(FabricBlockSettings.of(Material.METAL).strength(256, 900).luminance(16));

    public static final Block BoardBlockEighth_Copy = new Block(FabricBlockSettings.of(Material.METAL).strength(128, 100).luminance(0).air().breakInstantly().dropsNothing().noCollision().nonOpaque().requiresTool());
    public static final Block BoardBlockSuper = new Block(FabricBlockSettings.of(Material.METAL).strength(Integer.MAX_VALUE, Integer.MIN_VALUE).luminance(0));

    public static final BlockItem ItemBoardBlockFirst = new BlockItem(BoardBlockFirst, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final BlockItem ItemBoardBlockSecond = new BlockItem(BoardBlockSecond, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final BlockItem ItemBoardBlockThird = new BlockItem(BoardBlockThird, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final BlockItem ItemBoardBlockFourth = new BlockItem(BoardBlockFourth, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final BlockItem ItemBoardBlockFifth = new BlockItem(BoardBlockFifth, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final BlockItem ItemBoardBlockSixth = new BlockItem(BoardBlockSixth, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final BlockItem ItemBoardBlockSeventh = new BlockItem(BoardBlockSeventh, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final BlockItem ItemBoardBlockEighth = new BlockItem(BoardBlockEighth, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final BlockItem ItemBoardBlockNinth = new BlockItem(BoardBlockNinth, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));

    public static final BlockItem ItemBoardBlockEighth_Copy = new BlockItem(BoardBlockEighth_Copy, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));
    public static final BlockItem ItemBoardBlockSuper = new BlockItem(BoardBlockSuper, new Item.Settings().group(com.fzzkill.boardbrick.boardbrick.BoardGroup.ITEM_GROUP));


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

        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_first"), BoardBlockFirst);
        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_second"), BoardBlockSecond);
        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_third"), BoardBlockThird);
        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_fourth"), BoardBlockFourth);
        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_fifth"), BoardBlockFifth);
        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_sixth"), BoardBlockSixth);
        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_seventh"), BoardBlockSeventh);
        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_eighth"), BoardBlockEighth);
        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_ninth"), BoardBlockNinth);

        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_eighth_copy"), BoardBlockEighth_Copy);
        Registry.register(Registry.BLOCK, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_super"), BoardBlockSuper);

        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_first"), ItemBoardBlockFirst);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_second"), ItemBoardBlockSecond);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_third"), ItemBoardBlockThird);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_fourth"), ItemBoardBlockFourth);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_fifth"), ItemBoardBlockFifth);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_sixth"), ItemBoardBlockSixth);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_seventh"), ItemBoardBlockSeventh);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_eighth"), ItemBoardBlockEighth);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_ninth"), ItemBoardBlockNinth);

        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_eighth_copy"), ItemBoardBlockEighth_Copy);
        Registry.register(Registry.ITEM, new Identifier(com.fzzkill.boardbrick.boardbrick.MODID, "board_block_super"), ItemBoardBlockSuper);

    }
}
