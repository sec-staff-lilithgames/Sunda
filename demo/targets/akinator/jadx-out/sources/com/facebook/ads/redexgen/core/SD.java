package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SD {
    public static byte[] A09;
    public SL A01;
    public final int A04;
    public final int A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public float A00 = -1.0f;
    public String A02 = A00(0, 4, 75);
    public boolean A03 = false;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{7, 10, -4, -1};
    }

    public SD(String str, int i10, int i11, String str2, String str3) {
        this.A08 = str;
        this.A04 = i10;
        this.A05 = i11;
        this.A07 = str2;
        this.A06 = str3;
    }
}
