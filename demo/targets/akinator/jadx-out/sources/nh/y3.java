package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface y3 extends w3, sf {
    @Override // nh.w3, nh.fc, nh.c8
    /* synthetic */ Map asMap();

    @Override // nh.w3, nh.fc
    /* synthetic */ void clear();

    @Override // nh.w3, nh.fc
    /* synthetic */ boolean containsEntry(Object obj, Object obj2);

    @Override // nh.w3, nh.fc
    /* synthetic */ boolean containsKey(Object obj);

    @Override // nh.w3, nh.fc
    /* synthetic */ boolean containsValue(Object obj);

    @Override // nh.w3, nh.fc
    /* bridge */ /* synthetic */ default Collection entries() {
        return super.entries();
    }

    @Override // nh.w3, nh.fc
    /* synthetic */ Set entries();

    @Override // nh.w3
    /* synthetic */ mh.q1 entryPredicate();

    @Override // nh.w3, nh.fc, nh.c8
    /* bridge */ /* synthetic */ default Collection get(Object obj) {
        return super.get(obj);
    }

    @Override // nh.w3, nh.fc, nh.c8
    /* synthetic */ Set get(Object obj);

    @Override // nh.w3, nh.fc
    /* synthetic */ boolean isEmpty();

    @Override // nh.w3, nh.fc
    /* synthetic */ Set keySet();

    @Override // nh.w3, nh.fc
    /* synthetic */ ud keys();

    @Override // nh.w3, nh.fc, nh.c8
    /* synthetic */ boolean put(Object obj, Object obj2);

    @Override // nh.w3, nh.fc
    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    @Override // nh.w3, nh.fc
    /* synthetic */ boolean putAll(fc fcVar);

    @Override // nh.w3, nh.fc
    /* synthetic */ boolean remove(Object obj, Object obj2);

    @Override // nh.w3, nh.fc, nh.c8
    /* bridge */ /* synthetic */ default Collection removeAll(Object obj) {
        return super.removeAll(obj);
    }

    @Override // nh.w3, nh.fc, nh.c8
    /* synthetic */ Set removeAll(Object obj);

    @Override // nh.w3, nh.fc, nh.c8
    /* bridge */ /* synthetic */ default Collection replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    @Override // nh.w3, nh.fc, nh.c8
    /* synthetic */ Set replaceValues(Object obj, Iterable iterable);

    @Override // nh.w3, nh.fc
    /* synthetic */ int size();

    @Override // nh.w3
    sf unfiltered();

    @Override // nh.w3, nh.fc
    /* synthetic */ Collection values();
}
