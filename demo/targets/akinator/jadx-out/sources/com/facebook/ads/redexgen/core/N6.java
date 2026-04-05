package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class N6 implements Serializable {
    public static byte[] A04 = null;
    public static final long serialVersionUID = 351643298236575729L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-124, -2, -26, -8, -11, -11, -24, -15, -26, -4, 0, -36, -46, -42, -62, -49, -43, -54, -43, -38, -34};
    }

    public N6(N5 n52) {
        this.A02 = n52.A02;
        this.A03 = n52.A03;
        this.A00 = n52.A00;
        this.A01 = n52.A01;
    }

    public static String A01(String str, String str2, int i10) {
        String strReplace = str.replace(A00(1, 10, 68), str2);
        String strA00 = A00(0, 0, 39);
        if (i10 > 0) {
            StringBuilder sbAppend = new StringBuilder().append(i10);
            String updatedString = A00(0, 1, 37);
            strA00 = sbAppend.append(updatedString).toString();
        }
        String updatedString2 = A00(11, 10, 34);
        return strReplace.replace(updatedString2, strA00);
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }

    public final String A06(String str, int i10) {
        return A01(this.A03, str, i10);
    }
}
