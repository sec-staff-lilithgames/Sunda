package nh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ng extends o4 implements NavigableSet, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final NavigableSet f76511b;

    /* renamed from: c, reason: collision with root package name */
    public final SortedSet f76512c;

    /* renamed from: e, reason: collision with root package name */
    public transient ng f76513e;

    public ng(NavigableSet navigableSet) {
        this.f76511b = (NavigableSet) mh.p1.checkNotNull(navigableSet);
        this.f76512c = Collections.unmodifiableSortedSet(navigableSet);
    }

    @Override // nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        return this.f76512c;
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return this.f76511b.ceiling(obj);
    }

    @Override // nh.m4
    public final Set d() {
        return this.f76512c;
    }

    @Override // nh.e4, nh.l4
    public final Object delegate() {
        return this.f76512c;
    }

    @Override // java.util.NavigableSet
    public Iterator<Object> descendingIterator() {
        return z7.unmodifiableIterator(this.f76511b.descendingIterator());
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> descendingSet() {
        ng ngVar = this.f76513e;
        if (ngVar != null) {
            return ngVar;
        }
        ng ngVar2 = new ng(this.f76511b.descendingSet());
        this.f76513e = ngVar2;
        ngVar2.f76513e = this;
        return ngVar2;
    }

    @Override // nh.o4
    public final SortedSet e() {
        return this.f76512c;
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return this.f76511b.floor(obj);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> headSet(Object obj, boolean z10) {
        return og.unmodifiableNavigableSet(this.f76511b.headSet(obj, z10));
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return this.f76511b.higher(obj);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return this.f76511b.lower(obj);
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return og.unmodifiableNavigableSet(this.f76511b.subSet(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> tailSet(Object obj, boolean z10) {
        return og.unmodifiableNavigableSet(this.f76511b.tailSet(obj, z10));
    }
}
