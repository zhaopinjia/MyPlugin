package com.zpj2008.myplugin.event;


import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {
    @EventHandler
    public void PlayQuit(PlayerQuitEvent event) {
        String playerq = event.getPlayer().getName();
        event.setQuitMessage(ChatColor.AQUA + "ISCRO成员 " + playerq + " 跑路了");
    }
}
