package nh;

import java.io.Serializable;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.stream.Collector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j6 extends k0 implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final j6 f76386f = new j6(b5.of(), null);

    /* renamed from: g, reason: collision with root package name */
    public static final j6 f76387g = new j6(b5.of(ze.all()), null);

    /* renamed from: b, reason: collision with root package name */
    public final transient b5 f76388b;

    /* renamed from: c, reason: collision with root package name */
    public final transient j6 f76389c;

    /* renamed from: e, reason: collision with root package name */
    public transient j6 f76390e;

    public j6(b5 b5Var, j6 j6Var) {
        this.f76388b = b5Var;
        this.f76389c = j6Var;
    }

    public static <C extends Comparable<?>> h6 builder() {
        return new h6();
    }

    public static <C extends Comparable> j6 copyOf(af afVar) {
        mh.p1.checkNotNull(afVar);
        if (afVar.isEmpty()) {
            return of();
        }
        if (afVar.encloses(ze.all())) {
            return f76387g;
        }
        if (afVar instanceof j6) {
            j6 j6Var = (j6) afVar;
            if (!j6Var.f76388b.isPartialView()) {
                return j6Var;
            }
        }
        return new j6(b5.copyOf((Collection) afVar.asRanges()), null);
    }

    public static <C extends Comparable> j6 of() {
        return f76386f;
    }

    public static <E extends Comparable<? super E>> Collector<ze, ?, j6> toImmutableRangeSet() {
        return i1.f76345c;
    }

    public static <C extends Comparable<?>> j6 unionOf(Iterable<ze> iterable) {
        return copyOf(dj.create(iterable));
    }

    @Override // nh.k0, nh.af
    @Deprecated
    public void add(ze zeVar) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.k0, nh.af
    @Deprecated
    public void addAll(af afVar) {
        throw new UnsupportedOperationException();
    }

    public u6 asSet(a3 a3Var) {
        mh.p1.checkNotNull(a3Var);
        if (isEmpty()) {
            return u6.of();
        }
        ze zeVarCanonical = span().canonical(a3Var);
        if (!zeVarCanonical.hasLowerBound()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!zeVarCanonical.hasUpperBound()) {
            try {
                a3Var.maxValue();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new g6(this, a3Var);
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public j6 difference(af afVar) {
        dj djVarCreate = dj.create(this);
        djVarCreate.removeAll(afVar);
        return copyOf(djVarCreate);
    }

    @Override // nh.k0, nh.af
    public boolean encloses(ze zeVar) {
        int iBinarySearch = ch.binarySearch(this.f76388b, new in.c(8), zeVar.f76827b, we.natural(), bh.f76138b, vg.f76722b);
        return iBinarySearch != -1 && ((ze) this.f76388b.get(iBinarySearch)).encloses(zeVar);
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll((Iterable<ze>) iterable);
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public j6 intersection(af afVar) {
        dj djVarCreate = dj.create(this);
        djVarCreate.removeAll(afVar.complement());
        return copyOf(djVarCreate);
    }

    @Override // nh.k0, nh.af
    public boolean intersects(ze zeVar) {
        int iBinarySearch = ch.binarySearch(this.f76388b, new in.c(8), zeVar.f76827b, we.natural(), bh.f76138b, vg.f76723c);
        b5 b5Var = this.f76388b;
        if (iBinarySearch >= b5Var.size() || !((ze) b5Var.get(iBinarySearch)).isConnected(zeVar) || ((ze) b5Var.get(iBinarySearch)).intersection(zeVar).isEmpty()) {
            if (iBinarySearch <= 0) {
                return false;
            }
            int i10 = iBinarySearch - 1;
            if (!((ze) b5Var.get(i10)).isConnected(zeVar) || ((ze) b5Var.get(i10)).intersection(zeVar).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // nh.k0, nh.af
    public boolean isEmpty() {
        return this.f76388b.isEmpty();
    }

    @Override // nh.k0, nh.af
    public ze rangeContaining(Comparable comparable) {
        int iBinarySearch = ch.binarySearch(this.f76388b, new in.c(8), v2.a(comparable), we.natural(), bh.f76138b, vg.f76722b);
        if (iBinarySearch == -1) {
            return null;
        }
        ze zeVar = (ze) this.f76388b.get(iBinarySearch);
        if (zeVar.contains(comparable)) {
            return zeVar;
        }
        return null;
    }

    @Override // nh.k0, nh.af
    @Deprecated
    public void remove(ze zeVar) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.k0, nh.af
    @Deprecated
    public void removeAll(af afVar) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.k0, nh.af
    public ze span() {
        b5 b5Var = this.f76388b;
        if (b5Var.isEmpty()) {
            throw new NoSuchElementException();
        }
        return new ze(((ze) b5Var.get(0)).f76827b, ((ze) b5Var.get(b5Var.size() - 1)).f76828c);
    }

    public j6 union(af afVar) {
        return unionOf(i7.concat(asRanges(), afVar.asRanges()));
    }

    public static <C extends Comparable> j6 of(ze zeVar) {
        mh.p1.checkNotNull(zeVar);
        return zeVar.isEmpty() ? of() : zeVar.equals(ze.all()) ? f76387g : new j6(b5.of(zeVar), null);
    }

    @Override // nh.k0, nh.af
    @Deprecated
    public void addAll(Iterable<ze> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.k0, nh.af
    public l6 asDescendingSetOfRanges() {
        b5 b5Var = this.f76388b;
        if (b5Var.isEmpty()) {
            return l6.of();
        }
        b5 b5VarReverse = b5Var.reverse();
        ze zeVar = ze.f76826e;
        return new pf(b5VarReverse, ye.f76795b.reverse());
    }

    @Override // nh.k0, nh.af
    public l6 asRanges() {
        b5 b5Var = this.f76388b;
        if (b5Var.isEmpty()) {
            return l6.of();
        }
        ze zeVar = ze.f76826e;
        return new pf(b5Var, ye.f76795b);
    }

    @Override // nh.k0, nh.af
    public j6 complement() {
        j6 j6Var = this.f76389c;
        if (j6Var != null) {
            return j6Var;
        }
        b5 b5Var = this.f76388b;
        if (b5Var.isEmpty()) {
            return f76387g;
        }
        if (b5Var.size() == 1 && ((ze) b5Var.get(0)).equals(ze.all())) {
            return of();
        }
        j6 j6Var2 = this.f76390e;
        if (j6Var2 != null) {
            return j6Var2;
        }
        j6 j6Var3 = new j6(new i6(b5Var), this);
        this.f76390e = j6Var3;
        return j6Var3;
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ boolean enclosesAll(af afVar) {
        return super.enclosesAll(afVar);
    }

    @Override // nh.k0, nh.af
    @Deprecated
    public void removeAll(Iterable<ze> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.k0, nh.af
    public j6 subRangeSet(ze zeVar) {
        if (!isEmpty()) {
            ze zeVarSpan = span();
            if (zeVar.encloses(zeVarSpan)) {
                return this;
            }
            if (zeVar.isConnected(zeVarSpan)) {
                b5 b5VarOf = this.f76388b;
                if (b5VarOf.isEmpty() || zeVar.isEmpty()) {
                    b5VarOf = b5.of();
                } else if (!zeVar.encloses(span())) {
                    boolean zHasLowerBound = zeVar.hasLowerBound();
                    tg tgVar = vg.f76723c;
                    int iBinarySearch = zHasLowerBound ? ch.binarySearch(b5VarOf, new in.c(9), zeVar.f76827b, bh.f76141f, tgVar) : 0;
                    int iBinarySearch2 = (zeVar.hasUpperBound() ? ch.binarySearch(b5VarOf, new in.c(8), zeVar.f76828c, bh.f76140e, tgVar) : b5VarOf.size()) - iBinarySearch;
                    b5VarOf = iBinarySearch2 == 0 ? b5.of() : new e6(this, iBinarySearch2, iBinarySearch, zeVar);
                }
                return new j6(b5VarOf, null);
            }
        }
        return of();
    }

    public static <C extends Comparable<?>> j6 copyOf(Iterable<ze> iterable) {
        return new h6().addAll(iterable).build();
    }
}
