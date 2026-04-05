package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.ads.AdSettings;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gd extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2324 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2326;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2327 = {'c', 46159, 26669, 7246, 53478, 33985, 14499, 60549, 41314, 21839, 2351, 48395, 29102, 9665, 55716, 36243, 16942, 63073, 43556, 24115, 4837, 50900, 31412, 11913, 58222, 38727, 19251, 11099, 40828, 17182, 14136, 64479, 45042, 5010, 51126};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2325 = 4502814317164147744L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2324 = (f2326 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        String strIntern = m2536((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11068), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 27).intern();
        int i10 = f2324 + 49;
        f2326 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 57 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2326 + 47;
        int i11 = i10 % 128;
        f2324 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        f2326 = (i11 + 61) % 128;
        return AdSettings.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bp bpVar = new bp(mo2524());
        f2326 = (f2324 + 1) % 128;
        return bpVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        f2326 = (f2324 + 69) % 128;
        String strIntern = m2536((char) ExpandableListView.getPackedPositionGroup(0L), Color.rgb(0, 0, 0) + 16777243, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1).intern();
        f2324 = (f2326 + 67) % 128;
        return strIntern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2536(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2327[i11 + i12] ^ (i12 * f2325)) ^ c10);
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
