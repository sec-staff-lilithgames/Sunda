package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.hyprmx.android.sdk.placement.PlacementType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gi extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2354 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2355 = {'c', 35786, 5927, 41665, 12028, 47680, 17838, 53745, 23877, 59573, 29788, 'v', 35794, 5893, 41844, 11972, 47673, 17809, 53684, 23884, 59520, 29922, 0, 35747, 5908, 41852, 11937, 47618, 18017, 53716, 23864, 59535, 29838, 21, 35718, 6126, 41815, 11964, 47635, 17990, 53670, 23833, 59718, 29902, AbstractJsonLexerKt.COMMA, 35940, 65375, 29931, 59405, 23978, 53710, 17782};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2356 = -9163474123766461531L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2357 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2357 = (f2354 + 95) % 128;
        String strIntern = m2543((char) (Color.red(0) + 65335), ImageFormat.getBitsPerPixel(0) + 7, 46 - KeyEvent.keyCodeFromString("")).intern();
        int i10 = f2354 + 31;
        f2357 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2354;
        f2357 = (i10 + 15) % 128;
        int i11 = i10 + 111;
        f2357 = i11 % 128;
        if (i11 % 2 != 0) {
            return PlacementType.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bq bqVar = new bq(mo2524());
        int i10 = f2354 + 105;
        f2357 = i10 % 128;
        if (i10 % 2 != 0) {
            return bqVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        char absoluteGravity;
        int keyRepeatTimeout;
        int gidForName;
        int i10 = f2357 + 113;
        f2354 = i10 % 128;
        if (i10 % 2 != 0) {
            absoluteGravity = (char) Gravity.getAbsoluteGravity(1, 1);
            keyRepeatTimeout = 85 >> (ViewConfiguration.getKeyRepeatTimeout() - 81);
            gidForName = 1 << Process.getGidForName("");
        } else {
            absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
            keyRepeatTimeout = 46 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            gidForName = Process.getGidForName("") + 1;
        }
        String strIntern = m2543(absoluteGravity, keyRepeatTimeout, gidForName).intern();
        int i11 = f2357 + 51;
        f2354 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2543(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2355[i11 + i12] ^ (i12 * f2356)) ^ c10);
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
