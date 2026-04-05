package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Hs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1265Hs extends AbstractC2009eW {
    public static byte[] A01;
    public final /* synthetic */ AbstractC1264Hr A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-37, -32, -39, -31, -26, -35, -36, -41, -39, -36, -41, -31, -26, -36, -35, -16};
    }

    public C1265Hs(AbstractC1264Hr abstractC1264Hr) {
        this.A00 = abstractC1264Hr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2009eW
    public final void A03() {
        if (!this.A00.A0A.A07()) {
            this.A00.A0A.A05();
            if (!TextUtils.isEmpty(this.A00.A06.A25())) {
                Map<String, String> mapA05 = new C1722Zp().A03(this.A00.A0D).A02(this.A00.A0A).A04(this.A00.A06.A0u()).A05();
                mapA05.put(A00(0, 16, 42), A00(0, 0, 96) + this.A00.A02);
                this.A00.A08.AB5(this.A00.A06.A25(), mapA05);
                W2.A00(this.A00.A07).A0E(this.A00.A0C.A8d(), this.A00.A06.A25());
                N3.A07(this.A00.A06.A21(), this.A00.A07);
                this.A00.A07.A0F().A3D();
                if (!this.A00.A04) {
                    AbstractC1424Nw.A02(this.A00.A06.A0t(), X0.A00(this.A00.A06.A0v()));
                }
                if (!this.A00.A05) {
                    this.A00.A0B.A4b(this.A00.A0C.A88());
                }
            }
        }
    }
}
