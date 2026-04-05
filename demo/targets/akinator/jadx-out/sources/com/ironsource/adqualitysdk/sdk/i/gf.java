package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import io.ktor.util.date.GMTDateParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class gf extends gk {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2332 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2334 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2331 = {'b', 44975, 24536, 4071, 48956, 28495, 8042, 52921, 32469};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2333 = 7671017891653464022L;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends gf {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2335 = 1;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f2336 = 5;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f2337 = {'c', 'o', GMTDateParser.MINUTES, '.', 'b', 'y', 't', 'e', GMTDateParser.DAY_OF_MONTH, 'a', 'n', GMTDateParser.SECONDS, 'k', 'p', 'T', 'A', 'S', 'f', 'g', GMTDateParser.HOURS, 'i', 'j', 'l', 'q', 'r'};

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2338;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m2539(int i10, byte b10, String str) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (h.f2445) {
                try {
                    char[] cArr2 = f2337;
                    char c10 = f2336;
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

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻛ */
        public final Class mo2525() {
            Class<TTAdSdk> cls;
            int i10 = f2338;
            int i11 = i10 + 39;
            f2335 = i11 % 128;
            if (i11 % 2 == 0) {
                cls = TTAdSdk.class;
                int i12 = 23 / 0;
            } else {
                cls = TTAdSdk.class;
            }
            f2335 = (i10 + 63) % 128;
            return cls;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾒ */
        public final String mo2527() {
            f2338 = (f2335 + 55) % 128;
            String strIntern = m2539(35 - Color.alpha(0), (byte) (116 - View.combineMeasuredStates(0, 0)), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000f\u0005\b\u0002\r\u0006\r\u0002\u0003\u000b\u0005\f\u0005\t\r\u0006\r\u0002ÈÈ\u0012\u0005\u0012\u0006ß").intern();
            int i10 = f2335 + 77;
            f2338 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 79 / 0;
            }
            return strIntern;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends gf {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2339 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2340 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2341 = 163257155;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2342 = 117;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static short[] f2343 = null;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2344 = 181559972;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static byte[] f2345 = {-74, 0, -14, -9, 1, -110, -27, 77, -4, -116, -2, -52, -66, -118, -8, -44, -60, 0, -110, -8, 4, -108, -6, -114, 2, 66, -60, 0, -110, 62, -70, 5, -114, -10, -122, -120, -110, -116, -16, -49, -62, -119, -9};

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m2540(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (n.f3160) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2342;
                    int i14 = i10 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f2345;
                        i14 = bArr != null ? (byte) (bArr[f2344 + i11] + i13) : (short) (f2343[f2344 + i11] + i13);
                    }
                    if (i14 > 0) {
                        n.f3165 = ((i11 + i14) - 2) + f2344 + i15;
                        n.f3163 = b10;
                        char c10 = (char) (i12 + f2341);
                        n.f3162 = c10;
                        sb2.append(c10);
                        n.f3161 = n.f3162;
                        n.f3164 = 1;
                        while (n.f3164 < i14) {
                            byte[] bArr2 = f2345;
                            if (bArr2 != null) {
                                int i16 = n.f3165;
                                n.f3165 = i16 - 1;
                                n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                            } else {
                                short[] sArr = f2343;
                                int i17 = n.f3165;
                                n.f3165 = i17 - 1;
                                n.f3162 = (char) (n.f3161 + (((short) (sArr[i17] + s10)) ^ n.f3163));
                            }
                            sb2.append(n.f3162);
                            n.f3161 = n.f3162;
                            n.f3164++;
                        }
                    }
                    string = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return string;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻛ */
        public final Class mo2525() {
            int i10 = f2340 + 95;
            f2339 = i10 % 128;
            if (i10 % 2 == 0) {
                return PAGSdk.class;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾒ */
        public final String mo2527() {
            f2340 = (f2339 + 41) % 128;
            String strIntern = m2540((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 118, (short) (58 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 181559972, (byte) (61 - KeyEvent.getDeadChar(0, 0)), (-163257056) - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
            int i10 = f2340 + 71;
            f2339 = i10 % 128;
            if (i10 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        char windowTouchSlop;
        int i10;
        int i11 = f2334 + 57;
        f2332 = i11 % 128;
        if (i11 % 2 != 0) {
            windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() % 90);
            i10 = 8 >> (TypedValue.complexToFraction(0, 1.0f, 2.0f) > 2.0f ? 1 : (TypedValue.complexToFraction(0, 1.0f, 2.0f) == 2.0f ? 0 : -1));
        } else {
            windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            i10 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9;
        }
        return m2538(windowTouchSlop, i10, TextUtils.getCapsMode("", 0, 0)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bk bkVar = new bk(mo2524());
        int i10 = f2334 + 99;
        f2332 = i10 % 128;
        if (i10 % 2 == 0) {
            return bkVar;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2538(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2331[i11 + i12] ^ (i12 * f2333)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
