package com.natamus.randomshulkercolours.forge.events;

import com.natamus.randomshulkercolours.events.ShulkerEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeShulkerEvent {
	@SubscribeEvent
	public static void onShulkerSpawn(EntityJoinLevelEvent e) {
		ShulkerEvent.onShulkerSpawn(e.getLevel(), e.getEntity());
	}
}
