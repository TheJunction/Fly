package io.thejunct.fly;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Fly extends JavaPlugin {
    private Logger logger;

    @Override
    public void onEnable() {
        PluginDescriptionFile pdfFile = this.getDescription();
        Logger logger = Logger.getLogger("Minecraft");
        this.logger.info(pdfFile.getName() + " Has Been Activated")
    }

    @Override
    public void onDisable() {
        PluginDescriptionFile pdfFile = this.getDescription();
        Logger logger = Logger.getLogger("Minecraft");
        this.logger.info(pdfFile.getName() + " Has Been Turned Off")
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("testfly")) {

            player.setFlying();
            player.sendMessage("You Are Now Flying");

        }
    }

    return false
}
