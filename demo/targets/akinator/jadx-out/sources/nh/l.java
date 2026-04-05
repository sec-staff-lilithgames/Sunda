package nh;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends o implements NavigableSet {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f76432f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w wVar, NavigableMap navigableMap) {
        super(wVar, navigableMap);
        this.f76432f = wVar;
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return d().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public Iterator<Object> descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> descendingSet() {
        return new l(this.f76432f, d().descendingMap());
    }

    @Override // nh.o
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.f76503b);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return d().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return d().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return d().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        return z7.b(iterator());
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        return z7.b(descendingIterator());
    }

    @Override // nh.o, java.util.SortedSet, java.util.NavigableSet
    public NavigableSet<Object> headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // nh.o, java.util.SortedSet, java.util.NavigableSet
    public NavigableSet<Object> subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // nh.o, java.util.SortedSet, java.util.NavigableSet
    public NavigableSet<Object> tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> headSet(Object obj, boolean z10) {
        return new l(this.f76432f, d().headMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new l(this.f76432f, d().subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> tailSet(Object obj, boolean z10) {
        return new l(this.f76432f, d().tailMap(obj, z10));
    }
}
