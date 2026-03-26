package com.natamus.randomshulkercolours.forge.events;

import com.natamus.randomshulkercolours.events.ShulkerEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeShulkerEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeShulkerEvent.class);

		EntityJoinLevelEvent.BUS.addListener(ForgeShulkerEvent::onShulkerSpawn);
	}

	@SubscribeEvent
	public static void onShulkerSpawn(EntityJoinLevelEvent e) {
		ShulkerEvent.onShulkerSpawn(e.getLevel(), e.getEntity());
	}
}
