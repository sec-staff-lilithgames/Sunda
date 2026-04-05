package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.qq.e.comm.managers.GDTAdSdk;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gy extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2435 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2436 = -3638578346156077155L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2437;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2438;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2439;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2439 = (f2435 + 91) % 128;
        String strIntern = m2564("ꙝ漣舖\u0602", (char) Color.alpha(0), "尹軬摇\ue823꒖\ud97eⓡ", 385454758 - (ViewConfiguration.getTapTimeout() >> 16), "依귰ⱅ춁").intern();
        int i10 = f2439 + 23;
        f2435 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 21 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2439;
        f2435 = (i10 + 35) % 128;
        int i11 = i10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2435 = i11 % 128;
        if (i11 % 2 != 0) {
            return GDTAdSdk.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        cf cfVar = new cf(mo2524());
        int i10 = f2439 + 47;
        f2435 = i10 % 128;
        if (i10 % 2 != 0) {
            return cfVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        f2439 = (f2435 + 111) % 128;
        String strIntern = m2564("䤟ꢠ彧㵱", (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29022), "ꏝ챮晨撎\uf331└⫒䀜⤾ఋ洼醵⯲㟥\ue89a\uf515旌鴲\ud81b\ue7a5햽礖ᒑ㬀ﳖ\ue22f쳯䈏헵㔖\uec4b", 1739104329 - TextUtils.getOffsetAfter("", 0), "依귰ⱅ춁").intern();
        f2439 = (f2435 + 67) % 128;
        return strIntern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2564(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f2436) ^ f2438) ^ f2437);
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
}
