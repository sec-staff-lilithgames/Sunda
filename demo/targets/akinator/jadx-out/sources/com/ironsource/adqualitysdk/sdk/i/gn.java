package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.i.bv;
import com.mbridge.msdk.MBridgeSDK;
import com.mintegral.msdk.MIntegralSDK;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gn {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends gk {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2373 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2374 = 1;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f2375 = {'9', 'i', 'f', GMTDateParser.MONTH, GMTDateParser.MONTH, 'p', 'k', 'g', 'L', G5.T, 'K', AbstractJsonLexerKt.BEGIN_LIST, 'q', 'l', 'f', 'l', 'i', 'f', '_', 'K', 'G', 'W', 'i', 'n', GMTDateParser.MONTH, GMTDateParser.MONTH, 'k', 'k', 'q', 'l', 'f', '6', 'k', 'k', 'q', 'l', 'f', 'l', 'i', 'f'};

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m2549(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                    System.arraycopy(f2375, i10, cArr, 0, i11);
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

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻐ */
        public final String mo2524() {
            f2373 = (f2374 + 83) % 128;
            String strIntern = m2549("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001", false, new int[]{31, 9, 0, 0}).intern();
            int i10 = f2373 + 49;
            f2374 = i10 % 128;
            if (i10 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻛ */
        public final Class mo2525() {
            int i10 = (f2374 + 21) % 128;
            f2373 = i10;
            int i11 = i10 + 5;
            f2374 = i11 % 128;
            if (i11 % 2 != 0) {
                return MIntegralSDK.class;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾇ */
        public final bg mo2526() {
            bv.a aVar = new bv.a(mo2524());
            int i10 = f2374 + 33;
            f2373 = i10 % 128;
            if (i10 % 2 == 0) {
                return aVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾒ */
        public final String mo2527() {
            int i10 = f2373 + 75;
            f2374 = i10 % 128;
            String strIntern = (i10 % 2 == 0 ? m2549("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 31, 0, 21}) : m2549("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{0, 31, 0, 21})).intern();
            f2374 = (f2373 + 57) % 128;
            return strIntern;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends gk {

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f2376 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2377 = 43446;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2378 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f2379 = 19037;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f2380 = 2312;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char f2381 = 37557;

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻐ */
        public final String mo2524() {
            f2376 = (f2378 + 91) % 128;
            String strIntern = m2550("싇\ue17f\udfcb\uee37泑缤旣ޖԿ滽", 9 - TextUtils.indexOf("", "", 0, 0)).intern();
            f2378 = (f2376 + 91) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻛ */
        public final Class mo2525() {
            int i10 = f2378;
            int i11 = i10 + 33;
            f2376 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            f2376 = (i10 + 33) % 128;
            return MBridgeSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾇ */
        public final bg mo2526() {
            bv.b bVar = new bv.b(mo2524());
            int i10 = f2376 + 35;
            f2378 = i10 % 128;
            if (i10 % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾒ */
        public final String mo2527() {
            f2376 = (f2378 + 85) % 128;
            String strIntern = m2550("썯\u20c3苲뺒泤妘术艭\uec91㞯痩鵟㦻龒\ueb4f⦇䑴䋎ꖶ뵿璝愡鯳竨\ue0b3禒擄鶎", 27 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
            int i10 = f2376 + 45;
            f2378 = i10 % 128;
            if (i10 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m2550(String str, int i10) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (o.f3166) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    o.f3167 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = o.f3167;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c10 = cArr3[1];
                                char c11 = cArr3[0];
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2380)) ^ ((c11 >>> 5) + f2379)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2381) ^ ((c12 + i12) ^ ((c12 << 4) + f2377))));
                                i12 -= 40503;
                            }
                            int i14 = o.f3167;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            o.f3167 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public gn() {
    }

    public gn(Context context) {
        context.getApplicationContext();
    }
}
