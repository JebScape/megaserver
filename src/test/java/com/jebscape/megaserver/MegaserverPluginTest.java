package com.jebscape.megaserver;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MegaserverPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(MegaserverPlugin.class);
		RuneLite.main(args);
	}
}