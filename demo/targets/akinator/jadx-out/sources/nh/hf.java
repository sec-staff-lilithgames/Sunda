package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class hf extends l6 {

    /* renamed from: e, reason: collision with root package name */
    public final transient m5 f76334e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f76335f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f76336g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f76337h;

    public hf(m5 m5Var, Object[] objArr, int i10, int i11) {
        this.f76334e = m5Var;
        this.f76335f = objArr;
        this.f76336g = i10;
        this.f76337h = i11;
    }

    @Override // nh.u4
    public final int a(int i10, Object[] objArr) {
        return asList().a(i10, objArr);
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f76334e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // nh.l6
    public final b5 h() {
        return new gf(this);
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76337h;
    }

    @Override // nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return asList().iterator();
    }
}
