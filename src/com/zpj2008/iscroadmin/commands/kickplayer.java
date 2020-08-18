package com.zpj2008.iscroadmin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class kickplayer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender.hasPermission("iscroadmin.commands.kickplayer")) {
                if (strings.length == 2) {
                    String kick = strings[1];
                    Player player = (Bukkit.getServer().getPlayer(strings[0]));
                    if (player == null) {
                        commandSender.sendMessage(ChatColor.WHITE + "[KICK]" + ChatColor.GREEN + strings[0] + ChatColor.RED + "不在线");
                        return false;
                    }
                    player.kickPlayer(ChatColor.RED + "你已被此服务器临时踢出\n\n" + ChatColor.GRAY + "原因：" + ChatColor.WHITE + kick + "\n\n" + ChatColor.DARK_AQUA + "请尝试重新连接至服务器！");
                } else {
                    if (strings.length == 1) {
                        Player player = (Bukkit.getServer().getPlayer(strings[0]));
                        player.kickPlayer(ChatColor.GOLD + "服务器断开连接");
                    } else {
                        commandSender.sendMessage(ChatColor.WHITE + "[KICK]" + ChatColor.RED + "用法错误！请使用：/kick-pl <Player> <Reason>");
                        return false;
                    }
                }
        }else {
            commandSender.sendMessage(ChatColor.WHITE + "[KICK]" + ChatColor.RED + "你没有权限这么做！");
        }
        return false;
    }
}
