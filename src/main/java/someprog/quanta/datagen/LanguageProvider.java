package someprog.quanta.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import someprog.quanta.item.ItemGroups;
import someprog.quanta.item.QItems;

public class LanguageProvider extends FabricLanguageProvider {

    protected LanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemGroups.QUANTA, "Quanta");

        // Items
        translationBuilder.add(QItems.LUCK_COOKIE, "Fortune Cookie");

        // Tooltip
        translationBuilder.add("tooltip.luck_cookie", "With love, Villagers!");
    }
}
