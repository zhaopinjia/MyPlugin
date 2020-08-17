package com.zpj2008.myplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class banme implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player kickme = (Player)commandSender;
            kickme.kickPlayer(ChatColor.GOLD + "你已被此服务器永久封禁\n\n" + ChatColor.GRAY + "请不要担心，这是我们的一个小玩笑，你只需要重新连接服务器就可以恢复了！");
        }else{
            System.out.println(ChatColor.RED + "[ISCRO]此指令只能在玩家处执行");
        }
        return false;
        }
    }
