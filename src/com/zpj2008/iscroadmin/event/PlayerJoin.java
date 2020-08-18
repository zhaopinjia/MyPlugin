package com.zpj2008.iscroadmin.event;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void PlayJoin(PlayerJoinEvent event) {
        String playerj = event.getPlayer().getName();
        Player playerjoin = event.getPlayer();
        playerjoin.sendMessage(ChatColor.GOLD + "IBIT is full\nPostition in queue: 1\nConnecting to the server...");
        event.setJoinMessage(ChatColor.YELLOW + "玩家" + playerj + " 已登入至IBIT刺稽服");
    }
}
