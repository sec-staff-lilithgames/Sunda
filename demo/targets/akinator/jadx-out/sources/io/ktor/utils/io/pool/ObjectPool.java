package io.ktor.utils.io.pool;

import java.io.Closeable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface ObjectPool<T> extends Closeable {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <T> void close(ObjectPool<T> objectPool) {
            objectPool.dispose();
        }
    }

    T borrow();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void dispose();

    int getCapacity();

    void recycle(T t10);
}
