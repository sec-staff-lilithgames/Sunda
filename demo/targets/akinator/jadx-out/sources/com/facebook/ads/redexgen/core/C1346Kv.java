package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1346Kv {
    public static byte[] A0B;
    public int A00;
    public int A01;
    public Integer A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{58, 51, 48, 51, 52, 60, 51};
    }

    public C1346Kv(C1346Kv c1346Kv) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = c1346Kv.A09;
        this.A08 = c1346Kv.A08;
        this.A06 = c1346Kv.A06;
        this.A07 = c1346Kv.A07;
        this.A02 = c1346Kv.A02;
        this.A03 = c1346Kv.A03;
        this.A0A = c1346Kv.A0A;
    }

    public C1346Kv(String str) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        String strA00 = A00(0, 7, 100);
        this.A08 = strA00;
        this.A06 = strA00;
        this.A07 = strA00;
        this.A02 = null;
        this.A03 = strA00;
        this.A0A = false;
    }

    public C1346Kv(String str, String str2, String str3, String str4, String str5, boolean z10) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = null;
        this.A03 = str5;
        this.A0A = z10;
    }
}
