package com.fzzkill.boardbrick;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class boardbrick implements ModInitializer {

    // public static final Logger LOGGER = LoggerFactory.getLogger("boardbrick");

    public static final String MODID = "boardbrick";

    // new Group

    public static class BoardGroup implements ModInitializer {

        public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
                new Identifier(boardbrick.MODID, "boardgroup"),
                () -> new ItemStack(Objects.boardbrick));

        @Override
        public void onInitialize() {

        }

    }

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(boardbrick.MODID, "boardbrick"), Objects.boardbrick);
        Registry.register(Registry.ITEM, new Identifier(boardbrick.MODID, "board_brick_food"), Objects.BoardBrickFood);
        Registry.register(Registry.ITEM, new Identifier(boardbrick.MODID, "board_brick_food_plus"), Objects.BoardBrickFoodPlus);

        Registry.register(Registry.ITEM, new Identifier(boardbrick.MODID, "board_brick_sword"), Objects.GenSword);
        Registry.register(Registry.ITEM, new Identifier(boardbrick.MODID, "board_brick_pickaxe"), Objects.GenPickaxe);
        Registry.register(Registry.ITEM, new Identifier(boardbrick.MODID, "board_brick_axe"), Objects.GenAxe);
        Registry.register(Registry.ITEM, new Identifier(boardbrick.MODID, "board_brick_shovel"), Objects.GenShovel);
        Registry.register(Registry.ITEM, new Identifier(boardbrick.MODID, "board_brick_hoe"), Objects.GenHoe);

    }
}
