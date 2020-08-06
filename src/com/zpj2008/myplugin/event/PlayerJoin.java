package com.zpj2008.myplugin.event;


import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void PlayJoin(PlayerJoinEvent event) {
        String playerj = event.getPlayer().getName();
        event.setJoinMessage(ChatColor.AQUA + "ISCRO成员 " + playerj + " 飞入了游戏");
    }
}
