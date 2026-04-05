package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class s0<K, V> extends x0 implements Map<K, V> {
    @Override // io.odeeo.internal.u0.x0
    /* renamed from: a */
    public abstract Map<K, V> delegate();

    public boolean a(Object obj) {
        return d2.a(this, obj);
    }

    public boolean b(Object obj) {
        return d2.b(this, obj);
    }

    public String c() {
        return d2.b(this);
    }

    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return delegate().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    public int b() {
        return e3.a(entrySet());
    }
}
