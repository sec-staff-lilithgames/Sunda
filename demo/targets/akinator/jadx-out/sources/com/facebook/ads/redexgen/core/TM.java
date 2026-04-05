package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class TM {
    public static byte[] A00;
    public static String[] A01 = {"45sljFocWSeUIm", "kFy0iLqCQu1rSjegRu3gZQBslrN28zfh", "Jt25Esr0vPr63IR3ofREXbE2F9XS", "aIy3uOWBpnLKLBqKI1xznCdUmB4uZWmr", "OU2R0KFOTNKkc0fC1q8eYWzKYBY", "OKiYeSmWG", "N6c8h1LLghxAImqWtVZLONNsuls", "y1x9YRSrIuYSzULWME6mF7szl8n2nmJ"};
    public static final String A02;
    public static final AtomicBoolean A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{108, 0, 55, 43, 46, 38, 1, 45, 44, 36, 43, 37, 105, 70, 76, 90, 71, 65, 76, 8, 123, 108, 99, 8, 74, 93, 65, 68, 92, 8, 78, 71, 90, 8, 80, 16, 30, 17, 6, 26, 31, 23, 12, 7, 10, 3, 22, 25, 53, 47, 54, 62, 122, 52, 53, 46, 122, 59, 62, 62, 122, 42, 59, 40, 59, 55, Utf8.REPLACEMENT_BYTE, 46, Utf8.REPLACEMENT_BYTE, 40, 96, 21, 20, 19, 4, 22, 99, 75, 83, 74, 71, 82, 73, 84, 20, 54, 61, 42, 62, 60, 39, 58, 60, 61, 69, 36, 74, 51, 34, 57, 13, 33, 59, 40, 55, 100, 117, 117, 90, 118, 113, 100, 119, 113, 96, 97, 90, 119, 96, 100, 118, 106, 107, 79, 88, 68, 65, 73, 114, 89, 84, 93, 72, 61, 60, 59, 44, 62, 6, 47, 56, 53, 44, 60, 15, 13, 6, 13, 26, 1, 11, 115, 123, 123, 115, 120, 113, 75, 103, 112, AbstractJsonLexerKt.TC_INVALID, 99, 121, 85, 110, 111, 104, AbstractJsonLexerKt.TC_INVALID, 109, 109, 107, 104, 102, 111, 12, 22, 58, 0, 8, 16, 87, 74, 78, 70, 89, 76, 77, 70, 124, 76, 69, 69, 80, 70, 87, 95, 68, 65, 68, 69, 93, 68};
    }

    static {
        A06();
        A02 = TM.class.getSimpleName();
        A03 = new AtomicBoolean();
    }

    public static int A00() {
        return TimeZone.getDefault().getRawOffset();
    }

    public static long A01(SQ sq2, String str) {
        try {
            PackageManager packageManager = sq2.getPackageManager();
            if (packageManager == null) {
                return -1L;
            }
            return new File(packageManager.getApplicationInfo(str, 0).publicSourceDir).length();
        } catch (Exception e10) {
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "r1yKAsFrz8T6kTbDeRMAIryo3adSH8UC";
            strArr2[3] = "KmyFzAC6ois190XCewwcScJ1n5axjY80";
            if (A03.compareAndSet(false, true)) {
                sq2.A08().AAy(A02(144, 7, 94), AbstractC1550Sv.A1E, new C1551Sw(e10));
            }
            return -1L;
        }
    }

    public static String A03(Context context) throws NoSuchFieldException {
        try {
            Field buildType = Class.forName(context.getPackageName() + A02(0, 12, 116)).getDeclaredField(A02(37, 10, 101));
            return (String) buildType.get(null);
        } catch (Exception unused) {
            return A02(94, 3, 61);
        }
    }

    public static String A04(Context context) throws NoSuchFieldException {
        try {
            Field buildType = Class.forName(context.getPackageName() + A02(0, 12, 116)).getDeclaredField(A02(71, 5, 103));
            return String.valueOf(buildType.getBoolean(null));
        } catch (Exception unused) {
            return A02(94, 3, 61);
        }
    }

    public static String A05(SQ sq2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        A07(sq2, jSONObject, A02(174, 6, 83), String.valueOf(A08()));
        A07(sq2, jSONObject, A02(97, 8, 100), String.valueOf(A01(sq2, str)));
        A07(sq2, jSONObject, A02(180, 15, 21), String.valueOf(A00()));
        A07(sq2, jSONObject, A02(105, 18, 51), String.valueOf(W6.A00(sq2)));
        A07(sq2, jSONObject, A02(161, 13, 60), String.valueOf(A09(sq2)));
        A07(sq2, jSONObject, A02(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 11, 111), A04(sq2));
        A07(sq2, jSONObject, A02(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 10, 27), A03(sq2));
        return jSONObject.toString();
    }

    public static void A07(SQ sq2, JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            if (sq2.A05().AAF()) {
                Log.e(A02, A02(47, 24, 108), e10);
            }
        }
    }

    public static boolean A08() {
        String str = Build.FINGERPRINT;
        String strA02 = A02(144, 7, 94);
        if (!str.contains(strA02) && !Build.FINGERPRINT.startsWith(A02(195, 7, 28))) {
            String str2 = Build.MODEL;
            String strA022 = A02(151, 10, 34);
            if (!str2.contains(strA022) && !Build.MODEL.contains(A02(76, 8, 16))) {
                String str3 = Build.MODEL;
                String[] strArr = A01;
                if (strArr[6].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "CTJ6oNGQrsuCzXfrpGcSjdlcrxq";
                strArr2[4] = "Vk4ircYNHpPTfJ73X6WLPy0mTCx";
                if (!str3.contains(A02(12, 25, 30)) && !Build.MANUFACTURER.contains(A02(84, 10, 101)) && ((!Build.BRAND.startsWith(strA02) || !Build.DEVICE.startsWith(strA02)) && !strA022.equals(Build.PRODUCT))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A09(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
