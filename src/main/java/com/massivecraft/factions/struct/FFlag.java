package com.massivecraft.factions.struct;

import com.massivecraft.factions.Conf;
import de.erethon.factionsone.Language;

/**
 * Flags that describe the nature of a faction and it's territory.
 * Can monsters spawn there? May fire spread etc? Is the faction permanent?
 * These flags have nothing to do with player-permission.
 * 
 * The flags are either true or false.
 */
public enum FFlag
{
	// Faction flags
	PERMANENT("permanent", Language.getInstance().flagPermanent, false),
	PEACEFUL("peaceful", Language.getInstance().flagPeaceful, false),
	INFPOWER("infpower", Language.getInstance().flagInfpower, false),
	// This faction has infinite power: TODO: Add faction has enough method. Replace the permanentpower level 
	
	// (Faction) Territory flags
	// If a faction later could have many different territories this would probably be in another enum
	POWERLOSS("powerloss", Language.getInstance().flagPowerloss, true),
	PVP("pvp", Language.getInstance().flagPvp, true),
	FRIENDLYFIRE("friendlyfire", Language.getInstance().flagFriendlyFire, false),
	MONSTERS("monsters", Language.getInstance().flagMonsters, true),
	EXPLOSIONS("explosions", Language.getInstance().flagExplosions, true),
	FIRESPREAD("firespread", Language.getInstance().flagFirespread, true),
	//LIGHTNING("lightning", "<i>Can lightning strike in this territory?", true), Possible to add later.
	ENDERGRIEF("endergrief", Language.getInstance().flagEndergrief, false),
	;
	
	private final String nicename;
	private final String desc;
	public final boolean defaultDefaultValue;
	
	private FFlag(final String nicename, final String desc, final boolean defaultDefaultValue)
	{
		this.nicename = nicename;
		this.desc = desc;
		this.defaultDefaultValue = defaultDefaultValue;
	}
	
	public String getNicename()
	{
		return this.nicename;
	}
	
	public String getDescription()
	{
		return this.desc;
	}
	
	/**
	 * The state for newly created factions.
	 */
	public boolean getDefault()
	{
		Boolean ret = Conf.factionFlagDefaults.get(this);
		if (ret == null) return this.defaultDefaultValue;
		return ret; 
	}
	
	public static FFlag parse(String str)
	{
		str = str.toLowerCase();
		if (str.startsWith("per")) return PERMANENT;
		if (str.startsWith("pea")) return PEACEFUL;
		if (str.startsWith("i")) return INFPOWER;
		if (str.startsWith("pow")) return POWERLOSS;
		if (str.startsWith("pvp")) return PVP;
		if (str.startsWith("fr") || str.startsWith("ff")) return FRIENDLYFIRE;
		if (str.startsWith("m")) return MONSTERS;
		if (str.startsWith("ex")) return EXPLOSIONS;
		if (str.startsWith("fi")) return FIRESPREAD;
		//if (str.startsWith("l")) return LIGHTNING;
		if (str.startsWith("en")) return ENDERGRIEF;		
		return null;
	}
	
	public String getStateInfo(boolean value, boolean withDesc)
	{
		String ret = (value ? "<g>YES" : "<b>NOO") + "<c> " + this.getNicename();
		if (withDesc)
		{
			ret += " " + this.getDescription();
		}
		return ret;
	}
}
