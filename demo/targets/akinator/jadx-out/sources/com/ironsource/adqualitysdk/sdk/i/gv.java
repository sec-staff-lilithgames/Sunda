package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import tv.superawesome.sdk.publisher.AwesomeAds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gv extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2415 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2418 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2417 = {35916, 36857, 35704, 34670, 33425, 40667, 39447, 38475, 37345, 44320, 43387, 42134, 41155, 48158, 47199, 48047, 46907, 45947, 52877, 51843, 50692, 49742, 56800, 55589, 54649, 53396, 60614, 59408, 58446, 59309, 58123, 65382, 64189, 63196, 61977, 3664, 2529, 1290, 374, 7338, 2986, 2075, 3271, 153, 1399, 6443, 7652, 4541, 5650, 10969, 11922, 9057};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2416 = -3085624791276846153L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2559(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2417[i11 + i12] ^ (i12 * f2416)) ^ c10);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int i10 = f2415 + 73;
        f2418 = i10 % 128;
        return (i10 % 2 == 0 ? m2559((char) ((KeyEvent.getMaxKeyCode() << 8) + 13892), 82 / TextUtils.getCapsMode("", 1, 1), View.MeasureSpec.getSize(1) * 73) : m2559((char) ((KeyEvent.getMaxKeyCode() >> 16) + 3033), 12 - TextUtils.getCapsMode("", 0, 0), View.MeasureSpec.getSize(0) + 40)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2415;
        f2418 = (i10 + 21) % 128;
        f2418 = (i10 + 1) % 128;
        return AwesomeAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        cd cdVar = new cd(mo2524());
        int i10 = f2418 + 115;
        f2415 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 78 / 0;
        }
        return cdVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int i10 = f2418 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2415 = i10 % 128;
        return (i10 % 2 != 0 ? m2559((char) (TextUtils.getOffsetAfter("", 1) * 35896), 16 - Color.red(1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))) : m2559((char) (TextUtils.getOffsetAfter("", 0) + 35896), 40 - Color.red(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern();
    }
}
