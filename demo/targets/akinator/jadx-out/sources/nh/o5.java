package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o5 extends w6 {

    /* renamed from: e, reason: collision with root package name */
    public final i5 f76520e;

    public o5(i5 i5Var) {
        this.f76520e = i5Var;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76520e.containsKey(obj);
    }

    @Override // nh.w6
    public final Object get(int i10) {
        return ((Map.Entry) this.f76520e.entrySet().asList().get(i10)).getKey();
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76520e.size();
    }

    @Override // nh.w6, nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return this.f76520e.g();
    }
}
