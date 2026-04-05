package nh;

import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u9 extends v9 {

    /* renamed from: c, reason: collision with root package name */
    public final v9 f76691c;

    public u9(ReferenceQueue referenceQueue, Object obj, int i10, v9 v9Var) {
        super(referenceQueue, obj, i10);
        this.f76691c = v9Var;
    }

    @Override // nh.v8, nh.a9
    public v9 getNext() {
        return this.f76691c;
    }
}
