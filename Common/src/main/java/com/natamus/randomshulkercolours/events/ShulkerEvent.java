package com.natamus.randomshulkercolours.events;

import com.natamus.collective.data.GlobalVariables;
import com.natamus.randomshulkercolours.util.Reference;
import com.natamus.randomshulkercolours.util.Util;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.Level;

import java.util.Optional;
import java.util.Set;

public class ShulkerEvent {
	public static void onShulkerSpawn(Level world, Entity entity) {
		if (world.isClientSide) {
			return;
		}

		if (!(entity instanceof Shulker)) {
			return;
		}
		
		String shulkertag = Reference.MOD_ID + ".coloured";
		Set<String> tags = entity.getTags();
		if (tags.contains(shulkertag)) {
			return;
		}
		
		if (Util.possibleColours == null) {
			return;
		}
		if (Util.possibleColours.size() < 1) {
			return;
		}
		
		Shulker shulker = (Shulker)entity;
		
		int randomindex = GlobalVariables.random.nextInt(Util.possibleColours.size());
		final DyeColor randomcolour = Util.possibleColours.get(randomindex);
		if (randomcolour != null) {
			shulker.setVariant(Optional.of(randomcolour));
		}
		
		shulker.addTag(shulkertag);
	}
}
