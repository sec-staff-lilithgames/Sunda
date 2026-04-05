package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import net.pubnative.lite.sdk.HyBid;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gw extends gk {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2419 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2420 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2421 = 27870;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2422 = 33469;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2423 = 37754;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2424 = 20484;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2420 = (f2419 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        String strIntern = m2560("ῖ\ue4cd鏻\ued02ఞ\uf651賽Ᵹ\uf2b4쐻", KeyEvent.keyCodeFromString("") + 9).intern();
        f2420 = (f2419 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2420 + 53;
        int i11 = i10 % 128;
        f2419 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        f2420 = (i11 + 103) % 128;
        return HyBid.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        by byVar = new by(mo2524());
        f2419 = (f2420 + 85) % 128;
        return byVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int i10 = f2419 + 97;
        f2420 = i10 % 128;
        return m2560("☃沐ᯒ堩ῖ\ue4cd鏻\ued02ఞ\uf651賽Ᵹǰ뾱⥫칱ꏲ䓖녿䫇ꄤ뿁壧\ue840똣㏰㍚ቌ", i10 % 2 != 0 ? Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE << (ExpandableListView.getPackedPositionForChild(1, 1) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 1L ? 0 : -1)) : (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29).intern();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2560(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.f3166) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3167 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3167;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2423)) ^ ((c11 >>> 5) + f2422)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2421) ^ ((c12 + i12) ^ ((c12 << 4) + f2424))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3167;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3167 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
