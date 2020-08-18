package com.zpj2008.iscroadmin.event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class IBITChat implements Listener {
    @EventHandler
    public void ChatEvent(AsyncPlayerChatEvent event){
        if (event.getMessage().contains(">")){
            String Chat = event.getMessage();
            event.setMessage(ChatColor.GREEN + Chat);
        }
    }
}
