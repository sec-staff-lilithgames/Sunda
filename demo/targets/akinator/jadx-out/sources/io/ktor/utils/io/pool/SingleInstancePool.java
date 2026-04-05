package io.ktor.utils.io.pool;

import io.ktor.utils.io.pool.ObjectPool;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class SingleInstancePool<T> implements ObjectPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater borrowed$FU = AtomicIntegerFieldUpdater.newUpdater(SingleInstancePool.class, "borrowed");
    private static final /* synthetic */ AtomicIntegerFieldUpdater disposed$FU = AtomicIntegerFieldUpdater.newUpdater(SingleInstancePool.class, "disposed");
    private volatile /* synthetic */ int borrowed = 0;
    private volatile /* synthetic */ int disposed = 0;
    private volatile /* synthetic */ Object instance = null;

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final T borrow() {
        int i10;
        do {
            i10 = this.borrowed;
            if (i10 != 0) {
                throw new IllegalStateException("Instance is already consumed");
            }
        } while (!borrowed$FU.compareAndSet(this, i10, 1));
        T tProduceInstance = produceInstance();
        this.instance = tProduceInstance;
        return tProduceInstance;
    }

    @Override // io.ktor.utils.io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void dispose() {
        Object obj;
        if (!disposed$FU.compareAndSet(this, 0, 1) || (obj = this.instance) == null) {
            return;
        }
        this.instance = null;
        disposeInstance(obj);
    }

    public abstract void disposeInstance(T t10);

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final int getCapacity() {
        return 1;
    }

    public abstract T produceInstance();

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void recycle(T instance) {
        e0.checkNotNullParameter(instance, "instance");
        if (this.instance != instance) {
            if (this.instance == null && this.borrowed != 0) {
                throw new IllegalStateException("Already recycled or an irrelevant instance tried to be recycled");
            }
            throw new IllegalStateException("Unable to recycle irrelevant instance");
        }
        this.instance = null;
        if (!disposed$FU.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException("An instance is already disposed");
        }
        disposeInstance(instance);
    }
}
