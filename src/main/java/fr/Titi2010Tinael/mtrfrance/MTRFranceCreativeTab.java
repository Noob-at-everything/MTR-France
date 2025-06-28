package fr.Titi2010Tinael.mtrfrance;

import fr.Titi2010Tinael.mtrfrance.item.TestItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class MTRFranceCreativeTab{
    public static final CreativeModeTab MTRFrance = new CreativeModeTab("mtr_france") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TestItem.TEST_ITEM.get());}
    };
}