package io.ktor.utils.io.pool;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PoolKt {
    @f
    public static final <T, R> R useBorrowed(ObjectPool<T> objectPool, l block) {
        e0.checkNotNullParameter(objectPool, "<this>");
        e0.checkNotNullParameter(block, "block");
        T tBorrow = objectPool.borrow();
        try {
            return (R) block.invoke(tBorrow);
        } finally {
            b0.finallyStart(1);
            objectPool.recycle(tBorrow);
            b0.finallyEnd(1);
        }
    }

    public static final <T, R> R useInstance(ObjectPool<T> objectPool, l block) {
        e0.checkNotNullParameter(objectPool, "<this>");
        e0.checkNotNullParameter(block, "block");
        T tBorrow = objectPool.borrow();
        try {
            return (R) block.invoke(tBorrow);
        } finally {
            b0.finallyStart(1);
            objectPool.recycle(tBorrow);
            b0.finallyEnd(1);
        }
    }
}
