package com.github.steveice10.mc.protocol.data.game;

import com.github.steveice10.mc.auth.data.GameProfile;
import com.github.steveice10.mc.protocol.data.game.entity.player.GameMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import net.kyori.adventure.text.Component;

import java.security.PublicKey;

@Data
@AllArgsConstructor
public class PlayerListEntry {
    private final @NonNull GameProfile profile;
    private final GameMode gameMode;
    private final int ping;
    private final Component displayName;
    private final long expiresAt;
    private final PublicKey publicKey;
    private final byte[] keySignature;

    public PlayerListEntry(GameProfile profile) {
        this(profile, null, 0, null, 0, null, null);
    }

    public PlayerListEntry(GameProfile profile, GameMode gameMode) {
        this(profile, gameMode, 0, null, 0, null, null);
    }

    public PlayerListEntry(GameProfile profile, int ping) {
        this(profile, null, ping, null, 0, null, null);
    }

    public PlayerListEntry(GameProfile profile, Component displayName) {
        this(profile, null, 0, displayName, 0, null, null);
    }
}
