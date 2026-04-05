package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface l0<K, V> extends e2<K, V> {
    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Map asMap();

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

    io.odeeo.internal.t0.v<? super Map.Entry<K, V>> entryPredicate();

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Collection get(Object obj);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean isEmpty();

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ Set keySet();

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ h2 keys();

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ boolean put(Object obj, Object obj2);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean putAll(e2 e2Var);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ boolean remove(Object obj, Object obj2);

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Collection removeAll(Object obj);

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Collection replaceValues(Object obj, Iterable iterable);

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ int size();

    e2<K, V> unfiltered();

    @Override // io.odeeo.internal.u0.e2
    /* synthetic */ Collection values();
}
