package nh;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t0 extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f76647f;

    public t0(u0 u0Var, int i10) {
        this.f76646e = i10;
        this.f76647f = u0Var;
    }

    @Override // java.util.List
    public Object get(int i10) {
        mh.p1.checkElementIndex(i10, size());
        int i11 = this.f76646e;
        u0 u0Var = this.f76647f;
        return ((List) u0Var.f76675b.get(i10)).get(u0.a(u0Var, i11, i10));
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76647f.f76675b.size();
    }
}
