package com.mbridge.msdk.timer;

import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.timer.b$b, reason: collision with other inner class name */
    public static class C0337b {

        /* renamed from: a, reason: collision with root package name */
        static b f43881a = new b();
    }

    public static b getInstance() {
        return C0337b.f43881a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().a(str, str2);
        } catch (Exception e10) {
            p0.b("TimerController", "addInterstitialList error:" + e10.getMessage());
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().b(str, str2);
        } catch (Exception e10) {
            p0.b("TimerController", "addRewardList error:" + e10.getMessage());
        }
    }

    public void start() {
        g gVarF = com.google.android.gms.internal.play_billing.a.f(h.b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        if (gVarF.h() > 0) {
            com.mbridge.msdk.timer.a.a().b(r0 * 1000);
        }
    }

    private b() {
    }
}
