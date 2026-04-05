package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import com.google.common.base.ParametricNullness;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.iX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2243iX<T> implements Iterator<T> {
    public EnumC2242iW A00 = EnumC2242iW.A04;

    @CheckForNull
    public T A01;

    @CheckForNull
    public abstract T A03();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iX != com.google.common.base.AbstractIterator<T> */
    private boolean A01() {
        this.A00 = EnumC2242iW.A03;
        this.A01 = A03();
        if (this.A00 != EnumC2242iW.A02) {
            this.A00 = EnumC2242iW.A05;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iX != com.google.common.base.AbstractIterator<T> */
    @CheckForNull
    public final T A02() {
        this.A00 = EnumC2242iW.A02;
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iX != com.google.common.base.AbstractIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC2279jA.A0D(this.A00 != EnumC2242iW.A03);
        switch (this.A00) {
            case A02:
                return false;
            case A05:
                return true;
            default:
                return A01();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iX != com.google.common.base.AbstractIterator<T> */
    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (hasNext()) {
            this.A00 = EnumC2242iW.A04;
            T t10 = (T) AbstractC2272j2.A00(this.A01);
            this.A01 = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iX != com.google.common.base.AbstractIterator<T> */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
