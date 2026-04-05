package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;

@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.oE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC2577oE<K, V> {
    Map<K, Collection<V>> A49();

    boolean AGU(@ParametricNullness K key, @ParametricNullness V value);

    void clear();

    int size();

    Collection<V> values();
}
