package someprog.quanta;

import net.fabricmc.api.ModInitializer;
import someprog.quanta.item.ItemGroups;
import someprog.quanta.item.Items;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quanta implements ModInitializer {

	public static final String MOD_ID = "quanta";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemGroups.registerItemGroups();
		Items.registerItems();
	}
}