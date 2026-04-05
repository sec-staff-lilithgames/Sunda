package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.hN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2180hN extends AbstractRunnableC1624Vt {
    public static byte[] A05;
    public static String[] A06 = {"oXE2C4io4CadFj", "SLi30xh9eEh4aNBWy87TaVqEnPCRDurp", "eis5RYtigxDn0kuTv6xEcFlmBnmepzOu", "7zfUioi34Z20h4XlF6Svx2fywMYufGtL", "3ch3CCIwylkue97fKtVgZja7Sq2vQTLD", "WcYwUSLGNymzaUHoHnyTUfb", "YL0d97V0Q3k08jxWq5XvLfGqClGTo7H3", "GhmWEJEURttFfnvoo6VO1smQO3ReaFoJ"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ C2233iN A01;
    public final /* synthetic */ NU A02;
    public final /* synthetic */ C10006w A03;
    public final /* synthetic */ TC A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-97, -93, -59, -24, -27, -12, -8, -23, -10, -92, -8, -19, -15, -23, -13, -7, -8, -78, -74, -61, -61, -64, -61, -73, -67, -79, -4, -15, -11, -19, -9, -3, -4};
        String[] strArr = A06;
        if (strArr[6].charAt(10) != strArr[4].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "j4Ns4hKT00kRsJcq4mYGiSVRR39xkXLE";
        strArr2[4] = "aj4N2GTd0jkYX56rliTu9cnftT6aRfqb";
    }

    static {
        A01();
    }

    public C2180hN(C10006w c10006w, NU nu2, C2233iN c2233iN, long j10, TC tc2) {
        this.A03 = c10006w;
        this.A02 = nu2;
        this.A01 = c2233iN;
        this.A00 = j10;
        this.A04 = tc2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A03.A0T(this.A02);
        this.A03.A0Q(this.A01);
        Map mapA01 = this.A03.A01(this.A00);
        mapA01.put(A00(18, 5, 53), A00(0, 2, 86));
        mapA01.put(A00(23, 3, 46), A00(26, 7, 108));
        this.A03.A05(this.A04.A03(TG.A04), mapA01);
        this.A03.ADB(new V1(AdErrorType.NETWORK_ERROR, A00(2, 16, 104)));
    }
}
