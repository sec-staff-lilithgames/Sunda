package nh;

import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y9 extends z9 {

    /* renamed from: c, reason: collision with root package name */
    public final z9 f76791c;

    public y9(ReferenceQueue referenceQueue, Object obj, int i10, z9 z9Var) {
        super(referenceQueue, obj, i10);
        this.f76791c = z9Var;
    }

    @Override // nh.v8, nh.a9
    public z9 getNext() {
        return this.f76791c;
    }
}
