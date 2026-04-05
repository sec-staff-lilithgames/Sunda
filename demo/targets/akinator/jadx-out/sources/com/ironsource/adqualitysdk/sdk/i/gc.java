package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gc extends gk {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2322 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2323;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2321 = {8357, 52844, 64801, 60583, 39867, 35181, 47159, 42955, 22173, 17476, 29441, 25283, 4505, 162, 11822, 56620, 52466, 64418, 59753, 38968, 34766, 46726, 42076, 21260, 17101, 29087, 24751, 3631, 15673, 11507, 56251, 51507, 63535, 59345, 38531, 33863, 45857, 41680, 20877, 16567, 28269, 7470, 3285, 15285, 10571, 55314, 51137, 63105, 58463, 37639, 33477, 1576, 59624, 56242, 51829, 48437, 45041, 40613, 33103, 28677, 25297, 21903, 17495, 14105, 9787};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2320 = -8808215556371845435L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int i10 = f2322 + 91;
        f2323 = i10 % 128;
        String strIntern = (i10 % 2 != 0 ? m2535((char) (9430 % View.getDefaultSize(1, 0)), 71 % View.resolveSizeAndState(1, 0, 0), 125 - (ViewConfiguration.getTapTimeout() % 7)) : m2535((char) (1609 - View.getDefaultSize(0, 0)), 14 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 51)).intern();
        int i11 = f2322 + 19;
        f2323 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2323 + 55;
        f2322 = i10 % 128;
        if (i10 % 2 != 0) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bh bhVar = new bh(mo2524());
        f2322 = (f2323 + 53) % 128;
        return bhVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        char cNormalizeMetaState;
        int doubleTapTimeout;
        int minimumFlingVelocity;
        int i10 = f2322 + 5;
        f2323 = i10 % 128;
        if (i10 % 2 != 0) {
            cNormalizeMetaState = (char) (2487 << KeyEvent.normalizeMetaState(0));
            doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() * 7747;
            minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() + 40;
        } else {
            cNormalizeMetaState = (char) (8390 - KeyEvent.normalizeMetaState(0));
            doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 51;
            minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
        }
        String strIntern = m2535(cNormalizeMetaState, doubleTapTimeout, minimumFlingVelocity).intern();
        f2322 = (f2323 + 47) % 128;
        return strIntern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2535(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2321[i11 + i12] ^ (i12 * f2320)) ^ c10);
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
