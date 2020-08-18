package com.zpj2008.iscroadmin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setop implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender.hasPermission("iscroadmin.commands.setop")) {
            if (strings.length == 1) {
                Player op = (Bukkit.getServer().getPlayer(strings[0]));
                if (op == null) {
                    commandSender.sendMessage(ChatColor.WHITE + "[SetOP]" + ChatColor.GREEN + strings[0] + ChatColor.RED + "不在线");
                    return false;
                }
                op.setOp(true);
                System.out.println(ChatColor.WHITE + "[SetOP]" + ChatColor.RED + "Warn: 服务器管理员" + ChatColor.GREEN + commandSender + ChatColor.RED + "将玩家"+ ChatColor.GREEN + op + ChatColor.RED + "设定为了OP！请注意服务器安全！");
            } else {
                commandSender.sendMessage(ChatColor.WHITE + "[SetOP]" + ChatColor.RED + "用法错误！请使用：/setop <Player>");
            }
        }else {
            commandSender.sendMessage(ChatColor.WHITE + "[SetOP]" + ChatColor.RED + "你没有权限这么做！");
        }
        return false;
    }
}
