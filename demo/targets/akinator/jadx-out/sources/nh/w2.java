package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w2 extends u6 {

    /* renamed from: g, reason: collision with root package name */
    public final u6 f76733g;

    public w2(u6 u6Var) {
        super(we.from(u6Var.comparator()).reverse());
        this.f76733g = u6Var;
    }

    @Override // nh.u6, java.util.NavigableSet
    public Object ceiling(Object obj) {
        return this.f76733g.floor(obj);
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76733g.contains(obj);
    }

    @Override // nh.u6, java.util.NavigableSet
    public Object floor(Object obj) {
        return this.f76733g.ceiling(obj);
    }

    @Override // nh.u6, java.util.NavigableSet
    public Object higher(Object obj) {
        return this.f76733g.lower(obj);
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return this.f76733g.isPartialView();
    }

    @Override // nh.u6, java.util.NavigableSet
    public Object lower(Object obj) {
        return this.f76733g.higher(obj);
    }

    @Override // nh.u6
    public final u6 m() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.u6
    public final u6 o(Object obj, boolean z10) {
        return this.f76733g.tailSet(obj, z10).descendingSet();
    }

    @Override // nh.u6
    public final u6 p(Object obj, boolean z10, Object obj2, boolean z11) {
        return this.f76733g.subSet(obj2, z11, obj, z10).descendingSet();
    }

    @Override // nh.u6
    public final u6 q(Object obj, boolean z10) {
        return this.f76733g.headSet(obj, z10).descendingSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76733g.size();
    }

    @Override // nh.u6, java.util.NavigableSet
    public ej descendingIterator() {
        return this.f76733g.iterator();
    }

    @Override // nh.u6, java.util.NavigableSet
    public u6 descendingSet() {
        return this.f76733g;
    }

    @Override // nh.u6, nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return this.f76733g.descendingIterator();
    }
}
