package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Pv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1473Pv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1484Qg A04;
    public AbstractC1484Qg A05;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{118, 122, 60, 40, 53, 55, 2, 103, 14, 2, 68, 80, 77, 79, 123, 31, 76, 64, 14, 5, 23, 40, 15, 12, 4, 5, 18, 93, 86, 90, 14, 21, 34, 71, 71, 75, 31, 4, 50, 86, 109, 70, 79, 64, 73, 75, 103, 64, 72, 65, 85, 65, 66, 74, 102, 65, 66, 74, 75, 92, 19};
    }

    public C1473Pv(AbstractC1484Qg abstractC1484Qg, AbstractC1484Qg abstractC1484Qg2) {
        this.A05 = abstractC1484Qg;
        this.A04 = abstractC1484Qg2;
    }

    public C1473Pv(AbstractC1484Qg abstractC1484Qg, AbstractC1484Qg abstractC1484Qg2, int i10, int i11, int i12, int i13) {
        this(abstractC1484Qg, abstractC1484Qg2);
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A03 = i13;
    }

    public final String toString() {
        return A00(40, 21, 109) + this.A05 + A00(16, 12, 35) + this.A04 + A00(0, 8, 25) + this.A00 + A00(8, 8, 97) + this.A01 + A00(28, 6, 57) + this.A02 + A00(34, 6, 40) + this.A03 + AbstractJsonLexerKt.END_OBJ;
    }
}
