package nh;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface c8 extends fc {
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
    /* synthetic */ Collection entries();

    boolean equals(Object obj);

    @Override // 
    List<Object> get(Object obj);

    @Override // nh.fc
    /* synthetic */ boolean isEmpty();

    @Override // nh.fc
    /* synthetic */ Set keySet();

    @Override // nh.fc
    /* synthetic */ ud keys();

    /* synthetic */ boolean put(Object obj, Object obj2);

    @Override // nh.fc
    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    @Override // nh.fc
    /* synthetic */ boolean putAll(fc fcVar);

    @Override // nh.fc
    /* synthetic */ boolean remove(Object obj, Object obj2);

    @Override // 
    List<Object> removeAll(Object obj);

    /* bridge */ /* synthetic */ default Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.fc, nh.c8
    List<Object> replaceValues(Object obj, Iterable<Object> iterable);

    @Override // nh.fc
    /* synthetic */ int size();

    @Override // nh.fc
    /* synthetic */ Collection values();
}
