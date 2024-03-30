package com.pandapulsestudios.pulsediscord.Objects;

import com.pandapulsestudios.pulsecore.Chat.ChatAPI;
import com.pandapulsestudios.pulsediscord.Interface.PulseDiscordBot;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class DiscordBotWrapper{
    private final JDA jda;

    public DiscordBotWrapper(PulseDiscordBot pulseDiscordBot){
        jda = JDABuilder.createDefault(pulseDiscordBot.discordBotToken())
                .addEventListeners(new DiscordBotListener(pulseDiscordBot))
                .setActivity(pulseDiscordBot.discordBotActivity())
                .enableIntents(pulseDiscordBot.discordBotIntents())
                .setMemberCachePolicy(pulseDiscordBot.discordMemberCachePolicy())
                .setAutoReconnect(pulseDiscordBot.autoReconnect())
                .build();
        jda.updateCommands().addCommands(pulseDiscordBot.discordBotCommandData()).queue();
        ChatAPI.chatBuilder().SendMessage(String.format("&9Registered Discord Bot: %s", pulseDiscordBot.getClass().getSimpleName()));
    }

    public JDA ReturnJDA(){
        return jda;
    }

    public void ShutdownConnection() throws InterruptedException {
        jda.shutdownNow();
    }


}
