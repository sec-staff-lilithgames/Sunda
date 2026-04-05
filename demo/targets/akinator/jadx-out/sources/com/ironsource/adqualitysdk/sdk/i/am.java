package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class am {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f534 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f535 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f536 = {-18141971, -849801677, -1230063022, -1139601234, 1610706320, -786974146, 1371731156, 1794864289, -543346180, -553240993, -1449673962, 324677547, 877985079, 1291306637, -1035993481, -1126282278, 1877025155, -682675487};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m797(Map<String, String> map) {
        f535 = (f534 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        boolean zContainsKey = map.containsKey(m800(new int[]{-643108026, -314972584, 1296785441, 1266784023, 1258538523, -1469826701, 1154589446, -2045118827}, 13 - KeyEvent.keyCodeFromString("")).intern());
        int i10 = f535 + 11;
        f534 = i10 % 128;
        if (i10 % 2 == 0) {
            return zContainsKey;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean m798(String str) {
        f534 = (f535 + 103) % 128;
        boolean zEquals = m800(new int[]{-643108026, -314972584, 1296785441, 1266784023, 1258538523, -1469826701, 1154589446, -2045118827}, 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern().equals(str);
        int i10 = f534 + 87;
        f535 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 78 / 0;
        }
        return zEquals;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m800(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f536.clone();
                d.f1846 = 0;
                while (true) {
                    int i11 = d.f1846;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        d.f1844 = (c10 << 16) + c11;
                        d.f1847 = (c12 << 16) + c13;
                        d.m2179(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = d.f1844 ^ iArr2[i13];
                            d.f1844 = i14;
                            int iM2178 = d.m2178(i14) ^ d.f1847;
                            int i15 = d.f1844;
                            d.f1844 = iM2178;
                            d.f1847 = i15;
                        }
                        int i16 = d.f1844;
                        int i17 = d.f1847;
                        d.f1844 = i17;
                        d.f1847 = i16;
                        int i18 = i16 ^ iArr2[16];
                        d.f1847 = i18;
                        int i19 = i17 ^ iArr2[17];
                        d.f1844 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        d.m2179(iArr2);
                        int i20 = d.f1846;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        d.f1846 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m801(Map<String, String> map, String str) {
        int i10;
        if (map.containsKey(str)) {
            return false;
        }
        int size = map.size();
        if (m797(map)) {
            f535 = (f534 + 111) % 128;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (size < 5 + i10) {
            return false;
        }
        int i11 = f535 + 13;
        f534 = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean m799(String str, String str2) {
        f534 = (f535 + 23) % 128;
        if (!ka.m3165(str, 64)) {
            return false;
        }
        int i10 = f534 + 57;
        f535 = i10 % 128;
        if (i10 % 2 == 0) {
            if (!ka.m3165(str2, 65)) {
                return false;
            }
        } else if (!ka.m3165(str2, 64)) {
            return false;
        }
        f534 = (f535 + 47) % 128;
        return true;
    }
}
