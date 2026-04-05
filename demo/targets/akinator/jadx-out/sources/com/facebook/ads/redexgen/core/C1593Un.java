package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1593Un extends AbstractRunnableC1624Vt {
    public static byte[] A07;
    public final /* synthetic */ long A00;
    public final /* synthetic */ UY A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{21, 33, 31, -32, 24, 19, 21, 23, 20, 33, 33, 29, -32, 29, 19, 38, 19, 32, 19, -32, 34, 36, 33, 40, 27, 22, 23, 36, -32, -5, 32, 37, 38, 19, 30, 30, 4, 23, 24, 23, 36, 36, 23, 36, 2, 36, 33, 40, 27, 22, 23, 36, -74, -62, -64, -127, -68, -63, -58, -57, -76, -70, -59, -76, -64, -127, -74, -62, -63, -57, -72, -63, -57, -61, -59, -62, -55, -68, -73, -72, -59, -127, -100, -63, -58, -57, -76, -65, -65, -91, -72, -71, -72, -59, -59, -72, -59, -93, -59, -62, -55, -68, -73, -72, -59};
    }

    public C1593Un(UY uy, boolean z10, String str, String str2, String str3, long j10, boolean z11) {
        this.A01 = uy;
        this.A06 = z10;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = j10;
        this.A05 = z11;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        boolean fb4aResult = this.A01.A03(A00(0, 52, 96), this.A06, this.A02, this.A04, this.A03, this.A00);
        if (fb4aResult) {
            return;
        }
        boolean fb4aResult2 = this.A05;
        if (fb4aResult2) {
            this.A01.A03(A00(52, 53, 1), this.A06, this.A02, this.A04, this.A03, this.A00);
        }
    }
}
