package someprog.quanta.utils;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;
import someprog.quanta.Quanta;
import someprog.quanta.item.QItems;

public class VillagerTradeModifier {
    
    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 4, 
                factories -> { 
                    factories.add(new TradeOffers.SellItemFactory(
                        QItems.LUCK_COOKIE, 10, 2, 3, 30)); 
                });
    }
    

    public static void registerVillagerTrades() {
        Quanta.LOGGER.debug("Registered custom trades for" + Quanta.MOD_ID);
        registerCustomTrades();
    }
}
