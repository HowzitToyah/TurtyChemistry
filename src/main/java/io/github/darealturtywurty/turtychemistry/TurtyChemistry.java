package io.github.darealturtywurty.turtychemistry;

import io.github.darealturtywurty.turtychemistry.core.init.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Mod(TurtyChemistry.MODID)
public class TurtyChemistry {
    public static final String MODID = "turtychemistry";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.THULIUM.get().getDefaultInstance();
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    };

    public TurtyChemistry() {
        final var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
        BlockEntityInit.BLOCK_ENTITIES.register(bus);
        ContainerInit.MENU_TYPES.register(bus);
        RecipeInit.SERIALIZERS.register(bus);
        MultiblockInit.MULTIBLOCKS.register(bus);
    }
}
