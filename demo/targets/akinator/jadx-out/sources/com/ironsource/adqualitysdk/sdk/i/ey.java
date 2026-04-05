package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ey extends en {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2204 = {'-'};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2205 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2206 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2207 = 1;

    public ey(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        f2205 = (f2207 + 31) % 128;
        String strIntern = m2502(-TextUtils.lastIndexOf("", '0'), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), "¢").intern();
        int i10 = f2207 + 21;
        f2205 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* renamed from: ﾒ */
    public final Number mo2493(Number number, Number number2) {
        int i10 = f2205 + 57;
        f2207 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number.doubleValue() - number2.doubleValue());
        }
        if ((number instanceof Long) || (number2 instanceof Long)) {
            Long lValueOf = Long.valueOf(number.longValue() - number2.longValue());
            int i11 = f2207 + 5;
            f2205 = i11 % 128;
            if (i11 % 2 == 0) {
                return lValueOf;
            }
            throw null;
        }
        Integer numValueOf = Integer.valueOf(number.intValue() - number2.intValue());
        int i12 = f2207 + 55;
        f2205 = i12 % 128;
        if (i12 % 2 == 0) {
            return numValueOf;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2502(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f2204;
                char c10 = f2206;
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
}
