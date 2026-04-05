package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.iP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2235iP implements S7 {
    public static byte[] A04;
    public final /* synthetic */ MX A00;
    public final /* synthetic */ C7K A01;
    public final /* synthetic */ C6M A02;
    public final /* synthetic */ Y9 A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -79, -68, -60, -69, -71, -68, -82, -79, 109, -82, 109, -70, -78, -79, -74, -82, 123};
    }

    public C2235iP(C7K c7k, Y9 y92, MX mx, C6M c6m) {
        this.A01 = c7k;
        this.A03 = y92;
        this.A00 = mx;
        this.A02 = c6m;
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String strA00 = A00(0, 27, 69);
        this.A02.A0F().A3F(XG.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        this.A00.ADj(this.A01, V1.A01(adErrorType, strA00));
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        this.A03.A0J();
        this.A00.ACc(this.A01, this.A03);
        this.A02.A0F().A4G(this.A01.A01 != null);
    }
}
