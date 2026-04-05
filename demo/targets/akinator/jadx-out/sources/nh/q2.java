package nh;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q2 extends u6 {

    /* renamed from: g, reason: collision with root package name */
    public final a3 f76576g;

    public q2(a3 a3Var) {
        super(we.natural());
        this.f76576g = a3Var;
    }

    @Deprecated
    public static <E> t6 builder() {
        throw new UnsupportedOperationException();
    }

    public static q2 closed(int i10, int i11) {
        return create(ze.closed(Integer.valueOf(i10), Integer.valueOf(i11)), a3.integers());
    }

    public static q2 closedOpen(int i10, int i11) {
        return create(ze.closedOpen(Integer.valueOf(i10), Integer.valueOf(i11)), a3.integers());
    }

    public static <C extends Comparable> q2 create(ze zeVar, a3 a3Var) {
        mh.p1.checkNotNull(zeVar);
        mh.p1.checkNotNull(a3Var);
        try {
            ze zeVarIntersection = !zeVar.hasLowerBound() ? zeVar.intersection(ze.atLeast(a3Var.minValue())) : zeVar;
            if (!zeVar.hasUpperBound()) {
                zeVarIntersection = zeVarIntersection.intersection(ze.atMost(a3Var.maxValue()));
            }
            if (!zeVarIntersection.isEmpty()) {
                Comparable comparableH = zeVar.f76827b.h(a3Var);
                Objects.requireNonNull(comparableH);
                Comparable comparableF = zeVar.f76828c.f(a3Var);
                Objects.requireNonNull(comparableF);
                if (comparableH.compareTo(comparableF) <= 0) {
                    return new df(zeVarIntersection, a3Var);
                }
            }
            return new b3(a3Var);
        } catch (NoSuchElementException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract q2 intersection(q2 q2Var);

    @Override // nh.u6
    public u6 m() {
        return new w2(this);
    }

    @Override // nh.u6
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract q2 o(Comparable comparable, boolean z10);

    public abstract ze range();

    public abstract ze range(r0 r0Var, r0 r0Var2);

    @Override // nh.u6
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract q2 p(Comparable comparable, boolean z10, Comparable comparable2, boolean z11);

    @Override // nh.u6
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public abstract q2 q(Comparable comparable, boolean z10);

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    public static q2 closed(long j10, long j11) {
        return create(ze.closed(Long.valueOf(j10), Long.valueOf(j11)), a3.longs());
    }

    public static q2 closedOpen(long j10, long j11) {
        return create(ze.closedOpen(Long.valueOf(j10), Long.valueOf(j11)), a3.longs());
    }

    @Override // nh.u6, java.util.NavigableSet, java.util.SortedSet
    public q2 headSet(Comparable comparable) {
        return o((Comparable) mh.p1.checkNotNull(comparable), false);
    }

    @Override // nh.u6, java.util.NavigableSet, java.util.SortedSet
    public q2 subSet(Comparable comparable, Comparable comparable2) {
        mh.p1.checkNotNull(comparable);
        mh.p1.checkNotNull(comparable2);
        mh.p1.checkArgument(comparator().compare(comparable, comparable2) <= 0);
        return p(comparable, true, comparable2, false);
    }

    @Override // nh.u6, java.util.NavigableSet, java.util.SortedSet
    public q2 tailSet(Comparable comparable) {
        return q((Comparable) mh.p1.checkNotNull(comparable), true);
    }

    @Override // nh.u6, java.util.NavigableSet
    public q2 headSet(Comparable comparable, boolean z10) {
        return o((Comparable) mh.p1.checkNotNull(comparable), z10);
    }

    @Override // nh.u6, java.util.NavigableSet
    public q2 tailSet(Comparable comparable, boolean z10) {
        return q((Comparable) mh.p1.checkNotNull(comparable), z10);
    }

    @Override // nh.u6, java.util.NavigableSet
    public q2 subSet(Comparable comparable, boolean z10, Comparable comparable2, boolean z11) {
        mh.p1.checkNotNull(comparable);
        mh.p1.checkNotNull(comparable2);
        mh.p1.checkArgument(comparator().compare(comparable, comparable2) <= 0);
        return p(comparable, z10, comparable2, z11);
    }
}
