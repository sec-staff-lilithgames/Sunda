package com.facebook.ads.redexgen.core;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.facebook.ads.redexgen.X.Ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1071Ac<K, V> extends AbstractC2613oq<K> {
    public final Map<K, V> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ac != com.google.common.collect.Maps$KeySet<K, V> */
    public C1071Ac(Map<K, V> map) {
        this.A00 = (Map) AbstractC2279jA.A04(map);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ac != com.google.common.collect.Maps$KeySet<K, V> */
    public Map<K, V> A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ac != com.google.common.collect.Maps$KeySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        A00().clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ac != com.google.common.collect.Maps$KeySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object o10) {
        return A00().containsKey(o10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ac != com.google.common.collect.Maps$KeySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return A00().isEmpty();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ac != com.google.common.collect.Maps$KeySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return AbstractC2562nz.A02(A00().entrySet().iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ac != com.google.common.collect.Maps$KeySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@CheckForNull Object o10) {
        if (contains(o10)) {
            A00().remove(o10);
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ac != com.google.common.collect.Maps$KeySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return A00().size();
    }
}
