package nh;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class vb extends wb implements NavigableMap {
    @Override // nh.wb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.f76692b);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> ceilingEntry(Object obj) {
        return d(b().ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return b().ceilingKey(obj);
    }

    public final na d(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        ya yaVar = this.f76693c;
        mh.p1.checkNotNull(yaVar);
        mh.p1.checkNotNull(entry);
        return new na(entry, yaVar);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> descendingKeySet() {
        return b().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> descendingMap() {
        return ec.transformEntries(b().descendingMap(), this.f76693c);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> firstEntry() {
        return d(b().firstEntry());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> floorEntry(Object obj) {
        return d(b().floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return b().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> higherEntry(Object obj) {
        return d(b().higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lastEntry() {
        return d(b().lastEntry());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lowerEntry(Object obj) {
        return d(b().lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> navigableKeySet() {
        return b().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> pollFirstEntry() {
        return d(b().pollFirstEntry());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> pollLastEntry() {
        return d(b().pollLastEntry());
    }

    @Override // nh.wb, java.util.SortedMap, java.util.NavigableMap
    public NavigableMap<Object, Object> headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return ec.transformEntries(b().subMap(obj, z10, obj2, z11), this.f76693c);
    }

    @Override // nh.wb, java.util.SortedMap, java.util.NavigableMap
    public NavigableMap<Object, Object> tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> headMap(Object obj, boolean z10) {
        return ec.transformEntries(b().headMap(obj, z10), this.f76693c);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> tailMap(Object obj, boolean z10) {
        return ec.transformEntries(b().tailMap(obj, z10), this.f76693c);
    }

    @Override // nh.wb, java.util.SortedMap, java.util.NavigableMap
    public NavigableMap<Object, Object> subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }
}
