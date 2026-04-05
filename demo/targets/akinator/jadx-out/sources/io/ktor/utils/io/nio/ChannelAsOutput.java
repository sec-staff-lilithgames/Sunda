package io.ktor.utils.io.nio;

import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ChannelAsOutput extends Output {
    private final WritableByteChannel channel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelAsOutput(ObjectPool<ChunkBuffer> pool, WritableByteChannel channel) {
        super(pool);
        e0.checkNotNullParameter(pool, "pool");
        e0.checkNotNullParameter(channel, "channel");
        this.channel = channel;
    }

    @Override // io.ktor.utils.io.core.Output
    public void closeDestination() throws IOException {
        this.channel.close();
    }

    @Override // io.ktor.utils.io.core.Output
    /* renamed from: flush-62zg_DM */
    public void mo4493flush62zg_DM(ByteBuffer source, int i10, int i11) throws IOException {
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferSliceSafe = MemoryJvmKt.sliceSafe(source, i10, i11);
        while (byteBufferSliceSafe.hasRemaining()) {
            this.channel.write(byteBufferSliceSafe);
        }
    }

    public final WritableByteChannel getChannel() {
        return this.channel;
    }
}
