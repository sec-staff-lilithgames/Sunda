package com.facebook.ads.redexgen.core;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ZW extends AbstractRunnableC1624Vt {
    public static byte[] A02;
    public static String[] A03 = {"w4GsGaTCcJA9wFWp2KNopTJOjqP8UDpw", "KJoDcXHO6XERgkU18ZjJw4XTw2kjUjU4", "R80wDz5faPpVYHVxJychiW2DfFSiKcfh", "t0Fzi1DjxmxSLCfz9XJ2VaEQot34azEH", "xhDPy00jOuqmtbPp3auQzix75rw9IX8h", "Uu427jBhvNl8yC5HrJluoVTOz", "6hGUj4iS9agb9", "ga1SCcoGdvIpCjYHRj6uJxXsB"};
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C1911cu A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A03[1].charAt(16) != '8') {
                throw new RuntimeException();
            }
            A03[1] = "4HO8Ss9k2AmZ8k9M8zrjCYxt48xbOoMK";
            bArrCopyOfRange[i13] = (byte) ((b10 ^ i12) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{3, 52, 59, 112, 35, 37, 51, 51, 53, 35, 35, 54, 37, 60, 60, 41, 112, 57, 62, 57, 36, 57, 49, 60, 57, 42, 53, 52, 113};
    }

    static {
        A01();
    }

    public ZW(C1911cu c1911cu, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c1911cu;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        try {
            C1648Wt.A02().A0C(this.A01);
        } catch (Throwable th2) {
            this.A01.A08().A4A(th2);
        }
        TK.A0C(this.A01);
        if (this.A00 != null) {
            TK.A04(this.A00, new TJ(true, A00(0, 29, 22)));
        }
    }
}
