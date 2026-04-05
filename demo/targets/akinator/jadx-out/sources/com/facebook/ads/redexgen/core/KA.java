package com.facebook.ads.redexgen.core;

import android.text.Layout;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KA {
    public static byte[] A0B;
    public static String[] A0C = {"ESJRmhDLc7NikCaEyh1Vifm1kcZyUfVZ", "aTTKw54KgCsdTiacoM6Uao", "AQffeXGY9UF2RO1KJqJs07qSuLvLibNX", "JzQF5qJPeleZtBxAVP8FFhosbzcygG6f", "tbObE2uaMy", "gF7iYmzQc0u", "ooQgCGRV3OuZUQB0e4AvfnYfn3EwO6qP", "bBgaV4vqzz2b3sIikkn4irzAIlEySbAE"};
    public CharSequence A0A;
    public long A09 = 0;
    public long A08 = 0;
    public int A06 = 2;
    public float A00 = -3.4028235E38f;
    public int A04 = 1;
    public int A03 = 0;
    public float A01 = -3.4028235E38f;
    public int A05 = Integer.MIN_VALUE;
    public float A02 = 1.0f;
    public int A07 = Integer.MIN_VALUE;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0B = new byte[]{35, 24, 29, 24, 25, 1, 24, 86, 2, 19, 14, 2, 55, 26, 31, 17, 24, 27, 19, 24, 2, 76, 86, 20, 38, 33, 53, 55, 55, 0, 54, 38, 19, 34, 49, 48, 38, 49};
    }

    static {
        A06();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r6 > 1.0f) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float A00(float r6, int r7) {
        /*
            r5 = 1065353216(0x3f800000, float:1.0)
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L34
            if (r7 != 0) goto L34
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L33
            int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.KA.A0C
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 32
            if (r1 == r0) goto L25
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L25:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.KA.A0C
            java.lang.String r1 = "J0IfntZMkxbbx68hLNly1u3Pfrgy9oGS"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "jp12lwau8SNu8MLcYdTF5jN7geoyKRFi"
            r0 = 0
            r2[r0] = r1
            if (r3 <= 0) goto L34
        L33:
            return r5
        L34:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L39
            return r6
        L39:
            if (r7 != 0) goto L3c
            return r5
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KA.A00(float, int):float");
    }

    public static float A01(int i10) {
        switch (i10) {
            case 4:
                String[] strArr = A0C;
                if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[7] = "U5kipMMfYsvpFebUOrNnvm9fZvEH8TF4";
                strArr2[6] = "e8XmGXiYxdTIRsHNKLkkAuRQRzEuxsB2";
                return 0.0f;
            case 5:
                return 1.0f;
            default:
                return 0.5f;
        }
    }

    public static float A02(int i10, float f10) {
        switch (i10) {
            case 0:
                return 1.0f - f10;
            case 1:
                if (f10 <= 0.5f) {
                    return 2.0f * f10;
                }
                return (1.0f - f10) * 2.0f;
            case 2:
                return f10;
            default:
                throw new IllegalStateException(String.valueOf(i10));
        }
    }

    public static int A03(int i10) {
        switch (i10) {
            case 1:
            case 4:
                return 0;
            case 2:
            default:
                return 1;
            case 3:
            case 5:
                return 2;
        }
    }

    public static Layout.Alignment A04(int i10) {
        switch (i10) {
            case 1:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 5:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                AnonymousClass44.A07(A05(23, 15, 34), A05(0, 23, 23) + i10);
                return null;
        }
    }

    public final C3C A07() {
        int iA03;
        float fA01 = this.A01 != -3.4028235E38f ? this.A01 : A01(this.A06);
        if (this.A05 != Integer.MIN_VALUE) {
            iA03 = this.A05;
        } else {
            iA03 = A03(this.A06);
        }
        C3C c3cA0A = new C3C().A0F(A04(this.A06)).A07(A00(this.A00, this.A04), this.A04).A09(this.A03).A04(fA01).A0A(iA03);
        float f10 = this.A02;
        float position = A02(iA03, fA01);
        C3C c3cA0B = c3cA0A.A06(Math.min(f10, position)).A0B(this.A07);
        if (this.A0A != null) {
            c3cA0B.A0G(this.A0A);
        }
        return c3cA0B;
    }

    public final K3 A08() {
        return new K3(A07().A0H(), this.A09, this.A08);
    }
}
