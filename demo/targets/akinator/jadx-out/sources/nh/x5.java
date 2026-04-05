package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x5 extends u4 {

    /* renamed from: c, reason: collision with root package name */
    public final transient y5 f76757c;

    public x5(y5 y5Var) {
        this.f76757c = y5Var;
    }

    @Override // nh.u4
    public final int a(int i10, Object[] objArr) {
        ej it = this.f76757c.f76784h.values().iterator();
        while (it.hasNext()) {
            i10 = ((u4) it.next()).a(i10, objArr);
        }
        return i10;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76757c.containsValue(obj);
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f76757c.size();
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        y5 y5Var = this.f76757c;
        y5Var.getClass();
        return new t5(y5Var);
    }
}
