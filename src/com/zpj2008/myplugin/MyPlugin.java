package com.zpj2008.myplugin;

import com.zpj2008.myplugin.commands.*;
import com.zpj2008.myplugin.event.ChatEvent;
import com.zpj2008.myplugin.event.PlayerJoin;
import com.zpj2008.myplugin.event.PlayerQuit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    public static MyPlugin instance;

    @Override
    public void onEnable() {
        instance = this;
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
        getCommand("banme").setExecutor(new banme());
        getCommand("tps").setExecutor(new getop());
        getCommand("kick-pl").setExecutor(new kickplayer());
        getCommand("ess").setExecutor(new stopS());
        getCommand("sreport").setExecutor(new serverbug());
        getCommand("/health").setExecutor(new heal());
        System.out.println("[ISCRO-ADMIN]" + ChatColor.GREEN + "服务器特色插件已加载！");
    }

    @Override
    public void onDisable() {
        System.out.println("[ISCRO-ADMIN]" + ChatColor.RED + "服务器特色插件已卸载！");
    }
}