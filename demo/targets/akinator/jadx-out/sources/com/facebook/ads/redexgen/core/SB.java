package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SB {
    public static byte[] A09;
    public long A00;
    public Integer A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-107, -104, -118, -115};
    }

    public SB(String str, String str2, String str3) {
        this.A03 = A00(0, 0, 68);
        this.A02 = A00(0, 4, 27);
        this.A00 = -1L;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = null;
    }

    public SB(String str, String str2, String str3, long j10) {
        this.A03 = A00(0, 0, 68);
        this.A02 = A00(0, 4, 27);
        this.A00 = -1L;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = null;
        this.A00 = j10;
    }
}
