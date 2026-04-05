package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* renamed from: com.facebook.ads.redexgen.X.1T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C1T<E> extends AG<E> implements SortedSet<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1T != com.google.common.collect.Sets$FilteredSortedSet<E> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jB != com.google.common.base.Predicate<? super E> */
    public C1T(SortedSet<E> unfiltered, InterfaceC2280jB<? super E> predicate) {
        super(unfiltered, predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1T != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator<? super E> comparator() {
        return ((SortedSet) this.A01).comparator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1T != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    @ParametricNullness
    public final E first() {
        return (E) AbstractC2523nL.A06(this.A01.iterator(), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1T != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(@ParametricNullness E toElement) {
        return new C1T(((SortedSet) this.A01).headSet(toElement), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1T != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    @ParametricNullness
    public E last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.A01;
        while (true) {
            E e10 = (Object) sortedSetHeadSet.last();
            if (this.A00.A44(e10)) {
                return e10;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1T != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(@ParametricNullness E fromElement, @ParametricNullness E toElement) {
        return new C1T(((SortedSet) this.A01).subSet(fromElement, toElement), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1T != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(@ParametricNullness E fromElement) {
        return new C1T(((SortedSet) this.A01).tailSet(fromElement), this.A00);
    }
}
