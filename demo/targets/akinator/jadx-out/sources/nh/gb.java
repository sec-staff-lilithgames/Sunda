package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class gb extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final NavigableMap f76296b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.q1 f76297c;

    /* renamed from: e, reason: collision with root package name */
    public final eb f76298e;

    public gb(NavigableMap navigableMap, mh.q1 q1Var) {
        this.f76296b = (NavigableMap) mh.p1.checkNotNull(navigableMap);
        this.f76297c = q1Var;
        this.f76298e = new eb(navigableMap, q1Var);
    }

    @Override // nh.mb
    public final Iterator a() {
        return z7.filter(this.f76296b.entrySet().iterator(), this.f76297c);
    }

    @Override // nh.j0
    public final Iterator b() {
        return z7.filter(this.f76296b.descendingMap().entrySet().iterator(), this.f76297c);
    }

    @Override // nh.mb, java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f76298e.clear();
    }

    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        return this.f76296b.comparator();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f76298e.containsKey(obj);
    }

    @Override // nh.j0, java.util.NavigableMap
    public NavigableMap<Object, Object> descendingMap() {
        return ec.filterEntries(this.f76296b.descendingMap(), this.f76297c);
    }

    @Override // nh.mb, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<Map.Entry<Object, Object>> entrySet() {
        return this.f76298e.entrySet();
    }

    @Override // nh.j0, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f76298e.get(obj);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> headMap(Object obj, boolean z10) {
        return ec.filterEntries(this.f76296b.headMap(obj, z10), this.f76297c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return !i7.any(this.f76296b.entrySet(), this.f76297c);
    }

    @Override // nh.j0, java.util.NavigableMap
    public NavigableSet<Object> navigableKeySet() {
        return new fb(this, this);
    }

    @Override // nh.j0, java.util.NavigableMap
    public Map.Entry<Object, Object> pollFirstEntry() {
        return (Map.Entry) i7.a(this.f76296b.entrySet(), this.f76297c);
    }

    @Override // nh.j0, java.util.NavigableMap
    public Map.Entry<Object, Object> pollLastEntry() {
        return (Map.Entry) i7.a(this.f76296b.descendingMap().entrySet(), this.f76297c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f76298e.put(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<Object, Object> map) {
        this.f76298e.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return this.f76298e.remove(obj);
    }

    @Override // nh.mb, java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f76298e.size();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return ec.filterEntries(this.f76296b.subMap(obj, z10, obj2, z11), this.f76297c);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> tailMap(Object obj, boolean z10) {
        return ec.filterEntries(this.f76296b.tailMap(obj, z10), this.f76297c);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Collection<Object> values() {
        return new kb(this, this.f76296b, this.f76297c);
    }
}
