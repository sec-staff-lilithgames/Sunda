package com.facebook.ads.redexgen.core;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: com.facebook.ads.redexgen.X.lu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2435lu<V> extends AbstractCollection<V> {
    public final /* synthetic */ C2436lv A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lu != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    public C2435lu(final C2436lv this$0) {
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lu != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lu != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.A00.A0f();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lu != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}
