package nh;

import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class z9 extends v8 implements ba {

    /* renamed from: b, reason: collision with root package name */
    public volatile ca f76821b;

    public z9(ReferenceQueue referenceQueue, Object obj, int i10) {
        super(referenceQueue, obj, i10);
        this.f76821b = fa.f76258l;
    }

    @Override // nh.v8, nh.a9
    public final Object getValue() {
        return this.f76821b.get();
    }

    @Override // nh.ba
    public final ca getValueReference() {
        return this.f76821b;
    }
}
