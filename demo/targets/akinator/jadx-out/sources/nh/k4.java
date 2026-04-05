package nh;

import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k4 extends o4 implements NavigableSet {
    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return ((ka) this).f76421b.ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public Iterator<Object> descendingIterator() {
        return ((ka) this).f76421b.descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> descendingSet() {
        return ((ka) this).f76421b.descendingSet();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return ((ka) this).f76421b.floor(obj);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> headSet(Object obj, boolean z10) {
        return ((ka) this).f76421b.headSet(obj, z10);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return ((ka) this).f76421b.higher(obj);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return ((ka) this).f76421b.lower(obj);
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        return ((ka) this).f76421b.pollFirst();
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        return ((ka) this).f76421b.pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return ((ka) this).f76421b.subSet(obj, z10, obj2, z11);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> tailSet(Object obj, boolean z10) {
        return ((ka) this).f76421b.tailSet(obj, z10);
    }
}
