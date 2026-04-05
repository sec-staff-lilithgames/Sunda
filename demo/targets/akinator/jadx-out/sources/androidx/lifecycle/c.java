package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f6529a;

    public c(Object obj) {
        this.f6529a = new AtomicReference(obj);
    }

    public final boolean compareAndSet(Object obj, Object obj2) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f6529a;
            if (atomicReference.compareAndSet(obj, obj2)) {
                return true;
            }
        } while (atomicReference.get() == obj);
        return false;
    }

    public final Object get() {
        return this.f6529a.get();
    }
}
