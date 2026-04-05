package com.facebook.ads.redexgen.core;

import java.util.AbstractCollection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: com.facebook.ads.redexgen.X.kK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2350kK<V> extends AbstractCollection<V> {
    public final /* synthetic */ BD A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kK != com.google.common.collect.AbstractMultimap<K, V>$Values */
    public C2350kK(final BD this$0) {
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kK != com.google.common.collect.AbstractMultimap<K, V>$Values */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kK != com.google.common.collect.AbstractMultimap<K, V>$Values */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object o10) {
        return this.A00.A03(o10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kK != com.google.common.collect.AbstractMultimap<K, V>$Values */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.A00.A0C();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kK != com.google.common.collect.AbstractMultimap<K, V>$Values */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}
