package com.pandapulsestudios.pulsediscord;

import com.pandapulsestudios.pulsediscord.API.DiscordBotAPI;
import com.pandapulsestudios.pulsediscord.Objects.DiscordBotWrapper;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.LinkedHashMap;

public final class PulseDiscord extends JavaPlugin {
    public static LinkedHashMap<String, DiscordBotWrapper> discordBotWrappers = new LinkedHashMap<>();

    @Override
    public void onEnable() {
        DiscordBotAPI.RegisterClasses(this);
    }

    @Override
    public void onDisable() {
        for(var discordBotWrapper : discordBotWrappers.values()) {
            try {discordBotWrapper.ShutdownConnection();}
            catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}
