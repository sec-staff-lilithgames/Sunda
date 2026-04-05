package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0<K, V> extends j0<K, V> implements y1<K, V> {
    public i0(y1<K, V> y1Var, io.odeeo.internal.t0.v<? super K> vVar) {
        super(y1Var, vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.j0, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((i0<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((i0<K, V>) obj, iterable);
    }

    @Override // io.odeeo.internal.u0.j0, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public List<V> get(K k10) {
        return (List) super.get((i0<K, V>) k10);
    }

    @Override // io.odeeo.internal.u0.j0, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public List<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((i0<K, V>) k10, (Iterable) iterable);
    }

    @Override // io.odeeo.internal.u0.j0, io.odeeo.internal.u0.l0
    public y1<K, V> unfiltered() {
        return (y1) super.unfiltered();
    }
}
