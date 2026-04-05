package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.SingleInstancePool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class SingleByteBufferPool extends SingleInstancePool<ChunkBuffer> {
    private final ByteBuffer instance;
    private final l release;

    public SingleByteBufferPool(ByteBuffer instance, l release) {
        e0.checkNotNullParameter(instance, "instance");
        e0.checkNotNullParameter(release, "release");
        this.instance = instance;
        this.release = release;
    }

    public final ByteBuffer getInstance() {
        return this.instance;
    }

    public final l getRelease() {
        return this.release;
    }

    @Override // io.ktor.utils.io.pool.SingleInstancePool
    public void disposeInstance(ChunkBuffer instance) {
        e0.checkNotNullParameter(instance, "instance");
        this.release.invoke(this.instance);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.utils.io.pool.SingleInstancePool
    public ChunkBuffer produceInstance() {
        return BufferUtilsJvmKt.ChunkBuffer(this.instance, this);
    }
}
