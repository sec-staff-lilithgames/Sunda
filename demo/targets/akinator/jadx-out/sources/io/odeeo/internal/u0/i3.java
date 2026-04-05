package io.odeeo.internal.u0;

import io.odeeo.internal.u0.a2;
import java.util.Map;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface i3<K, V> extends a2<K, V> {
    @Override // io.odeeo.internal.u0.a2
    /* synthetic */ boolean areEqual();

    @Override // io.odeeo.internal.u0.a2
    /* synthetic */ Map entriesDiffering();

    @Override // io.odeeo.internal.u0.a2
    SortedMap<K, a2.a<V>> entriesDiffering();

    @Override // io.odeeo.internal.u0.a2
    /* synthetic */ Map entriesInCommon();

    @Override // io.odeeo.internal.u0.a2
    SortedMap<K, V> entriesInCommon();

    @Override // io.odeeo.internal.u0.a2
    /* synthetic */ Map entriesOnlyOnLeft();

    @Override // io.odeeo.internal.u0.a2
    SortedMap<K, V> entriesOnlyOnLeft();

    @Override // io.odeeo.internal.u0.a2
    /* synthetic */ Map entriesOnlyOnRight();

    @Override // io.odeeo.internal.u0.a2
    SortedMap<K, V> entriesOnlyOnRight();
}
