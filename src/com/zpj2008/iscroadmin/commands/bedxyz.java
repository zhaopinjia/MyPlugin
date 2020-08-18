package com.zpj2008.iscroadmin.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class bedxyz implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player playerbed = (Player)commandSender;
            String bed_xyz = ChatColor.WHITE + "[BedXYZ]" + ChatColor.RED + "你的床位置：%player_bed_x% %player_bed_y% %player_bed_z%";
            bed_xyz = PlaceholderAPI.setPlaceholders(playerbed,bed_xyz);
            playerbed.sendMessage(bed_xyz);
        }else {
            commandSender.sendMessage(ChatColor.WHITE + "[BedXYZ]" + ChatColor.RED + "该指令只能在玩家处执行！");
        }
        return false;
    }
}
