package io.odeeo.internal.u0;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface n<K, V> extends Map<K, V> {
    V forcePut(K k10, V v10);

    n<V, K> inverse();

    @Override // java.util.Map
    V put(K k10, V v10);

    @Override // java.util.Map
    void putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    Set<V> values();
}
