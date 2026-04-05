package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.hX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2190hX {
    A09(A00(173, 7, 111)),
    A07(A00(145, 11, 71)),
    A0A(A00(180, 16, 94)),
    A06(A00(129, 16, 114)),
    A08(A00(156, 17, 64)),
    A05(A00(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 9, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)),
    A04(A00(98, 22, 15));

    public static byte[] A01;
    public static String[] A02 = {"3irfHjb1xBggEOYppIC20CVGO", "PvTwVw4l1egAAUgNiEJHpQxcY", "Z83jj4f2UJi7iIzCa97fW954cYyfIvRS", "Pn3ECjM654pG8xNfJs7iPR6nvOfTtg4S", "rnvCizUmlaJkbQ0LWt7EGYvIVwvlRHSU", "Y4v1TwA3VTqRjFpvhM1P5mrv4yN1Kb1i", "iJ3TP1yTdydKb8xTTpNjz5p9ilImmlzt", "3Fyn3bOdC3lEL0zKVakbNgp9AIkAOPYu"};
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            String[] strArr = A02;
            if (strArr[4].charAt(18) != strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "9Fh1XlTwmrAkPSBsBt7sR6HEZ4z1EPMB";
            strArr2[3] = "w0XpqxyBnVeSACOsJ07N96wKg89kpHEO";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{71, 80, 67, 67, 64, 87, 90, 71, 64, 73, 74, 82, 90, 81, 77, 87, 64, 86, 77, 74, 73, 65, 25, 16, 13, 28, 26, 0, 26, 17, 27, 33, 32, 48, 32, 58, 59, Utf8.REPLACEMENT_BYTE, 58, 59, 48, 45, 58, 41, 41, 42, 61, 103, 124, 101, 101, 118, 111, 102, 123, 100, 104, 125, 79, 73, 78, 90, 93, 95, 89, 67, 82, 83, 72, 67, 78, 89, 93, 88, 69, 2, 25, 28, 25, 24, 0, 25, AbstractJsonLexerKt.TC_INVALID, 105, 97, 124, 97, 102, 111, 119, 110, 103, 122, 119, 99, 109, 113, 123, 86, 65, 82, 82, 81, 70, 107, 86, 81, 88, 91, 67, 107, 64, 92, 70, 81, 71, 92, 91, 88, 80, 43, 34, Utf8.REPLACEMENT_BYTE, 46, 40, 18, 40, 35, 41, 39, 38, 22, 38, 60, 61, 57, 60, 61, 22, 43, 60, 47, 47, 44, 59, 18, 9, 16, 16, 35, 26, 19, 14, 17, 29, 8, 8, 14, 9, 29, 26, 24, 30, 36, 21, 20, 15, 36, 9, 30, 26, 31, 2, 33, 58, Utf8.REPLACEMENT_BYTE, 58, 59, 35, 58, 18, 4, 12, 17, 12, 11, 2, 58, 3, 10, 23, 58, 14, 0, 28, 22};
    }

    static {
        A01();
    }

    EnumC2190hX(String str) {
        this.A00 = str;
    }
}
