package com.pandapulsestudios.pulsediscord.API;

import com.pandapulsestudios.pulsecore.Chat.ChatAPI;
import com.pandapulsestudios.pulsecore.Java.JavaAPI;
import com.pandapulsestudios.pulsecore.Loops.PulseLoop;
import com.pandapulsestudios.pulsediscord.Interface.PulseDiscordBot;
import com.pandapulsestudios.pulsediscord.Objects.DiscordBotWrapper;
import com.pandapulsestudios.pulsediscord.PulseDiscord;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.InvocationTargetException;

public class DiscordBotAPI {

    public static DiscordBotWrapper GetDiscordBotWrapper(PulseDiscordBot pulseDiscordBot){
        return PulseDiscord.discordBotWrappers.getOrDefault(pulseDiscordBot.discordBotToken(), null);
    }

    public static void RegisterClasses(JavaPlugin javaPlugin){
        try { RegisterClassesRaw(javaPlugin); }
        catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) { throw new RuntimeException(e);}
    }

    public static void RegisterClassesRaw(JavaPlugin javaPlugin) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for(var autoRegisterClass : JavaAPI.ReturnAllAutoRegisterClasses(javaPlugin)){
            if(PulseDiscordBot.class.isAssignableFrom(autoRegisterClass)) RegisterDiscordBot((PulseDiscordBot) autoRegisterClass.getConstructor().newInstance());
        }
    }

    private static void RegisterDiscordBot(PulseDiscordBot pulseDiscordBot){
        var storedDiscordBotWrapper = PulseDiscord.discordBotWrappers.getOrDefault(pulseDiscordBot.getClass().getSimpleName(), null);
        if(storedDiscordBotWrapper != null) return;
        PulseDiscord.discordBotWrappers.put(pulseDiscordBot.getClass().getSimpleName(), new DiscordBotWrapper(pulseDiscordBot));
    }
}
