package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface y1<K, V> extends e2<K, V> {
    Map<K, Collection<V>> asMap();

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ void clear();

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean containsEntry(Object obj, Object obj2);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean containsKey(Object obj);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean containsValue(Object obj);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ Collection entries();

    boolean equals(Object obj);

    /* synthetic */ Collection get(Object obj);

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    List<V> get(K k10);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean isEmpty();

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ Set keySet();

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ h2 keys();

    /* synthetic */ boolean put(Object obj, Object obj2);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean putAll(e2 e2Var);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean remove(Object obj, Object obj2);

    /* synthetic */ Collection removeAll(Object obj);

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    List<V> removeAll(Object obj);

    /* synthetic */ Collection replaceValues(Object obj, Iterable iterable);

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    List<V> replaceValues(K k10, Iterable<? extends V> iterable);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ int size();

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ Collection values();
}
