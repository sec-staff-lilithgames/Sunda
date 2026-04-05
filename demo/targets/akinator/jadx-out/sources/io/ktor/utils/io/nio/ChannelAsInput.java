package io.ktor.utils.io.nio;

import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import kotlin.jvm.internal.e0;
import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ChannelAsInput extends Input {
    private final ReadableByteChannel channel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelAsInput(ReadableByteChannel channel, ObjectPool<ChunkBuffer> pool) {
        super(null, 0L, pool, 3, null);
        e0.checkNotNullParameter(channel, "channel");
        e0.checkNotNullParameter(pool, "pool");
        this.channel = channel;
        if ((channel instanceof SelectableChannel) && ((SelectableChannel) channel).isBlocking()) {
            throw new IllegalArgumentException("Non-blocking channels are not supported");
        }
    }

    @Override // io.ktor.utils.io.core.Input
    public void closeSource() throws IOException {
        this.channel.close();
    }

    @Override // io.ktor.utils.io.core.Input
    /* renamed from: fill-62zg_DM */
    public int mo4494fill62zg_DM(ByteBuffer destination, int i10, int i11) {
        e0.checkNotNullParameter(destination, "destination");
        return v.coerceAtLeast(this.channel.read(MemoryJvmKt.sliceSafe(destination, i10, i11)), 0);
    }
}
