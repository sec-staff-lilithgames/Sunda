package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.Gravity;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fl extends ee {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2241 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2242 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static fl f2243;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2244;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2245;

    static {
        m2511();
        f2243 = new fl();
        f2245 = (f2242 + 19) % 128;
    }

    public fl() {
        super(Cdo.m2351("", -1));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m2511() {
        f2244 = (char) 2;
        f2241 = new char[]{'n', AbstractJsonLexerKt.UNICODE_ESC, 'l', 'o'};
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static synchronized fl m2512() {
        int i10 = f2242 + 29;
        f2245 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return f2243;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2513(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f2241;
                char c10 = f2244;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    h.f2448 = 0;
                    while (true) {
                        int i11 = h.f2448;
                        if (i11 >= i10) {
                            break;
                        }
                        h.f2450 = cArr[i11];
                        h.f2449 = cArr[h.f2448 + 1];
                        if (h.f2450 == h.f2449) {
                            cArr3[h.f2448] = (char) (h.f2450 - b10);
                            cArr3[h.f2448 + 1] = (char) (h.f2449 - b10);
                        } else {
                            h.f2447 = h.f2450 / c10;
                            h.f2444 = h.f2450 % c10;
                            h.f2446 = h.f2449 / c10;
                            h.f2443 = h.f2449 % c10;
                            if (h.f2444 == h.f2443) {
                                h.f2447 = e3.g.x(h.f2447, c10, 1, c10);
                                h.f2446 = e3.g.x(h.f2446, c10, 1, c10);
                                int i12 = (h.f2447 * c10) + h.f2444;
                                int i13 = (h.f2446 * c10) + h.f2443;
                                int i14 = h.f2448;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (h.f2447 == h.f2446) {
                                h.f2444 = e3.g.x(h.f2444, c10, 1, c10);
                                h.f2443 = e3.g.x(h.f2443, c10, 1, c10);
                                int i15 = (h.f2447 * c10) + h.f2444;
                                int i16 = (h.f2446 * c10) + h.f2443;
                                int i17 = h.f2448;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (h.f2447 * c10) + h.f2443;
                                int i19 = (h.f2446 * c10) + h.f2444;
                                int i20 = h.f2448;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        h.f2448 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public final String toString() {
        int capsMode;
        int absoluteGravity;
        int i10 = f2242 + 15;
        f2245 = i10 % 128;
        if (i10 % 2 != 0) {
            capsMode = 3 >> TextUtils.getCapsMode("", 0, 0);
            absoluteGravity = 16 - Gravity.getAbsoluteGravity(1, 0);
        } else {
            capsMode = TextUtils.getCapsMode("", 0, 0) + 4;
            absoluteGravity = 76 - Gravity.getAbsoluteGravity(0, 0);
        }
        return m2513(capsMode, (byte) absoluteGravity, "\u0001\u0000¸¸").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        du duVar = new du(null);
        f2245 = (f2242 + 41) % 128;
        return duVar;
    }
}
