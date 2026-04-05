package io.odeeo.internal.u0;

import io.odeeo.internal.u0.d;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class j<K, V> extends d<K, V> implements d3<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public j(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // io.odeeo.internal.u0.d
    public Collection<V> a(K k10, Collection<V> collection) {
        return new d.n(k10, (Set) collection);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // io.odeeo.internal.u0.d
    public <E> Collection<E> c(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((j<K, V>) obj);
    }

    @Override // io.odeeo.internal.u0.d
    /* renamed from: m */
    public abstract Set<V> i();

    @Override // io.odeeo.internal.u0.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Set<V> l() {
        return Collections.EMPTY_SET;
    }

    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((j<K, V>) obj, iterable);
    }

    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Set<V> get(K k10) {
        return (Set) super.get((j<K, V>) k10);
    }

    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Set<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((j<K, V>) k10, (Iterable) iterable);
    }
}
