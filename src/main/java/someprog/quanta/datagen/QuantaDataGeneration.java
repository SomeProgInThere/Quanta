package someprog.quanta.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class QuantaDataGeneration implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		
		fabricDataGenerator.createPack().addProvider(LanguageProvider::new);
		fabricDataGenerator.createPack().addProvider(ModelProvider::new);
	}
}
