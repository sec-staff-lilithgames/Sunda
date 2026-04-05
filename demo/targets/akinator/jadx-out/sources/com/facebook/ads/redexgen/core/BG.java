package com.facebook.ads.redexgen.core;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: assets/audience_network.dex */
public class BG<K, V> extends AbstractC2561ny<K, Collection<V>> {
    public final transient Map<K, Collection<V>> A00;
    public final /* synthetic */ AbstractC08581i A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    public BG(final AbstractC08581i this$0, Map<K, Collection<V>> submap) {
        this.A01 = this$0;
        this.A00 = submap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final Collection<V> get(@CheckForNull Object key) {
        Collection<V> collection = (Collection) AbstractC2562nz.A05(this.A00, key);
        if (collection == null) {
            return null;
        }
        Collection<V> collection2 = this.A01.A0F(key, collection);
        return collection2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final Collection<V> remove(@CheckForNull Object key) {
        Collection<V> collectionRemove = this.A00.remove(key);
        if (collectionRemove == null) {
            return null;
        }
        Collection<V> collectionA0D = this.A01.A0D();
        collectionA0D.addAll(collectionRemove);
        AbstractC08581i.A03(this.A01, collectionRemove.size());
        collectionRemove.clear();
        return collectionA0D;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // com.facebook.ads.redexgen.core.AbstractC2561ny
    public final Set<Map.Entry<K, Collection<V>>> A09() {
        return new AbstractC1072Ad<K, Collection<V>>() { // from class: com.facebook.ads.redexgen.X.1m
            public static String[] A01 = {ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Cderzo7kRJnvUqpU20WcBh2OZWVVjooT", "Z", "ZZrF4bQPE17IkUPu05dPNeIYxEP3htEV", "zoL9Bw1Syr4GOxCjTnDxY342EbanM9q3", "GegVcEhGdWXR", "86lf1o9WQgzrbD", "NgZwPtD5hXQhY3eRyOKbKp0yAyP86bbs"};

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1m != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapEntries */
            @Override // com.facebook.ads.redexgen.core.AbstractC1072Ad
            public final Map<K, Collection<V>> A00() {
                return this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1m != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapEntries */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object o10) {
                return AbstractC2431lq.A03(this.A00.A00.entrySet(), o10);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1m != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapEntries */
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C2343kD(this.A00);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1m != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapEntries */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@CheckForNull Object o10) {
                if (!contains(o10)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) Objects.requireNonNull((Map.Entry) o10);
                BG bg2 = this.A00;
                if (A01[2].length() == 19) {
                    throw new RuntimeException();
                }
                A01[3] = "G2qcJwlII5HIikaXRsYLysr3qmkTj7oM";
                bg2.A01.A0A(entry.getKey());
                return true;
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    public final Map.Entry<K, Collection<V>> A0A(Map.Entry<K, Collection<V>> entry) {
        K key = entry.getKey();
        return AbstractC2562nz.A01(key, this.A01.A0F(key, entry.getValue()));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.A00 == this.A01.A01) {
            this.A01.clear();
        } else {
            AbstractC2523nL.A0A(new C2343kD(this));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object key) {
        return AbstractC2562nz.A0C(this.A00, key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@CheckForNull Object object) {
        return this == object || this.A00.equals(object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        return this.A01.A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A00.size();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap
    public final String toString() {
        return this.A00.toString();
    }
}
