package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r5 extends u4 {

    /* renamed from: c, reason: collision with root package name */
    public final i5 f76596c;

    public r5(i5 i5Var) {
        this.f76596c = i5Var;
    }

    @Override // nh.u4
    public b5 asList() {
        return new q5(this.f76596c.entrySet().asList());
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return obj != null && z7.contains(iterator(), obj);
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f76596c.size();
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return new p5(this);
    }
}
