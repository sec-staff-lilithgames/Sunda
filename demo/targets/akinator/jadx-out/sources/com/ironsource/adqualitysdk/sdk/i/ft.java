package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.adqualitysdk.sdk.i.ba;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ft extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2279 = 2205309593012926715L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2280 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2281 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m2522() {
        int i10 = f2280 + 107;
        f2281 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Prode.m533();
                throw null;
            }
            if (Prode.m533()) {
                return true;
            }
            Class.forName(m2523("셓넫섰\ue23d㣕䦿Ꭶ툊⋘涣㞰\uf66fۧ熝寝詽櫹ᗰ翵긏亊㧤掵䈓늢\uddcf螁昹隿\ue1db\uab6d竺既蔶켤ộ\ude5cꤞ\uf322㋪쉹䴃", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
            f2280 = (f2281 + 9) % 128;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String mo2524() {
        int i10 = f2281 + 43;
        f2280 = i10 % 128;
        return (i10 % 2 != 0 ? m2523("멦和먇挳\udf91갓銨㔏姨", 1 << ExpandableListView.getPackedPositionGroup(0L)) : m2523("멦和먇挳\udf91갓銨㔏姨", 1 - ExpandableListView.getPackedPositionGroup(0L))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Class mo2525() {
        int i10 = f2281 + 1;
        int i11 = i10 % 128;
        f2280 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        f2281 = (i11 + 3) % 128;
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg mo2526() {
        f2281 = (f2280 + 81) % 128;
        if (m2522()) {
            return new ba.d(mo2524());
        }
        ba baVar = new ba(mo2524());
        int i10 = f2280 + 31;
        f2281 = i10 % 128;
        if (i10 % 2 != 0) {
            return baVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String mo2527() {
        int windowTouchSlop;
        int i10 = f2281 + 13;
        f2280 = i10 % 128;
        if (i10 % 2 != 0) {
            ViewConfiguration.getWindowTouchSlop();
            windowTouchSlop = 0;
        } else {
            windowTouchSlop = 1 - (ViewConfiguration.getWindowTouchSlop() >> 8);
        }
        String strIntern = m2523("\ue3dc糟\ue3bf茝䒓葋犆까Wꁗ嚐訩⑨뱩㫽\uf63b䡶\ud804ổ퉉氅\uf410ʕ㹕逭ျ\ue6a1᩿됰Ⱟ쩍ڧ\ud8c7䣒긞抚ﳙ擅鈯亱", windowTouchSlop).intern();
        int i11 = f2281 + 47;
        f2280 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2523(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2279, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2279));
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
}
