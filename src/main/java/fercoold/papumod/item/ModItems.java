package fercoold.papumod.item;


import fercoold.papumod.Papumod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PAPU = registerItem("papu", new Item(new FabricItemSettings()));
    public static final Item RAW_PAPU = registerItem("raw_papu", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(PAPU);
        entries.add(RAW_PAPU);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Papumod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Papumod.LOGGER.info("Registering Mod Items for " + Papumod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
