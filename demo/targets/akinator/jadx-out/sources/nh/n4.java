package nh;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n4 extends g4 implements SortedMap {
    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        return Collections.unmodifiableSortedMap(((ac) this).f76098b).comparator();
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return Collections.unmodifiableSortedMap(((ac) this).f76098b).firstKey();
    }

    public SortedMap<Object, Object> headMap(Object obj) {
        return Collections.unmodifiableSortedMap(((ac) this).f76098b).headMap(obj);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return Collections.unmodifiableSortedMap(((ac) this).f76098b).lastKey();
    }

    public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
        return Collections.unmodifiableSortedMap(((ac) this).f76098b).subMap(obj, obj2);
    }

    public SortedMap<Object, Object> tailMap(Object obj) {
        return Collections.unmodifiableSortedMap(((ac) this).f76098b).tailMap(obj);
    }
}
