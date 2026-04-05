package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0<K, V> extends j0<K, V> implements n0<K, V> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends j0<K, V>.c implements Set<Map.Entry<K, V>> {
        public a() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return e3.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return e3.a(this);
        }
    }

    public k0(d3<K, V> d3Var, io.odeeo.internal.t0.v<? super K> vVar) {
        super(d3Var, vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.j0, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((k0<K, V>) obj);
    }

    @Override // io.odeeo.internal.u0.j0, io.odeeo.internal.u0.g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> b() {
        return new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((k0<K, V>) obj, iterable);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // io.odeeo.internal.u0.j0, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Set<V> get(K k10) {
        return (Set) super.get((k0<K, V>) k10);
    }

    @Override // io.odeeo.internal.u0.j0, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Set<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((k0<K, V>) k10, (Iterable) iterable);
    }

    @Override // io.odeeo.internal.u0.j0, io.odeeo.internal.u0.l0
    public d3<K, V> unfiltered() {
        return (d3) this.f66894f;
    }
}
