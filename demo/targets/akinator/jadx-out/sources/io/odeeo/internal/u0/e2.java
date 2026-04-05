package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface e2<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(Object obj);

    Collection<V> get(K k10);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    h2<K> keys();

    boolean put(K k10, V v10);

    boolean putAll(e2<? extends K, ? extends V> e2Var);

    boolean putAll(K k10, Iterable<? extends V> iterable);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    Collection<V> replaceValues(K k10, Iterable<? extends V> iterable);

    int size();

    Collection<V> values();
}
