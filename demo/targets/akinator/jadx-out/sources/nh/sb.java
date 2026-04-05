package nh;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class sb extends nb implements SortedSet {
    @Override // java.util.SortedSet
    public Comparator<Object> comparator() {
        return c().comparator();
    }

    @Override // nh.nb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedMap c() {
        return (SortedMap) this.f76503b;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return c().firstKey();
    }

    public SortedSet<Object> headSet(Object obj) {
        return new sb(c().headMap(obj));
    }

    @Override // java.util.SortedSet
    public Object last() {
        return c().lastKey();
    }

    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return new sb(c().subMap(obj, obj2));
    }

    public SortedSet<Object> tailSet(Object obj) {
        return new sb(c().tailMap(obj));
    }
}
