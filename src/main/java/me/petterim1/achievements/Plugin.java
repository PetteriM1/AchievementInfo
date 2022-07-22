package me.petterim1.achievements;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.element.ElementButtonImageData;
import cn.nukkit.form.response.FormResponseSimple;
import cn.nukkit.form.window.FormWindowSimple;
import cn.nukkit.plugin.PluginBase;

public class Plugin extends PluginBase implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("achievements")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                FormWindowSimple form = new FormWindowSimple("Achievements", "");
                String openInventory = p.hasAchievement("openInventory") ? "§2" : "§8";
                form.addButton(new ElementButton(openInventory + "Taking Inventory",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/book_normal.png")));
                String mineWood = p.hasAchievement("mineWood") ? "§2" : "§8";
                form.addButton(new ElementButton(mineWood + "Getting Wood",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/blocks/log_oak.png")));
                String buildWorkBench = p.hasAchievement("buildWorkBench") ? "§2" : "§8";
                form.addButton(new ElementButton(buildWorkBench + "Benchmarking",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/blocks/crafting_table_side.png")));
                String buildPickaxe = p.hasAchievement("buildPickaxe") ? "§2" : "§8";
                form.addButton(new ElementButton(buildPickaxe + "Time to Mine!",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/wood_pickaxe.png")));
                String buildFurnace = p.hasAchievement("buildFurnace") ? "§2" : "§8";
                form.addButton(new ElementButton(buildFurnace + "Hot Topic",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/blocks/furnace_front_off.png")));
                String acquireIron = p.hasAchievement("acquireIron") ? "§2" : "§8";
                form.addButton(new ElementButton(acquireIron + "Acquire Hardware",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/iron_ingot.png")));
                String buildHoe = p.hasAchievement("buildHoe") ? "§2" : "§8";
                form.addButton(new ElementButton(buildHoe + "Time to Farm!",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/wood_hoe.png")));
                String makeBread = p.hasAchievement("makeBread") ? "§2" : "§8";
                form.addButton(new ElementButton(makeBread + "Bake Bread",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/bread.png")));
                String bakeCake = p.hasAchievement("bakeCake") ? "§2" : "§8";
                form.addButton(new ElementButton(bakeCake + "The Lie",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/cake.png")));
                String buildBetterPickaxe = p.hasAchievement("buildBetterPickaxe") ? "§2" : "§8";
                form.addButton(new ElementButton(buildBetterPickaxe + "Getting an Upgrade",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/stone_pickaxe.png")));
                String cookFish = p.hasAchievement("cookFish") ? "§2" : "§8";
                form.addButton(new ElementButton(cookFish + "Delicious Fish",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/fish_raw.png"))); // should be a different fish
                String onARail = p.hasAchievement("onARail") ? "§2" : "§8";
                form.addButton(new ElementButton(onARail + "On A Rail",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/blocks/rail_normal.png")));
                String buildSword = p.hasAchievement("buildSword") ? "§2" : "§8";
                form.addButton(new ElementButton(buildSword + "Time to Strike!",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/wood_sword.png")));
                String killEnemy = p.hasAchievement("killEnemy") ? "§2" : "§8";
                form.addButton(new ElementButton(killEnemy + "Monster Hunter",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/bone.png")));
                String killCow = p.hasAchievement("killCow") ? "§2" : "§8";
                form.addButton(new ElementButton(killCow + "Cow Tipper",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/leather.png")));
                String flyPig = p.hasAchievement("flyPig") ? "§2" : "§8";
                form.addButton(new ElementButton(flyPig + "When Pigs Fly",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/saddle.png")));
                String snipeSkeleton = p.hasAchievement("snipeSkeleton") ? "§2" : "§8";
                form.addButton(new ElementButton(snipeSkeleton + "Sniper Duel",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/bow_standby.png")));
                String diamonds = p.hasAchievement("diamonds") ? "§2" : "§8";
                form.addButton(new ElementButton(diamonds + "DIAMONDS!",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/blocks/diamond_ore.png")));
                String portal = p.hasAchievement("portal") ? "§2" : "§8";
                form.addButton(new ElementButton(portal + "We Need to Go Deeper",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/blocks/obsidian.png")));
                String ghast = p.hasAchievement("ghast") ? "§2" : "§8";
                form.addButton(new ElementButton(ghast + "Return to Sender",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/ghast_tear.png")));
                String blazeRod = p.hasAchievement("blazeRod") ? "§2" : "§8";
                form.addButton(new ElementButton(blazeRod + "Into Fire",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/blaze_rod.png")));
                String potion = p.hasAchievement("potion") ? "§2" : "§8";
                form.addButton(new ElementButton(potion + "Local Brewery",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/potion_bottle_heal.png"))); // not sure which potion this should be
                String theEnd = p.hasAchievement("theEnd") ? "§2" : "§8";
                form.addButton(new ElementButton(theEnd + "The End?",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/ender_eye.png")));
                String theEnd2 = p.hasAchievement("theEnd2") ? "§2" : "§8";
                form.addButton(new ElementButton(theEnd2 + "The End.",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/blocks/dragon_egg.png")));
                String enchantments = p.hasAchievement("enchantments") ? "§2" : "§8";
                form.addButton(new ElementButton(enchantments + "Enchanter",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/blocks/enchanting_table_side.png")));
                String overkill = p.hasAchievement("overkill") ? "§2" : "§8";
                form.addButton(new ElementButton(overkill + "Overkill",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/diamond_sword.png")));
                String bookcase = p.hasAchievement("bookcase") ? "§2" : "§8";
                form.addButton(new ElementButton(bookcase + "Librarian",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/blocks/bookshelf.png")));
                String exploreAllBiomes = p.hasAchievement("exploreAllBiomes") ? "§2" : "§8";
                form.addButton(new ElementButton(exploreAllBiomes + "Adventuring Time",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/diamond_boots.png")));
                String spawnWither = p.hasAchievement("spawnWither") ? "§2" : "§8";
                form.addButton(new ElementButton(spawnWither + "The Beginning?",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/entity/skulls/wither_skeleton.png"))); // should be a wither skull
                String killWither = p.hasAchievement("killWither") ? "§2" : "§8";
                form.addButton(new ElementButton(killWither + "The Beginning.",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/nether_star.png")));
                String fullBeacon = p.hasAchievement("fullBeacon") ? "§2" : "§8";
                form.addButton(new ElementButton(fullBeacon + "Beaconator",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/blocks/beacon.png")));
                String breedCow = p.hasAchievement("breedCow") ? "§2" : "§8";
                form.addButton(new ElementButton(breedCow + "Repopulation",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/wheat.png")));
                String diamondsToYou = p.hasAchievement("diamondsToYou") ? "§2" : "§8";
                form.addButton(new ElementButton(diamondsToYou + "Diamonds to you!",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/diamond.png")));
                String overpowered = p.hasAchievement("overpowered") ? "§2" : "§8";
                form.addButton(new ElementButton(overpowered + "Overpowered",
                        new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, "textures/items/apple_golden.png"))); // should be an enchanted golden apple
                p.showFormWindow(form, Integer.MAX_VALUE - 21072022);
            } else {
                sender.sendMessage("§cThis command can be used only as a player");
            }
            return true;
        }
        return false;
    }

    @EventHandler
    public void onFormResponse(PlayerFormRespondedEvent e) {
        if (e.getWindow() instanceof FormWindowSimple && e.getResponse() instanceof FormResponseSimple) {
            if (e.getFormID() == Integer.MAX_VALUE - 21072022) {
                int id = ((FormResponseSimple) e.getResponse()).getClickedButtonId();
                switch (id) {
                    case 0:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Taking Inventory", "Press 'E' to open your inventory\n\n\nParent: -"));
                        return;
                    case 1:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Getting Wood", "Attack a tree until a block of wood pops out\n\n\nParent: Taking Inventory"));
                        return;
                    case 2:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Benchmarking", "Craft a workbench with four blocks of planks\n\n\nParent: Getting Wood"));
                        return;
                    case 3:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Time to Mine!", "Use planks and sticks to make a pickaxe\n\n\nParent: Benchmarking"));
                        return;
                    case 4:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Hot Topic", "Construct a furnace out of eight cobblestone blocks\n\n\nParent: Time to Mine!"));
                        return;
                    case 5:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Acquire Hardware", "Smelt an iron ingot\n\n\nParent: Hot Topic"));
                        return;
                    case 6:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Time to Farm!", "Use planks and sticks to make a hoe\n\n\nParent: Benchmarking"));
                        return;
                    case 7:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Bake Bread", "Turn wheat into bread\n\n\nParent: Time to Farm!"));
                        return;
                    case 8:
                        e.getPlayer().showFormWindow(new FormWindowSimple("The Lie", "Bake cake using wheat, sugar, milk, and eggs\n\n\nParent: Time to Farm!"));
                        return;
                    case 9:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Getting an Upgrade", "Construct a better pickaxe\n\n\nParent: Time to Mine!"));
                        return;
                    case 10:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Delicious Fish", "Catch and cook a fish\n\n\nParent: Hot Topic"));
                        return;
                    case 11:
                        e.getPlayer().showFormWindow(new FormWindowSimple("On A Rail", "Travel by minecart at least 1 km from where you started\n\n\nParent: Acquire Hardware"));
                        return;
                    case 12:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Time to Strike!", "Use planks and sticks to make a sword\n\n\nParent: Benchmarking"));
                        return;
                    case 13:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Monster Hunter", "Attack and destroy a monster\n\n\nParent: Time to Strike!"));
                        return;
                    case 14:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Cow Tipper", "Harvest some leather\n\n\nParent: Time to Strike!"));
                        return;
                    case 15:
                        e.getPlayer().showFormWindow(new FormWindowSimple("When Pigs Fly", "Fly a pig off a cliff\n\n\nParent: Cow Tipper"));
                        return;
                    case 16:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Sniper Duel", "Kill a skeleton with an arrow from more than 50 meters\n\n\nParent: Monster Hunter"));
                        return;
                    case 17:
                        e.getPlayer().showFormWindow(new FormWindowSimple("DIAMONDS!", "Acquire diamonds with your iron tools\n\n\nParent: Acquire Hardware"));
                        return;
                    case 18:
                        e.getPlayer().showFormWindow(new FormWindowSimple("We Need to Go Deeper", "Build a portal to the Nether\n\n\nParent: DIAMONDS!"));
                        return;
                    case 19:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Return to Sender", "Destroy a Ghast with a fireball\n\n\nParent: We Need to Go Deeper"));
                        return;
                    case 20:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Into Fire", "Relieve a Blaze of its rod\n\n\nParent: We Need to Go Deeper"));
                        return;
                    case 21:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Local Brewery", "Brew a potion\n\n\nParent: Into Fire"));
                        return;
                    case 22:
                        e.getPlayer().showFormWindow(new FormWindowSimple("The End?", "Locate the End\n\n\nParent: Into Fire"));
                        return;
                    case 23:
                        e.getPlayer().showFormWindow(new FormWindowSimple("The End.", "Defeat the Ender Dragon\n\n\nParent: The End?"));
                        return;
                    case 24:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Enchanter", "Use a book, obsidian and diamonds to construct an enchantment table\n\n\nParent: DIAMONDS!"));
                        return;
                    case 25:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Overkill", "Deal nine hearts of damage in a single hit\n\n\nParent: Enchanter"));
                        return;
                    case 26:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Librarian", "Build some bookshelves to improve your enchantment table\n\n\nParent: Enchanter"));
                        return;
                    case 27:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Adventuring Time", "Discover all biomes\n\n\nParent: The End?"));
                        return;
                    case 28:
                        e.getPlayer().showFormWindow(new FormWindowSimple("The Beginning?", "Spawn the Wither\n\n\nParent: The End."));
                        return;
                    case 29:
                        e.getPlayer().showFormWindow(new FormWindowSimple("The Beginning.", "Kill the Wither\n\n\nParent: The Beginning?"));
                        return;
                    case 30:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Beaconator", "Create a full beacon\n\n\nParent: The Beginning."));
                        return;
                    case 31:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Repopulation", "Breed two cows with wheat\n\n\nParent: Cow Tipper"));
                        return;
                    case 32:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Diamonds to you!", "Throw diamonds at another player\n\n\nParent: DIAMONDS!"));
                        return;
                    case 33:
                        e.getPlayer().showFormWindow(new FormWindowSimple("Overpowered", "Eat the Notch apple\n\n\nParent: Getting an Upgrade"));
                        return;
                    default:
                        getLogger().error("Invalid button id: " + id);
                }
            }
        }
    }
}
