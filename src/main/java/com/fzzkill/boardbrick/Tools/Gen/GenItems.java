package com.fzzkill.boardbrick.Tools.Gen;

import net.minecraft.item.*;

public class GenItems {
    public static class Pickaxe extends PickaxeItem {
        public Pickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }
    public static class Axe extends AxeItem {
        public Axe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }
    public static class Sword extends SwordItem {
        public Sword(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }
    public static class Shovel extends ShovelItem {
        public Shovel(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }
    public static class Hoe extends HoeItem {
        public Hoe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }
}
