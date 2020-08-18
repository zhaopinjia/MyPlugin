package com.zpj2008.iscroadmin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player heal = (Player)commandSender;
            if (heal.getHealth()<20) {
                heal.sendMessage(ChatColor.WHITE + "[Health]" + ChatColor.GREEN + "你的血量已经增加到20！");
                heal.setHealth(20);
            }else{
                heal.sendMessage(ChatColor.WHITE + "[Health]" + ChatColor.RED + "你的血量已经是20了！");
            }
        }else{
            commandSender.sendMessage(ChatColor.RED + "该指令只能由玩家执行！");
        }
        return false;
    }
}
