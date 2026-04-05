package nh;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class ri extends ii implements SortedMap {
    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        Comparator<Object> comparator;
        synchronized (this.f76516c) {
            comparator = c().comparator();
        }
        return comparator;
    }

    @Override // nh.ii
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedMap c() {
        return (SortedMap) ((Map) this.f76515b);
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        Object objFirstKey;
        synchronized (this.f76516c) {
            objFirstKey = c().firstKey();
        }
        return objFirstKey;
    }

    public SortedMap<Object, Object> headMap(Object obj) {
        ri riVar;
        synchronized (this.f76516c) {
            riVar = new ri(c().headMap(obj), this.f76516c);
        }
        return riVar;
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        Object objLastKey;
        synchronized (this.f76516c) {
            objLastKey = c().lastKey();
        }
        return objLastKey;
    }

    public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
        ri riVar;
        synchronized (this.f76516c) {
            riVar = new ri(c().subMap(obj, obj2), this.f76516c);
        }
        return riVar;
    }

    public SortedMap<Object, Object> tailMap(Object obj) {
        ri riVar;
        synchronized (this.f76516c) {
            riVar = new ri(c().tailMap(obj), this.f76516c);
        }
        return riVar;
    }
}
