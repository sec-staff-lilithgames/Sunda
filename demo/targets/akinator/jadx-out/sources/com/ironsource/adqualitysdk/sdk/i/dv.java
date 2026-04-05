package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dv extends ee {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2066 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2067 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2068 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2069 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2070 = 31941;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f2071;

    public dv(String str, Cdo cdo) {
        super(cdo);
        this.f2071 = dy.m2458(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.dv.class == r5.getClass()) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r5 = (com.ironsource.adqualitysdk.sdk.i.dv) r5;
        r0 = r4.f2071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.dv.f2066 = (com.ironsource.adqualitysdk.sdk.i.dv.f2067 + 93) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return r0.equals(r5.f2071);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r5.f2071 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.dv.f2067 = (r0 + 107) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dv.f2066
            int r1 = r0 + 67
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.dv.f2067 = r2
            int r1 = r1 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = 99
            int r1 = r1 / r3
            if (r4 != r5) goto L1d
            goto L16
        L14:
            if (r4 != r5) goto L1d
        L16:
            int r0 = r0 + 107
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dv.f2067 = r0
            return r2
        L1d:
            if (r5 == 0) goto L42
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.dv> r0 = com.ironsource.adqualitysdk.sdk.i.dv.class
            java.lang.Class r1 = r5.getClass()
            if (r0 == r1) goto L28
            goto L42
        L28:
            com.ironsource.adqualitysdk.sdk.i.dv r5 = (com.ironsource.adqualitysdk.sdk.i.dv) r5
            java.lang.String r0 = r4.f2071
            if (r0 == 0) goto L3d
            int r1 = com.ironsource.adqualitysdk.sdk.i.dv.f2067
            int r1 = r1 + 93
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.dv.f2066 = r1
            java.lang.String r5 = r5.f2071
            boolean r5 = r0.equals(r5)
            return r5
        L3d:
            java.lang.String r5 = r5.f2071
            if (r5 != 0) goto L42
            return r2
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f2071;
        if (str == null) {
            f2067 = (f2066 + 41) % 128;
            return 0;
        }
        int i10 = f2067 + 91;
        f2066 = i10 % 128;
        if (i10 % 2 == 0) {
            str.hashCode();
            throw null;
        }
        int iHashCode = str.hashCode();
        int i11 = f2067 + 97;
        f2066 = i11 % 128;
        if (i11 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i10 = f2067 + 97;
        f2066 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2071;
        }
        int i11 = 18 / 0;
        return this.f2071;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final du mo2440(ds dsVar, cp cpVar) {
        du duVar = new du(cpVar.m2017().m1166(ka.m3166(this.f2071, m2439("恤夣ڃ垡", (char) (41222 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\ue78cᏏ\ue29c\ue353蓪䪁", ViewConfiguration.getDoubleTapTimeout() >> 16, "\u0000\u0000\u0000\u0000").intern())));
        int i10 = f2066 + 69;
        f2067 = i10 % 128;
        if (i10 % 2 == 0) {
            return duVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2439(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f2068) ^ f2069) ^ f2070);
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
