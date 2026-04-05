package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ij, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2253ij extends MH {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, Utf8.REPLACEMENT_BYTE, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = C2253ij.class.getSimpleName();
    }

    public C2253ij(C1937dL c1937dL, US us, String str, Uri uri) {
        super(c1937dL, us, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.core.MH
    public final ME A0G(String str) {
        try {
            WN.A0E(new WN(), this.A01, this.A00, this.A03);
        } catch (Exception unused) {
            String str2 = A00(0, 25, 104) + this.A00.toString();
        }
        return ME.A09;
    }
}
