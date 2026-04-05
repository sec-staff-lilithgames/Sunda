package nh;

import java.util.Comparator;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class wb extends ub implements SortedMap {
    public SortedMap b() {
        return (SortedMap) this.f76692b;
    }

    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return b().firstKey();
    }

    public SortedMap<Object, Object> headMap(Object obj) {
        return ec.transformEntries(b().headMap(obj), this.f76693c);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return b().lastKey();
    }

    public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
        return ec.transformEntries(b().subMap(obj, obj2), this.f76693c);
    }

    public SortedMap<Object, Object> tailMap(Object obj) {
        return ec.transformEntries(b().tailMap(obj), this.f76693c);
    }
}
