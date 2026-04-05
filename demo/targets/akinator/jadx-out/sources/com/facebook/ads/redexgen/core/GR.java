package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class GR {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-65, -31, -35, -47, -16, -27, -24, -36, -12, -14, -7, -7, -14, -9, -16, -87, -5, -18, -10, -22, -14, -9, -19, -18, -5, -87, -8, -17, -87, -10, -22, -11, -17, -8, -5, -10, -18, -19, -87, -36, -50, -46, -87, -41, -54, -43, -87, -2, -9, -14, -3, -73};
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(com.facebook.ads.redexgen.core.C4J r3) {
        /*
            r2 = 0
        L1:
            int r0 = r3.A07()
            if (r0 != 0) goto L9
            r0 = -1
            return r0
        L9:
            int r1 = r3.A0I()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.GR.A00(com.facebook.ads.redexgen.X.4J):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(long r9, com.facebook.ads.redexgen.core.C4J r11, com.facebook.ads.redexgen.core.H1[] r12) {
        /*
        L0:
            int r0 = r11.A07()
            r8 = 1
            if (r0 <= r8) goto L79
            int r2 = A00(r11)
            int r1 = A00(r11)
            int r7 = r11.A09()
            int r7 = r7 + r1
            r0 = -1
            if (r1 == r0) goto L1d
            int r0 = r11.A07()
            if (r1 <= r0) goto L38
        L1d:
            r2 = 0
            r1 = 7
            r0 = 3
            java.lang.String r3 = A01(r2, r1, r0)
            r2 = 7
            r1 = 45
            r0 = 16
            java.lang.String r0 = A01(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A07(r3, r0)
            int r7 = r11.A0A()
        L34:
            r11.A0f(r7)
            goto L0
        L38:
            r0 = 4
            if (r2 != r0) goto L34
            r0 = 8
            if (r1 < r0) goto L34
            int r6 = r11.A0I()
            int r5 = r11.A0M()
            r4 = 0
            r3 = 49
            if (r5 != r3) goto L50
            int r4 = r11.A0C()
        L50:
            int r2 = r11.A0I()
            r1 = 47
            if (r5 != r1) goto L5b
            r11.A0g(r8)
        L5b:
            r0 = 181(0xb5, float:2.54E-43)
            if (r6 != r0) goto L77
            if (r5 == r3) goto L63
            if (r5 != r1) goto L77
        L63:
            r0 = 3
            if (r2 != r0) goto L77
            r1 = 1
        L67:
            if (r5 != r3) goto L6f
            r0 = 1195456820(0x47413934, float:49465.203)
            if (r4 != r0) goto L75
        L6e:
            r1 = r1 & r8
        L6f:
            if (r1 == 0) goto L34
            A04(r9, r11, r12)
            goto L34
        L75:
            r8 = 0
            goto L6e
        L77:
            r1 = 0
            goto L67
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.GR.A03(long, com.facebook.ads.redexgen.X.4J, com.facebook.ads.redexgen.X.H1[]):void");
    }

    public static void A04(long j10, C4J c4j, H1[] h1Arr) {
        int firstByte = c4j.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c4j.A0g(1);
        int i10 = (firstByte & 31) * 3;
        int iA09 = c4j.A09();
        for (H1 h12 : h1Arr) {
            c4j.A0f(iA09);
            h12.AI7(c4j, i10);
            if (j10 != C.TIME_UNSET) {
                h12.AIA(j10, 1, i10, 0, null);
            }
        }
    }
}
