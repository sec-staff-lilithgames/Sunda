package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class NR {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73};
    }

    public static void A02(C1937dL c1937dL, AbstractC2212hy abstractC2212hy, boolean z10, NP np2) {
        if (!U7.A27(c1937dL)) {
            SF sf2 = new SF(c1937dL);
            NB nbA07 = abstractC2212hy.A20().A0H().A07();
            sf2.A0e(new C1580Ua(abstractC2212hy.A25(), c1937dL.A0A()));
            if (nbA07 == null) {
                np2.AEZ(AdError.CACHE_ERROR);
                return;
            }
            if (nbA07.A0O()) {
                np2.AEa();
                return;
            }
            SB sb2 = new SB(nbA07.A0F(), abstractC2212hy.A17(), abstractC2212hy.A0v());
            sb2.A04 = true;
            sb2.A03 = A00(0, 5, 86);
            switch (NO.A00[nbA07.A0A().ordinal()]) {
                case 1:
                case 2:
                    sf2.A0Y(sb2);
                    break;
            }
            sf2.A0c(new SD(abstractC2212hy.A23().A01(), -1, -1, abstractC2212hy.A17(), abstractC2212hy.A0v()));
            sf2.A0c(new SD(nbA07.A0E(), -1, -1, abstractC2212hy.A17(), abstractC2212hy.A0v()));
            sf2.A0X(new C2192hZ(c1937dL, np2, sf2, nbA07, z10), new S8(abstractC2212hy.A17(), abstractC2212hy.A0v()));
            return;
        }
        np2.AEa();
    }
}
