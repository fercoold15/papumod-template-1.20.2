package fercoold.papumod.item;

import fercoold.papumod.Papumod;
import fercoold.papumod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Papumod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.PAPU)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PAPU);
                        entries.add(ModItems.RAW_PAPU);

                        entries.add(Items.DIAMOND);

                        entries.add(ModBlocks.PAPU_BLOCK);
                        //entries.add(ModBlocks.RAW_PAPU_BLOCK);

                        entries.add(ModBlocks.PAPU_ORE);
                        //.add(ModBlocks.DEEPSLATE_PAPU_ORE);
                       // entries.add(ModBlocks.NETHER_PAPU_ORE);
                        //entries.add(ModBlocks.END_STONE_PAPU_ORE);


                    }).build());


    public static void registerItemGroups() {
        Papumod.LOGGER.info("Registering Item Groups for " + Papumod.MOD_ID);
    }
}
