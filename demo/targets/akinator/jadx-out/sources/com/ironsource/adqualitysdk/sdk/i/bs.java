package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bs extends bg {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1205 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f1206 = 7005;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1207 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1208 = 36058;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1209 = 16694;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1210 = 50028;

    public bs(String str) {
        super(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1467(MaioAdsListenerInterface maioAdsListenerInterface) {
        f1207 = (f1205 + 7) % 128;
        m1465(maioAdsListenerInterface);
        f1207 = (f1205 + 39) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        f1205 = (f1207 + 85) % 128;
        String sdkVersion = MaioAds.getSdkVersion();
        int i10 = f1205 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1207 = i10 % 128;
        if (i10 % 2 == 0) {
            return sdkVersion;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo1110(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bs.mo1110(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1466("栌አ辋㈯ퟟ㵒⻠䮆끤践楧㜱灢橯\uf826Ⳍˠ抱", (KeyEvent.getMaxKeyCode() >> 16) + 18).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bs.m1467((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        int i10 = f1205 + 17;
        f1207 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 21 / 0;
        }
        return map;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1466(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1208)) ^ ((c11 >>> 5) + f1209)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1210) ^ ((c12 + i12) ^ ((c12 << 4) + f1206))));
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m1465(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i10 = f1207 + 115;
        f1205 = i10 % 128;
        int i11 = i10 % 2;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        if (i11 == 0) {
            throw null;
        }
        f1205 = (f1207 + 63) % 128;
    }
}
