package someprog.quanta.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import someprog.quanta.Quanta;

public class ItemGroups {
    
    public static ItemGroup QUANTA;

    public static void registerItemGroups() {
        
        QUANTA = FabricItemGroup.builder(new Identifier(Quanta.MOD_ID, "quanta"))
                .displayName(Text.translatable("itemGroup.quanta"))
                .icon(() -> new ItemStack(Items.LUCK_COOKIE)).build();
    }
}
