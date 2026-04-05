package io.ktor.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AtomicOp<T> extends OpDescriptor {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _consensus$FU = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = LockFreeLinkedListKt.NO_DECISION;

    private final Object decide(Object obj) {
        return tryDecide(obj) ? obj : this._consensus;
    }

    public abstract void complete(T t10, Object obj);

    public final boolean isDecided() {
        return this._consensus != LockFreeLinkedListKt.NO_DECISION;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.internal.OpDescriptor
    public final Object perform(Object obj) {
        Object objDecide = this._consensus;
        if (objDecide == LockFreeLinkedListKt.NO_DECISION) {
            objDecide = decide(prepare(obj));
        }
        complete(obj, objDecide);
        return objDecide;
    }

    public abstract Object prepare(T t10);

    public final boolean tryDecide(Object obj) {
        if (obj == LockFreeLinkedListKt.NO_DECISION) {
            throw new IllegalStateException("Check failed.");
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _consensus$FU;
        Object obj2 = LockFreeLinkedListKt.NO_DECISION;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                return false;
            }
        }
        return true;
    }
}
