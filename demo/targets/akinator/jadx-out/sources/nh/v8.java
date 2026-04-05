package nh;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class v8 extends WeakReference implements a9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f76711a;

    public v8(ReferenceQueue referenceQueue, Object obj, int i10) {
        super(obj, referenceQueue);
        this.f76711a = i10;
    }

    @Override // nh.a9
    public final int getHash() {
        return this.f76711a;
    }

    @Override // nh.a9
    public final Object getKey() {
        return get();
    }

    public a9 getNext() {
        return null;
    }

    @Override // nh.a9
    public abstract /* synthetic */ Object getValue();
}
