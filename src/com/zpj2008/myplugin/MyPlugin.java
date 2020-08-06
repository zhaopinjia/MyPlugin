package com.zpj2008.myplugin;

import com.zpj2008.myplugin.commands.banme;
import com.zpj2008.myplugin.commands.getop;
import com.zpj2008.myplugin.commands.kickplayer;
import com.zpj2008.myplugin.commands.stopS;
import com.zpj2008.myplugin.event.ChatEvent;
import com.zpj2008.myplugin.event.PlayerJoin;
import com.zpj2008.myplugin.event.PlayerQuit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
        getCommand("banme").setExecutor(new banme());
        getCommand("tps").setExecutor(new getop());
        getCommand("kick-pl").setExecutor(new kickplayer());
        getCommand("ess").setExecutor(new stopS());
        System.out.println(ChatColor.GREEN + "基本管理插件已加载！");
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED + "基本管理插件已卸载！");
    }
}