package com.zpj2008.iscroadmin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class stopS implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender.hasPermission("iscroadmin.commands.stopserver")){
                Bukkit.shutdown();
        }else {
            commandSender.sendMessage(ChatColor.WHITE + "[ServerRestarter]" + ChatColor.RED + "你没有权限这么做！");
        }
        return false;
    }
}
