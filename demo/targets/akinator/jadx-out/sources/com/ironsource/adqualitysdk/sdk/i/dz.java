package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dz extends ee {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2099 = true;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2100 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2101 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2102 = {'E', 'b'};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2103 = 37;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2104 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private em f2105;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ee f2106;

    public dz(em emVar, ee eeVar, Cdo cdo) {
        super(cdo);
        this.f2105 = emVar;
        this.f2106 = eeVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2459(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2102;
                int i11 = f2103;
                if (f2099) {
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
                if (f2104) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            f2101 = (f2100 + 21) % 128;
            return true;
        }
        if (obj == null || dz.class != obj.getClass()) {
            return false;
        }
        dz dzVar = (dz) obj;
        em emVar = this.f2105;
        if (emVar == null ? dzVar.f2105 != null : !emVar.equals(dzVar.f2105)) {
            return false;
        }
        ee eeVar = this.f2106;
        if (eeVar != null) {
            f2100 = (f2101 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            return eeVar.equals(dzVar.f2106);
        }
        if (dzVar.f2106 == null) {
            return true;
        }
        int i10 = f2100 + 15;
        f2101 = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i10 = (f2100 + 79) % 128;
        f2101 = i10;
        em emVar = this.f2105;
        int iHashCode2 = 0;
        if (emVar != null) {
            iHashCode = emVar.hashCode();
            f2100 = (f2101 + 115) % 128;
        } else {
            f2100 = (i10 + 115) % 128;
            iHashCode = 0;
        }
        int i11 = iHashCode * 31;
        ee eeVar = this.f2106;
        if (eeVar != null) {
            f2101 = (f2100 + 17) % 128;
            iHashCode2 = eeVar.hashCode();
        }
        return i11 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2105);
        sb2.append(m2459(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, "\u0081\u0082\u0081").intern());
        sb2.append(this.f2106);
        String string = sb2.toString();
        f2101 = (f2100 + 35) % 128;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        f2101 = (f2100 + 15) % 128;
        du duVarM2473 = this.f2106.m2473(dsVar, cpVar);
        dsVar.m2419(this.f2105.m2492(), duVarM2473.m2437());
        f2100 = (f2101 + 61) % 128;
        return duVarM2473;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final em m2460() {
        int i10 = f2100 + 105;
        f2101 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2105;
        }
        int i11 = 28 / 0;
        return this.f2105;
    }
}
