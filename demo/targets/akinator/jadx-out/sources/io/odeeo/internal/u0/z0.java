package io.odeeo.internal.u0;

import java.util.Comparator;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class z0<K, V> extends s0<K, V> implements SortedMap<K, V> {
    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    @Override // io.odeeo.internal.u0.s0, io.odeeo.internal.u0.x0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract SortedMap<K, V> delegate();

    @Override // java.util.SortedMap
    public K firstKey() {
        return delegate().firstKey();
    }

    public SortedMap<K, V> headMap(K k10) {
        return delegate().headMap(k10);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return delegate().lastKey();
    }

    public SortedMap<K, V> subMap(K k10, K k11) {
        return delegate().subMap(k10, k11);
    }

    public SortedMap<K, V> tailMap(K k10) {
        return delegate().tailMap(k10);
    }
}
