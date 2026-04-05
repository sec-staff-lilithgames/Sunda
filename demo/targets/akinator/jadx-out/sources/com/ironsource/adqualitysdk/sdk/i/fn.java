package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fn extends fr {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2251 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2252;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2250 = {38177, 47144, 53012, 4713, 8524, 29701};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2249 = 626892188336008473L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2515(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2250[i11 + i12] ^ (i12 * f2249)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final String toString() {
        f2252 = (f2251 + 11) % 128;
        String strIntern = m2515((char) ((Process.myPid() >> 22) + 38211), 6 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1).intern();
        f2252 = (f2251 + 89) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* renamed from: ﻐ */
    public final du mo2509(ds dsVar, cp cpVar) {
        du duVar = new du(null);
        duVar.m2431();
        f2252 = (f2251 + 71) % 128;
        return duVar;
    }
}
