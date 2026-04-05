package io.odeeo.internal.u0;

import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class q0<K, V> extends s0<K, V> implements ConcurrentMap<K, V> {
    @Override // io.odeeo.internal.u0.s0, io.odeeo.internal.u0.x0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap<K, V> delegate();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        return delegate().putIfAbsent(k10, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        return delegate().replace(k10, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, V v10, V v11) {
        return delegate().replace(k10, v10, v11);
    }
}
