package io.ktor.utils.io.core.internal;

import io.ktor.utils.io.bits.DefaultAllocator;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.BufferFactoryKt;
import io.ktor.utils.io.pool.NoPoolImpl;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes10.dex */
public class ChunkBuffer extends Buffer {
    public static final Companion Companion = new Companion(null);
    private static final ChunkBuffer Empty;
    private static final ObjectPool<ChunkBuffer> EmptyPool;
    private static final ObjectPool<ChunkBuffer> NoPool;
    private static final ObjectPool<ChunkBuffer> NoPoolManuallyManaged;
    private static final /* synthetic */ AtomicReferenceFieldUpdater nextRef$FU;
    private static final /* synthetic */ AtomicIntegerFieldUpdater refCount$FU;
    private volatile /* synthetic */ Object nextRef;
    private ChunkBuffer origin;
    private final ObjectPool<ChunkBuffer> parentPool;
    private volatile /* synthetic */ int refCount;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final ChunkBuffer getEmpty() {
            return ChunkBuffer.Empty;
        }

        public final ObjectPool<ChunkBuffer> getEmptyPool() {
            return ChunkBuffer.EmptyPool;
        }

        public final ObjectPool<ChunkBuffer> getNoPool$ktor_io() {
            return ChunkBuffer.NoPool;
        }

        public final ObjectPool<ChunkBuffer> getNoPoolManuallyManaged$ktor_io() {
            return ChunkBuffer.NoPoolManuallyManaged;
        }

        public final ObjectPool<ChunkBuffer> getPool() {
            return BufferFactoryKt.getDefaultChunkedBufferPool();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ObjectPool<ChunkBuffer> objectPool = new ObjectPool<ChunkBuffer>() { // from class: io.ktor.utils.io.core.internal.ChunkBuffer$Companion$EmptyPool$1
            @Override // io.ktor.utils.io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ObjectPool.DefaultImpls.close(this);
            }

            @Override // io.ktor.utils.io.pool.ObjectPool
            public int getCapacity() {
                return 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.ktor.utils.io.pool.ObjectPool
            public ChunkBuffer borrow() {
                return ChunkBuffer.Companion.getEmpty();
            }

            @Override // io.ktor.utils.io.pool.ObjectPool
            public void recycle(ChunkBuffer instance) {
                e0.checkNotNullParameter(instance, "instance");
                if (instance != ChunkBuffer.Companion.getEmpty()) {
                    throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
                }
            }

            @Override // io.ktor.utils.io.pool.ObjectPool
            public void dispose() {
            }
        };
        EmptyPool = objectPool;
        Empty = new ChunkBuffer(Memory.Companion.m4330getEmptySK3TCg8(), 0 == true ? 1 : 0, objectPool, 0 == true ? 1 : 0);
        NoPool = new NoPoolImpl<ChunkBuffer>() { // from class: io.ktor.utils.io.core.internal.ChunkBuffer$Companion$NoPool$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.ktor.utils.io.pool.ObjectPool
            public ChunkBuffer borrow() {
                return new ChunkBuffer(DefaultAllocator.INSTANCE.mo4307allocgFvZug(4096), null, this, 0 == true ? 1 : 0);
            }

            @Override // io.ktor.utils.io.pool.NoPoolImpl, io.ktor.utils.io.pool.ObjectPool
            public void recycle(ChunkBuffer instance) {
                e0.checkNotNullParameter(instance, "instance");
                DefaultAllocator.INSTANCE.mo4309free3GNKZMM(instance.m4458getMemorySK3TCg8());
            }
        };
        NoPoolManuallyManaged = new NoPoolImpl<ChunkBuffer>() { // from class: io.ktor.utils.io.core.internal.ChunkBuffer$Companion$NoPoolManuallyManaged$1
            @Override // io.ktor.utils.io.pool.NoPoolImpl, io.ktor.utils.io.pool.ObjectPool
            public void recycle(ChunkBuffer instance) {
                e0.checkNotNullParameter(instance, "instance");
            }

            @Override // io.ktor.utils.io.pool.ObjectPool
            public ChunkBuffer borrow() {
                throw new UnsupportedOperationException("This pool doesn't support borrow");
            }
        };
        nextRef$FU = AtomicReferenceFieldUpdater.newUpdater(ChunkBuffer.class, Object.class, "nextRef");
        refCount$FU = AtomicIntegerFieldUpdater.newUpdater(ChunkBuffer.class, "refCount");
    }

    public /* synthetic */ ChunkBuffer(ByteBuffer byteBuffer, ChunkBuffer chunkBuffer, ObjectPool objectPool, u uVar) {
        this(byteBuffer, chunkBuffer, objectPool);
    }

    private final void appendNext(ChunkBuffer chunkBuffer) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nextRef$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, chunkBuffer)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                throw new IllegalStateException("This chunk has already a next chunk.");
            }
        }
    }

    public final void acquire$ktor_io() {
        int i10;
        do {
            i10 = this.refCount;
            if (i10 <= 0) {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!refCount$FU.compareAndSet(this, i10, i10 + 1));
    }

    public final ChunkBuffer cleanNext() {
        return (ChunkBuffer) nextRef$FU.getAndSet(this, null);
    }

    public final ChunkBuffer getNext() {
        return (ChunkBuffer) this.nextRef;
    }

    public final ChunkBuffer getOrigin() {
        return this.origin;
    }

    public final ObjectPool<ChunkBuffer> getParentPool$ktor_io() {
        return this.parentPool;
    }

    public final int getReferenceCount() {
        return this.refCount;
    }

    public void release(ObjectPool<ChunkBuffer> pool) {
        e0.checkNotNullParameter(pool, "pool");
        if (release$ktor_io()) {
            ChunkBuffer chunkBuffer = this.origin;
            if (chunkBuffer != null) {
                unlink$ktor_io();
                chunkBuffer.release(pool);
            } else {
                ObjectPool<ChunkBuffer> objectPool = this.parentPool;
                if (objectPool != null) {
                    pool = objectPool;
                }
                pool.recycle(this);
            }
        }
    }

    public final boolean release$ktor_io() {
        int i10;
        int i11;
        do {
            i10 = this.refCount;
            if (i10 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i11 = i10 - 1;
        } while (!refCount$FU.compareAndSet(this, i10, i11));
        return i11 == 0;
    }

    @Override // io.ktor.utils.io.core.Buffer
    public final void reset() {
        if (this.origin != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        super.reset();
        this.nextRef = null;
    }

    public final void setNext(ChunkBuffer chunkBuffer) {
        if (chunkBuffer == null) {
            cleanNext();
        } else {
            appendNext(chunkBuffer);
        }
    }

    public final void unlink$ktor_io() {
        if (!refCount$FU.compareAndSet(this, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        cleanNext();
        this.origin = null;
    }

    public final void unpark$ktor_io() {
        int i10;
        do {
            i10 = this.refCount;
            if (i10 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i10 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!refCount$FU.compareAndSet(this, i10, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ChunkBuffer(ByteBuffer memory, ChunkBuffer chunkBuffer, ObjectPool<ChunkBuffer> objectPool) {
        super(memory, null);
        e0.checkNotNullParameter(memory, "memory");
        this.parentPool = objectPool;
        if (chunkBuffer == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        this.origin = chunkBuffer;
    }

    @Override // io.ktor.utils.io.core.Buffer
    public ChunkBuffer duplicate() {
        ChunkBuffer chunkBuffer = this.origin;
        if (chunkBuffer == null) {
            chunkBuffer = this;
        }
        chunkBuffer.acquire$ktor_io();
        ChunkBuffer chunkBuffer2 = new ChunkBuffer(m4458getMemorySK3TCg8(), chunkBuffer, this.parentPool, null);
        duplicateTo(chunkBuffer2);
        return chunkBuffer2;
    }
}
