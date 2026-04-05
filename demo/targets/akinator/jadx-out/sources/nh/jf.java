package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class jf extends l6 {

    /* renamed from: e, reason: collision with root package name */
    public final transient m5 f76402e;

    /* renamed from: f, reason: collision with root package name */
    public final transient kf f76403f;

    public jf(m5 m5Var, kf kfVar) {
        this.f76402e = m5Var;
        this.f76403f = kfVar;
    }

    @Override // nh.u4
    public final int a(int i10, Object[] objArr) {
        return asList().a(i10, objArr);
    }

    @Override // nh.l6, nh.u4
    public b5 asList() {
        return this.f76403f;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76402e.get(obj) != null;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76402e.size();
    }

    @Override // nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return asList().iterator();
    }
}
