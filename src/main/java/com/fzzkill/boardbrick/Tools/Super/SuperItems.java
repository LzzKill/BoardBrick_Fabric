package com.fzzkill.boardbrick.Tools.Super;

import com.fzzkill.boardbrick.Tools.Super.SuperItem.*;
import com.fzzkill.boardbrick.boardbrick;

public class SuperItems {

    public static class SuperSword extends BoardBrickSwordItem {
        public SuperSword() {
            super(SuperMaterial.superMaterial, Integer.MAX_VALUE, Integer.MAX_VALUE, boardbrick.ITEMSETTING);
        }
    }
    public static class SuperPickaxe extends BoardBrickPickaxeItem {
        public SuperPickaxe() {
            super(SuperMaterial.superMaterial, Integer.MAX_VALUE, Integer.MAX_VALUE, boardbrick.ITEMSETTING);
        }
    }
    public static class SuperAxe extends BoardBrickAxeItem {
        public SuperAxe() {
            super(SuperMaterial.superMaterial, Integer.MAX_VALUE, Integer.MAX_VALUE, boardbrick.ITEMSETTING);
        }
    }
    public static class SuperShovel extends BoardBrickShovelItem {
        public SuperShovel() {
            super(SuperMaterial.superMaterial, Integer.MAX_VALUE, Integer.MAX_VALUE, boardbrick.ITEMSETTING);
        }
    }
    public static class SuperHoe extends BoardBrickHoeItem {
        public SuperHoe() {
            super(SuperMaterial.superMaterial, Integer.MAX_VALUE, Integer.MAX_VALUE, boardbrick.ITEMSETTING);
        }
    }
}
