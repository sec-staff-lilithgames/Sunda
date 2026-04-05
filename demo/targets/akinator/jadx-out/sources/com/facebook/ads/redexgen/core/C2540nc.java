package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.nc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2540nc extends C09514z {
    public static byte[] A02;
    public final int A00;
    public final AnonymousClass56 A01;

    static {
        A06();
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{-39, -30, -37, -41, -24, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, -24, -29, -33, -22, -22, -37, -38, -92, -96};
    }

    public C2540nc(AnonymousClass56 anonymousClass56, int i10, int i11) {
        super(A03(i10, i11));
        this.A01 = anonymousClass56;
        this.A00 = i11;
    }

    public C2540nc(IOException iOException, AnonymousClass56 anonymousClass56, int i10, int i11) {
        super(iOException, A03(i10, i11));
        this.A01 = anonymousClass56;
        this.A00 = i11;
    }

    public C2540nc(String str, AnonymousClass56 anonymousClass56, int i10, int i11) {
        super(str, A03(i10, i11));
        this.A01 = anonymousClass56;
        this.A00 = i11;
    }

    public C2540nc(String str, IOException iOException, AnonymousClass56 anonymousClass56, int i10, int i11) {
        super(str, iOException, A03(i10, i11));
        this.A01 = anonymousClass56;
        this.A00 = i11;
    }

    public static int A03(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C2540nc A04(final java.io.IOException r4, final com.facebook.ads.redexgen.core.AnonymousClass56 r5, int r6) {
        /*
            java.lang.String r1 = r4.getMessage()
            boolean r0 = r4 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L1a
            r1 = 2002(0x7d2, float:2.805E-42)
        La:
            r0 = 2007(0x7d7, float:2.812E-42)
            if (r1 != r0) goto L14
            com.facebook.ads.redexgen.X.9h r0 = new com.facebook.ads.redexgen.X.9h
            r0.<init>(r4, r5)
        L13:
            return r0
        L14:
            com.facebook.ads.redexgen.X.nc r0 = new com.facebook.ads.redexgen.X.nc
            r0.<init>(r4, r5, r1, r6)
            goto L13
        L1a:
            boolean r0 = r4 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L21
            r1 = 1004(0x3ec, float:1.407E-42)
            goto La
        L21:
            if (r1 == 0) goto L39
            java.lang.String r3 = com.facebook.ads.redexgen.core.AbstractC2244iY.A01(r1)
            r2 = 0
            r1 = 26
            r0 = 62
            java.lang.String r0 = A05(r2, r1, r0)
            boolean r0 = r3.matches(r0)
            if (r0 == 0) goto L39
            r1 = 2007(0x7d7, float:2.812E-42)
            goto La
        L39:
            r1 = 2001(0x7d1, float:2.804E-42)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2540nc.A04(java.io.IOException, com.facebook.ads.redexgen.X.56, int):com.facebook.ads.redexgen.X.nc");
    }
}
