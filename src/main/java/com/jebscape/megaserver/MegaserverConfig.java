package com.jebscape.megaserver;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("megaserver")
public interface MegaserverConfig extends Config
{
	@ConfigItem(
		keyName = "jebscape",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "powered by JebScape";
	}
}
