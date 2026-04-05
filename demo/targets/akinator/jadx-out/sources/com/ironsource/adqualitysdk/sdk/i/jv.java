package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class jv {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f3085 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3086 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f3087 = {GMTDateParser.SECONDS, 227, 222, 226, 216, 219, 234, 226, 222, 218, 223, 215, 206, 198, AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'B', 'n', 'n', GMTDateParser.DAY_OF_MONTH, 'l', 't', 'n', 'k', 'j', 'C', '@', 'j', 'v', GMTDateParser.SECONDS, GMTDateParser.HOURS, 'A', 'J', 'j', 'j', 'o', AbstractJsonLexerKt.STRING, 'L', 'A', '9', 'B', 'B', '9', '?', GMTDateParser.MONTH, 'G', 'K', 'D', 'B', 'X', 'b', GMTDateParser.DAY_OF_MONTH, 'f', 'k', 'j', 'T', ' ', 'C', 'L', '@', '8', 'B', 'B', '8', '>', 'O', 'J', 'I', 'P', 'S', 'O', 'N', 'I', 'C', 'N', 'P', 'N', 'N', 'J', 'H', '<', ';', 'G', 'I', ';', '3', '5', '<', 'E', 'N', '4', GMTDateParser.HOURS, GMTDateParser.ANY, 'T', GMTDateParser.MONTH, '9', '2', 'C', 138, 139, 141, 147, 147, 'i', 'c', 138, 139, 142, 146, 148, 149, 138, 132, 132, 'b', 'i', 144, 144, 146, AbstractJsonLexerKt.BEGIN_OBJ, '7', 'k', 'i', 'f', '@', 'J', 'r', 't', AbstractJsonLexerKt.UNICODE_ESC, 'j', GMTDateParser.DAY_OF_MONTH, GMTDateParser.DAY_OF_MONTH, 'B', 'C', 'j', 'k', 'n', 'j', 'c', 'k', 'j', 'A', 'I', 'p', 'p', 'r', AbstractJsonLexerKt.BEGIN_LIST};

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static long m3085() {
        f3086 = (f3085 + 39) % 128;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        f3085 = (f3086 + 61) % 128;
        return timeInMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00fc A[Catch: all -> 0x0132, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0132, blocks: (B:15:0x00cc, B:23:0x00fc), top: B:41:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3086(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jv.m3086(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3091(iu iuVar) {
        int i10 = f3086 + 29;
        f3085 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Executors.newSingleThreadExecutor().execute(iuVar);
            } else {
                Executors.newSingleThreadExecutor().execute(iuVar);
                throw null;
            }
        } catch (Throwable th2) {
            kd.m3203(m3087("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", true, new int[]{0, 14, 116, 0}).intern(), m3087("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000", false, new int[]{14, 26, 0, 0}).intern(), th2, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static long m3089() {
        long jElapsedRealtime;
        int i10 = f3086 + 19;
        f3085 = i10 % 128;
        if (i10 % 2 != 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            int i11 = 90 / 0;
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        f3086 = (f3085 + 13) % 128;
        return jElapsedRealtime;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List m3090(List list, List list2) {
        HashSet hashSet = new HashSet(list);
        if (list2 != null) {
            f3085 = (f3086 + 57) % 128;
            hashSet.addAll(list2);
            f3085 = (f3086 + 115) % 128;
        }
        return new ArrayList(hashSet);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m3088(String str) {
        int length;
        byte[] bArr;
        int i10;
        int i11 = f3085 + 67;
        f3086 = i11 % 128;
        if (i11 % 2 == 0) {
            length = str.length();
            bArr = new byte[length << 4];
            i10 = 1;
        } else {
            length = str.length();
            bArr = new byte[length / 2];
            i10 = 0;
        }
        while (i10 < length) {
            f3085 = (f3086 + 23) % 128;
            bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
            i10 += 2;
        }
        f3086 = (f3085 + 13) % 128;
        return bArr;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m3087(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f3087, i10, cArr, 0, i11);
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
