package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public abstract class U6 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{62, 59, 49, 40, 0, 60, 48, 49, 57, 54, 56, 0, 44, 58, 49, 59, 0, 57, 61, 51, 48, 56, 54, 49, 0, 62, 44, 54, 59, AbstractJsonLexerKt.TC_INVALID, 122, 112, 105, 65, 119, 122, 120, AbstractJsonLexerKt.TC_INVALID, 65, 108, 123, 120, 108, 123, 109, 118, 65, 106, 119, 115, 123, 65, 115, 109, 94, 91, 81, 72, 96, 76, 87, 80, 74, 83, 91, 96, 76, 90, 81, 91, 96, 94, 79, 79, 96, 86, 81, 89, 80, 96, 86, 81, 96, 74, 76, 90, 77, 96, 94, 88, 90, 81, 75, 1, 4, 14, 23, Utf8.REPLACEMENT_BYTE, 21, 19, 5, Utf8.REPLACEMENT_BYTE, 6, 2, 84, 1, Utf8.REPLACEMENT_BYTE, 9, 4, 122, AbstractJsonLexerKt.TC_INVALID, 117, 108, 68, 110, 104, 126, 68, 125, 121, 47, 122, 68, 114, AbstractJsonLexerKt.TC_INVALID, 68, 125, 114, 105, 104, 111, 64, 69, 79, 86, 126, 84, 82, 68, 83, 126, 64, 70, 68, 79, 85, 126, 83, 68, 71, 83, 68, 82, 73, 126, 85, 72, 76, 68, 126, 76, 82};
    }

    public static long A00(Context context) {
        return U7.A0V(context).A2v(A02(29, 25, 32), -1L);
    }

    public static long A01(Context context) {
        return U7.A0V(context).A2v(A02(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 31, 31), -1L);
    }

    public static boolean A04(Context context) {
        return U7.A0V(context).A30(A02(54, 39, 1), true);
    }

    public static boolean A05(Context context) {
        return U7.A0V(context).A30(A02(0, 29, 97), false);
    }

    public static boolean A06(Context context) {
        return U7.A0V(context).A30(A02(93, 16, 94), false);
    }

    public static boolean A07(Context context) {
        return U7.A0V(context).A30(A02(109, 22, 37), false);
    }
}
