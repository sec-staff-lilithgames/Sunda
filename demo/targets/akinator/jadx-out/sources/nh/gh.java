package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface gh extends sf {
    @Override // nh.sf, nh.fc, nh.c8
    Map<Object, Collection<Object>> asMap();

    @Override // nh.sf, nh.fc
    /* synthetic */ void clear();

    @Override // nh.sf, nh.fc
    /* synthetic */ boolean containsEntry(Object obj, Object obj2);

    @Override // nh.sf, nh.fc
    /* synthetic */ boolean containsKey(Object obj);

    @Override // nh.sf, nh.fc
    /* synthetic */ boolean containsValue(Object obj);

    @Override // nh.sf, nh.fc
    /* bridge */ /* synthetic */ default Collection entries() {
        return super.entries();
    }

    @Override // nh.sf, nh.fc
    /* synthetic */ Set entries();

    @Override // nh.sf, nh.fc, nh.c8
    SortedSet<Object> get(Object obj);

    @Override // nh.sf, nh.fc
    /* synthetic */ boolean isEmpty();

    @Override // nh.sf, nh.fc
    /* synthetic */ Set keySet();

    @Override // nh.sf, nh.fc
    /* synthetic */ ud keys();

    @Override // nh.sf, nh.fc, nh.c8
    /* synthetic */ boolean put(Object obj, Object obj2);

    @Override // nh.sf, nh.fc
    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    @Override // nh.sf, nh.fc
    /* synthetic */ boolean putAll(fc fcVar);

    @Override // nh.sf, nh.fc
    /* synthetic */ boolean remove(Object obj, Object obj2);

    @Override // nh.sf, nh.fc, nh.c8
    SortedSet<Object> removeAll(Object obj);

    @Override // nh.sf, nh.fc, nh.c8
    /* bridge */ /* synthetic */ default Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.sf, nh.fc, nh.c8
    SortedSet<Object> replaceValues(Object obj, Iterable<Object> iterable);

    @Override // nh.sf, nh.fc
    /* synthetic */ int size();

    Comparator<Object> valueComparator();

    @Override // nh.sf, nh.fc
    /* synthetic */ Collection values();

    @Override // nh.sf, nh.fc, nh.c8
    /* bridge */ /* synthetic */ default Set replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }
}
