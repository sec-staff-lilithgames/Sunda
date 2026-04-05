package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.i.bg;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class be extends bg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f960 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f961 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f962 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f963 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f964 = -703389678;

    public be(String str) {
        super(str);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1155(String str, char c10, String str2, int i10, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (f.f2212) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                f.f2213 = 0;
                while (true) {
                    int i11 = f.f2213;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2211 = c12;
                        cArr5[i13] = (char) e3.g.e(cArr4[i13], 32718, c11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c12;
                        int i15 = f.f2213;
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f962) ^ f964) ^ f963);
                        f.f2213 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﱡ */
    public final boolean mo1154() {
        int i10 = f961;
        int i11 = i10 + 27;
        f960 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        int i12 = i10 + 95;
        f960 = i12 % 128;
        if (i12 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean mo1156() {
        f960 = (f961 + 45) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        f960 = (f961 + 85) % 128;
        String strIntern = m1155("ꬠ᩵ᙐ\u16fb", (char) ('0' - AndroidCharacter.getMirror('0')), "纍䶈⒡閫\ueed1\u1ad9\ua6fe", 1343911338 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0000\u0000\u0000\u0000").intern();
        int i10 = f961 + 59;
        f960 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        int i10 = f961 + 99;
        f960 = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        int i10 = f960 + 9;
        f961 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }
}
