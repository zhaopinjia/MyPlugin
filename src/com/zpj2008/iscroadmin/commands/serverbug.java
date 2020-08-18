package com.zpj2008.iscroadmin.commands;

import com.zpj2008.iscroadmin.MyPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class serverbug implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            if (strings.length == 2) {
                Player PlayerName = (Player)commandSender;
                String reason = strings[0];
                String call = strings[1];
                MyPlugin.instance.getConfig().set("player_srp." + PlayerName + ".report:" + reason + ".联系方式", call);
                MyPlugin.instance.saveConfig();
                PlayerName.sendMessage(ChatColor.GOLD + "[ServerBugReporter]" + ChatColor.WHITE + "您成功地反馈了问题：" + reason + ChatColor.RED + "\n服务器管理员将在1周内联系你，你也可以加入我们的QQ群：931502870");
                System.out.println(ChatColor.GOLD + "[ServerBugReporter]\n" + ChatColor.WHITE + "玩家" + PlayerName + "反馈了问题：" + reason + ChatColor.RED + "\n请注意config.yml中的信息！");
            }else{
                commandSender.sendMessage(ChatColor.GOLD + "[ServerBugReporter]\n" + ChatColor.RED + "用法错误！请使用：/sreport <服务器问题> <联系方式>进行反馈！");
            }
        }else{
            commandSender.sendMessage(ChatColor.GOLD + "[ServerBugReporter]\n" + ChatColor.RED + "该指令只能在玩家处执行！");
        }
        return false;
    }
}
