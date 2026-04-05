package com.ironsource.adqualitysdk.sdk.i;

import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class hx<T> extends da implements ci, hs<T> {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2589 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2590;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private hs f2591;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Map f2592;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Collection f2593;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Object f2594;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Field f2595;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f2588 = {144, 297, 300, 290, 279, 289, 296, 290, GMTDateParser.MONTH, 154, 152, 154, 151, 144, 148, 152, 153, 133, 135, 154, 'B', 137, AbstractJsonLexerKt.BEGIN_OBJ, 'r', 131, '3', 'f', 'l', '`', 'W', GMTDateParser.HOURS, '7', 'g', 'j', GMTDateParser.SECONDS, 'p', AbstractJsonLexerKt.BEGIN_LIST, '^', 'l', 'f', 'f', GMTDateParser.DAY_OF_MONTH};

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int[] f2587 = {-1174510426, -701681626, 1333245612, 1244200790, 1098207783, 293684225, 1667433755, 322818964, 1922638686, -1704600261, 910457552, 1634534306, 146591051, -997609333, -750438280, -1586326265, 1289045300, -1151404293};

    public hx(Field field, Object obj, hs hsVar) {
        this.f2595 = field;
        this.f2594 = obj;
        this.f2591 = hsVar;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private hs m2688() {
        int i10 = f2590 + 109;
        f2589 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2591;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Object m2689() {
        int i10 = f2590;
        Object obj = this.f2594;
        int i11 = i10 + 23;
        f2589 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 97 / 0;
        }
        return obj;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private Collection m2690() {
        int i10 = f2589 + 67;
        f2590 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2593;
        }
        int i11 = 38 / 0;
        return this.f2593;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private Map m2691() {
        int i10 = (f2590 + 97) % 128;
        f2589 = i10;
        Map map = this.f2592;
        f2590 = (i10 + 93) % 128;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if ((r0 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4.f2593 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.f2593 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r0 = r0 + 45;
        com.ironsource.adqualitysdk.sdk.i.hx.f2589 = r0 % 128;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m2693() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hx.f2590
            int r1 = r0 + 109
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2589 = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 != 0) goto L15
            java.util.Collection r1 = r4.f2593
            r3 = 34
            int r3 = r3 / r2
            if (r1 == 0) goto L27
            goto L19
        L15:
            java.util.Collection r1 = r4.f2593
            if (r1 == 0) goto L27
        L19:
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2589 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L25
            r0 = 1
            return r0
        L25:
            r0 = 0
            throw r0
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.m2693():boolean");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2694(T t10) throws IllegalAccessException, IllegalArgumentException {
        if (m2695()) {
            f2589 = (f2590 + 63) % 128;
            try {
                this.f2595.set(this.f2594, t10);
                int i10 = f2590 + 15;
                f2589 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean m2697() {
        int i10 = f2589 + 81;
        int i11 = i10 % 128;
        f2590 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f2592 == null) {
            return false;
        }
        int i12 = i11 + 45;
        f2589 = i12 % 128;
        return i12 % 2 != 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hs
    /* renamed from: ｋ */
    public final T mo2643() {
        if (m2695()) {
            f2589 = (f2590 + 89) % 128;
            try {
                return (T) this.f2595.get(this.f2594);
            } catch (Exception unused) {
                return null;
            }
        }
        if (!m2693()) {
            f2589 = (f2590 + 57) % 128;
            if (!m2697()) {
                return null;
            }
        }
        return (T) this.f2594;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hs
    /* renamed from: ﾇ */
    public final Field mo2644() {
        Field field;
        int i10 = f2589 + 19;
        int i11 = i10 % 128;
        f2590 = i11;
        if (i10 % 2 != 0) {
            field = this.f2595;
            int i12 = 97 / 0;
        } else {
            field = this.f2595;
        }
        int i13 = i11 + 19;
        f2589 = i13 % 128;
        if (i13 % 2 != 0) {
            return field;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2692(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2587.clone();
                d.f1846 = 0;
                while (true) {
                    int i11 = d.f1846;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        d.f1844 = (c10 << 16) + c11;
                        d.f1847 = (c12 << 16) + c13;
                        d.m2179(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = d.f1844 ^ iArr2[i13];
                            d.f1844 = i14;
                            int iM2178 = d.m2178(i14) ^ d.f1847;
                            int i15 = d.f1844;
                            d.f1844 = iM2178;
                            d.f1847 = i15;
                        }
                        int i16 = d.f1844;
                        int i17 = d.f1847;
                        d.f1844 = i17;
                        d.f1847 = i16;
                        int i18 = i16 ^ iArr2[16];
                        d.f1847 = i18;
                        int i19 = i17 ^ iArr2[17];
                        d.f1844 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        d.m2179(iArr2);
                        int i20 = d.f1846;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        d.f1846 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if ((r7 % 2) != 0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1170(java.lang.String r7, java.util.List<java.lang.Object> r8, com.ironsource.adqualitysdk.sdk.i.ch r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.mo1170(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    public hx(Collection collection, Object obj, hs hsVar) {
        this.f2593 = collection;
        this.f2594 = obj;
        this.f2591 = hsVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m2695() {
        int i10 = f2590;
        f2589 = (i10 + 15) % 128;
        if (this.f2595 == null) {
            return false;
        }
        int i11 = i10 + 79;
        f2589 = i11 % 128;
        return i11 % 2 != 0;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2696(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f2588, i10, cArr, 0, i11);
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

    public hx(Map map, Object obj, hs hsVar) {
        this.f2592 = map;
        this.f2594 = obj;
        this.f2591 = hsVar;
    }
}
