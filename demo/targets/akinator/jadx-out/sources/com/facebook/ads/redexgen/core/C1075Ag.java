package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.Ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1075Ag<K, V> extends AbstractC2642pV<Map.Entry<K, V>, K> {
    public C1075Ag(Iterator backingIterator) {
        super(backingIterator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2642pV
    @ParametricNullness
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final K A01(Map.Entry<K, V> entry) {
        return entry.getKey();
    }
}
