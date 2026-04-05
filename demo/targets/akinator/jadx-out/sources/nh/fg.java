package nh;

import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class fg extends hg implements NavigableSet {
    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return i7.find(((NavigableSet) this.f76617b).tailSet(obj, true), this.f76618c, null);
    }

    @Override // java.util.NavigableSet
    public Iterator<Object> descendingIterator() {
        return z7.filter(((NavigableSet) this.f76617b).descendingIterator(), this.f76618c);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> descendingSet() {
        return og.filter(((NavigableSet) this.f76617b).descendingSet(), this.f76618c);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return z7.find(((NavigableSet) this.f76617b).headSet(obj, true).descendingIterator(), this.f76618c, null);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> headSet(Object obj, boolean z10) {
        return og.filter(((NavigableSet) this.f76617b).headSet(obj, z10), this.f76618c);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return i7.find(((NavigableSet) this.f76617b).tailSet(obj, false), this.f76618c, null);
    }

    @Override // nh.hg, java.util.SortedSet
    public Object last() {
        return z7.find(((NavigableSet) this.f76617b).descendingIterator(), this.f76618c);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return z7.find(((NavigableSet) this.f76617b).headSet(obj, false).descendingIterator(), this.f76618c, null);
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        return i7.a((NavigableSet) this.f76617b, this.f76618c);
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        return i7.a(((NavigableSet) this.f76617b).descendingSet(), this.f76618c);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return og.filter(((NavigableSet) this.f76617b).subSet(obj, z10, obj2, z11), this.f76618c);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> tailSet(Object obj, boolean z10) {
        return og.filter(((NavigableSet) this.f76617b).tailSet(obj, z10), this.f76618c);
    }
}
