package fr.Titi2010Tinael.mtrfrance.item;

import fr.Titi2010Tinael.mtrfrance.MTRFranceCreativeTab;
import fr.Titi2010Tinael.mtrfrance.MTR_France;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TPlus {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MTR_France.MOD_ID);

    public static final RegistryObject<Item> T_Plus = ITEMS.register("t_plus", () -> new Item(new Item.Properties().tab(MTRFranceCreativeTab.MTRFrance)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);}
}