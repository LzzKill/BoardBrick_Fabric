package com.fzzkill.boardbrick.Items;

import com.fzzkill.boardbrick.boardbrick;
import net.minecraft.item.Item;

public class BoardBrick extends Item {

    public BoardBrick() {
        super(new Item.Settings().group(boardbrick.BoardGroup.ITEM_GROUP).fireproof());
    }

}
