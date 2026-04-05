package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0<K, V> extends g0<K, V> implements n0<K, V> {
    public h0(d3<K, V> d3Var, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        super(d3Var, vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.g0, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((h0<K, V>) obj);
    }

    @Override // io.odeeo.internal.u0.g0, io.odeeo.internal.u0.g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> b() {
        return e3.filter(unfiltered().entries(), entryPredicate());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((h0<K, V>) obj, iterable);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // io.odeeo.internal.u0.g0, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Set<V> get(K k10) {
        return (Set) super.get((h0<K, V>) k10);
    }

    @Override // io.odeeo.internal.u0.g0, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Set<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((h0<K, V>) k10, (Iterable) iterable);
    }

    @Override // io.odeeo.internal.u0.g0, io.odeeo.internal.u0.l0
    public d3<K, V> unfiltered() {
        return (d3) this.f66802f;
    }
}
