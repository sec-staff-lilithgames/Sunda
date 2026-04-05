package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.1W, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1W<E> extends AbstractC1080Al<E> {
    public final transient Object[] A00;
    public final transient Object[] A01;
    public final transient int A02;
    public final transient int A03;
    public final transient int A04;
    public static final Object[] A06 = new Object[0];
    public static final C1W<Object> A05 = new C1W<>(A06, 0, A06, 0, 0);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    public C1W(Object[] elements, int hashCode, Object[] table, int mask, int size) {
        this.A00 = elements;
        this.A02 = hashCode;
        this.A01 = table;
        this.A03 = mask;
        this.A04 = size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
    public final int A0G() {
        return this.A04;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
    public final int A0H() {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
    public final int A0I(Object[] dst, int offset) {
        System.arraycopy(this.A00, 0, dst, offset, this.A04);
        return this.A04 + offset;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
    public final Object[] A0L() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1080Al
    public final AbstractC1081Am<E> A0M() {
        return AbstractC1081Am.A09(this.A00, this.A04);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: A0N */
    public final AbstractC2648pg<E> iterator() {
        return A0J().iterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1080Al
    public final boolean A0O() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object target) {
        Object[] objArr = this.A01;
        if (target == null || objArr.length == 0) {
            return false;
        }
        int iA02 = AbstractC2470mU.A02(target);
        while (true) {
            int i10 = iA02 & this.A03;
            Object obj = objArr[i10];
            if (obj == null) {
                return false;
            }
            if (obj.equals(target)) {
                return true;
            }
            iA02 = i10 + 1;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1080Al, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1W != com.google.common.collect.RegularImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A04;
    }
}
