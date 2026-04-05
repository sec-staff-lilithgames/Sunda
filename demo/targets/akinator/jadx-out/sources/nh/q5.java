package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q5 extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b5 f76578e;

    public q5(b5 b5Var) {
        this.f76578e = b5Var;
    }

    @Override // java.util.List
    public Object get(int i10) {
        return ((Map.Entry) this.f76578e.get(i10)).getValue();
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76578e.size();
    }
}
