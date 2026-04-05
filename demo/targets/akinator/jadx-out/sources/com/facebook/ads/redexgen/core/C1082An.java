package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.An, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1082An<K, V> extends AbstractC2349kJ<K, V> implements Serializable {
    public static final long serialVersionUID = 0;

    @ParametricNullness
    public final K A00;

    @ParametricNullness
    public final V A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.An != com.google.common.collect.ImmutableEntry<K, V> */
    public C1082An(@ParametricNullness K key, @ParametricNullness V value) {
        this.A00 = key;
        this.A01 = value;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.An != com.google.common.collect.ImmutableEntry<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2349kJ, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.An != com.google.common.collect.ImmutableEntry<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2349kJ, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.An != com.google.common.collect.ImmutableEntry<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2349kJ, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V value) {
        throw new UnsupportedOperationException();
    }
}
