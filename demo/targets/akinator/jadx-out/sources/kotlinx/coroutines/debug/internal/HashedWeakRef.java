package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class HashedWeakRef<T> extends WeakReference<T> {
    public final int hash;

    public HashedWeakRef(T t10, ReferenceQueue<T> referenceQueue) {
        super(t10, referenceQueue);
        this.hash = t10 != null ? t10.hashCode() : 0;
    }
}
