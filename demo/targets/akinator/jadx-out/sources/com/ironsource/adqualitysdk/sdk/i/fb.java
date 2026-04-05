package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fb extends en {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2218 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2219 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2220 = {'/'};

    public fb(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2505(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f2220, i10, cArr, 0, i11);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        f2219 = (f2218 + 61) % 128;
        String strIntern = m2505("\u0001", false, new int[]{0, 1, 53, 1}).intern();
        f2218 = (f2219 + 11) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* renamed from: ﾒ */
    public final Number mo2493(Number number, Number number2) {
        if (!(number instanceof Double)) {
            int i10 = (f2218 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
            f2219 = i10;
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    f2218 = (i10 + 59) % 128;
                    if (!(number2 instanceof Long)) {
                        return Integer.valueOf(number2.intValue() * number.intValue());
                    }
                }
                return Long.valueOf(number2.longValue() * number.longValue());
            }
        }
        return Double.valueOf(number2.doubleValue() * number.doubleValue());
    }
}
