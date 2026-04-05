package io.ktor.utils.io.nio;

import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InputKt {
    public static final Input asInput(ReadableByteChannel readableByteChannel, ObjectPool<ChunkBuffer> pool) {
        e0.checkNotNullParameter(readableByteChannel, "<this>");
        e0.checkNotNullParameter(pool, "pool");
        return new ChannelAsInput(readableByteChannel, pool);
    }

    public static /* synthetic */ Input asInput$default(ReadableByteChannel readableByteChannel, ObjectPool objectPool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            objectPool = ChunkBuffer.Companion.getPool();
        }
        return asInput(readableByteChannel, objectPool);
    }
}
