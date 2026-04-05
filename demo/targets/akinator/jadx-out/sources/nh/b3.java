package nh;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b3 extends q2 {
    @Override // nh.l6, nh.u4
    public b5 asList() {
        return b5.of();
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return false;
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return false;
    }

    @Override // nh.q2, nh.u6
    public final u6 m() {
        return u6.n(we.natural().reverse());
    }

    @Override // nh.q2, nh.u6
    public final u6 o(Object obj, boolean z10) {
        return this;
    }

    @Override // nh.q2, nh.u6
    public final u6 p(Object obj, boolean z10, Object obj2, boolean z11) {
        return this;
    }

    @Override // nh.q2, nh.u6
    public final u6 q(Object obj, boolean z10) {
        return this;
    }

    @Override // nh.q2
    public ze range() {
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // nh.q2, java.util.AbstractCollection
    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // nh.u6, java.util.NavigableSet
    public ej descendingIterator() {
        return s7.f76631f;
    }

    @Override // nh.u6, java.util.SortedSet
    public Comparable first() {
        throw new NoSuchElementException();
    }

    @Override // nh.u6, nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return s7.f76631f;
    }

    @Override // nh.u6, java.util.SortedSet
    public Comparable last() {
        throw new NoSuchElementException();
    }

    @Override // nh.q2
    public ze range(r0 r0Var, r0 r0Var2) {
        throw new NoSuchElementException();
    }

    @Override // nh.q2
    public q2 intersection(q2 q2Var) {
        return this;
    }

    @Override // nh.q2
    /* renamed from: r */
    public final q2 o(Comparable comparable, boolean z10) {
        return this;
    }

    @Override // nh.q2
    /* renamed from: t */
    public final q2 q(Comparable comparable, boolean z10) {
        return this;
    }

    @Override // nh.q2
    /* renamed from: s */
    public final q2 p(Comparable comparable, boolean z10, Comparable comparable2, boolean z11) {
        return this;
    }
}
