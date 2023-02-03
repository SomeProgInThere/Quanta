package someprog.quanta.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import someprog.quanta.Quanta;

public class Items {
    
    public static final Item LUCK_COOKIE = registerItem("luck_cookie", 
            new LuckCookieItem(new FabricItemSettings()));    

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Quanta.MOD_ID, name), item);
    } 

    public static void AddItemsToItemGroup() {
        addToItemGroup(ItemGroups.QUANTA, LUCK_COOKIE);
    }

    private static void addToItemGroup(ItemGroup itemGroup, Item item) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
    }

    public static void registerItems() {
        Quanta.LOGGER.debug("Registered items for" + Quanta.MOD_ID);
        AddItemsToItemGroup();
    }
}
