package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ek extends eg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2168 = 24;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2169 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2170 = 1;

    public ek(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2487(int i10, int i11, String str, int i12, boolean z10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (e.f2108) {
            try {
                char[] cArr2 = new char[i11];
                e.f2107 = 0;
                while (true) {
                    int i13 = e.f2107;
                    if (i13 >= i11) {
                        break;
                    }
                    e.f2110 = cArr[i13];
                    cArr2[e.f2107] = (char) (e.f2110 + i10);
                    int i14 = e.f2107;
                    cArr2[i14] = (char) (cArr2[i14] - f2168);
                    e.f2107 = i14 + 1;
                }
                if (i12 > 0) {
                    e.f2109 = i12;
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr2, 0, cArr3, 0, i11);
                    int i15 = e.f2109;
                    System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                    int i16 = e.f2109;
                    System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    e.f2107 = 0;
                    while (true) {
                        int i17 = e.f2107;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i11 - i17) - 1];
                        e.f2107 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        return new du(Boolean.valueOf(m2480().m2473(dsVar, cpVar).m2434() && m2478().m2473(dsVar, cpVar).m2434()));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        f2170 = (f2169 + 87) % 128;
        String strIntern = m2487((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 62, 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0000\u0000", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true).intern();
        f2169 = (f2170 + 45) % 128;
        return strIntern;
    }
}
