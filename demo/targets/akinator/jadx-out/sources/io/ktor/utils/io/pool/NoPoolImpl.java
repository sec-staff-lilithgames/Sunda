package io.ktor.utils.io.pool;

import io.ktor.utils.io.pool.ObjectPool;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class NoPoolImpl<T> implements ObjectPool<T> {
    @Override // io.ktor.utils.io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public int getCapacity() {
        return 0;
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public void recycle(T instance) {
        e0.checkNotNullParameter(instance, "instance");
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public void dispose() {
    }
}
