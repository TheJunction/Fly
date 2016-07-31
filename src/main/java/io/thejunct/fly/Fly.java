package io.thejunct.fly;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Fly extends JavaPlugin {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("junction.fly")) {
            if (player.isFlying()) {
                player.setFlying(false);
                player.sendMessage("You are no longer flying");
            } else {
                player.setFlying(true);
                player.sendMessage("You Are Now Flying");
            }
            return true;
        }
        return false;
    }
}
