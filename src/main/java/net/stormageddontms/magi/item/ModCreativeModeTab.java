package net.stormageddontms.magi.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAGI_TAB = new CreativeModeTab("magitab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.SILVER_INGOT.get());
        }
    };
}
