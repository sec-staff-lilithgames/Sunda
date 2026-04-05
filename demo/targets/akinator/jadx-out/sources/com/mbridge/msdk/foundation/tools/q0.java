package com.mbridge.msdk.foundation.tools;

import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f41171a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', GMTDateParser.MONTH, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', GMTDateParser.YEAR, 'Z', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f', 'g', GMTDateParser.HOURS, 'i', 'j', 'k', 'l', GMTDateParser.MINUTES, 'n', 'o', 'p', 'q', 'r', GMTDateParser.SECONDS, 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', GMTDateParser.ZONE, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f41172b = new byte[128];

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f41173c;

    /* renamed from: d, reason: collision with root package name */
    private static char[] f41174d;

    static {
        HashMap map = new HashMap();
        f41173c = map;
        map.put('A', 'v');
        f41173c.put('B', 'S');
        f41173c.put('C', 'o');
        f41173c.put('D', 'a');
        f41173c.put('E', 'j');
        f41173c.put('F', 'c');
        f41173c.put('G', '7');
        f41173c.put('H', Character.valueOf(GMTDateParser.DAY_OF_MONTH));
        f41173c.put('I', 'R');
        f41173c.put('J', Character.valueOf(GMTDateParser.ZONE));
        f41173c.put('K', 'p');
        f41173c.put('L', 'W');
        f41173c.put(Character.valueOf(GMTDateParser.MONTH), 'i');
        f41173c.put('N', 'f');
        f41173c.put('O', 'G');
        f41173c.put('P', 'y');
        f41173c.put('Q', 'N');
        f41173c.put('R', 'x');
        f41173c.put('S', 'Z');
        f41173c.put('T', 'n');
        f41173c.put('U', 'V');
        f41173c.put('V', '5');
        f41173c.put('W', 'k');
        f41173c.put('X', '+');
        f41173c.put(Character.valueOf(GMTDateParser.YEAR), 'D');
        f41173c.put('Z', 'H');
        f41173c.put('a', 'L');
        f41173c.put('b', Character.valueOf(GMTDateParser.YEAR));
        f41173c.put('c', Character.valueOf(GMTDateParser.HOURS));
        f41173c.put(Character.valueOf(GMTDateParser.DAY_OF_MONTH), 'J');
        f41173c.put('e', '4');
        f41173c.put('f', '6');
        f41173c.put('g', 'l');
        f41173c.put(Character.valueOf(GMTDateParser.HOURS), 't');
        f41173c.put('i', '0');
        f41173c.put('j', 'U');
        f41173c.put('k', '3');
        f41173c.put('l', 'Q');
        f41173c.put(Character.valueOf(GMTDateParser.MINUTES), 'r');
        f41173c.put('n', 'g');
        f41173c.put('o', 'E');
        f41173c.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f41173c.put('q', 'q');
        f41173c.put('r', '8');
        f41173c.put(Character.valueOf(GMTDateParser.SECONDS), Character.valueOf(GMTDateParser.SECONDS));
        f41173c.put('t', 'w');
        f41173c.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), '/');
        f41173c.put('v', 'X');
        f41173c.put('w', Character.valueOf(GMTDateParser.MONTH));
        f41173c.put('x', 'e');
        f41173c.put('y', 'B');
        f41173c.put(Character.valueOf(GMTDateParser.ZONE), 'A');
        f41173c.put('0', 'T');
        f41173c.put('1', '2');
        f41173c.put('2', 'F');
        f41173c.put('3', 'b');
        f41173c.put('4', '9');
        f41173c.put('5', 'P');
        f41173c.put('6', '1');
        f41173c.put('7', 'O');
        f41173c.put('8', 'I');
        f41173c.put('9', 'K');
        f41173c.put('+', Character.valueOf(GMTDateParser.MINUTES));
        f41173c.put('/', 'C');
        f41174d = new char[64];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char[] cArr = f41171a;
            if (i11 >= cArr.length) {
                break;
            }
            f41174d[i11] = f41173c.get(Character.valueOf(cArr[i11])).charValue();
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr = f41172b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = AbstractJsonLexerKt.TC_INVALID;
            i12++;
        }
        while (true) {
            char[] cArr2 = f41174d;
            if (i10 >= cArr2.length) {
                return;
            }
            f41172b[cArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i10) {
        try {
            char c10 = cArr[3];
            char c11 = c10 == '=' ? (char) 2 : (char) 3;
            char c12 = cArr[2];
            if (c12 == '=') {
                c11 = 1;
            }
            byte[] bArr2 = f41172b;
            byte b10 = bArr2[cArr[0]];
            byte b11 = bArr2[cArr[1]];
            byte b12 = bArr2[c12];
            byte b13 = bArr2[c10];
            if (c11 == 1) {
                bArr[i10] = (byte) (((b11 >> 4) & 3) | ((b10 << 2) & 252));
                return 1;
            }
            if (c11 == 2) {
                bArr[i10] = (byte) ((3 & (b11 >> 4)) | ((b10 << 2) & 252));
                bArr[i10 + 1] = (byte) (((b11 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b12 >> 2) & 15));
                return 2;
            }
            if (c11 != 3) {
                throw new RuntimeException("Internal Error");
            }
            bArr[i10] = (byte) (((b10 << 2) & 252) | ((b11 >> 4) & 3));
            bArr[i10 + 1] = (byte) (((b11 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b12 >> 2) & 15));
            bArr[i10 + 2] = (byte) (((b12 << 6) & PsExtractor.AUDIO_STREAM) | (b13 & Utf8.REPLACEMENT_BYTE));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bArrA = a(str);
        if (bArrA == null || bArrA.length <= 0) {
            return null;
        }
        return new String(bArrA);
    }

    public static String c(String str) {
        return a(str.getBytes());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r13) {
        /*
            int r0 = r13.length()     // Catch: java.lang.Exception -> L5b
            r1 = 259(0x103, float:3.63E-43)
            if (r0 >= r1) goto L9
            r1 = r0
        L9:
            char[] r1 = new char[r1]     // Catch: java.lang.Exception -> L5b
            int r2 = r0 >> 2
            int r2 = r2 * 3
            int r2 = r2 + 3
            byte[] r3 = new byte[r2]     // Catch: java.lang.Exception -> L5b
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
        L17:
            if (r5 >= r0) goto L52
            int r8 = r5 + 256
            if (r8 > r0) goto L23
            r13.getChars(r5, r8, r1, r7)     // Catch: java.lang.Exception -> L5b
            int r5 = r7 + 256
            goto L29
        L23:
            r13.getChars(r5, r0, r1, r7)     // Catch: java.lang.Exception -> L5b
            int r5 = r0 - r5
            int r5 = r5 + r7
        L29:
            r9 = r7
        L2a:
            if (r7 >= r5) goto L4f
            char r10 = r1[r7]     // Catch: java.lang.Exception -> L5b
            r11 = 61
            if (r10 == r11) goto L3d
            byte[] r11 = com.mbridge.msdk.foundation.tools.q0.f41172b     // Catch: java.lang.Exception -> L5b
            int r12 = r11.length     // Catch: java.lang.Exception -> L5b
            if (r10 >= r12) goto L4c
            r11 = r11[r10]     // Catch: java.lang.Exception -> L5b
            r12 = 127(0x7f, float:1.78E-43)
            if (r11 == r12) goto L4c
        L3d:
            int r11 = r9 + 1
            r1[r9] = r10     // Catch: java.lang.Exception -> L5b
            r9 = 4
            if (r11 != r9) goto L4b
            int r9 = a(r1, r3, r6)     // Catch: java.lang.Exception -> L5b
            int r6 = r6 + r9
            r9 = r4
            goto L4c
        L4b:
            r9 = r11
        L4c:
            int r7 = r7 + 1
            goto L2a
        L4f:
            r5 = r8
            r7 = r9
            goto L17
        L52:
            if (r6 != r2) goto L55
            return r3
        L55:
            byte[] r13 = new byte[r6]     // Catch: java.lang.Exception -> L5b
            java.lang.System.arraycopy(r3, r4, r13, r4, r6)     // Catch: java.lang.Exception -> L5b
            return r13
        L5b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.q0.a(java.lang.String):byte[]");
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i10, int i11) {
        if (i11 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i11 / 3) << 2) + 4];
            int i12 = 0;
            while (i11 >= 3) {
                int i13 = ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) + ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                char[] cArr2 = f41174d;
                cArr[i12] = cArr2[i13 >> 18];
                cArr[i12 + 1] = cArr2[(i13 >> 12) & 63];
                int i14 = i12 + 3;
                cArr[i12 + 2] = cArr2[(i13 >> 6) & 63];
                i12 += 4;
                cArr[i14] = cArr2[i13 & 63];
                i10 += 3;
                i11 -= 3;
            }
            if (i11 == 1) {
                int i15 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                char[] cArr3 = f41174d;
                cArr[i12] = cArr3[i15 >> 2];
                cArr[i12 + 1] = cArr3[(i15 << 4) & 63];
                int i16 = i12 + 3;
                cArr[i12 + 2] = G5.T;
                i12 += 4;
                cArr[i16] = G5.T;
            } else if (i11 == 2) {
                int i17 = ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                char[] cArr4 = f41174d;
                cArr[i12] = cArr4[i17 >> 10];
                cArr[i12 + 1] = cArr4[(i17 >> 4) & 63];
                int i18 = i12 + 3;
                cArr[i12 + 2] = cArr4[(i17 << 2) & 63];
                i12 += 4;
                cArr[i18] = G5.T;
            }
            return new String(cArr, 0, i12);
        } catch (Exception unused) {
            return null;
        }
    }
}
