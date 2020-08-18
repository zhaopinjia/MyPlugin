package com.zpj2008.iscroadmin.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class rubbish implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player rguip = (Player) commandSender;
            Inventory rubbishgui = Bukkit.createInventory(null, 27, ChatColor.WHITE + "[GuiRubbishCleaner]" + ChatColor.RED + "请将不需要的物品放入此处，完成后按ESC退出");
            rguip.openInventory(rubbishgui);
        }else {
            commandSender.sendMessage(ChatColor.WHITE + "[GuiRubbishCleaner]" + ChatColor.RED + "该指令只能在玩家处执行！");
        }
        return false;
    }
}
