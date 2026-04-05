package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ev extends eo {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2196 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2198;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2199 = {50901, 16311};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2197 = 5403202663872788835L;

    public ev(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        f2196 = (f2198 + 105) % 128;
        String strIntern = m2500((char) (50921 - Color.red(0)), 3 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0)).intern();
        f2196 = (f2198 + 57) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ｋ */
    public final boolean mo2489(int i10) {
        int i11 = f2198 + 115;
        int i12 = i11 % 128;
        f2196 = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (i10 <= 0) {
            return true;
        }
        f2198 = (i12 + 33) % 128;
        return false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2500(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2199[i11 + i12] ^ (i12 * f2197)) ^ c10);
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
}
