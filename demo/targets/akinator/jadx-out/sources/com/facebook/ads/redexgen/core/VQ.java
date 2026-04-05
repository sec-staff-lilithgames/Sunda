package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public abstract class VQ {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    public static boolean A03;
    public static byte[] A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{96, 54, AbstractJsonLexerKt.TC_INVALID, 96, 54, AbstractJsonLexerKt.TC_INVALID, 96, 33, AbstractJsonLexerKt.TC_INVALID, 96, 33, AbstractJsonLexerKt.TC_INVALID, 96, 33, 80, 85, 3, 1, 82, 82, 83, 84, 11, 45, 55, 48, 57, 126, 50, Utf8.REPLACEMENT_BYTE, 45, 42, 126, Utf8.REPLACEMENT_BYTE, 58, 126, 44, 59, 45, 46, 49, 48, 45, 59, 65, 67, 82, 106, 71, 85, 82, 116, 67, 85, 86, 73, 72, 85, 67};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, V6 v62) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        switch (v62) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return MBInterstitialActivity.WEB_LOAD_TIME;
            default:
                return -1000L;
        }
    }

    public static String A02(VR vr2) {
        VF.A05(A01(44, 15, 126), A01(22, 22, 6), A01(14, 8, 61));
        return A02.get(A03(vr2));
    }

    public static String A03(VR vr2) {
        return String.format(Locale.US, A01(0, 14, 29), vr2.A09(), vr2.A07(), Integer.valueOf(vr2.A08() == null ? 0 : vr2.A08().A00()), Integer.valueOf(vr2.A08() == null ? 0 : vr2.A08().A01()), Integer.valueOf(vr2.A04()));
    }

    public static void A05(long j10, VR vr2) {
        A01.put(A03(vr2), Long.valueOf(j10));
    }

    public static void A06(VR vr2) {
        A00.put(A03(vr2), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, VR vr2) {
        A02.put(A03(vr2), str);
    }

    public static boolean A08(VR vr2) {
        if (A03) {
            return false;
        }
        String strA03 = A03(vr2);
        if (A00.containsKey(strA03)) {
            return System.currentTimeMillis() - A00.get(strA03).longValue() < A00(strA03, vr2.A07());
        }
        return false;
    }
}
