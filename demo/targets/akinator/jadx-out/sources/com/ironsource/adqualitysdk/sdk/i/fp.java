package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fp extends fr {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f2257 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2258 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2259 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2260 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2261 = -4804290414751191468L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private fr f2262;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ee f2263;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ee f2264;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee f2265;

    public fp(ee eeVar, ee eeVar2, ee eeVar3, fr frVar) {
        this.f2264 = eeVar;
        this.f2263 = eeVar2;
        this.f2265 = eeVar3;
        this.f2262 = frVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static du m2518(ee eeVar, ds dsVar, cp cpVar) {
        int i10 = f2260;
        int i11 = i10 + 93;
        f2258 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (eeVar != null) {
            f2258 = (i10 + 21) % 128;
            return eeVar.m2473(dsVar, cpVar);
        }
        du duVar = new du(null);
        int i12 = f2260 + 57;
        f2258 = i12 % 128;
        if (i12 % 2 != 0) {
            return duVar;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2519(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f2261) ^ f2259) ^ f2257);
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
        f2258 = (f2260 + 97) % 128;
        if (this == obj) {
            return true;
        }
        if (obj == null || fp.class != obj.getClass()) {
            f2260 = (f2258 + 27) % 128;
            return false;
        }
        fp fpVar = (fp) obj;
        ee eeVar = this.f2264;
        if (eeVar == null ? fpVar.f2264 != null : !eeVar.equals(fpVar.f2264)) {
            return false;
        }
        ee eeVar2 = this.f2263;
        if (eeVar2 == null ? fpVar.f2263 != null : !eeVar2.equals(fpVar.f2263)) {
            return false;
        }
        ee eeVar3 = this.f2265;
        if (eeVar3 == null ? fpVar.f2265 != null : !eeVar3.equals(fpVar.f2265)) {
            return false;
        }
        fr frVar = this.f2262;
        if (frVar == null) {
            if (fpVar.f2262 != null) {
                return false;
            }
            f2260 = (f2258 + 109) % 128;
            return true;
        }
        int i10 = f2260 + 71;
        f2258 = i10 % 128;
        int i11 = i10 % 2;
        fr frVar2 = fpVar.f2262;
        if (i11 != 0) {
            return frVar.equals(frVar2);
        }
        frVar.equals(frVar2);
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i10 = f2258 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        int i11 = i10 % 128;
        f2260 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        ee eeVar = this.f2264;
        if (eeVar != null) {
            int i12 = i11 + 61;
            f2258 = i12 % 128;
            if (i12 % 2 == 0) {
                eeVar.hashCode();
                throw null;
            }
            iHashCode = eeVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i13 = iHashCode * 31;
        ee eeVar2 = this.f2263;
        if (eeVar2 != null) {
            int i14 = f2258 + 65;
            f2260 = i14 % 128;
            if (i14 % 2 != 0) {
                iHashCode2 = eeVar2.hashCode();
                int i15 = 98 / 0;
            } else {
                iHashCode2 = eeVar2.hashCode();
            }
        } else {
            iHashCode2 = 0;
        }
        int i16 = (i13 + iHashCode2) * 31;
        ee eeVar3 = this.f2265;
        if (eeVar3 != null) {
            int i17 = f2258 + 41;
            f2260 = i17 % 128;
            if (i17 % 2 != 0) {
                iHashCode3 = eeVar3.hashCode();
                int i18 = 29 / 0;
            } else {
                iHashCode3 = eeVar3.hashCode();
            }
        } else {
            f2258 = (f2260 + 19) % 128;
            iHashCode3 = 0;
        }
        int i19 = (i16 + iHashCode3) * 31;
        fr frVar = this.f2262;
        return i19 + (frVar != null ? frVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2519("료臐\uf27e㠴", (char) (((Process.getThreadPriority(0) + 20) >> 6) + 13554), "菀\uec05豑ယ\ue46f", 2122436792 - (Process.myTid() >> 22), "\uee54滰뭒뵓").intern());
        ee eeVar = this.f2264;
        if (eeVar != null) {
            int i10 = f2260 + 45;
            f2258 = i10 % 128;
            if (i10 % 2 == 0) {
                sb2.append(eeVar);
                int i11 = 98 / 0;
            } else {
                sb2.append(eeVar);
            }
        }
        sb2.append(m2519("蕉歕迳⯹", (char) (TextUtils.getOffsetBefore("", 0) + 63887), "璞㪛", ViewConfiguration.getScrollDefaultDelay() >> 16, "\uee54滰뭒뵓").intern());
        sb2.append(this.f2263);
        sb2.append(m2519("蕉歕迳⯹", (char) (KeyEvent.getDeadChar(0, 0) + 63887), "璞㪛", TextUtils.getCapsMode("", 0, 0), "\uee54滰뭒뵓").intern());
        ee eeVar2 = this.f2265;
        if (eeVar2 != null) {
            f2260 = (f2258 + 85) % 128;
            sb2.append(eeVar2);
        }
        sb2.append(m2519("鱘᷄ᒭඣ", (char) (41748 - TextUtils.indexOf("", "")), "適\uab17", View.MeasureSpec.getSize(0), "\uee54滰뭒뵓").intern());
        sb2.append(this.f2262);
        return sb2.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* renamed from: ﻐ */
    public final du mo2509(ds dsVar, cp cpVar) {
        int i10 = f2258 + 71;
        f2260 = i10 % 128;
        if (i10 % 2 != 0) {
            m2518(this.f2264, dsVar, cpVar);
            throw null;
        }
        m2518(this.f2264, dsVar, cpVar);
        while (this.f2263.m2473(dsVar, cpVar).m2434()) {
            int i11 = f2260 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f2258 = i11 % 128;
            if (i11 % 2 == 0) {
                this.f2262.mo2509(dsVar, cpVar).m2438();
                throw null;
            }
            du duVarMo2509 = this.f2262.mo2509(dsVar, cpVar);
            if (duVarMo2509.m2438()) {
                break;
            }
            if (duVarMo2509.m2435()) {
                int i12 = f2260 + 23;
                f2258 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 60 / 0;
                }
                return duVarMo2509;
            }
            m2518(this.f2265, dsVar, cpVar);
        }
        return new du(null);
    }
}
