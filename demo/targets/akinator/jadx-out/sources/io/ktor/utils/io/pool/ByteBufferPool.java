package io.ktor.utils.io.pool;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteBufferPool extends DefaultPool<ByteBuffer> {
    private final int bufferSize;

    /* JADX WARN: Illegal instructions before constructor call */
    public ByteBufferPool() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public final int getBufferSize() {
        return this.bufferSize;
    }

    public /* synthetic */ ByteBufferPool(int i10, int i11, int i12, u uVar) {
        this((i12 & 1) != 0 ? 2000 : i10, (i12 & 2) != 0 ? 4096 : i11);
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public ByteBuffer clearInstance(ByteBuffer instance) {
        e0.checkNotNullParameter(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public ByteBuffer produceInstance() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.bufferSize);
        e0.checkNotNull(byteBufferAllocate);
        return byteBufferAllocate;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public void validateInstance(ByteBuffer instance) {
        e0.checkNotNullParameter(instance, "instance");
        if (instance.capacity() != this.bufferSize) {
            throw new IllegalStateException("Check failed.");
        }
        if (instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public ByteBufferPool(int i10, int i11) {
        super(i10);
        this.bufferSize = i11;
    }
}
