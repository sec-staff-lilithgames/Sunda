package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public enum XD {
    A08(0),
    A07(0),
    A06(1),
    A03(2),
    A04(3),
    A05(4);

    public static byte[] A01;
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-63, -61, -74, -67, -64, -71, -45, -90, -69, -47, -45, -58, -51, -48, -55, -29, -73, -53, -97, -95, -108, -101, -98, -105, -79, -122, -103, -74, -72, -85, -78, -75, -82, -56, -78, -73, -67, -82, -69, -73, -82, -67, AbstractJsonLexerKt.TC_INVALID, -128, AbstractJsonLexerKt.TC_INVALID, 118, -67, -74, -77, -74, -73, -65, -74};
    }

    static {
        A01();
    }

    XD(int i10) {
        this.A00 = i10;
    }
}
