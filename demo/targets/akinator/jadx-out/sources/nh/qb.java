package nh;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class qb extends sb implements NavigableSet {
    @Override // nh.sb, nh.nb
    public final Map c() {
        return (NavigableMap) this.f76503b;
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return ((NavigableMap) this.f76503b).ceilingKey(obj);
    }

    @Override // nh.sb
    /* renamed from: d */
    public final SortedMap c() {
        return (NavigableMap) this.f76503b;
    }

    @Override // java.util.NavigableSet
    public Iterator<Object> descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> descendingSet() {
        return ((NavigableMap) this.f76503b).descendingKeySet();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return ((NavigableMap) this.f76503b).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> headSet(Object obj, boolean z10) {
        return ((NavigableMap) this.f76503b).headMap(obj, z10).navigableKeySet();
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return ((NavigableMap) this.f76503b).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return ((NavigableMap) this.f76503b).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        return ec.g(((NavigableMap) this.f76503b).pollFirstEntry());
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        return ec.g(((NavigableMap) this.f76503b).pollLastEntry());
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return ((NavigableMap) this.f76503b).subMap(obj, z10, obj2, z11).navigableKeySet();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> tailSet(Object obj, boolean z10) {
        return ((NavigableMap) this.f76503b).tailMap(obj, z10).navigableKeySet();
    }

    @Override // nh.sb, java.util.SortedSet, java.util.NavigableSet
    public SortedSet<Object> headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // nh.sb, java.util.SortedSet, java.util.NavigableSet
    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // nh.sb, java.util.SortedSet, java.util.NavigableSet
    public SortedSet<Object> tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
