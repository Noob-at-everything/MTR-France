package fr.Titi2010Tinael.mtrfrance.block;

import fr.Titi2010Tinael.mtrfrance.MTRFranceCreativeTab;
import fr.Titi2010Tinael.mtrfrance.MTR_France;
import fr.Titi2010Tinael.mtrfrance.item.TestItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Properties;
import java.util.function.Supplier;

public class RATPBlock {

    public static final DeferredRegister <Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MTR_France.MOD_ID);

    public static final RegistryObject<Block> RATP_BLOCK = registerBlock("ratp_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1f)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockOnly(String name, Supplier<T> block) {
        RegistryObject<T> toreturn = BLOCKS.register(name, block);
        return toreturn;
    }

    private static <T extends Block>void registerBlockItem(String name, Supplier<T> block){
        TestItem.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(MTRFranceCreativeTab.MTRFrance)));
    }

    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}
}
