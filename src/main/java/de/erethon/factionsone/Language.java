/*
 * Copyright (C) 2015-2018 Daniel Saukel.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package de.erethon.factionsone;

import com.massivecraft.factions.P;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

/**
 * @author Daniel Saukel
 */
public class Language {

    private static Language instance;

    private File file;
    private FileConfiguration config;

    public String actionBuild = "build";
    public String actionBypass = "<i>You can bypass by using";
    public String actionDestroy = "destroy";
    public String actionDoesNotAllowYouTo = "%s<b> does not allow you to %s<b>.";
    public String actionPainful = "<b>It is painful to %s in the territory of %s<b>.";
    public String actionPlacePaintings = "place paintings";
    public String actionRemovePaintings = "remove paintings";
    public String claimAlreadyOwned = "%s<i> already own this land.";
    public String claimBorder = "<b>You must start claiming land at the border of the territory.";
    public String claimLandOwned = "<b>You may not claim land from others.";
    public String claimLimitReached = "<b>Limit reached. You can't claim more land!";
    public String claimMinMembers = "Factions must have at least <h>%s<b> members to claim land.";
    public String claimNeedMorePower = "<b>You can't claim more land! You need more power!";
    public String claimNotConnected = "<b>You can only claim additional land which is connected to your first claim or controlled by another faction!";
    public String claimNotConnectedFirstClaim = "<b>You can only claim additional land which is connected to your first claim!";
    public String claimOwnerStrongEnough = "%s<i> owns this land and is strong enough to keep it.";
    public String claimProtected = "<b>This land is protected";
    public String claimRelationError = "<b>You can't claim this land due to your relation with the current owner.";
    public String claimWorldDisabled = "<b>Sorry, this world has land claiming disabled.";
    public String configReloaded = "<i>Reloaded <h>config <i>from disk, took <h>%dms<i>.";
    public String factionDefaultDesc = "Default faction description :(";
    public String factionDisbanded = "The faction %s<i> was disbanded.";
    public String factionFactionlessOnline = "<i>Factionless<i> %d online";
    public String factionForOwningLand = "for faction owning ";
    public String factionHomeNotInTerritory = "<b>Your faction home has been un-set since it is no longer in your territory.";
    public String factionLandClaimed = "<h>%s<i> claimed land for <h>%s<i> from <h>%s<i>.";
    public String factionLandDevided = " land divided among ";
    public String factionLeaderKicked = "<i>Faction leader <h>%s<i> has been removed. %s<i> has been promoted as the new faction leader.";
    public String factionList = "Faction List";
    public String factionMembers = "member(s)";
    public String factionOnline = "%s<i> %d/%d online, %d/%d/%d";
    public String factionCmdBlockedEnemy1 = "<b>You can't use the command \"";
    public String factionCmdBlockedEnemy2 = "\" in enemy territory.";
    public String factionCmdBlockedNeutral1 = "<b>You can't use the command \"";
    public String factionCmdBlockedNeutral2 = "\" in neutral territory.";
    public String factionCmdBlockedPermanent1 = "<b>You can't use the command \"";
    public String factionCmdBlockedPermanent2 = "\" because you are in a permanent faction.";
    public String factionPlayerLeft = "%s<i> left %s<i>.";
    public String factionSafeZoneDesc = "Free from PVP and monsters";
    public String factionSafeZoneTag = "SafeZone";
    public String factionTagAlphaNum = "<i>Faction tag must be alphanumeric. \"<h>%s<i>\" is not allowed.";
    public String factionTagTooLong = "<i>The faction tag can't be longer than <h>%s<i> chars.";
    public String factionTagTooShort = "<i>The faction tag can't be shorter than <h>%s<i> chars.";
    public String factionTerritoryAccessRestricted = "<b>This territory owned by your faction has restricted access.";
    public String factionToOwnLand = "to own faction land";
    public String factionWarZoneDesc = "Not the safest place to be";
    public String factionWarZoneTag = "WarZone";
    public String factionWasDisbanded = "<i>%s<i> was disbanded.";
    public String factionWildernessDesc = new String();
    public String factionWildernessTag = "Wilderness";
    public String flagEndergrief = "<i>Can endermen grief in this territory?";
    public String flagExplosions = "<i>Can explosions occur in this territory?";
    public String flagFirespread = "<i>Can fire spread in territory?";
    public String flagFriendlyFire = "<i>Can friends hurt eachother here?";
    public String flagInfpower = "<i>This flag gives the faction infinite power.";
    public String flagMonsters = "<i>Can monsters spawn in this territory?";
    public String flagPeaceful = "<i>Allways in truce with other factions.";
    public String flagPermanent = "<i>A permanent faction will never be deleted.";
    public String flagPowerloss = "<i>Is power lost on death in this territory?";
    public String flagPvp = "<i>Can you PVP in territory?";
    public String fpermAccess = "grant territory";
    public String fpermBuild = "edit the terrain";
    public String fpermButton = "use buttons";
    public String fpermCape = "set the cape";
    public String fpermContainer = "use containers";
    public String fpermDisband = "disband the faction";
    public String fpermDoor = "use doors";
    public String fpermInvite = "invite players";
    public String fpermKick = "kick members";
    public String fpermLever = "use levers";
    public String fpermPainbuild = "edit, take damage";
    public String fpermPerms = "manage permissions";
    public String fpermSetHome = "set the home";
    public String fpermTerritory = "claim or unclaim";
    public String fpermWithdraw = "withdraw money";
    public String help1 = "<i>Learn how to create a faction on the next page.";
    public String help2 = "<i>You might want to close it and use invitations:";
    public String help3 = "<i>And don't forget to set your home:";
    public String help4 = "<i>Your faction has a bank which is used to pay for certain";
    public String help5 = "<i>things, so it will need to have money deposited into it.";
    public String help6 = "<i>To learn more, use the money command.";
    public String help7 = "<i>Player titles are just for fun. No rules connected to them.";
    public String help8 = "<i>Claimed land with ownership set is further protected so";
    public String help9 = "<i>that only the owner(s), faction admin, and possibly the";
    public String help10 = "<i>faction moderators have full access.";
    public String help11 = "<i>Set the relation you WISH to have with another faction.";
    public String help12 = "<i>Your default relation with other factions will be neutral.";
    public String help13 = "<i>If BOTH factions choose \"ally\" you will be allies.";
    public String help14 = "<i>If ONE faction chooses \"enemy\" you will be enemies.";
    public String help15 = "<i>You can never hurt members or allies.";
    public String help16 = "<i>You can not hurt neutrals in their own territory.";
    public String help17 = "<i>You can always hurt enemies and players without faction.";
    public String help18 = "<i>Damage from enemies is reduced in your own territory.";
    public String help19 = "<i>When you die you lose power. It is restored over time.";
    public String help20 = "<i>The power of a faction is the sum of all member power.";
    public String help21 = "<i>The power of a faction determines how much land it can hold.";
    public String help22 = "<i>You can claim land from factions with too little power.";
    public String help23 = "<i>Only faction members can build and destroy in their own";
    public String help24 = "<i>territory. Usage of the following items is also restricted:";
    public String help25 = "<i>Door, Chest, Furnace, Dispenser, Diode.";
    public String help26 = "<i>Make sure to put pressure plates in front of doors for your";
    public String help27 = "<i>guest visitors. Otherwise they can't get through. You can";
    public String help28 = "<i>also use this to create member only areas.";
    public String help29 = "<i>As dispensers are protected, you can create traps without";
    public String help30 = "<i>worrying about those arrows getting stolen.";
    public String help31 = "Finally some commands for the server admins:";
    public String help32 = "<c>/f claim safezone <i>claim land for the Safe Zone";
    public String help33 = "<c>/f claim warzone <i>claim land for the War Zone";
    public String help34 = "<c>/f autoclaim [safezone|warzone] <i>take a guess";
    public String help35 = "works on safe/war zones as well.";
    public String help36 = "<i>More commands for server admins:";
    public String helpFactions = "Factions Help";
    public String helpForCmd = "Help for command";
    public String helpMoneyDepositShort = "deposit money";
    public String helpMoneyLong = "<i>The faction money commands.";
    public String helpMoneyShort = "faction money commands";
    public String helpMoneyTransferFfShort = "transfer f -> f";
    public String helpMoneyTransferFpShort = "transfer f -> p";
    public String helpMoneyTransferPfShort = "transfer p -> f";
    public String helpMoneyWithdrawShort = "withdraw money";
    public String helpPageDoesNotExist = "<b>This page does not exist";
    public String moneyBalance = "<a>%s's<i> balance is <h>%s<i>.";
    public String moneyCannotAffordAmount = "<h>%s<i> can't afford <h>%s<i> %s.";
    public String moneyCannotAffordTransfer = "<h>%s<b> can't afford to transfer <h>%s<b> to %s<b>.";
    public String moneyDeposited = "%s deposited %s in the faction bank: %s";
    public String moneyGained = "<h>%s<i> gained <h>%s<i> %s.";
    public String moneyGainFailed = "<h>%s<i> would have gained <h>%s<i> %s, but the deposit failed.";
    public String moneyGave = "<h>%s<i> <h>gave %s<i> to <h>%s<i>.";
    public String moneyHasAtLeast = "<h>%s<i> can't afford <h>%s<i> %s.";
    public String moneyLost = "<h>%s<i> lost <h>%s<i> %s.";
    public String moneyTook = "<h>%s<i> <h>took %s<i> from <h>%s<i>.";
    public String moneyTransactionFailed = "Unable to transfer %s<b> to <h>%s<b> from <h>%s<b>.";
    public String moneyTransferredInfo = "<h>%s<i> was transfered from <h>%s<i> to <h>%s<i>.";
    public String moneyTransferredFf = "%s transferred %s from the faction \"%s\" to the faction \"%s\"";
    public String moneyTransferredFp = "%s transferred %s from the faction \"%s\" to the player \"%s\"";
    public String moneyTransferredPf = "%s transferred %s from the player \"%s\" to the faction \"%s\"";
    public String moneyWithdrew = "%s withdrew %s from the faction bank: %s";
    public String playerAreaAccessGranted = "<g>You have access to this area.";
    public String playerAreaAccessRestricted = "<b>This area has restricted access.";
    public String playerBannedByAdmin = "Banned by admin.";
    public String playerCannotLeaveNegativePower = "<b>You cannot leave until your power is positive.";
    public String playerForClaiming = "for claiming this land";
    public String playerForLeaving = "for leaving your faction.";
    public String playerMustBeLeader = "<b>You must be leader of the faction to %s.";
    public String playerNewPower = "<i>Your power is now <h>%d / %d";
    public String playerNoFaction = "<b>You are not member of any faction.";
    public String playerNoMatch = "<b>No player match found for \"<p>%s<b>\".";
    public String playerNoneFound = "<b>No player \"<p>%s<b>\" could not be found.";
    public String playerNoPowerlossTerritory = "<i>You didn't lose any power since the territory you died in works that way.";
    public String playerNoPowerlossWorld = "<i>You didn't lose any power due to the world you died in.";
    public String playerNotLeader = "<b>Only faction leaders can %s.";
    public String playerNotOfficer = "<b>Only faction officers can %s.";
    public String playerNotSameFaction = "%s <b>is not in the same faction as you.";
    public String playerPassAdminRole = "<b>You must give the admin role to someone else first.";
    public String playerThatHurts = "<b>Ouch, that is starting to hurt. You should give it a rest.";
    public String playerToClaim = "to claim this land";
    public String playerToLeave = "to leave your faction.";
    public String permNoMoneyControl = "<h>%s<i> lacks permission to control <h>%s's<i> money.";
    public String permOfficersControlEachOther = "<b>Officers can't control each other...";
    public String permOnlyLeaders = "<b>Only the faction leader can do that.";
    public String permOnlyOfficers = "<b>You must be a faction officer to do that.";
    public String pvpAttackedFactionless = "<i>You can't hurt players who are not currently in a faction.";
    public String pvpAttempt = "%s<i> tried to hurt you.";
    public String pvpCannotHurt = "<i>You can't hurt %s<i>.";
    public String pvpCannotHurtTerritory = "<i>You can't hurt %s<i> in their own territory unless you declare them as an enemy.";
    public String pvpDisabled = "<i>PVP is disabled in %s.";
    public String pvpDisabledJoinFaction = "<i>You can't hurt other players until you join a faction.";
    public String pvpDisabledLogin1 = "<i>You can't hurt other players for ";
    public String pvpDisabledLogin2 = " seconds after logging in.";
    public String relAllyPlayerSg = "an ally";
    public String relAllyPlayerPl = "allies";
    public String relAllyFactionSg = "an allied faction";
    public String relAllyFactionPl = "allied factions";
    public String relEnemyPlayerSg = "an enemy";
    public String relEnemyPlayerPl = "enemies";
    public String relEnemyFactionSg = "an enemy faction";
    public String relEnemyFactionPl = "enemy factions";
    public String relLeader = "your faction leader";
    public String relMemberPlayerSg = "a member in your faction";
    public String relMemberPlayerPl = "members in your faction";
    public String relMemberFactionSg = "your faction";
    public String relMemberFactionPl = "your factions";
    public String relNeutralPlayerSg = "someone neutral to you";
    public String relNeutralPlayerPl = "those neutral to you";
    public String relNeutralFactionSg = "a neutral faction";
    public String relNeutralFactionPl = "neutral factions";
    public String relOfficerPlayerSg = "an officer in your faction";
    public String relOfficerPlayerPl = "officers in your faction";
    public String relRecruitPlayerSg = "a recruit in your faction";
    public String relRecruitPlayerPl = "recruits in your faction";
    public String relServerAdmin = "A server admin";
    public String relTrucePlayerSg = "someone in truce with you";
    public String relTrucePlayerPl = "those in truce with you";
    public String relTruceFactionSg = "a faction in truce";
    public String relTruceFactionPl = "factions in truce";
    public String relYourFaction = "your faction";
    public String relYou = "you";
    public String textNoPage = "<i>Sorry. No Pages available.";
    public String textPageInvalid = "<i>Invalid page. Must be between 1 and";
    public String timeAgo = "ago";
    public String timeFromNow = "from now";
    public String timeJustNow = "just now";

    // From internal Lang class
    public String permForbidden = "<b>You don't have permission to %s.";
    public String permDoThat = "do that";
    public String commandSenderMustBePlayer = "<b>This command can only be used by ingame players.";
    public String commandToFewArgs = "<b>Too few arguments. <i>Use like this:";
    public String commandToManyArgs = "<b>Strange argument \"<p>%s<b>\". <i>Use the command like this:";

    private Language() {
        instance = this;
        reload();
    }

    public static Language getInstance() {
        if (instance == null) {
            instance = new Language();
        }
        return instance;
    }

    public void reload() {
        file = new File(P.p.getDataFolder(), "lang.yml");
        if (!file.exists()) {
            try {
                file.createNewFile();
                initConfig();
                config.save(file);
            } catch (IOException exception) {
                P.p.log(Level.SEVERE, "Could not create language file!");
            }
        } else {
            readConfig();
        }
    }

    private void initConfig() {
        if (config == null) {
            config = YamlConfiguration.loadConfiguration(file);
        }
        config.set("claim.protected", claimProtected);
        config.set("faction.list", factionList);
    }

    private void readConfig() {
        if (config == null) {
            config = YamlConfiguration.loadConfiguration(file);
        }
        claimProtected = config.getString("claim.protected", claimProtected);
        factionList = config.getString("faction.list", factionList);
    }

}
