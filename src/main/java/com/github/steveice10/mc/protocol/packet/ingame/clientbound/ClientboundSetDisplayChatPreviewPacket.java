package com.github.steveice10.mc.protocol.packet.ingame.clientbound;

import com.github.steveice10.mc.protocol.codec.MinecraftCodecHelper;
import com.github.steveice10.mc.protocol.codec.MinecraftPacket;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

import java.io.IOException;

@Data
@With
@AllArgsConstructor
public class ClientboundSetDisplayChatPreviewPacket implements MinecraftPacket {
	private final boolean enabled;

	public ClientboundSetDisplayChatPreviewPacket(ByteBuf in, MinecraftCodecHelper helper) throws IOException {
		this.enabled = in.readBoolean();
	}

	@Override
	public void serialize(ByteBuf out, MinecraftCodecHelper helper) throws IOException {
		out.writeBoolean(this.enabled);
	}
}
