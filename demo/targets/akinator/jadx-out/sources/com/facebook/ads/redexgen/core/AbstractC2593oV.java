package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.oV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2593oV<T> implements Comparator<T> {
    @Override // java.util.Comparator
    public abstract int compare(@ParametricNullness T left, @ParametricNullness T right);

    public static <C extends Comparable> AbstractC2593oV<C> A03() {
        return AQ.A02;
    }

    public static <T> AbstractC2593oV<T> A04(Comparator<T> comparator) {
        if (comparator instanceof AbstractC2593oV) {
            return (AbstractC2593oV) comparator;
        }
        return new B2(comparator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ip != com.google.common.base.Function<F, ? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.Ordering<T> */
    public final <F> AbstractC2593oV<F> A05(InterfaceC2259ip<F, ? extends T> function) {
        return new BA(function, this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.Ordering<T> */
    public <S extends T> AbstractC2593oV<S> A06() {
        return new AJ(this);
    }
}
