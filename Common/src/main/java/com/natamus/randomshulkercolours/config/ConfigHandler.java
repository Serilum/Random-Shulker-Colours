package com.natamus.randomshulkercolours.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.randomshulkercolours.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static String possibleShulkerColours = "normal,black,blue,brown,cyan,gray,green,light_blue,light_gray,lime,magenta,orange,pink,purple,red,white,yellow";

	public static void initConfig() {
		configMetaData.put("possibleShulkerColours", Arrays.asList(
			"The possible shulker colours which the mod chooses from, divided by a comma."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}