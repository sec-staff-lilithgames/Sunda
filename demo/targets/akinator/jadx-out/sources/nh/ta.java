package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class ta extends g4 implements NavigableMap {

    /* renamed from: b, reason: collision with root package name */
    public transient we f76662b;

    /* renamed from: c, reason: collision with root package name */
    public transient sa f76663c;

    /* renamed from: e, reason: collision with root package name */
    public transient qb f76664e;

    @Override // nh.g4
    public final Map c() {
        return ((i0) this).f76342f;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> ceilingEntry(Object obj) {
        return ((i0) this).f76342f.floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return ((i0) this).f76342f.floorKey(obj);
    }

    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        we weVar = this.f76662b;
        if (weVar != null) {
            return weVar;
        }
        Comparator comparator = ((i0) this).f76342f.comparator();
        if (comparator == null) {
            comparator = we.natural();
        }
        we weVarReverse = we.from(comparator).reverse();
        this.f76662b = weVarReverse;
        return weVarReverse;
    }

    @Override // nh.l4
    public final Object delegate() {
        return ((i0) this).f76342f;
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> descendingKeySet() {
        return ((i0) this).f76342f.navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> descendingMap() {
        return ((i0) this).f76342f;
    }

    @Override // nh.g4, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        sa saVar = this.f76663c;
        if (saVar != null) {
            return saVar;
        }
        sa saVar2 = new sa(this);
        this.f76663c = saVar2;
        return saVar2;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> firstEntry() {
        return ((i0) this).f76342f.lastEntry();
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return ((i0) this).f76342f.lastKey();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> floorEntry(Object obj) {
        return ((i0) this).f76342f.ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return ((i0) this).f76342f.ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> headMap(Object obj, boolean z10) {
        return ((i0) this).f76342f.tailMap(obj, z10).descendingMap();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> higherEntry(Object obj) {
        return ((i0) this).f76342f.lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return ((i0) this).f76342f.lowerKey(obj);
    }

    @Override // nh.g4, java.util.Map
    public Set<Object> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lastEntry() {
        return ((i0) this).f76342f.firstEntry();
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return ((i0) this).f76342f.firstKey();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lowerEntry(Object obj) {
        return ((i0) this).f76342f.higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return ((i0) this).f76342f.higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> navigableKeySet() {
        qb qbVar = this.f76664e;
        if (qbVar != null) {
            return qbVar;
        }
        qb qbVar2 = new qb(this);
        this.f76664e = qbVar2;
        return qbVar2;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> pollFirstEntry() {
        return ((i0) this).f76342f.pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> pollLastEntry() {
        return ((i0) this).f76342f.pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return ((i0) this).f76342f.subMap(obj2, z11, obj, z10).descendingMap();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> tailMap(Object obj, boolean z10) {
        return ((i0) this).f76342f.headMap(obj, z10).descendingMap();
    }

    @Override // nh.l4
    public String toString() {
        return ec.h(this);
    }

    @Override // nh.g4, java.util.Map
    public Collection<Object> values() {
        return new cc(this);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<Object, Object> headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<Object, Object> tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
