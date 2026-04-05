package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ic {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2629 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f2630;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2631;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2632;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static short[] f2633;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final byte[] f2634;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2635;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2636;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ boolean f2637;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final byte[] f2638;

    static {
        m2790();
        int i10 = (f2629 + 53) % 128;
        f2632 = i10;
        f2637 = true;
        f2634 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2638 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
        f2629 = (i10 + 107) % 128;
    }

    private ic() {
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m2790() {
        f2636 = -1774339556;
        f2635 = Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE;
        f2631 = -1283482610;
        f2630 = new byte[]{19, 118, 89, 116, 103, 94, -74, 34, 88, 98, 126, -87, 19, 122, -88, 96, 81, 125, 110, 34, 88, 98, 126, -87, 32, 96, 108, 108, 103, 106, 88, -73, 35, 98, 100, 114, 82, 111, 108, 50, -107, 120, -109, -122, 125, -43, 50, -103, -57, 65, 118, -113, -111, 113, -36, 66, -123, -121, 123, -110, 123, -113, -53, 64, 125, -43, 66, 124, -113, -53, 51, -115, -111, 121, -115, -124, 124, -39, 45, -109, -115, 120, -115, -111, -127, -52, AbstractJsonLexerKt.TC_INVALID, 112, -100, -115, 65, 119, -127, -99, -56, Utf8.REPLACEMENT_BYTE, AbstractJsonLexerKt.TC_INVALID, -117, -117, -122, -119, 119, 16, 26, 54, 97, -40, 24, 36, 28, 34, 39, 14, 29, 115, -37, 26, 28, 42, 10, 39, 36, 104, -52, 49, 24, 103, -38, 15, 40, 42, 10, 117, -37, 30, 32, 20, 43, 20, 40, -35, 68, 114, -33, 62, 34, 66, 51, 32, 66, 42, 54, 116, -35, 48, 54, 51, 54, 122, 29, 47, 2, 35, 67, 80, 83, -19, 52, 80, 10, 58, -120, 113, -127, -125, 123, 126, -71, -77, 22, -7, 20, 7, -2, 86, -77, 26, 72, -75, 20, -8, 24, 9, -10, 24, 0, 12, 74, -64, 0, 12, 4, 10, 15, -10, 5, 91, -62, 0, 12, 0, 12, -3, 0, 0, 0, 0, 0, 0, 0};
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m2793(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = ((i11 + 2) / 3) << 2;
        int i13 = (i12 / Integer.MAX_VALUE) + i12;
        byte[] bArr3 = new byte[i13];
        int i14 = i11 - 2;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i14) {
            int i18 = ((bArr[i15] << 24) >>> 8) | ((bArr[i15 + 1] << 24) >>> 16) | ((bArr[i15 + 2] << 24) >>> 24);
            bArr3[i16] = bArr2[i18 >>> 18];
            int i19 = i16 + 1;
            bArr3[i19] = bArr2[(i18 >>> 12) & 63];
            bArr3[i16 + 2] = bArr2[(i18 >>> 6) & 63];
            bArr3[i16 + 3] = bArr2[i18 & 63];
            i17 += 4;
            if (i17 == Integer.MAX_VALUE) {
                bArr3[i16 + 4] = 10;
                i17 = 0;
                i16 = i19;
            }
            i15 += 3;
            i16 += 4;
        }
        if (i15 < i11) {
            f2629 = (f2632 + 91) % 128;
            m2796(bArr, i15, i11 - i15, bArr3, i16, bArr2);
            if (i17 + 4 == Integer.MAX_VALUE) {
                int i20 = f2629 + 115;
                f2632 = i20 % 128;
                if (i20 % 2 != 0) {
                    bArr3[i16 - 3] = 83;
                    i16 += 17;
                } else {
                    bArr3[i16 + 4] = 10;
                    i16++;
                }
            }
            i16 += 4;
            f2632 = (f2629 + 87) % 128;
        }
        if (!f2637 && i16 != i13) {
            throw new AssertionError();
        }
        int i21 = f2632 + 105;
        f2629 = i21 % 128;
        if (i21 % 2 != 0) {
            return bArr3;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static byte[] m2794(String str) throws id {
        f2629 = (f2632 + 3) % 128;
        byte[] bytes = str.getBytes();
        byte[] bArrM2791 = m2791(bytes, bytes.length);
        f2629 = (f2632 + 7) % 128;
        return bArrM2791;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] m2796(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3) {
        int i13;
        int i14;
        int i15 = f2629;
        f2632 = (i15 + 107) % 128;
        int i16 = 0;
        if (i11 > 0) {
            f2632 = (i15 + 35) % 128;
            i13 = (bArr[i10] << 24) >>> 8;
            f2632 = (i15 + 37) % 128;
        } else {
            i13 = 0;
        }
        if (i11 > 1) {
            f2629 = (f2632 + 83) % 128;
            i14 = (bArr[i10 + 1] << 24) >>> 16;
        } else {
            i14 = 0;
        }
        int i17 = i13 | i14;
        if (i11 > 2) {
            int i18 = f2629 + 19;
            f2632 = i18 % 128;
            i16 = i18 % 2 != 0 ? (bArr[i10 >> 5] + 115) / 0 : (bArr[i10 + 2] << 24) >>> 24;
        }
        int i19 = i17 | i16;
        if (i11 == 1) {
            bArr2[i12] = bArr3[i19 >>> 18];
            bArr2[i12 + 1] = bArr3[(i19 >>> 12) & 63];
            bArr2[i12 + 2] = 61;
            bArr2[i12 + 3] = 61;
            return bArr2;
        }
        if (i11 == 2) {
            bArr2[i12] = bArr3[i19 >>> 18];
            bArr2[i12 + 1] = bArr3[(i19 >>> 12) & 63];
            bArr2[i12 + 2] = bArr3[(i19 >>> 6) & 63];
            bArr2[i12 + 3] = 61;
            return bArr2;
        }
        if (i11 != 3) {
            return bArr2;
        }
        bArr2[i12] = bArr3[i19 >>> 18];
        bArr2[i12 + 1] = bArr3[(i19 >>> 12) & 63];
        bArr2[i12 + 2] = bArr3[(i19 >>> 6) & 63];
        bArr2[i12 + 3] = bArr3[i19 & 63];
        return bArr2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m2788(byte[] bArr) {
        int i10 = f2632 + 45;
        f2629 = i10 % 128;
        if (i10 % 2 == 0) {
            m2789(bArr, bArr.length, f2634);
            throw null;
        }
        String strM2789 = m2789(bArr, bArr.length, f2634);
        f2629 = (f2632 + 111) % 128;
        return strM2789;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2789(byte[] bArr, int i10, byte[] bArr2) {
        byte[] bArrM2793 = m2793(bArr, 0, i10, bArr2);
        String str = new String(bArrM2793, 0, bArrM2793.length);
        f2632 = (f2629 + 91) % 128;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m2791(byte[] bArr, int i10) throws id {
        int i11 = f2629 + 71;
        f2632 = i11 % 128;
        return i11 % 2 != 0 ? m2795(bArr, 1, i10, f2638) : m2795(bArr, 0, i10, f2638);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2787(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2635;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2630;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f2636 + i11] + i13);
                    } else {
                        i14 = (short) (f2633[f2636 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f2636 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f2631);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f2630;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f2633;
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

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int m2792(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        byte b10 = bArr[2];
        if (b10 == 61) {
            int i11 = f2632 + 65;
            f2629 = i11 % 128;
            if (i11 % 2 == 0) {
                byte b11 = bArr3[bArr[0]];
                bArr2[i10] = (byte) (((b11 >>> 27) ^ ((b11 >>> 72) / 97)) / 109);
                return 0;
            }
            bArr2[i10] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b12 = bArr[3];
        if (b12 == 61) {
            f2629 = (f2632 + 81) % 128;
            int i12 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18);
            bArr2[i10] = (byte) (i12 >>> 16);
            bArr2[i10 + 1] = (byte) (i12 >>> 8);
            return 2;
        }
        int i13 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18) | ((bArr3[b12] << 24) >>> 24);
        bArr2[i10] = (byte) (i13 >> 16);
        bArr2[i10 + 1] = (byte) (i13 >> 8);
        bArr2[i10 + 2] = (byte) i13;
        int i14 = f2629 + 49;
        f2632 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 37 / 0;
        }
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r12 <= 1) goto L22;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] m2795(byte[] r19, int r20, int r21, byte[] r22) throws com.ironsource.adqualitysdk.sdk.i.id {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ic.m2795(byte[], int, int, byte[]):byte[]");
    }
}
