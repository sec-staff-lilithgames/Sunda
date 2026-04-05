package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ip {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2753 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2754;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, Integer> f2755;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2756;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Map<String, Object> f2757;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, Integer> f2758;

    static {
        m2836();
        f2757 = new HashMap();
        f2755 = new HashMap();
        f2758 = new HashMap();
        int i10 = f2754 + 19;
        f2753 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2835(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (g.f2307) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2756, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    g.f2306 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = g.f2306;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        g.f2306 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    g.f2306 = 0;
                    while (true) {
                        int i16 = g.f2306;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        g.f2306 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    g.f2306 = 0;
                    while (true) {
                        int i17 = g.f2306;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        g.f2306 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m2836() {
        f2756 = new char[]{')'};
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m2837(Context context, String str, JSONObject jSONObject, Object... objArr) {
        ij.m2822(context).m2827(new Intent(str).putExtra(ig.f2663, jSONObject.toString()));
        f2753 = (f2754 + 111) % 128;
    }
}
