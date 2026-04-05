package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fd extends eg {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2227 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2228 = 272;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2229 = {315};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2230 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2231 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2232 = true;

    public fd(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2507(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2229;
                int i11 = f2228;
                if (f2230) {
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
                if (f2232) {
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

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        du duVarM2473 = m2480().m2473(dsVar, cpVar);
        du duVarM24732 = m2478().m2473(dsVar, cpVar);
        if ((duVarM2473.m2437() instanceof String) || (duVarM24732.m2437() instanceof String)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(duVarM2473.m2437());
            sb2.append(duVarM24732.m2437());
            return new du(sb2.toString());
        }
        Number numberM2436 = duVarM2473.m2436();
        Number numberM24362 = duVarM24732.m2436();
        if (!(numberM2436 instanceof Double)) {
            f2231 = (f2227 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            if (!(numberM24362 instanceof Double)) {
                if ((numberM2436 instanceof Long) || (numberM24362 instanceof Long)) {
                    return new du(Long.valueOf(numberM24362.longValue() + numberM2436.longValue()));
                }
                return new du(Integer.valueOf(numberM24362.intValue() + numberM2436.intValue()));
            }
        }
        du duVar = new du(Double.valueOf(numberM24362.doubleValue() + numberM2436.doubleValue()));
        int i10 = f2231 + 77;
        f2227 = i10 % 128;
        if (i10 % 2 != 0) {
            return duVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        int i10 = f2231 + 101;
        f2227 = i10 % 128;
        String strIntern = m2507(null, i10 % 2 == 0 ? 19 << (ViewConfiguration.getMinimumFlingVelocity() - 103) : (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, null, "\u0081").intern();
        f2227 = (f2231 + 61) % 128;
        return strIntern;
    }
}
