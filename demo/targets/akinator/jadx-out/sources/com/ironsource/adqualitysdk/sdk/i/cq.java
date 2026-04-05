package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.i.cm;
import com.ironsource.adqualitysdk.sdk.i.hz;
import io.ktor.util.date.GMTDateParser;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class cq {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private cm f1698;

    /* renamed from: ｋ, reason: contains not printable characters */
    private hz.a f1699;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private List<String> f1700;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private int f1701;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final hz m2066(ia iaVar) {
        return this.f1699.m2756(iaVar, this.f1700, this.f1701);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final cm m2065() {
        return this.f1698;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends da implements ci {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f1703 = 1;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f1705 = 0;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f1708 = 6;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private cm.b f1709;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private cq f1710;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f1706 = {GMTDateParser.SECONDS, 'e', 't', GMTDateParser.MONTH, 'i', 'n', 'D', 'p', GMTDateParser.HOURS, 'F', 'o', 'r', 'C', 'c', 'k', 'S', AbstractJsonLexerKt.UNICODE_ESC, 'l', 'a', 'w', 'W', 'R', 'f', 'I', 'A', 'y', 'O', 'b', 'j', GMTDateParser.MINUTES, GMTDateParser.DAY_OF_MONTH, 'v', 'x', GMTDateParser.ZONE, AbstractJsonLexerKt.BEGIN_OBJ, '|'};

        /* renamed from: ｋ, reason: contains not printable characters */
        private static long f1707 = 0;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f1702 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char f1704 = 9283;

        public b(List<String> list, int i10) {
            cq cqVar = new cq();
            this.f1710 = cqVar;
            cqVar.f1699 = new hz.a();
            this.f1710.f1700 = list;
            this.f1710.f1701 = i10;
            this.f1709 = new cm.b();
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m2067(int i10, byte b10, String str) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (h.f2445) {
                try {
                    char[] cArr2 = f1706;
                    char c10 = f1708;
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

        /* renamed from: ﾇ, reason: contains not printable characters */
        private cq m2068() {
            cq cqVar;
            int i10 = f1703 + 91;
            f1705 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f1710.f1698 = this.f1709.m1928();
                cqVar = this.f1710;
                int i11 = 42 / 0;
            } else {
                this.f1710.f1698 = this.f1709.m1928();
                cqVar = this.f1710;
            }
            int i12 = f1705 + 13;
            f1703 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 71 / 0;
            }
            return cqVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:69:0x02e4  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ci
        /* renamed from: ﾒ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo1170(java.lang.String r20, java.util.List<java.lang.Object> r21, com.ironsource.adqualitysdk.sdk.i.ch r22) {
            /*
                Method dump skipped, instructions count: 1206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.b.mo1170(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m2069(String str, char c10, String str2, int i10, String str3) {
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
                            cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f1707) ^ f1702) ^ f1704);
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
    }
}
