package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class co {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1565 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f1566 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1567 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1568 = 11;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1569;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1570 = {'^', AbstractJsonLexerKt.END_LIST, 'W', '+', AbstractJsonLexerKt.COLON};

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m1955(String str, String str2, Throwable th2) {
        int i10 = f1569 + 115;
        f1565 = i10 % 128;
        int i11 = i10 % 2;
        m1957(str, str2, th2);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f1565 + 79;
        f1569 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m1956(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1954(null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, "\u0084\u0083\u0082\u0081").intern());
        sb2.append(str);
        k.m3149(sb2.toString(), str2);
        f1569 = (f1565 + 21) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m1957(String str, String str2, Throwable th2) {
        kd.m3197(com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m1954(null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, null, "\u0085\u0083\u0082\u0081"), str), str2, Integer.toHexString(str2.hashCode()), th2, (JSONObject) null, false);
        int i10 = f1569 + 99;
        f1565 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1954(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.f3159) {
            try {
                char[] cArr2 = f1570;
                int i11 = f1568;
                if (f1567) {
                    int length = bArr.length;
                    m.f3157 = length;
                    char[] cArr3 = new char[length];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i12 = m.f3158;
                        int i13 = m.f3157 - 1;
                        int i14 = m.f3158;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3158 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1566) {
                    int length2 = cArr.length;
                    m.f3157 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i15 = m.f3158;
                        int i16 = m.f3157 - 1;
                        int i17 = m.f3158;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3158 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3157 = length3;
                char[] cArr5 = new char[length3];
                m.f3158 = 0;
                while (m.f3158 < m.f3157) {
                    int i18 = m.f3158;
                    int i19 = m.f3157 - 1;
                    int i20 = m.f3158;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3158 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
