package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: assets/audience_network.dex */
public final class O4 {
    public static byte[] A01;
    public static String[] A02 = {"VujXzvSFrlMAu4R1I5vUAWLnq57AsPWM", "eCB4AeZNNUxNJOW0xCQdVSKErAFKyRUE", "SxM7TzuiGj5mLkDPau1usW4gOWoxs80M", "JPSotx28OKEE72Qpgvn7eDCIGwp5uNVo", "DEnf6Zvbz7peiDJpz513nqQn8JHSiM1H", "gOyBV6cEPVg9ZlKZ082v3gM", "JzQKQqAcA3MWJuXBOCM1CdL45YEfwdQ5", "kFuiftK6CrUjCipoQAB5otHUPyyIQR1T"};
    public static final /* synthetic */ O4[] A03;
    public static final O4 A04;
    public static final O4 A05;
    public static final O4 A06;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 125, 112, 113, 70, 71, 70, 77, 82, 69, 80, 79, 82, 84, 74, 75, 70, 71, 101, 100, 101, 110, 44, 59, 46, 49, 44, 42};
    }

    static {
        A01();
        A06 = new O4(A00(8, 6, 62), 0, A00(22, 6, 96));
        A04 = new O4(A00(0, 4, 10), 1, A00(14, 4, 28));
        A05 = new O4(A00(4, 4, 54), 2, A00(18, 4, 53));
        A03 = A02();
    }

    public O4(String str, int i10, String str2) {
        this.A00 = str2;
    }

    public static /* synthetic */ O4[] A02() {
        O4[] o4Arr = new O4[3];
        o4Arr[0] = A06;
        O4 o42 = A04;
        String[] strArr = A02;
        if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "cigJDFmR8APB9TZFazKvkLU6eV5xdG1z";
        strArr2[7] = "bxChofFJf2xaRn9PIbRGfpqcGnLInP10";
        o4Arr[1] = o42;
        o4Arr[2] = A05;
        return o4Arr;
    }

    public final String A03() {
        return this.A00;
    }

    public static O4 valueOf(String str) {
        return (O4) Enum.valueOf(O4.class, str);
    }

    public static O4[] values() {
        return (O4[]) A03.clone();
    }
}
