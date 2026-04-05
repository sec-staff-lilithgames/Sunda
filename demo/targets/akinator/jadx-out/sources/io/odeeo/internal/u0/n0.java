package io.odeeo.internal.u0;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface n0<K, V> extends l0<K, V>, d3<K, V> {
    @Override // io.odeeo.internal.u0.l0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Map asMap();

    @Override // io.odeeo.internal.u0.l0, io.odeeo.internal.u0.e2
    /* synthetic */ Set entries();

    @Override // io.odeeo.internal.u0.l0
    /* synthetic */ io.odeeo.internal.t0.v entryPredicate();

    @Override // io.odeeo.internal.u0.l0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Set get(Object obj);

    @Override // io.odeeo.internal.u0.l0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Set removeAll(Object obj);

    @Override // io.odeeo.internal.u0.l0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    /* synthetic */ Set replaceValues(Object obj, Iterable iterable);

    @Override // io.odeeo.internal.u0.l0
    d3<K, V> unfiltered();

    @Override // io.odeeo.internal.u0.l0
    /* synthetic */ e2 unfiltered();
}
