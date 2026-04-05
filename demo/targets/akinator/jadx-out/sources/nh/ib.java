package nh;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ib extends eb implements SortedMap {
    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        return ((SortedMap) this.f76530f).comparator();
    }

    @Override // nh.eb, nh.dc
    public final Set createKeySet() {
        return new hb(this);
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return keySet().iterator().next();
    }

    @Override // java.util.SortedMap
    public SortedMap<Object, Object> headMap(Object obj) {
        return new ib(((SortedMap) this.f76530f).headMap(obj), this.f76531g);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        Map map = this.f76530f;
        SortedMap sortedMapHeadMap = (SortedMap) map;
        while (true) {
            Object objLastKey = sortedMapHeadMap.lastKey();
            if (c(objLastKey, map.get(objLastKey))) {
                return objLastKey;
            }
            sortedMapHeadMap = ((SortedMap) map).headMap(objLastKey);
        }
    }

    @Override // java.util.SortedMap
    public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
        return new ib(((SortedMap) this.f76530f).subMap(obj, obj2), this.f76531g);
    }

    @Override // java.util.SortedMap
    public SortedMap<Object, Object> tailMap(Object obj) {
        return new ib(((SortedMap) this.f76530f).tailMap(obj), this.f76531g);
    }

    @Override // nh.dc, java.util.AbstractMap, java.util.Map
    public SortedSet<Object> keySet() {
        return (SortedSet) super.keySet();
    }
}
