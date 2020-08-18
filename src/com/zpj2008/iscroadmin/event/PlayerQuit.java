package com.zpj2008.iscroadmin.event;


import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {
    @EventHandler
    public void PlayQuit(PlayerQuitEvent event) {
        String playerq = event.getPlayer().getName();
        event.setQuitMessage(ChatColor.YELLOW + "玩家" + playerq + " 与刺激服的连接不知为何丢失了");
    }
}
