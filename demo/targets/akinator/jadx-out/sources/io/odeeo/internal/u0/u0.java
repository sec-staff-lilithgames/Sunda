package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class u0<K, V> extends x0 implements e2<K, V> {
    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    public void clear() {
        delegate().clear();
    }

    @Override // io.odeeo.internal.u0.e2
    public boolean containsEntry(Object obj, Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    @Override // io.odeeo.internal.u0.e2
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // io.odeeo.internal.u0.e2
    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // io.odeeo.internal.u0.x0
    public abstract e2<K, V> delegate();

    public Collection<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public Collection<V> get(K k10) {
        return delegate().get(k10);
    }

    @Override // io.odeeo.internal.u0.e2
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // io.odeeo.internal.u0.e2
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public h2<K> keys() {
        return delegate().keys();
    }

    public boolean put(K k10, V v10) {
        return delegate().put(k10, v10);
    }

    public boolean putAll(K k10, Iterable<? extends V> iterable) {
        return delegate().putAll(k10, iterable);
    }

    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public Collection<V> removeAll(Object obj) {
        return delegate().removeAll(obj);
    }

    public Collection<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        return delegate().replaceValues(k10, iterable);
    }

    @Override // io.odeeo.internal.u0.e2
    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    public boolean putAll(e2<? extends K, ? extends V> e2Var) {
        return delegate().putAll(e2Var);
    }
}
