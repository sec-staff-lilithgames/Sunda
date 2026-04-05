package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.ListIterator;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public abstract class AF<E> extends AbstractC2648pg<E> implements ListIterator<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AF != com.google.common.collect.UnmodifiableListIterator<E> */
    @Override // java.util.ListIterator
    @Deprecated
    public final void add(@ParametricNullness E e10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AF != com.google.common.collect.UnmodifiableListIterator<E> */
    @Override // java.util.ListIterator
    @Deprecated
    public final void set(@ParametricNullness E e10) {
        throw new UnsupportedOperationException();
    }
}
