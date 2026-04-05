package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class fo extends fr {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2253 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2254 = {859732408, 1614578408, 873075883, 383878866, -712237202, -1737379884, -1967363732, -235926320, 1629569907, 1360839406, -596225569, -630482873, 349544504, 334753471, 550135799, 1195138204, 7664139, -1751550761};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2255;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ee f2256;

    public fo(ee eeVar) {
        this.f2256 = eeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.fo.f2255
            int r1 = r0 + 105
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fo.f2253 = r2
            int r1 = r1 % 2
            r3 = 0
            if (r1 == 0) goto L67
            r1 = 1
            if (r6 != r7) goto L1c
            int r0 = r0 + 63
            int r7 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fo.f2253 = r7
            int r0 = r0 % 2
            if (r0 == 0) goto L1b
            return r1
        L1b:
            throw r3
        L1c:
            r0 = 0
            if (r7 == 0) goto L66
            int r2 = r2 + 81
            int r4 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.fo.f2255 = r4
            int r2 = r2 % 2
            if (r2 == 0) goto L37
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r4 = r7.getClass()
            r5 = 52
            int r5 = r5 / r0
            if (r2 == r4) goto L42
            goto L66
        L37:
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r4 = r7.getClass()
            if (r2 == r4) goto L42
            goto L66
        L42:
            com.ironsource.adqualitysdk.sdk.i.fo r7 = (com.ironsource.adqualitysdk.sdk.i.fo) r7
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r6.f2256
            if (r2 == 0) goto L61
            int r0 = com.ironsource.adqualitysdk.sdk.i.fo.f2255
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fo.f2253 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L5b
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f2256
            boolean r7 = r2.equals(r7)
            return r7
        L5b:
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f2256
            r2.equals(r7)
            throw r3
        L61:
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f2256
            if (r7 != 0) goto L66
            return r1
        L66:
            return r0
        L67:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ee eeVar = this.f2256;
        if (eeVar == null) {
            return 0;
        }
        int i10 = f2255 + 49;
        f2253 = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode = eeVar.hashCode();
        if (i11 == 0) {
            int i12 = 39 / 0;
        }
        f2255 = (f2253 + 59) % 128;
        return iHashCode;
    }

    public String toString() {
        int i10 = f2255 + 51;
        f2253 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f2256 == null) {
            return m2516(new int[]{-452054545, -1358511187}, View.resolveSize(0, 0) + 1).intern();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2256);
        String strI = com.google.android.gms.internal.play_billing.a.i(m2516(new int[]{-452054545, -1358511187}, KeyEvent.normalizeMetaState(0) + 1), sb2);
        int i11 = f2255 + 51;
        f2253 = i11 % 128;
        if (i11 % 2 != 0) {
            return strI;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* renamed from: ﻐ */
    public du mo2509(ds dsVar, cp cpVar) {
        int i10 = f2253;
        f2255 = (i10 + 103) % 128;
        ee eeVar = this.f2256;
        if (eeVar == null) {
            return new du(null);
        }
        int i11 = i10 + 19;
        f2255 = i11 % 128;
        if (i11 % 2 != 0) {
            eeVar.m2473(dsVar, cpVar);
            throw null;
        }
        du duVarM2473 = eeVar.m2473(dsVar, cpVar);
        f2253 = (f2255 + 111) % 128;
        return duVarM2473;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ee m2517() {
        int i10 = f2255 + 19;
        f2253 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2256;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2516(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2254.clone();
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
}
