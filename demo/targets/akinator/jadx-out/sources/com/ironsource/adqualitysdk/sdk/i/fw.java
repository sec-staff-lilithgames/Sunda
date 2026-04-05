package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fw extends fr {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2289 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2290 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f2291 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2292 = 52;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2293 = {171, 156, 157, 160, 153, 'T', AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.END_LIST};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2294 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ee f2295;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private fr f2296;

    public fw(ee eeVar, fr frVar) {
        this.f2295 = eeVar;
        this.f2296 = frVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2529(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.f3159) {
            try {
                char[] cArr2 = f2293;
                int i11 = f2292;
                if (f2291) {
                    int length = bArr.length;
                    m.f3157 = length;
                    char[] cArr3 = new char[length];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i12 = m.f3158;
                        int i13 = m.f3157 - 1;
                        int i14 = m.f3158;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3158 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2294) {
                    int length2 = cArr.length;
                    m.f3157 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i15 = m.f3158;
                        int i16 = m.f3157 - 1;
                        int i17 = m.f3158;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3158 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3157 = length3;
                char[] cArr5 = new char[length3];
                m.f3158 = 0;
                while (m.f3158 < m.f3157) {
                    int i18 = m.f3158;
                    int i19 = m.f3157 - 1;
                    int i20 = m.f3158;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3158 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r5.f2295 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto Lc
            int r5 = com.ironsource.adqualitysdk.sdk.i.fw.f2290
            int r5 = r5 + 19
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.fw.f2289 = r5
            return r0
        Lc:
            r1 = 0
            if (r5 == 0) goto L4b
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.fw> r2 = com.ironsource.adqualitysdk.sdk.i.fw.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L18
            goto L4b
        L18:
            com.ironsource.adqualitysdk.sdk.i.fw r5 = (com.ironsource.adqualitysdk.sdk.i.fw) r5
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f2295
            if (r2 == 0) goto L2f
            com.ironsource.adqualitysdk.sdk.i.ee r3 = r5.f2295
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L34
            int r5 = com.ironsource.adqualitysdk.sdk.i.fw.f2290
            int r5 = r5 + 25
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.fw.f2289 = r5
            goto L33
        L2f:
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r5.f2295
            if (r2 == 0) goto L34
        L33:
            return r1
        L34:
            com.ironsource.adqualitysdk.sdk.i.fr r2 = r4.f2296
            com.ironsource.adqualitysdk.sdk.i.fr r5 = r5.f2296
            if (r2 == 0) goto L3f
            boolean r5 = r2.equals(r5)
            return r5
        L3f:
            if (r5 != 0) goto L42
            return r0
        L42:
            int r5 = com.ironsource.adqualitysdk.sdk.i.fw.f2289
            int r5 = r5 + 59
        L46:
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.fw.f2290 = r5
            return r1
        L4b:
            int r5 = com.ironsource.adqualitysdk.sdk.i.fw.f2289
            int r5 = r5 + 35
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        ee eeVar = this.f2295;
        int iHashCode2 = 0;
        if (eeVar != null) {
            f2290 = (f2289 + 63) % 128;
            iHashCode = eeVar.hashCode();
            f2289 = (f2290 + 15) % 128;
        } else {
            iHashCode = 0;
        }
        int i10 = iHashCode * 31;
        fr frVar = this.f2296;
        if (frVar != null) {
            int i11 = f2289 + 33;
            f2290 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 20 / 0;
                iHashCode2 = frVar.hashCode();
            } else {
                iHashCode2 = frVar.hashCode();
            }
        }
        int i13 = i10 + iHashCode2;
        f2289 = (f2290 + 113) % 128;
        return i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2529(null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, "\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
        sb2.append(this.f2295);
        sb2.append(m2529(null, 127 - (ViewConfiguration.getTapTimeout() >> 16), null, "\u0086\u0088").intern());
        sb2.append(this.f2296);
        String string = sb2.toString();
        int i10 = f2289 + 13;
        f2290 = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* renamed from: ﻐ */
    public final du mo2509(ds dsVar, cp cpVar) {
        while (this.f2295.m2473(dsVar, cpVar).m2434()) {
            du duVarMo2509 = this.f2296.mo2509(dsVar, cpVar);
            if (duVarMo2509.m2438()) {
                break;
            }
            f2290 = (f2289 + 107) % 128;
            if (duVarMo2509.m2435()) {
                return duVarMo2509;
            }
        }
        du duVar = new du(null);
        int i10 = f2290 + 21;
        f2289 = i10 % 128;
        if (i10 % 2 != 0) {
            return duVar;
        }
        throw null;
    }
}
