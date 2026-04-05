package nh;

import java.util.Collection;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class df extends q2 {

    /* renamed from: h, reason: collision with root package name */
    public final ze f76188h;

    public df(ze zeVar, a3 a3Var) {
        super(a3Var);
        this.f76188h = zeVar;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f76188h.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return y1.b(this, collection);
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof df) {
            df dfVar = (df) obj;
            if (this.f76576g.equals(dfVar.f76576g)) {
                return first().equals(dfVar.first()) && last().equals(dfVar.last());
            }
        }
        return super.equals(obj);
    }

    @Override // nh.l6
    public final b5 h() {
        return this.f76576g.f76083b ? new cf(this) : super.h();
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public int hashCode() {
        return og.b(this);
    }

    @Override // nh.q2
    public q2 intersection(q2 q2Var) {
        mh.p1.checkNotNull(q2Var);
        a3 a3Var = q2Var.f76576g;
        a3 a3Var2 = this.f76576g;
        mh.p1.checkArgument(a3Var2.equals(a3Var));
        if (q2Var.isEmpty()) {
            return q2Var;
        }
        Comparable comparable = (Comparable) we.natural().max(first(), (Comparable) q2Var.first());
        Comparable comparable2 = (Comparable) we.natural().min(last(), (Comparable) q2Var.last());
        return comparable.compareTo(comparable2) <= 0 ? q2.create(ze.closed(comparable, comparable2), a3Var2) : new b3(a3Var2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return false;
    }

    @Override // nh.q2
    /* renamed from: r */
    public final q2 o(Comparable comparable, boolean z10) {
        return u(ze.upTo(comparable, r0.a(z10)));
    }

    @Override // nh.q2
    public ze range() {
        r0 r0Var = r0.f76592c;
        return range(r0Var, r0Var);
    }

    @Override // nh.q2
    /* renamed from: s */
    public final q2 p(Comparable comparable, boolean z10, Comparable comparable2, boolean z11) {
        return (comparable.compareTo(comparable2) != 0 || z10 || z11) ? u(ze.range(comparable, r0.a(z10), comparable2, r0.a(z11))) : new b3(this.f76576g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jDistance = this.f76576g.distance(first(), last());
        if (jDistance >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jDistance) + 1;
    }

    @Override // nh.q2
    /* renamed from: t */
    public final q2 q(Comparable comparable, boolean z10) {
        return u(ze.downTo(comparable, r0.a(z10)));
    }

    public final q2 u(ze zeVar) {
        ze zeVar2 = this.f76188h;
        boolean zIsConnected = zeVar2.isConnected(zeVar);
        a3 a3Var = this.f76576g;
        return zIsConnected ? q2.create(zeVar2.intersection(zeVar), a3Var) : new b3(a3Var);
    }

    @Override // nh.u6, java.util.NavigableSet
    public ej descendingIterator() {
        return new bf(this, last(), 1);
    }

    @Override // nh.u6, java.util.SortedSet
    public Comparable first() {
        Comparable comparableH = this.f76188h.f76827b.h(this.f76576g);
        Objects.requireNonNull(comparableH);
        return comparableH;
    }

    @Override // nh.u6, nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return new bf(this, first(), 0);
    }

    @Override // nh.u6, java.util.SortedSet
    public Comparable last() {
        Comparable comparableF = this.f76188h.f76828c.f(this.f76576g);
        Objects.requireNonNull(comparableF);
        return comparableF;
    }

    @Override // nh.q2
    public ze range(r0 r0Var, r0 r0Var2) {
        ze zeVar = this.f76188h;
        v2 v2Var = zeVar.f76827b;
        a3 a3Var = this.f76576g;
        return new ze(v2Var.k(r0Var, a3Var), zeVar.f76828c.l(r0Var2, a3Var));
    }
}
