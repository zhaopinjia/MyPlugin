package com.zpj2008.iscroadmin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hun implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player hun = (Player)commandSender;
            if (hun.getFoodLevel()<20) {
                hun.sendMessage(ChatColor.WHITE + "[Food]" + ChatColor.GREEN + "你的饥饿度已回满！");
                hun.setFoodLevel(20);
            }else{
                hun.sendMessage(ChatColor.WHITE + "[Food]" + ChatColor.RED + "你的饥饿度不需要恢复！");
            }
        }else{
            commandSender.sendMessage(ChatColor.RED + "该指令只能由玩家执行！");
        }
        return false;
    }
}
