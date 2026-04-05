package io.ktor.utils.io.streams;

import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.InputStream;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InputKt {
    public static final Input asInput(InputStream inputStream, ObjectPool<ChunkBuffer> pool) {
        e0.checkNotNullParameter(inputStream, "<this>");
        e0.checkNotNullParameter(pool, "pool");
        return new InputStreamAsInput(inputStream, pool);
    }

    public static /* synthetic */ Input asInput$default(InputStream inputStream, ObjectPool objectPool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            objectPool = ChunkBuffer.Companion.getPool();
        }
        return asInput(inputStream, objectPool);
    }
}
