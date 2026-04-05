package nh;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class da extends WeakReference implements ca {

    /* renamed from: a, reason: collision with root package name */
    public final a9 f76182a;

    public da(ReferenceQueue referenceQueue, Object obj, a9 a9Var) {
        super(obj, referenceQueue);
        this.f76182a = a9Var;
    }

    @Override // nh.ca
    public ca copyFor(ReferenceQueue<Object> referenceQueue, a9 a9Var) {
        return new da(referenceQueue, get(), a9Var);
    }

    @Override // nh.ca
    public a9 getEntry() {
        return this.f76182a;
    }
}
