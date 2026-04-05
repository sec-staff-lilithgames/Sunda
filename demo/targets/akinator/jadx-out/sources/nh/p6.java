package nh;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p6 extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q6 f76552e;

    public p6(q6 q6Var) {
        this.f76552e = q6Var;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76552e.f76579e.size();
    }

    @Override // java.util.List
    public Map.Entry<Object, Object> get(int i10) {
        q6 q6Var = this.f76552e;
        return new AbstractMap.SimpleImmutableEntry(q6Var.f76579e.f76628h.asList().get(i10), q6Var.f76579e.f76629i.get(i10));
    }
}
