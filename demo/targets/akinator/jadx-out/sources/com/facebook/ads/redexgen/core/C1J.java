package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.1J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1J<E> extends AbstractC1080Al<E> {
    public final transient E A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1J != com.google.common.collect.SingletonImmutableSet<E> */
    public C1J(E e10) {
        this.A00 = (E) AbstractC2279jA.A04(e10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1J != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
    public final int A0I(Object[] dst, int offset) {
        dst[offset] = this.A00;
        return offset + 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1J != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1080Al, com.facebook.ads.redexgen.core.AbstractC2476ma
    public final AbstractC1081Am<E> A0J() {
        return AbstractC1081Am.A04(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1J != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1J != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final AbstractC2648pg<E> iterator() {
        return AbstractC2523nL.A03(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1J != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object target) {
        return this.A00.equals(target);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1J != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1080Al, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1J != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1J != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + this.A00.toString() + AbstractJsonLexerKt.END_LIST;
    }
}
