package someprog.quanta.item;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class LuckCookieItem extends Item {

    public LuckCookieItem(Settings settings) {
        super(settings.food(FoodComponents.COOKIE));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 1));
        return super.finishUsing(stack, world, user);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("Gives you luck! (and sugar crush) ;)").formatted(Formatting.LIGHT_PURPLE));
        super.appendTooltip(stack, world, tooltip, context);
    }    
}
