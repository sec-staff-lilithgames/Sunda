package io.ktor.utils.io.internal;

import io.ktor.utils.io.ByteBufferChannel;
import io.ktor.utils.io.SuspendableReadSession;
import io.ktor.utils.io.core.BufferUtilsJvmKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ReadSessionImpl implements SuspendableReadSession {
    private final ByteBufferChannel channel;
    private int lastAvailable;
    private ChunkBuffer lastView;

    public ReadSessionImpl(ByteBufferChannel channel) {
        e0.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.lastView = ChunkBuffer.Companion.getEmpty();
    }

    @Override // io.ktor.utils.io.SuspendableReadSession
    public Object await(int i10, d<? super Boolean> dVar) {
        completed();
        return this.channel.awaitAtLeast(i10, dVar);
    }

    public final void completed() {
        completed(ChunkBuffer.Companion.getEmpty());
    }

    @Override // io.ktor.utils.io.ReadSession
    public int discard(int i10) {
        completed();
        int iMin = Math.min(getAvailableForRead(), i10);
        this.channel.mo4580consumed(iMin);
        return iMin;
    }

    @Override // io.ktor.utils.io.ReadSession
    public int getAvailableForRead() {
        return this.channel.getAvailableForRead();
    }

    @Override // io.ktor.utils.io.ReadSession
    public ChunkBuffer request(int i10) {
        ByteBuffer byteBufferRequest = this.channel.request(0, i10);
        if (byteBufferRequest == null) {
            return null;
        }
        ChunkBuffer chunkBufferChunkBuffer$default = BufferUtilsJvmKt.ChunkBuffer$default(byteBufferRequest, null, 2, null);
        chunkBufferChunkBuffer$default.resetForRead();
        completed(chunkBufferChunkBuffer$default);
        return chunkBufferChunkBuffer$default;
    }

    private final void completed(ChunkBuffer chunkBuffer) {
        int i10 = this.lastAvailable;
        ChunkBuffer chunkBuffer2 = this.lastView;
        int writePosition = i10 - (chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition());
        if (writePosition > 0) {
            this.channel.mo4580consumed(writePosition);
        }
        this.lastView = chunkBuffer;
        this.lastAvailable = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
    }
}
