package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public abstract class BI<T> extends AbstractC2648pg<T> {
    public EnumC2342kC A00 = EnumC2342kC.A04;

    @CheckForNull
    public T A01;

    @CheckForNull
    public abstract T A02();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.google.common.collect.AbstractIterator<T> */
    private boolean A00() {
        this.A00 = EnumC2342kC.A03;
        this.A01 = A02();
        if (this.A00 != EnumC2342kC.A02) {
            this.A00 = EnumC2342kC.A05;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.google.common.collect.AbstractIterator<T> */
    @CheckForNull
    public final T A01() {
        this.A00 = EnumC2342kC.A02;
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.google.common.collect.AbstractIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC2279jA.A0D(this.A00 != EnumC2342kC.A03);
        switch (this.A00) {
            case A02:
                return false;
            case A05:
                return true;
            default:
                return A00();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.google.common.collect.AbstractIterator<T> */
    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (hasNext()) {
            this.A00 = EnumC2342kC.A04;
            T t10 = (T) AbstractC2588oQ.A01(this.A01);
            this.A01 = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
