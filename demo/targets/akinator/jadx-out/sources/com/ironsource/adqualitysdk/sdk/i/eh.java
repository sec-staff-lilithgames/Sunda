package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class eh extends ee {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2150 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2151 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2152 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2153 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2154 = 3970;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee f2155;

    public eh(ee eeVar, Cdo cdo) {
        super(cdo);
        this.f2155 = eeVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2481(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f2152) ^ f2153) ^ f2154);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            f2151 = (f2150 + 3) % 128;
            return true;
        }
        if (obj != null && eh.class == obj.getClass()) {
            eh ehVar = (eh) obj;
            ee eeVar = this.f2155;
            if (eeVar != null) {
                int i10 = f2151 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f2150 = i10 % 128;
                int i11 = i10 % 2;
                ee eeVar2 = ehVar.f2155;
                if (i11 != 0) {
                    return eeVar.equals(eeVar2);
                }
                eeVar.equals(eeVar2);
                throw null;
            }
            if (ehVar.f2155 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (f2151 + 93) % 128;
        f2150 = i10;
        ee eeVar = this.f2155;
        if (eeVar == null) {
            return 0;
        }
        f2151 = (i10 + 51) % 128;
        int iHashCode = eeVar.hashCode();
        int i11 = f2151 + 75;
        f2150 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 92 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2481("ĸ\uf3f0\uf3c8⫋", (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52211), "㘰", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 923537407, "\u0000\u0000\u0000\u0000").intern());
        sb2.append(this.f2155);
        String strI = com.google.android.gms.internal.play_billing.a.i(m2481("鄦藛괱籔", (char) (KeyEvent.getDeadChar(0, 0) + 21677), "⚠", 830856080 - MotionEvent.axisFromString(""), "\u0000\u0000\u0000\u0000"), sb2);
        int i10 = f2151 + 59;
        f2150 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 63 / 0;
        }
        return strI;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        f2150 = (f2151 + 13) % 128;
        du duVarM2473 = this.f2155.m2473(dsVar, cpVar);
        f2150 = (f2151 + 97) % 128;
        return duVarM2473;
    }
}
