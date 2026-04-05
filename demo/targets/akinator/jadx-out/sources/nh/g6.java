package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g6 extends u6 {

    /* renamed from: g, reason: collision with root package name */
    public final a3 f76289g;

    /* renamed from: h, reason: collision with root package name */
    public transient Integer f76290h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j6 f76291i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(j6 j6Var, a3 a3Var) {
        super(we.natural());
        this.f76291i = j6Var;
        this.f76289g = a3Var;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f76291i.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return this.f76291i.f76388b.isPartialView();
    }

    @Override // nh.u6
    public final u6 m() {
        return new w2(this);
    }

    @Override // nh.u6
    public final u6 o(Object obj, boolean z10) {
        return this.f76291i.subRangeSet(ze.upTo((Comparable) obj, r0.a(z10))).asSet(this.f76289g);
    }

    @Override // nh.u6
    public final u6 p(Object obj, boolean z10, Object obj2, boolean z11) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        if (!z10 && !z11) {
            ze zeVar = ze.f76826e;
            if (comparable.compareTo(comparable2) == 0) {
                return u6.of();
            }
        }
        return this.f76291i.subRangeSet(ze.range(comparable, r0.a(z10), comparable2, r0.a(z11))).asSet(this.f76289g);
    }

    @Override // nh.u6
    public final u6 q(Object obj, boolean z10) {
        return this.f76291i.subRangeSet(ze.downTo((Comparable) obj, r0.a(z10))).asSet(this.f76289g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Integer numValueOf = this.f76290h;
        if (numValueOf == null) {
            ej it = this.f76291i.f76388b.iterator();
            long size = 0;
            while (it.hasNext()) {
                size += q2.create((ze) it.next(), this.f76289g).size();
                if (size >= 2147483647L) {
                    break;
                }
            }
            numValueOf = Integer.valueOf(rh.w.saturatedCast(size));
            this.f76290h = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f76291i.f76388b.toString();
    }

    @Override // nh.u6, java.util.NavigableSet
    public ej descendingIterator() {
        return new f6(this, 1);
    }

    @Override // nh.u6, nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return new f6(this, 0);
    }
}
