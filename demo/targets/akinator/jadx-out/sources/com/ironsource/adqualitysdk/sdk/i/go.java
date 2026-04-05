package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.moloco.sdk.publisher.Moloco;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class go extends gk {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2383 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2384;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2382 = {'c', 64785, 64145, 63572, 62869, 62233, 61592, 60957, 60307, 59649, 59074, 58393, 57740, 57101, 56522, 55826, 55189, 54588, 53936, 53299, 52651, 52030, 51377, 50720, 50174, 49411, 48803, 48166, 47527, 46885, 46251, 30926, 34226, 33331, 32950, 36152, 35770};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2385 = 291457814825139582L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2384 = (f2383 + 15) % 128;
        String strIntern = m2551((char) (30883 - (Process.myPid() >> 22)), 6 - TextUtils.indexOf("", ""), 31 - (Process.myTid() >> 22)).intern();
        int i10 = f2383 + 7;
        f2384 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = (f2383 + 51) % 128;
        f2384 = i10;
        f2383 = (i10 + 25) % 128;
        return Moloco.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bu buVar = new bu(mo2524());
        int i10 = f2383 + 41;
        f2384 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 80 / 0;
        }
        return buVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        f2383 = (f2384 + 99) % 128;
        String strIntern = m2551((char) (Process.myPid() >> 22), (Process.myPid() >> 22) + 31, ViewConfiguration.getTapTimeout() >> 16).intern();
        f2383 = (f2384 + 35) % 128;
        return strIntern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2551(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2382[i11 + i12] ^ (i12 * f2385)) ^ c10);
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
