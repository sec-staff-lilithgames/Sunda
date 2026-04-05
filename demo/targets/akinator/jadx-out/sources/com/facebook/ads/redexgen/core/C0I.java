package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: com.facebook.ads.redexgen.X.0I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0I<K> extends AbstractC08581i<K, V>.SortedKeySet implements NavigableSet<K> {
    public final /* synthetic */ AbstractC08581i A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    public C0I(final AbstractC08581i this$0, NavigableMap<K, Collection<V>> subMap) {
        super(this$0, subMap);
        this.A00 = this$0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> A04() {
        return (NavigableMap) super.A04();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final NavigableSet<K> headSet(@ParametricNullness K toElement) {
        return headSet(toElement, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final NavigableSet<K> tailSet(@ParametricNullness K fromElement) {
        return tailSet(fromElement, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final NavigableSet<K> subSet(@ParametricNullness K fromElement, @ParametricNullness K toElement) {
        return subSet(fromElement, true, toElement, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @CheckForNull
    public final K ceiling(@ParametricNullness K k10) {
        return A04().ceilingKey(k10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    public final Iterator<K> descendingIterator() {
        return descendingSet().iterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    public final NavigableSet<K> descendingSet() {
        return new C0I(this.A00, A04().descendingMap());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @CheckForNull
    public final K floor(@ParametricNullness K k10) {
        return A04().floorKey(k10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    public final NavigableSet<K> headSet(@ParametricNullness K toElement, boolean inclusive) {
        return new C0I(this.A00, A04().headMap(toElement, inclusive));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @CheckForNull
    public final K higher(@ParametricNullness K k10) {
        return A04().higherKey(k10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @CheckForNull
    public final K lower(@ParametricNullness K k10) {
        return A04().lowerKey(k10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @CheckForNull
    public final K pollFirst() {
        return (K) AbstractC2523nL.A05(iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @CheckForNull
    public final K pollLast() {
        return (K) AbstractC2523nL.A05(descendingIterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    public final NavigableSet<K> subSet(@ParametricNullness K fromElement, @ParametricNullness boolean fromInclusive, K toElement, boolean toInclusive) {
        return new C0I(this.A00, A04().subMap(fromElement, fromInclusive, toElement, toInclusive));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0I != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    public final NavigableSet<K> tailSet(@ParametricNullness K fromElement, boolean inclusive) {
        return new C0I(this.A00, A04().tailMap(fromElement, inclusive));
    }
}
