package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final Handler f3168;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3169 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f3170 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3171 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final Handler f3172;

    static {
        m3256();
        f3172 = new Handler(Looper.getMainLooper());
        f3168 = m3246();
        f3171 = (f3169 + 55) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3247(iu iuVar) {
        f3171 = (f3169 + 39) % 128;
        try {
            m3250().post(iuVar);
            int i10 = f3171 + 99;
            f3169 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Error unused) {
            k.m3140(m3255(new int[]{0, 12, 0, 4}, true, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001").intern(), m3255(new int[]{78, 36, 103, 0}, false, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001").intern(), false);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m3248(iu iuVar) {
        int i10 = f3169 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3171 = i10 % 128;
        if (i10 % 2 == 0) {
            m3249();
            throw null;
        }
        if (m3249()) {
            m3247(iuVar);
            return;
        }
        iuVar.run();
        int i11 = f3169 + 97;
        f3171 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 89 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m3251(iu iuVar) {
        if (!m3249()) {
            m3253(iuVar);
            int i10 = f3171 + 113;
            f3169 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i11 = f3171 + 1;
        f3169 = i11 % 128;
        if (i11 % 2 == 0) {
            iuVar.run();
        } else {
            iuVar.run();
            int i12 = 5 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Handler m3252() {
        Handler handler;
        int i10 = f3169;
        int i11 = i10 + 5;
        f3171 = i11 % 128;
        if (i11 % 2 == 0) {
            handler = f3172;
            int i12 = 79 / 0;
        } else {
            handler = f3172;
        }
        f3171 = (i10 + 95) % 128;
        return handler;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3256() {
        f3170 = new char[]{AbstractJsonLexerKt.COLON, 'c', 'Z', 'R', 'F', 'G', 'K', 'f', 'v', 'n', 'j', 'f', '#', 'S', 'e', 'j', GMTDateParser.HOURS, GMTDateParser.DAY_OF_MONTH, 'B', 'J', 'q', 'G', 'H', 'o', 'q', GMTDateParser.SECONDS, 'J', 'G', 'n', 'G', 'F', 'g', 'e', 'k', 'G', 'J', 'n', GMTDateParser.MINUTES, 'k', 'c', 'b', GMTDateParser.HOURS, 206, 207, 215, 217, 218, 182, 179, 215, 209, 211, 178, 179, 218, 179, 174, 208, 219, 217, 210, 212, 208, 174, 182, 223, 221, 219, 180, 179, 221, 182, 174, 208, 212, 214, 209, 191, 'V', 186, 204, 209, 207, 203, 169, 177, 216, 174, 170, 205, 211, 219, 213, 210, 209, 170, 168, 200, 201, 206, 208, 211, 215, 217, 216, 208, 169, 171, 203, 206, 208, 207, 207, 210, 'x', 249, 255, 256, 264, 266, 251, 234, 225, 223, 220, 224, 237, 222, 155, 234, 239, 155, 223, 224, 231, 228, 220, 193, 169, 169, 169, 226, 233, 228, 244, 237, 239, 224, 237, 155, 167, 237, 224, 231, 223, 233, 220, 227, 155, 223, 233, 240, 234, 237, 226, 230, 222, 220, 221, 155, 224, 239, '2', 'i', 'q', 'r', 'p', 'l', 'i', 'g', 'b', 'a', 'A', 'B', 'l', 'j', 'c', 'k', 'j', 'A', 'G', 'q', 'J', 'B', GMTDateParser.DAY_OF_MONTH, GMTDateParser.HOURS, 'j', 'e', 'S', AbstractJsonLexerKt.STRING_ESC, 'k', GMTDateParser.HOURS, GMTDateParser.HOURS, 'i', 'g', GMTDateParser.DAY_OF_MONTH, 'D'};
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3253(iu iuVar) {
        f3169 = (f3171 + 93) % 128;
        try {
            m3252().post(iuVar);
            int i10 = f3171 + 101;
            f3169 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 61 / 0;
            }
        } catch (Error unused) {
            k.m3140(m3255(new int[]{0, 12, 0, 4}, true, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001").intern(), m3255(new int[]{12, 29, 0, 0}, false, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001").intern(), false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3257(iu iuVar, long j10) {
        int i10 = f3171 + 73;
        f3169 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m3250().postDelayed(iuVar, j10);
                int i11 = 74 / 0;
            } else {
                m3250().postDelayed(iuVar, j10);
            }
            int i12 = f3169 + 115;
            f3171 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Error unused) {
            k.m3140(m3255(new int[]{0, 12, 0, 4}, true, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001").intern(), m3255(new int[]{78, 36, 103, 0}, false, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001").intern(), false);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Handler m3246() {
        try {
            HandlerThread handlerThread = new HandlerThread(m3255(new int[]{114, 10, 157, 1}, true, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000").intern());
            f3171 = (f3169 + 107) % 128;
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    handlerThread.start();
                    Handler handler = new Handler(handlerThread.getLooper());
                    f3171 = (f3169 + 45) % 128;
                    return handler;
                } catch (Error unused) {
                    k.m3140(m3255(new int[]{0, 12, 0, 4}, true, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001").intern(), m3255(new int[]{Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 48, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 14}, true, null).intern(), true);
                }
            }
        } catch (Error unused2) {
            k.m3140(m3255(new int[]{0, 12, 0, 4}, true, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001").intern(), m3255(new int[]{172, 35, 0, 27}, true, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000").intern(), true);
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Handler m3250() {
        int i10 = f3169 + 13;
        f3171 = i10 % 128;
        if (i10 % 2 != 0) {
            return f3168;
        }
        int i11 = 62 / 0;
        return f3168;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3254(iu iuVar, long j10) {
        int i10 = f3169 + 29;
        f3171 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m3252().postDelayed(iuVar, j10);
                int i11 = f3171 + 9;
                f3169 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 72 / 0;
                    return;
                }
                return;
            }
            m3252().postDelayed(iuVar, j10);
            throw null;
        } catch (Error unused) {
            k.m3140(m3255(new int[]{0, 12, 0, 4}, true, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001").intern(), m3255(new int[]{41, 37, 108, 0}, true, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001").intern(), false);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m3249() {
        f3169 = (f3171 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return false;
        }
        f3171 = (f3169 + 35) % 128;
        return true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m3255(int[] iArr, boolean z10, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f3170, i10, cArr, 0, i11);
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
}
