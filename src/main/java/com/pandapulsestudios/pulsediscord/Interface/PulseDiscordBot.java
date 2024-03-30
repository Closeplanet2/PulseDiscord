package com.pandapulsestudios.pulsediscord.Interface;

import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.automod.*;
import net.dv8tion.jda.api.events.channel.ChannelCreateEvent;
import net.dv8tion.jda.api.events.channel.ChannelDeleteEvent;
import net.dv8tion.jda.api.events.channel.GenericChannelEvent;
import net.dv8tion.jda.api.events.channel.forum.ForumTagAddEvent;
import net.dv8tion.jda.api.events.channel.forum.ForumTagRemoveEvent;
import net.dv8tion.jda.api.events.channel.forum.GenericForumTagEvent;
import net.dv8tion.jda.api.events.channel.forum.update.ForumTagUpdateEmojiEvent;
import net.dv8tion.jda.api.events.channel.forum.update.ForumTagUpdateModeratedEvent;
import net.dv8tion.jda.api.events.channel.forum.update.ForumTagUpdateNameEvent;
import net.dv8tion.jda.api.events.channel.forum.update.GenericForumTagUpdateEvent;
import net.dv8tion.jda.api.events.channel.update.*;
import net.dv8tion.jda.api.events.emoji.EmojiAddedEvent;
import net.dv8tion.jda.api.events.emoji.EmojiRemovedEvent;
import net.dv8tion.jda.api.events.emoji.GenericEmojiEvent;
import net.dv8tion.jda.api.events.emoji.update.EmojiUpdateNameEvent;
import net.dv8tion.jda.api.events.emoji.update.EmojiUpdateRolesEvent;
import net.dv8tion.jda.api.events.emoji.update.GenericEmojiUpdateEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

import java.util.List;

public interface PulseDiscordBot {
    String discordBotToken();
    Activity discordBotActivity();
    MemberCachePolicy discordMemberCachePolicy();
    List<GatewayIntent> discordBotIntents();
    CommandData[] discordBotCommandData();
    boolean autoReconnect();
    boolean debugGenericEvents();
    default void GenericEvent(GenericEvent event){}
    default void ReadyEvent(ReadyEvent event){}
    default void AutoModExecutionEvent(AutoModExecutionEvent event){}
    default void AutoModRuleCreateEvent(AutoModRuleCreateEvent event){}
    default void AutoModRuleDeleteEvent(AutoModRuleDeleteEvent event){}
    default void AutoModRuleUpdateEvent(AutoModRuleUpdateEvent event){}
    default void GenericAutoModRuleEvent(GenericAutoModRuleEvent event){}
    default void ForumTagUpdateEmojiEvent(ForumTagUpdateEmojiEvent event){}
    default void ForumTagUpdateModeratedEvent(ForumTagUpdateModeratedEvent event){}
    default void ForumTagUpdateNameEvent(ForumTagUpdateNameEvent event){}
    default void ForumTagAddEvent(ForumTagAddEvent event){}
    default void ForumTagRemoveEvent(ForumTagRemoveEvent event){}
    default void GenericForumTagEvent(GenericForumTagEvent event){}
    default void ChannelUpdateAppliedTagsEvent(ChannelUpdateAppliedTagsEvent event){}
    default void ChannelUpdateArchiveTimestampEvent(ChannelUpdateArchiveTimestampEvent event){}
    default void ChannelUpdateArchivedEvent(ChannelUpdateArchivedEvent event){}
    default void ChannelUpdateAutoArchiveDurationEvent(ChannelUpdateAutoArchiveDurationEvent event){}
    default void ChannelUpdateBitrateEvent(ChannelUpdateBitrateEvent event){}
    default void ChannelUpdateDefaultLayoutEvent(ChannelUpdateDefaultLayoutEvent event){}
    default void ChannelUpdateDefaultReactionEvent(ChannelUpdateDefaultReactionEvent event){}
    default void ChannelUpdateDefaultSortOrderEvent(ChannelUpdateDefaultSortOrderEvent event){}
    default void ChannelUpdateDefaultThreadSlowmodeEvent(ChannelUpdateDefaultThreadSlowmodeEvent event){}
    default void ChannelUpdateFlagsEvent(ChannelUpdateFlagsEvent event){}
    default void ChannelUpdateInvitableEvent(ChannelUpdateInvitableEvent event){}
    default void ChannelUpdateLockedEvent(ChannelUpdateLockedEvent event){}
    default void ChannelUpdateNSFWEvent(ChannelUpdateNSFWEvent event){}
    default void ChannelUpdateNameEvent(ChannelUpdateNameEvent event){}
    default void ChannelUpdateParentEvent(ChannelUpdateParentEvent event){}
    default void ChannelUpdatePositionEvent(ChannelUpdatePositionEvent event){}
    default void ChannelUpdateRegionEvent(ChannelUpdateRegionEvent event){}
    default void ChannelUpdateSlowmodeEvent(ChannelUpdateSlowmodeEvent event){}
    default void ChannelUpdateTopicEvent(ChannelUpdateTopicEvent event){}
    default void ChannelUpdateTypeEvent(ChannelUpdateTypeEvent event){}
    default void ChannelUpdateUserLimitEvent(ChannelUpdateUserLimitEvent event){}
    default void ChannelUpdateVoiceStatusEvent(ChannelUpdateVoiceStatusEvent event){}
    default void ChannelCreateEvent(ChannelCreateEvent event){}
    default void ChannelDeleteEvent(ChannelDeleteEvent event){}
    default void GenericChannelEvent(GenericChannelEvent event){}
    default void EmojiUpdateNameEvent(EmojiUpdateNameEvent event){}
    default void EmojiUpdateRolesEvent(EmojiUpdateRolesEvent event){}
    default void EmojiAddedEvent(EmojiAddedEvent event){}
    default void EmojiRemovedEvent(EmojiRemovedEvent event){}
    default void GenericEmojiEvent(GenericEmojiEvent event){}
    default void MessageReceivedEvent(MessageReceivedEvent event){}
    default void SlashCommandInteractionEvent(SlashCommandInteractionEvent event, String commandName){}
}
