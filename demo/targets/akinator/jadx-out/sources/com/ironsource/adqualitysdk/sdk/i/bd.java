package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.ironsource.adqualitysdk.sdk.i.bg;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bd extends bg {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f957 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f959;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f958 = {36111, 42573, 56217, 3283, 8226, 21858, 36536};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f956 = -2157842704576206007L;

    public bd(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean mo1154() {
        int i10 = f957 + 33;
        f959 = i10 % 128;
        return i10 % 2 == 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        char cAxisFromString;
        int i10;
        int i11 = f957 + 73;
        f959 = i11 % 128;
        if (i11 % 2 != 0) {
            cAxisFromString = (char) (36169 % MotionEvent.axisFromString(""));
            i10 = 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
        } else {
            cAxisFromString = (char) (36169 - MotionEvent.axisFromString(""));
            i10 = 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
        }
        return m1153(cAxisFromString, i10, TextUtils.getTrimmedLength("")).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        int i10 = f959 + 19;
        int i11 = i10 % 128;
        f957 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = i11 + 15;
        f959 = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        f959 = (f957 + 47) % 128;
        return map;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1153(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f958[i11 + i12] ^ (i12 * f956)) ^ c10);
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
