package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import com.ironsource.adqualitysdk.sdk.i.bg;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bf extends bg {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f965 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f966 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f967 = {234, 243, 230, 231, 241, 233};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f968 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f969 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f970 = 165;

    public bf(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﱡ */
    public final boolean mo1154() {
        int i10 = (f965 + 99) % 128;
        f969 = i10;
        f965 = (i10 + 21) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻏ */
    public final boolean mo1156() {
        f965 = (f969 + 63) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        f969 = (f965 + 109) % 128;
        String strIntern = m1157((String) null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, (int[]) null, "\u0086\u0081\u0085\u0084\u0083\u0082\u0081").intern();
        int i10 = f965 + 29;
        f969 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 97 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        int i10 = f969 + 51;
        f965 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        int i10 = f969 + 81;
        f965 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1157(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f967;
                int i11 = f970;
                if (f966) {
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
                if (f968) {
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
