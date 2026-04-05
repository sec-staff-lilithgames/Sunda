package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.chartboost.sdk.Chartboost;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gh extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2349 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2350 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2351 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2352 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2353 = 42668;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2351 = (f2350 + 15) % 128;
        String strIntern = m2542("員廳징믓", (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "낡❲Մ翃\ue921䫛掸ﰳ\ue0f8\udea6", View.MeasureSpec.getMode(0), "\u0000\u0000\u0000\u0000").intern();
        f2351 = (f2350 + 1) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = (f2351 + 19) % 128;
        f2350 = i10;
        int i11 = i10 + 51;
        f2351 = i11 % 128;
        if (i11 % 2 != 0) {
            return Chartboost.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bj bjVar = new bj(mo2524());
        f2350 = (f2351 + 63) % 128;
        return bjVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        char c10;
        int maximumDrawingCacheSize;
        int i10 = f2351 + 3;
        f2350 = i10 % 128;
        if (i10 % 2 != 0) {
            c10 = (char) (45518 >> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() + 36;
        } else {
            c10 = (char) (45518 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
        }
        return m2542("룉広캞낱", c10, "\ue213㜌똌砕ፋ쑾ᢠ䧧ﻎ꺩쥕\uf07c\uf15d㺻ᢰ\ueade鋄숧뽖\ue877Ɋ붴夶鶈\uf19f灚㍰뭗렆", (-1637973064) - maximumDrawingCacheSize, "\u0000\u0000\u0000\u0000").intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2542(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f2349) ^ f2352) ^ f2353);
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
