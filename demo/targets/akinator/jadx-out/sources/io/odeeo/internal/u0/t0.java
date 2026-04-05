package io.odeeo.internal.u0;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class t0<K, V> extends x0 implements Map.Entry<K, V> {
    @Override // io.odeeo.internal.u0.x0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract Map.Entry<K, V> delegate();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return delegate().equals(obj);
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return delegate().getKey();
    }

    public V getValue() {
        return delegate().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return delegate().hashCode();
    }

    public V setValue(V v10) {
        return delegate().setValue(v10);
    }
}
