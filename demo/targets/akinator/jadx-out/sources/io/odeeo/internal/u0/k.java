package io.odeeo.internal.u0;

import io.odeeo.internal.u0.d;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class k<K, V> extends j<K, V> implements l3<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    public k(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d
    public Collection<V> a(K k10, Collection<V> collection) {
        return collection instanceof NavigableSet ? new d.m(k10, (NavigableSet) collection, null) : new d.o(k10, (SortedSet) collection, null);
    }

    @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public <E> SortedSet<E> c(Collection<E> collection) {
        return collection instanceof NavigableSet ? e3.unmodifiableNavigableSet((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((k<K, V>) obj);
    }

    @Override // io.odeeo.internal.u0.j
    /* renamed from: o */
    public abstract SortedSet<V> i();

    @Override // io.odeeo.internal.u0.j
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public SortedSet<V> l() {
        return (SortedSet<V>) c(i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((k<K, V>) obj, iterable);
    }

    public abstract /* synthetic */ Comparator valueComparator();

    @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public Collection<V> values() {
        return super.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return get((k<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return replaceValues((k<K, V>) obj, iterable);
    }

    @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public SortedSet<V> get(K k10) {
        return (SortedSet) super.get((k<K, V>) k10);
    }

    @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public SortedSet<V> removeAll(Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public SortedSet<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        return (SortedSet) super.replaceValues((k<K, V>) k10, (Iterable) iterable);
    }
}
