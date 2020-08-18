package com.zpj2008.iscroadmin;

import com.zpj2008.iscroadmin.commands.*;
import com.zpj2008.iscroadmin.event.IBITChat;
import com.zpj2008.iscroadmin.event.PlayerJoin;
import com.zpj2008.iscroadmin.event.PlayerQuit;
import com.zpj2008.iscroadmin.gui.rubbish;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public class MyPlugin extends JavaPlugin {
    private org.bukkit.configuration.file.FileConfiguration config;
    private org.bukkit.configuration.file.FileConfiguration reports;
    public static MyPlugin instance;
    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            instance = this;
            getConfig().options().copyDefaults();
            saveDefaultConfig();


            getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
            getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
            getServer().getPluginManager().registerEvents(new IBITChat(), this);
            getCommand("banme").setExecutor(new banme());
            getCommand("setop").setExecutor(new setop());
            getCommand("kick-pl").setExecutor(new kickplayer());
            getCommand("stops").setExecutor(new stopS());
            getCommand("sreport").setExecutor(new serverbug());
            getCommand("/health").setExecutor(new heal());
            getCommand("bedxyz").setExecutor(new bedxyz());
            getCommand("rubbish").setExecutor(new rubbish());
            getCommand("/hungry").setExecutor(new hun());
            System.out.println(ChatColor.WHITE + "[ISCRO-ADMIN]" + ChatColor.GREEN + "欢迎使用IBIT特色功能插件！插件已完全加载！本插件禁止外传！本插件版权属于jared2021！");
    } else {
        getLogger().warning("[ISCROAdmin]我们找不到PlaceholderAPI! 服务器将按我们的预定设置关闭！请在安装前置插件后重试！");
        Bukkit.shutdown();
        }
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.WHITE + "[ISCRO-ADMIN]" + ChatColor.RED + "服务器特色插件已卸载！");
    }
}