package io.ktor.utils.io.nio;

import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OutputKt {
    public static final Output asOutput(WritableByteChannel writableByteChannel, ObjectPool<ChunkBuffer> pool) {
        e0.checkNotNullParameter(writableByteChannel, "<this>");
        e0.checkNotNullParameter(pool, "pool");
        return new ChannelAsOutput(pool, writableByteChannel);
    }

    public static /* synthetic */ Output asOutput$default(WritableByteChannel writableByteChannel, ObjectPool objectPool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            objectPool = ChunkBuffer.Companion.getPool();
        }
        return asOutput(writableByteChannel, objectPool);
    }
}
