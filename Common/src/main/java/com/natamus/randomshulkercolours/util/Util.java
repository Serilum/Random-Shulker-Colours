package com.natamus.randomshulkercolours.util;

import com.natamus.randomshulkercolours.config.ConfigHandler;
import net.minecraft.world.item.DyeColor;

import java.util.ArrayList;
import java.util.List;

public class Util {
	public static List<DyeColor> possibleColours = null;
	
	public static void initColours() {
		possibleColours = new ArrayList<DyeColor>();
		
		String possiblecolours = ConfigHandler.possibleShulkerColours;
		String[] pcspl = possiblecolours.toLowerCase().replace(" ",  "").split(",");
		for (String pc : pcspl) {
			DyeColor colour = getColourFromString(pc.trim());
			if (colour != null || pc.equalsIgnoreCase("normal")) {
				possibleColours.add(colour);
			}
		}
	}
	
	private static DyeColor getColourFromString(String cs) {
		return switch (cs) {
			case "black" -> DyeColor.BLACK;
			case "blue" -> DyeColor.BLUE;
			case "brown" -> DyeColor.BROWN;
			case "cyan" -> DyeColor.CYAN;
			case "gray" -> DyeColor.GRAY;
			case "green" -> DyeColor.GREEN;
			case "light_blue" -> DyeColor.LIGHT_BLUE;
			case "light_gray" -> DyeColor.LIGHT_GRAY;
			case "lime" -> DyeColor.LIME;
			case "magenta" -> DyeColor.MAGENTA;
			case "orange" -> DyeColor.ORANGE;
			case "pink" -> DyeColor.PINK;
			case "purple" -> DyeColor.PURPLE;
			case "red" -> DyeColor.RED;
			case "white" -> DyeColor.WHITE;
			case "yellow" -> DyeColor.YELLOW;
			default -> null;
		};
	}
}
