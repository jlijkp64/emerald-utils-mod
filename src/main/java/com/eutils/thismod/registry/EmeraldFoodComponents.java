package com.eutils.thismod.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class EmeraldFoodComponents {
	
	public static final FoodComponent EMERALD_APPLE = (new FoodComponent.Builder())
			.hunger(8)
			.saturationModifier(3.5f)
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1600, 2), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 3), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 7200, 1), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 7200, 1), 1f)
			.alwaysEdible()
			.build();
}
