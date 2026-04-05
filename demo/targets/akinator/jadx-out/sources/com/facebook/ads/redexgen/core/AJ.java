package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public final class AJ<T> extends AbstractC2593oV<T> implements Serializable {
    public static byte[] A01;
    public static String[] A02 = {"TYphIuCeMUBPtejfiFOUwjFxcT4QBTq", "8HYxpO9zw1uGMW", "bftleM0W", "QbbbyMJUXm1d4Xd", "2naIPdaT", "exbXjeCkSw", "w", "Nm7"};
    public static final long serialVersionUID = 0;
    public final AbstractC2593oV<? super T> A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-30, 38, 25, 42, 25, 38, 39, 25, -36, -35};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.Ordering<? super T> */
    public AJ(AbstractC2593oV<? super T> forwardOrder) {
        this.A00 = (AbstractC2593oV) AbstractC2279jA.A04(forwardOrder);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2593oV
    public final <S extends T> AbstractC2593oV<S> A06() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2593oV, java.util.Comparator
    public final int compare(@ParametricNullness T a10, @ParametricNullness T b10) {
        return this.A00.compare(b10, a10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object != this) {
            if (object instanceof AJ) {
                return this.A00.equals(((AJ) object).A00);
            }
            return false;
        }
        String[] strArr = A02;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[2] = "3jzErf5H";
        strArr2[4] = "YYoE6Ooa";
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    public final int hashCode() {
        return -this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    public final String toString() {
        return this.A00 + A00(0, 10, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
    }
}
