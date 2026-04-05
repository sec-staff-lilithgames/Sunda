package io.ktor.utils.io.pool;

import a.b;
import io.ktor.utils.io.pool.ObjectPool;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class DefaultPool<T> implements ObjectPool<T> {
    public static final Companion Companion = new Companion(null);
    private static final AtomicLongFieldUpdater<DefaultPool<?>> Top;
    private final int capacity;
    private final AtomicReferenceArray<T> instances;
    private final int maxIndex;
    private final int[] next;
    private final int shift;
    private volatile long top;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        AtomicLongFieldUpdater<DefaultPool<?>> atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(DefaultPool.class, new l0() { // from class: io.ktor.utils.io.pool.DefaultPool$Companion$Top$1
            @Override // kotlin.jvm.internal.l0, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((DefaultPool) obj).top);
            }

            @Override // kotlin.jvm.internal.l0, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((DefaultPool) obj).top = ((Number) obj2).longValue();
            }
        }.getName());
        e0.checkNotNullExpressionValue(atomicLongFieldUpdaterNewUpdater, "newUpdater(Owner::class.java, p.name)");
        Top = atomicLongFieldUpdaterNewUpdater;
    }

    public DefaultPool(int i10) {
        this.capacity = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(b.e(i10, "capacity should be positive but it is ").toString());
        }
        if (i10 > 536870911) {
            throw new IllegalArgumentException(b.e(i10, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        int iHighestOneBit = Integer.highestOneBit((i10 * 4) - 1) * 2;
        this.maxIndex = iHighestOneBit;
        this.shift = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        this.instances = new AtomicReferenceArray<>(iHighestOneBit + 1);
        this.next = new int[iHighestOneBit + 1];
    }

    private final int popTop() {
        long j10;
        long j11;
        int i10;
        do {
            j10 = this.top;
            if (j10 == 0) {
                return 0;
            }
            j11 = ((j10 >> 32) & 4294967295L) + 1;
            i10 = (int) (4294967295L & j10);
            if (i10 == 0) {
                return 0;
            }
        } while (!Top.compareAndSet(this, j10, (j11 << 32) | this.next[i10]));
        return i10;
    }

    private final void pushTop(int i10) {
        long j10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("index should be positive");
        }
        do {
            j10 = this.top;
            this.next[i10] = (int) (4294967295L & j10);
        } while (!Top.compareAndSet(this, j10, ((((j10 >> 32) & 4294967295L) + 1) << 32) | i10));
    }

    private final T tryPop() {
        int iPopTop = popTop();
        if (iPopTop == 0) {
            return null;
        }
        return this.instances.getAndSet(iPopTop, null);
    }

    private final boolean tryPush(T t10) {
        int iIdentityHashCode = ((System.identityHashCode(t10) * (-1640531527)) >>> this.shift) + 1;
        for (int i10 = 0; i10 < 8; i10++) {
            AtomicReferenceArray<T> atomicReferenceArray = this.instances;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, t10)) {
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = this.maxIndex;
                    }
                }
            }
            pushTop(iIdentityHashCode);
            return true;
        }
        return false;
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final T borrow() {
        T tClearInstance;
        T tTryPop = tryPop();
        return (tTryPop == null || (tClearInstance = clearInstance(tTryPop)) == null) ? produceInstance() : tClearInstance;
    }

    public T clearInstance(T instance) {
        e0.checkNotNullParameter(instance, "instance");
        return instance;
    }

    @Override // io.ktor.utils.io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void dispose() {
        while (true) {
            T tTryPop = tryPop();
            if (tTryPop == null) {
                return;
            } else {
                disposeInstance(tTryPop);
            }
        }
    }

    public void disposeInstance(T instance) {
        e0.checkNotNullParameter(instance, "instance");
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final int getCapacity() {
        return this.capacity;
    }

    public abstract T produceInstance();

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void recycle(T instance) {
        e0.checkNotNullParameter(instance, "instance");
        validateInstance(instance);
        if (tryPush(instance)) {
            return;
        }
        disposeInstance(instance);
    }

    public void validateInstance(T instance) {
        e0.checkNotNullParameter(instance, "instance");
    }
}
