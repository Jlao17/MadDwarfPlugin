package com.maddwarf;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("maddwarf")
public interface MadDwarfConfig extends Config
{
	@ConfigItem(
		keyName = "Profanity",
		name = "Profanity toggle",
		description = "The message to show to the user when they login"
	)
	default boolean showProfanity()
	{
		return false;
	}
}
