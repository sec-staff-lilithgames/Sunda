package nh;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ac extends n4 implements NavigableMap, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final NavigableMap f76098b;

    /* renamed from: c, reason: collision with root package name */
    public transient ac f76099c;

    public ac(NavigableMap navigableMap) {
        this.f76098b = navigableMap;
    }

    @Override // nh.g4
    public final Map c() {
        return Collections.unmodifiableSortedMap(this.f76098b);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> ceilingEntry(Object obj) {
        return ec.b(this.f76098b.ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return this.f76098b.ceilingKey(obj);
    }

    @Override // nh.l4
    public final Object delegate() {
        return Collections.unmodifiableSortedMap(this.f76098b);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> descendingKeySet() {
        return og.unmodifiableNavigableSet(this.f76098b.descendingKeySet());
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> descendingMap() {
        ac acVar = this.f76099c;
        if (acVar != null) {
            return acVar;
        }
        ac acVar2 = new ac(this.f76098b.descendingMap(), this);
        this.f76099c = acVar2;
        return acVar2;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> firstEntry() {
        return ec.b(this.f76098b.firstEntry());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> floorEntry(Object obj) {
        return ec.b(this.f76098b.floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return this.f76098b.floorKey(obj);
    }

    @Override // nh.n4, java.util.SortedMap, java.util.NavigableMap
    public SortedMap<Object, Object> headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> higherEntry(Object obj) {
        return ec.b(this.f76098b.higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return this.f76098b.higherKey(obj);
    }

    @Override // nh.g4, java.util.Map
    public Set<Object> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lastEntry() {
        return ec.b(this.f76098b.lastEntry());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lowerEntry(Object obj) {
        return ec.b(this.f76098b.lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return this.f76098b.lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> navigableKeySet() {
        return og.unmodifiableNavigableSet(this.f76098b.navigableKeySet());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<Object, Object> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<Object, Object> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // nh.n4, java.util.SortedMap, java.util.NavigableMap
    public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // nh.n4, java.util.SortedMap, java.util.NavigableMap
    public SortedMap<Object, Object> tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> headMap(Object obj, boolean z10) {
        return ec.unmodifiableNavigableMap(this.f76098b.headMap(obj, z10));
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return ec.unmodifiableNavigableMap(this.f76098b.subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> tailMap(Object obj, boolean z10) {
        return ec.unmodifiableNavigableMap(this.f76098b.tailMap(obj, z10));
    }

    public ac(NavigableMap navigableMap, ac acVar) {
        this.f76098b = navigableMap;
        this.f76099c = acVar;
    }
}
