package com.facebook.ads.redexgen.core;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.In, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1286In {
    public static byte[] A05;
    public static String[] A06 = {"8Hrr", ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, "0Fdee0wg4hsenc5DHvlvwY", "0vqFlF7HyuYg3TUYlVTMC9xVo", "FyWFMrZuY5MlICM", "PN9pA9f0QUy", "hrYl81FOJTp7gpX67gLzFhurxBV", "ujvsBGrB8Jik"};
    public final int A00;
    public final C1247Gz A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{40, 33, 47, 78, 124, 124, 122, 98, 102, 97, 104, 47, 78, 74, 92, 34, 76, 91, 93, 47, 108, 125, 118, AbstractJsonLexerKt.TC_INVALID, 123, 96, 47, 98, 96, 107, 106, 33, 38, 0, 19, 17, 25, 55, 28, 17, 0, 11, 2, 6, 27, 29, 28, 48, 29, 10, 95, 100, 121, AbstractJsonLexerKt.TC_INVALID, 122, 122, 101, 120, 126, 111, 110, 42, 122, 120, 101, 126, 111, 105, 126, 99, 101, 100, 42, 121, 105, 98, 111, 103, 111, 42, 126, 115, 122, 111, 42, 45, 115, 114, 115, 33, 41, 40, 41, 57, 60, 58, 49, 60, 120, 126, 117, 104};
    }

    static {
        A02();
    }

    public C1286In(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        C3M.A07((bArr2 == null) ^ (i10 == 0));
        this.A03 = z10;
        this.A02 = str;
        this.A00 = i10;
        this.A04 = bArr2;
        this.A01 = new C1247Gz(A00(str), bArr, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.String r6) {
        /*
            r5 = 1
            if (r6 != 0) goto L4
            return r5
        L4:
            int r0 = r6.hashCode()
            r4 = 2
            switch(r0) {
                case 3046605: goto L93;
                case 3046671: goto L81;
                case 3049879: goto L70;
                case 3049895: goto L46;
                default: goto Lc;
            }
        Lc:
            r0 = -1
        Ld:
            switch(r0) {
                case 0: goto La6;
                case 1: goto La6;
                case 2: goto La5;
                case 3: goto La5;
                default: goto L10;
            }
        L10:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 50
            r1 = 36
            r0 = 74
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r3 = r0.append(r6)
            r2 = 0
            r1 = 32
            r0 = 79
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = r0.toString()
            r2 = 32
            r1 = 18
            r0 = 50
            java.lang.String r0 = A01(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A07(r0, r3)
            return r5
        L46:
            r3 = 98
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1286In.A06
            r0 = 6
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto La7
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1286In.A06
            java.lang.String r1 = "5D1VNf4Gt9Q"
            r0 = 5
            r2[r0] = r1
            r1 = 4
            r0 = 91
            java.lang.String r0 = A01(r3, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        L70:
            r2 = 94
            r1 = 4
            r0 = 31
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 0
            goto Ld
        L81:
            r2 = 90
            r1 = 4
            r0 = 10
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 3
            goto Ld
        L93:
            r2 = 86
            r1 = 4
            r0 = 80
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 2
            goto Ld
        La5:
            return r4
        La6:
            return r5
        La7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1286In.A00(java.lang.String):int");
    }
}
