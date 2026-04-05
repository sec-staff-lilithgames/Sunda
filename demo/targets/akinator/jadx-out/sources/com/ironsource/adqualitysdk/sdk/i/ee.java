package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class ee {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2135 = -3316788841076341711L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2136 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2137;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Cdo f2138;

    public ee(Cdo cdo) {
        this.f2138 = cdo;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2471(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2135, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2135));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﻛ */
    public abstract du mo2440(ds dsVar, cp cpVar);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return r0;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.du m2473(com.ironsource.adqualitysdk.sdk.i.ds r4, com.ironsource.adqualitysdk.sdk.i.cp r5) {
        /*
            r3 = this;
            r0 = r3
        L1:
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.mo2440(r4, r5)
            if (r0 == 0) goto L32
            int r1 = com.ironsource.adqualitysdk.sdk.i.ee.f2136
            int r1 = r1 + 7
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f2137 = r1
            java.lang.Object r1 = r0.m2437()
            boolean r1 = r1 instanceof com.ironsource.adqualitysdk.sdk.i.ee
            if (r1 == 0) goto L32
            int r1 = com.ironsource.adqualitysdk.sdk.i.ee.f2137
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f2136 = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L2a
            java.lang.Object r0 = r0.m2437()
            com.ironsource.adqualitysdk.sdk.i.ee r0 = (com.ironsource.adqualitysdk.sdk.i.ee) r0
            goto L1
        L2a:
            java.lang.Object r4 = r0.m2437()
            com.ironsource.adqualitysdk.sdk.i.ee r4 = (com.ironsource.adqualitysdk.sdk.i.ee) r4
            r4 = 0
            throw r4
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ee.m2473(com.ironsource.adqualitysdk.sdk.i.ds, com.ironsource.adqualitysdk.sdk.i.cp):com.ironsource.adqualitysdk.sdk.i.du");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m2475() {
        int i10 = f2137;
        f2136 = (i10 + 39) % 128;
        Cdo cdo = this.f2138;
        if (cdo == null) {
            return -1;
        }
        f2136 = (i10 + 23) % 128;
        int iM2352 = cdo.m2352();
        f2137 = (f2136 + 99) % 128;
        return iM2352;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m2472(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        f2136 = (f2137 + 13) % 128;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            if (!z10) {
                int i11 = f2137 + 99;
                f2136 = i11 % 128;
                sb2.append(m2471("쎻쎗紎㤟瀓鎕", i11 % 2 == 0 ? 1 >> Color.alpha(0) : Color.alpha(0) + 1).intern());
            }
            if (obj instanceof String) {
                sb2.append(m2471("醢醀㙔뙌\uf086", TextUtils.getCapsMode("", 0, 0) + 1).intern());
                sb2.append(obj);
                sb2.append(m2471("醢醀㙔뙌\uf086", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern());
            } else {
                sb2.append(obj);
            }
            i10++;
            z10 = false;
        }
        return sb2.toString();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m2474() {
        f2137 = (f2136 + 103) % 128;
        if (this.f2138 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2471("癨癈롫賎ﰻӘ櫖曁ꢫ鶊ꙥ筚垏駦괒", -MotionEvent.axisFromString("")).intern());
        sb2.append(this.f2138);
        String string = sb2.toString();
        int i10 = f2137 + 21;
        f2136 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
