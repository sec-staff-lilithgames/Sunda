package nh;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class dg extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b5 f76189e;

    public dg(b5 b5Var) {
        this.f76189e = b5Var;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76189e.size();
    }

    @Override // java.util.List
    public List<Object> get(int i10) {
        return ((l6) this.f76189e.get(i10)).asList();
    }
}
