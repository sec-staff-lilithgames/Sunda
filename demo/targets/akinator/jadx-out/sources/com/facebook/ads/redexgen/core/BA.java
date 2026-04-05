package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public final class BA<F, T> extends AbstractC2593oV<F> implements Serializable {
    public static byte[] A02;
    public static String[] A03 = {"qP7uN3CTeBtugcvn4iscvs4NawNVw3hj", "uACvKKD4Xh814PQzJz7fno8Y0d2htzTr", "OaGwUL0wruZXrmXuBUYR8eOdlsWVX5jO", "JY9GX7tPgJ", "UJNVJd39Mn7RrVqRZr4HQjubetYZ2pJj", "tP9Bx5HW1SG5GbSCFf4kAQmgB2SyEv9b", "xcsG1NfXHnFrLoKWAotfCT6bqQ3ToZXO", "wDWfKnr2Hnyq67FaxNzVQD5A0FwwfXbW"};
    public static final long serialVersionUID = 0;
    public final InterfaceC2259ip<F, ? extends T> A00;
    public final AbstractC2593oV<T> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[2].charAt(0) == strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A03[1] = "UOsr4mSSP3XVk2xA78tBNfMlPB0RSTkt";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 5);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{78, 122, 59, 58, 6, 49, 39, 33, 56, 32, 27, 50, 124};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof BA)) {
            return false;
        }
        BA ba2 = (BA) object;
        return this.A00.equals(ba2.A00) && this.A01.equals(ba2.A01);
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BA != com.google.common.collect.ByFunctionOrdering<F, T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ip != com.google.common.base.Function<F, ? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.Ordering<T> */
    public BA(InterfaceC2259ip<F, ? extends T> function, AbstractC2593oV<T> ordering) {
        this.A00 = (InterfaceC2259ip) AbstractC2279jA.A04(function);
        this.A01 = (AbstractC2593oV) AbstractC2279jA.A04(ordering);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BA != com.google.common.collect.ByFunctionOrdering<F, T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2593oV, java.util.Comparator
    public final int compare(@ParametricNullness F f10, @ParametricNullness F f11) {
        return this.A01.compare(this.A00.A43(f10), this.A00.A43(f11));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BA != com.google.common.collect.ByFunctionOrdering<F, T> */
    public final int hashCode() {
        return BX.A00(this.A00, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BA != com.google.common.collect.ByFunctionOrdering<F, T> */
    public final String toString() {
        return this.A01 + A00(1, 12, 81) + this.A00 + A00(0, 1, 98);
    }
}
