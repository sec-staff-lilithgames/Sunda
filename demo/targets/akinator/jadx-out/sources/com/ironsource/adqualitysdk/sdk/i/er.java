package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import io.bidmachine.protobuf.EventTypeExtended;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class er extends eo {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2181 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2182 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2183 = -4808092426746911067L;

    public er(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2496(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (j.f2852) {
            try {
                j.f2850 = i10;
                char[] cArr2 = new char[cArr.length];
                j.f2851 = 0;
                while (true) {
                    int i11 = j.f2851;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2183);
                        j.f2851++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        int i10 = f2181 + 29;
        f2182 = i10 % 128;
        return (i10 % 2 == 0 ? m2496("⚛┓", 23884 % TextUtils.indexOf((CharSequence) "", '1')) : m2496("⚛┓", TextUtils.indexOf((CharSequence) "", '0') + EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_WIN_VALUE)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ｋ */
    public final boolean mo2489(int i10) {
        int i11 = (f2181 + 25) % 128;
        f2182 = i11;
        if (i10 >= 0) {
            return true;
        }
        f2181 = (i11 + 79) % 128;
        return false;
    }
}
