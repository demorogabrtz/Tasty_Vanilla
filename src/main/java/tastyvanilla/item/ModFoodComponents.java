package tastyvanilla.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {

    //COOKIES
    public static final FoodComponent COOKIE_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();
    public static final FoodComponent COOKIE_CARROT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent COOKIE_GLOW_BERRY = new FoodComponent.Builder().nutrition(3).saturationModifier(0.1f).build();
    public static final FoodComponent COOKIE_HONEY = new FoodComponent.Builder().nutrition(4).saturationModifier(0.1f).build();
    public static final FoodComponent COOKIE_OATMEAL = new FoodComponent.Builder().nutrition(4).saturationModifier(0.6f).build();
    public static final FoodComponent COOKIE_POPPY_SEED = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent COOKIE_PUMPKIN = new FoodComponent.Builder().nutrition(3).saturationModifier(0.2f).build();
    public static final FoodComponent COOKIE_SPIDER_EYE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.8f).build();
    public static final FoodComponent COOKIE_SUNFLOWER_SEED = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent COOKIE_SUGAR = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent COOKIE_SWEET_BERRY = new FoodComponent.Builder().nutrition(3).saturationModifier(0.1f).build();

    //BAKED BREAD
    public static final FoodComponent BREAD_BAGUEL = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent BREAD_BAGUETTE = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).build();
    public static final FoodComponent BREAD_BAKED = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).build();
    public static final FoodComponent BREAD_BROWNIE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent BREAD_CROISSANT = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent BREAD_FLATBREAD = new FoodComponent.Builder().nutrition(5).saturationModifier(0.1f).build();
    public static final FoodComponent BREAD_FOCACCIA = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodComponent BREAD_HONEY = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent BREAD_MULTIGRAIN = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodComponent BREAD_PANCAKES = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent BREAD_SOURDOUGH = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).build();
    public static final FoodComponent BREAD_SWEET_ROLL = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();

    //PIES
    public static final FoodComponent PIE_APPLE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent PIE_CHICKEN = new FoodComponent.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodComponent PIE_CHOCOLATE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent PIE_CHORUS_FRUIT = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).alwaysEdible().build();
    public static final FoodComponent PIE_FISH = new FoodComponent.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodComponent PIE_FUNGUS = new FoodComponent.Builder().nutrition(8).saturationModifier(1.8f).build();
    public static final FoodComponent PIE_GLOW_BERRY = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent PIE_HONEY = new FoodComponent.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodComponent PIE_MEAT = new FoodComponent.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodComponent PIE_MELON = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent PIE_MUSHROOM = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent PIE_SHEPHERDS = new FoodComponent.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodComponent PIE_SWEET_BERRY = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent PIE_VEGETABLE = new FoodComponent.Builder().nutrition(8).saturationModifier(1.2f).build();

    //CROPS
    public static final FoodComponent CABBAGE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent CHILLI = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent EGGPLANT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent GARLIC = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent ONION = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent RICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent SWEET_POTATO = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();

    //FOOD FROM CROPS
    public static final FoodComponent FOOD_TOMATO_SOUP = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_SALAD = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_WRAP_VEGGIE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_WRAP = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_ONION_SOUP = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_ONION_RING = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_ROASTED_GARLIC = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_BAKED_SWEET_POTATO = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_SWEET_POTATO_FRIES = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_POTATO_FRIES = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_COLESLAW = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_CHILLI_STEW = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();

    public static final FoodComponent BREAD_GARLIC = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();


    //EFFECTS
    public static final ConsumableComponent PIE_CHORUS_FRUIT_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,200),1f)).build();

}
