package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class ej extends ee {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2160 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f2161 = true;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2162 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2163 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2164 = 296;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2165 = {387, 389};

    /* renamed from: ｋ, reason: contains not printable characters */
    private ee f2166;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee f2167;

    public ej(ee eeVar, ee eeVar2, Cdo cdo) {
        super(cdo);
        this.f2167 = eeVar;
        this.f2166 = eeVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r2.equals(r5.f2167) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r5.f2167 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        r2 = r4.f2166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ej.f2162 = (com.ironsource.adqualitysdk.sdk.i.ej.f2160 + 37) % 128;
        r5 = r2.equals(r5.f2166);
        r0 = com.ironsource.adqualitysdk.sdk.i.ej.f2162 + 17;
        com.ironsource.adqualitysdk.sdk.i.ej.f2160 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if ((r0 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r5.f2166 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ej.f2160 = (com.ironsource.adqualitysdk.sdk.i.ej.f2162 + 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L5b
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L5b
        L12:
            com.ironsource.adqualitysdk.sdk.i.ej r5 = (com.ironsource.adqualitysdk.sdk.i.ej) r5
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f2167
            if (r2 == 0) goto L29
            int r3 = com.ironsource.adqualitysdk.sdk.i.ej.f2162
            int r3 = r3 + 3
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f2160 = r3
            com.ironsource.adqualitysdk.sdk.i.ee r3 = r5.f2167
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2e
            goto L2d
        L29:
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r5.f2167
            if (r2 == 0) goto L2e
        L2d:
            return r1
        L2e:
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f2166
            if (r2 == 0) goto L4f
            int r0 = com.ironsource.adqualitysdk.sdk.i.ej.f2160
            int r0 = r0 + 37
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f2162 = r0
            com.ironsource.adqualitysdk.sdk.i.ee r5 = r5.f2166
            boolean r5 = r2.equals(r5)
            int r0 = com.ironsource.adqualitysdk.sdk.i.ej.f2162
            int r0 = r0 + 17
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f2160 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L4d
            return r5
        L4d:
            r5 = 0
            throw r5
        L4f:
            com.ironsource.adqualitysdk.sdk.i.ee r5 = r5.f2166
            if (r5 != 0) goto L5b
            int r5 = com.ironsource.adqualitysdk.sdk.i.ej.f2162
            int r5 = r5 + r0
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f2160 = r5
            return r0
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ej.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ej.f2162
            int r1 = r0 + 13
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f2160 = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 != 0) goto L15
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r5.f2167
            r3 = 99
            int r3 = r3 / r2
            if (r1 == 0) goto L26
            goto L19
        L15:
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r5.f2167
            if (r1 == 0) goto L26
        L19:
            int r0 = r0 + 119
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f2160 = r0
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r5.f2167
            int r0 = r0.hashCode()
            goto L27
        L26:
            r0 = r2
        L27:
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r5.f2166
            if (r1 == 0) goto L46
            int r3 = com.ironsource.adqualitysdk.sdk.i.ej.f2162
            int r3 = r3 + 67
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f2160 = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L42
            int r1 = r1.hashCode()
            r3 = 70
            int r3 = r3 / r2
            r2 = r1
            goto L46
        L42:
            int r2 = r1.hashCode()
        L46:
            int r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ej.hashCode():int");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2485().toString());
        sb2.append(m2484(null, 127 - TextUtils.getOffsetBefore("", 0), null, "\u0081").intern());
        sb2.append(m2486().toString());
        String strI = com.google.android.gms.internal.play_billing.a.i(m2484(null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, null, "\u0082"), sb2);
        int i10 = f2162 + 95;
        f2160 = i10 % 128;
        if (i10 % 2 != 0) {
            return strI;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ee m2485() {
        int i10 = f2162;
        int i11 = i10 + 55;
        f2160 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        ee eeVar = this.f2167;
        int i12 = i10 + 57;
        f2160 = i12 % 128;
        if (i12 % 2 != 0) {
            return eeVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ee m2486() {
        int i10 = (f2160 + 75) % 128;
        f2162 = i10;
        ee eeVar = this.f2166;
        int i11 = i10 + 75;
        f2160 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 96 / 0;
        }
        return eeVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2484(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2165;
                int i11 = f2164;
                if (f2161) {
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
                if (f2163) {
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
}
