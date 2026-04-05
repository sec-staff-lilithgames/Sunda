package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c<K, V> extends d<K, V> implements y1<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // io.odeeo.internal.u0.d
    public Collection<V> a(K k10, Collection<V> collection) {
        return a(k10, (List) collection, null);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // io.odeeo.internal.u0.d
    public <E> Collection<E> c(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((c<K, V>) obj);
    }

    @Override // io.odeeo.internal.u0.d
    /* renamed from: m */
    public abstract List<V> i();

    @Override // io.odeeo.internal.u0.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public List<V> l() {
        return Collections.EMPTY_LIST;
    }

    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((c<K, V>) obj, iterable);
    }

    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public List<V> get(K k10) {
        return (List) super.get((c<K, V>) k10);
    }

    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public List<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((c<K, V>) k10, (Iterable) iterable);
    }
}
