package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import io.ktor.util.date.GMTDateParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3122 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f3123 = {'\n', 'I', 'r', 'o', 'n', 'S', AbstractJsonLexerKt.UNICODE_ESC, 'c', 'e', ' ', 'A', GMTDateParser.DAY_OF_MONTH, 'Q', 'a', 'l', 'i', 't', 'y', AbstractJsonLexerKt.COLON, 11, '\f', '\r', 14, 15, 16};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f3124 = 5;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3125;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static void m3135(String str, String str2) {
        int i10 = f3125 + 35;
        f3122 = i10 % 128;
        int i11 = i10 % 2;
        m3139(str, str, str2);
        if (i11 == 0) {
            throw null;
        }
        f3125 = (f3122 + 63) % 128;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static void m3136(String str, String str2) {
        f3122 = (f3125 + 9) % 128;
        m3153(str, str2, (Object) null);
        int i10 = f3122 + 101;
        f3125 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 43 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3140(String str, String str2, boolean z10) {
        f3125 = (f3122 + 9) % 128;
        m3151(str, str, str2, z10);
        int i10 = f3122 + 9;
        f3125 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static ISAdQualityLogLevel m3141() {
        f3125 = (f3122 + 33) % 128;
        ISAdQualityLogLevel iSAdQualityLogLevelM3314 = q.m3297().m3314();
        int i10 = f3125 + 9;
        f3122 = i10 % 128;
        if (i10 % 2 != 0) {
            return iSAdQualityLogLevelM3314;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m3148() {
        f3125 = (f3122 + 61) % 128;
        boolean zM3316 = q.m3297().m3316();
        f3125 = (f3122 + 67) % 128;
        return zM3316;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3150(String str, String str2, String str3, Object obj, boolean z10) {
        if (obj != null) {
            StringBuilder sbU = o2.u(str3);
            sbU.append(m3146((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58), 1 - View.MeasureSpec.getMode(0), "D").intern());
            sbU.append(obj.toString());
            str3 = sbU.toString();
        }
        if (!m3148()) {
            if (z10 && m3141().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
                Log.d(m3137(str2), str3);
            }
            f3122 = (f3125 + 39) % 128;
            return;
        }
        int i10 = f3122 + 61;
        f3125 = i10 % 128;
        if (i10 % 2 == 0) {
            Log.d(m3137(str), str3);
        } else {
            Log.d(m3137(str), str3);
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3152(String str, String str2) {
        f3125 = (f3122 + 1) % 128;
        m3156(str, str2, (Throwable) null);
        f3122 = (f3125 + 43) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3138(String str, String str2) {
        int i10 = f3122 + 55;
        f3125 = i10 % 128;
        int i11 = i10 % 2;
        m3155(str, str, str2, true);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m3145(String str, String str2, Throwable th2) {
        int i10 = f3122 + 97;
        f3125 = i10 % 128;
        m3144(str, str, str2, th2, i10 % 2 != 0);
        f3122 = (f3125 + 45) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m3147(String str, String str2) {
        f3122 = (f3125 + 7) % 128;
        m3145(str, str2, (Throwable) null);
        f3125 = (f3122 + 61) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3156(String str, String str2, Throwable th2) {
        f3125 = (f3122 + 3) % 128;
        m3144(str, str, str2, th2, true);
        f3122 = (f3125 + 101) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (m3141().shouldPrintLog(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r2 = com.ironsource.adqualitysdk.sdk.i.k.f3122 + 57;
        com.ironsource.adqualitysdk.sdk.i.k.f3125 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if ((r2 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        android.util.Log.v(m3137(r3), r4);
        r2 = 26 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        android.util.Log.v(m3137(r3), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (m3148() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (m3148() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        android.util.Log.v(m3137(r2), r4);
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m3139(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.k.f3122
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f3125 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            boolean r0 = m3148()
            r1 = 34
            int r1 = r1 / 0
            if (r0 == 0) goto L25
            goto L1d
        L17:
            boolean r0 = m3148()
            if (r0 == 0) goto L25
        L1d:
            java.lang.String r2 = m3137(r2)
            android.util.Log.v(r2, r4)
            return
        L25:
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r2 = m3141()
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r0 = com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE
            boolean r2 = r2.shouldPrintLog(r0)
            if (r2 == 0) goto L50
            int r2 = com.ironsource.adqualitysdk.sdk.i.k.f3122
            int r2 = r2 + 57
            int r0 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f3125 = r0
            int r2 = r2 % 2
            if (r2 == 0) goto L49
            java.lang.String r2 = m3137(r3)
            android.util.Log.v(r2, r4)
            r2 = 26
            int r2 = r2 / 0
            return
        L49:
            java.lang.String r2 = m3137(r3)
            android.util.Log.v(r2, r4)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.k.m3139(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m3144(String str, String str2, String str3, Throwable th2, boolean z10) {
        int i10 = f3125 + 55;
        f3122 = i10 % 128;
        if (i10 % 2 != 0) {
            if (m3148()) {
                Log.e(m3137(str), str3, th2);
                f3125 = (f3122 + 99) % 128;
                return;
            }
            if (z10) {
                int i11 = f3122 + 89;
                f3125 = i11 % 128;
                if (i11 % 2 == 0) {
                    if (m3141().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
                        f3125 = (f3122 + 87) % 128;
                        Log.e(m3137(str2), str3, th2);
                    }
                } else {
                    m3141().shouldPrintLog(ISAdQualityLogLevel.ERROR);
                    throw null;
                }
            }
            int i12 = f3122 + 43;
            f3125 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 40 / 0;
                return;
            }
            return;
        }
        m3148();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m3146(byte b10, int i10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f3123;
                char c10 = f3124;
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3157(String str, String str2, Throwable th2, boolean z10) {
        int i10 = f3125 + 85;
        f3122 = i10 % 128;
        int i11 = i10 % 2;
        m3144(str, str, str2, th2, z10);
        if (i11 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m3155(String str, String str2, String str3, boolean z10) {
        if (m3148()) {
            f3125 = (f3122 + 75) % 128;
            Log.i(m3137(str), str3);
            return;
        }
        if (z10 && m3141().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            Log.i(m3137(str2), str3);
        }
        int i10 = f3122 + 97;
        f3125 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m3137(String str) {
        String strK = com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m3146((byte) (81 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Color.alpha(0) + 22, "\u0002\u0003\u0004\u0000\b\u0000\u0007\u0001\b\t\u0005\u000e\f\r\b\u000b\n\u0013\u0011\u0012\u0013\b"), str);
        int i10 = f3122 + 25;
        f3125 = i10 % 128;
        if (i10 % 2 == 0) {
            return strK;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m3154(String str, String str2, String str3, Object obj) {
        f3122 = (f3125 + 71) % 128;
        m3150(str, str2, str3, obj, true);
        f3125 = (f3122 + 81) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3153(String str, String str2, Object obj) {
        int i10 = f3125 + 85;
        f3122 = i10 % 128;
        m3150(str, str, str2, obj, i10 % 2 == 0);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3151(String str, String str2, String str3, boolean z10) {
        int i10 = f3125 + 15;
        f3122 = i10 % 128;
        int i11 = i10 % 2;
        m3144(str, str2, str3, null, z10);
        if (i11 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3149(String str, String str2) {
        f3122 = (f3125 + 101) % 128;
        m3155(str, str, str2, false);
        int i10 = f3125 + 41;
        f3122 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m3142(String str, String str2) {
        int i10 = f3125 + 23;
        f3122 = i10 % 128;
        int i11 = i10 % 2;
        m3154(str, str, str2, (Object) null);
        if (i11 == 0) {
            int i12 = 90 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m3143(String str, String str2, Object obj) {
        int i10 = f3122 + 29;
        f3125 = i10 % 128;
        int i11 = i10 % 2;
        m3154(str, str, str2, obj);
        if (i11 != 0) {
            int i12 = 8 / 0;
        }
        f3125 = (f3122 + 75) % 128;
    }
}
