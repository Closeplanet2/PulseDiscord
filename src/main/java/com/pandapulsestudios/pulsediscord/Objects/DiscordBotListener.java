package com.pandapulsestudios.pulsediscord.Objects;

import com.pandapulsestudios.pulsecore.Chat.ChatAPI;
import com.pandapulsestudios.pulsediscord.Interface.PulseDiscordBot;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;

public class DiscordBotListener extends ListenerAdapter {

    private final PulseDiscordBot pulseDiscordBot;

    public DiscordBotListener(PulseDiscordBot pulseDiscordBot){
        this.pulseDiscordBot = pulseDiscordBot;
    }

    @Override
    public void onGenericEvent(@NotNull GenericEvent event) {
        if(pulseDiscordBot.debugGenericEvents()) ChatAPI.chatBuilder().SendMessage(event.toString());
        pulseDiscordBot.GenericEvent(event);
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        pulseDiscordBot.MessageReceivedEvent(event);
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        pulseDiscordBot.SlashCommandInteractionEvent(event, event.getName());
    }
}
