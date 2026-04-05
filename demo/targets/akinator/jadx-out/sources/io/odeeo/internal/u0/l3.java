package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface l3<K, V> extends d3<K, V> {
    @Override // io.odeeo.internal.u0.d3, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    Map<K, Collection<V>> asMap();

    @Override // io.odeeo.internal.u0.d3, io.odeeo.internal.u0.e2
    /* synthetic */ Set entries();

    @Override // io.odeeo.internal.u0.d3, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Set get(Object obj);

    @Override // io.odeeo.internal.u0.d3, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    SortedSet<V> get(K k10);

    @Override // io.odeeo.internal.u0.d3, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Set removeAll(Object obj);

    @Override // io.odeeo.internal.u0.d3, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    SortedSet<V> removeAll(Object obj);

    @Override // io.odeeo.internal.u0.d3, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Set replaceValues(Object obj, Iterable iterable);

    @Override // io.odeeo.internal.u0.d3, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    SortedSet<V> replaceValues(K k10, Iterable<? extends V> iterable);

    Comparator<? super V> valueComparator();
}
