package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.CheckForNull;

/* loaded from: assets/audience_network.dex */
public class BR<T> implements InterfaceC2280jB<T>, Serializable {
    public static byte[] A01;
    public static final long serialVersionUID = 0;
    public final List<? extends InterfaceC2280jB<? super T>> A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{52, 65, 55};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BR != com.google.common.base.Predicates$AndPredicate<T> */
    public BR(List<? extends InterfaceC2280jB<? super T>> components) {
        this.A00 = components;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BR != com.google.common.base.Predicates$AndPredicate<T> */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2280jB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A44(@com.google.common.base.ParametricNullness T r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            java.util.List<? extends com.facebook.ads.redexgen.X.jB<? super T>> r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L1c
            java.util.List<? extends com.facebook.ads.redexgen.X.jB<? super T>> r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.jB r0 = (com.facebook.ads.redexgen.core.InterfaceC2280jB) r0
            boolean r0 = r0.A44(r3)
            if (r0 != 0) goto L19
            r0 = 0
            return r0
        L19:
            int r1 = r1 + 1
            goto L1
        L1c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.BR.A44(java.lang.Object):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BR != com.google.common.base.Predicates$AndPredicate<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BR != com.google.common.base.Predicates$AndPredicate<T> */
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof BR) {
            return this.A00.equals(((BR) obj).A00);
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BR != com.google.common.base.Predicates$AndPredicate<T> */
    public final int hashCode() {
        return this.A00.hashCode() + 306654252;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BR != com.google.common.base.Predicates$AndPredicate<T> */
    public final String toString() {
        return AbstractC2282jD.A02(A00(0, 3, 112), this.A00);
    }
}
