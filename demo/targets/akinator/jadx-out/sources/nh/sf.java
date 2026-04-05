package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface sf extends fc {
    @Override // nh.fc, nh.c8
    Map<Object, Collection<Object>> asMap();

    @Override // nh.fc
    /* synthetic */ void clear();

    @Override // nh.fc
    /* synthetic */ boolean containsEntry(Object obj, Object obj2);

    @Override // nh.fc
    /* synthetic */ boolean containsKey(Object obj);

    @Override // nh.fc
    /* synthetic */ boolean containsValue(Object obj);

    @Override // nh.fc
    Set<Map.Entry<Object, Object>> entries();

    @Override // nh.fc, nh.c8
    boolean equals(Object obj);

    @Override // nh.fc, nh.c8
    Set<Object> get(Object obj);

    @Override // nh.fc
    /* synthetic */ boolean isEmpty();

    @Override // nh.fc
    /* synthetic */ Set keySet();

    @Override // nh.fc
    /* synthetic */ ud keys();

    @Override // nh.fc, nh.c8
    /* synthetic */ boolean put(Object obj, Object obj2);

    @Override // nh.fc
    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    @Override // nh.fc
    /* synthetic */ boolean putAll(fc fcVar);

    @Override // nh.fc
    /* synthetic */ boolean remove(Object obj, Object obj2);

    @Override // nh.fc, nh.c8
    Set<Object> removeAll(Object obj);

    @Override // nh.fc, nh.c8
    /* bridge */ /* synthetic */ default Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.fc, nh.c8
    Set<Object> replaceValues(Object obj, Iterable<Object> iterable);

    @Override // nh.fc
    /* synthetic */ int size();

    @Override // nh.fc
    /* synthetic */ Collection values();
}
