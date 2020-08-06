package com.zpj2008.myplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class kickplayer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            if (strings.length == 2) {
                String kick = strings[1];
                Player player = (Bukkit.getServer().getPlayer(strings[0]));
                if (player == null) {
                    commandSender.sendMessage(ChatColor.WHITE + "[KICK]\n" + ChatColor.GREEN + strings[0] + ChatColor.RED + "不在线");
                    return false;
                }
                player.kickPlayer(ChatColor.RED + "你已被此服务器临时踢出\n\n" + ChatColor.GRAY + "原因：" + ChatColor.WHITE + kick + "\n\n" + ChatColor.DARK_AQUA + "请尝试重新连接至服务器！");
            } else {
                if (strings.length == 1) {
                    Player player = (Bukkit.getServer().getPlayer(strings[0]));
                    player.kickPlayer(ChatColor.GOLD + "服务器断开连接");
                } else {
                    commandSender.sendMessage(ChatColor.WHITE + "[KICK]\n" + ChatColor.RED + "用法错误！请使用：/kick-pl <Player> <Reason>");
                }
            }
        }else{
            System.out.println("未知的指令，请输入'/help'获取帮助");
        }
        return false;
    }
}
