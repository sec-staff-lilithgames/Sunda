package com.facebook.ads.redexgen.core;

import android.view.Surface;
import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class FR {
    public static byte[] A00;
    public static String[] A01 = {"C9RGb7NCXIcFkq487TbtOiV6wJyl5V", "dIw4BKlzmuU3zMuMzRjmW2qgnJuCAgWy", "9uTfiPT", "rJUClzDzuXOVG7xlKmzeqZnP5Peloa5p", "Z", "9S6veErjLDkLbxAihnisBS", "TmmUyGbb1uzRJUdaHSZi2e0nreAYvBIE", "B53ji15DIU9T3sUrLFCN0rmnX0Pwja5D"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] ^ i12) ^ 94;
            if (A01[0].length() != 30) {
                throw new RuntimeException();
            }
            A01[0] = "TD1mTFY2qo3QaoZPZEPw0mbH2R8uHE";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {20, 51, 59, 62, 55, 54, 114, 38, 61, 114, 49, 51, 62, 62, 114, 1, 39, 32, 52, 51, 49, 55, 124, 33, 55, 38, 20, 32, 51, Utf8.REPLACEMENT_BYTE, 55, 0, 51, 38, 55, 77, 114, AbstractJsonLexerKt.TC_INVALID, 126, 116, 93, 105, 122, 118, 126, 73, 126, 119, 126, 122, 104, 126, 83, 126, 119, 107, 126, 105};
        if (A01[2].length() != 7) {
            throw new RuntimeException();
        }
        A01[5] = "Lq9CeCJTygMtbBn2m02oyI";
        A00 = bArr;
    }

    static {
        A01();
    }

    public static void A02(Surface surface, float f10) {
        int compatibility;
        if (f10 == 0.0f) {
            compatibility = 0;
        } else {
            compatibility = 1;
        }
        try {
            surface.setFrameRate(f10, compatibility);
        } catch (IllegalStateException e10) {
            AnonymousClass44.A08(A00(35, 23, 69), A00(0, 35, 12), e10);
        }
    }
}
