package com.zpj2008.myplugin.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class ChatEvent implements Listener {
    Plugin plugin = com.zpj2008.myplugin.MyPlugin.getPlugin(com.zpj2008.myplugin.MyPlugin.class);
    @EventHandler
    public void ChatEvent(AsyncPlayerChatEvent event){
        if (event.getMessage().contains(plugin.getConfig().getString("zanghua"))){
            event.setMessage("***");
            String playerMessage = event.getMessage();
            Player player = event.getPlayer();
            String playerName = event.getPlayer().getName();
            player.sendMessage(ChatColor.RED + "请注意文明素质");
            System.out.println(playerName + "想要发送敏感词：" + playerMessage);
        }
    }
}
