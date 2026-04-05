package io.ktor.utils.io.core;

import io.ktor.utils.io.bits.Allocator;
import io.ktor.utils.io.bits.DefaultAllocator;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.DefaultPool;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DefaultBufferPool extends DefaultPool<ChunkBuffer> {
    private final Allocator allocator;
    private final int bufferSize;

    public DefaultBufferPool() {
        this(0, 0, null, 7, null);
    }

    public /* synthetic */ DefaultBufferPool(int i10, int i11, Allocator allocator, int i12, u uVar) {
        this((i12 & 1) != 0 ? 4096 : i10, (i12 & 2) != 0 ? 1000 : i11, (i12 & 4) != 0 ? DefaultAllocator.INSTANCE : allocator);
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public ChunkBuffer clearInstance(ChunkBuffer instance) {
        e0.checkNotNullParameter(instance, "instance");
        ChunkBuffer chunkBuffer = (ChunkBuffer) super.clearInstance((DefaultBufferPool) instance);
        chunkBuffer.unpark$ktor_io();
        chunkBuffer.reset();
        return chunkBuffer;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public void disposeInstance(ChunkBuffer instance) {
        e0.checkNotNullParameter(instance, "instance");
        this.allocator.mo4309free3GNKZMM(instance.m4458getMemorySK3TCg8());
        super.disposeInstance((DefaultBufferPool) instance);
        instance.unlink$ktor_io();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.utils.io.pool.DefaultPool
    public ChunkBuffer produceInstance() {
        return new ChunkBuffer(this.allocator.mo4307allocgFvZug(this.bufferSize), null, this, null);
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public void validateInstance(ChunkBuffer instance) {
        e0.checkNotNullParameter(instance, "instance");
        super.validateInstance((DefaultBufferPool) instance);
        if (instance.m4458getMemorySK3TCg8().limit() != this.bufferSize) {
            StringBuilder sb2 = new StringBuilder("Buffer size mismatch. Expected: ");
            sb2.append(this.bufferSize);
            sb2.append(", actual: ");
            sb2.append(instance.m4458getMemorySK3TCg8().limit());
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (instance == ChunkBuffer.Companion.getEmpty()) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (instance == Buffer.Companion.getEmpty()) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance.getReferenceCount() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (instance.getNext() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (instance.getOrigin() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultBufferPool(int i10, int i11, Allocator allocator) {
        super(i11);
        e0.checkNotNullParameter(allocator, "allocator");
        this.bufferSize = i10;
        this.allocator = allocator;
    }
}
