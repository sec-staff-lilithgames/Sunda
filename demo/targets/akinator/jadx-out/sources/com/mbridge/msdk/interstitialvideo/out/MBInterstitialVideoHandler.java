package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;
import com.mbridge.msdk.setting.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes7.dex */
public class MBInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f41382a;

    /* renamed from: b, reason: collision with root package name */
    private a f41383b;

    /* renamed from: c, reason: collision with root package name */
    private String f41384c;

    /* renamed from: d, reason: collision with root package name */
    private String f41385d;

    /* renamed from: e, reason: collision with root package name */
    private String f41386e;

    /* renamed from: f, reason: collision with root package name */
    private String f41387f;

    /* renamed from: g, reason: collision with root package name */
    private String f41388g;

    /* renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f41389h;

    /* renamed from: i, reason: collision with root package name */
    private int f41390i = 2;

    /* renamed from: j, reason: collision with root package name */
    private boolean f41391j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f41392k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41393l = false;

    /* renamed from: m, reason: collision with root package name */
    private int f41394m;

    /* renamed from: n, reason: collision with root package name */
    private int f41395n;

    /* renamed from: o, reason: collision with root package name */
    private int f41396o;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().d() == null && context != null) {
            c.m().b(context);
        }
        a(str, str2);
    }

    private void a(String str, String str2) {
        String strE = u0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            u0.b(str2, strE);
        }
        this.f41384c = str2;
        this.f41382a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f41383b == null) {
                a aVar = new a();
                this.f41383b = aVar;
                aVar.d(true);
                this.f41383b.c(str, str2);
                h.b().g(str2);
            }
        } catch (Throwable th2) {
            p0.b("MBRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f41383b;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f41383b;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f41383b;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isReady() {
        a();
        a aVar = this.f41383b;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void load() {
        a();
        if (this.f41383b != null) {
            this.f41383b.a(true, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f41384c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f41383b != null) {
            this.f41383b.a(false, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f41384c, true, 1));
        }
    }

    public void playVideoMute(int i10) {
        this.f41390i = i10;
        a aVar = this.f41383b;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f41385d = str;
        this.f41386e = str2;
        this.f41387f = str3;
        this.f41388g = str4;
        this.f41392k = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f41384c, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f41394m = i10;
        this.f41395n = i11;
        this.f41396o = com.mbridge.msdk.foundation.same.a.K;
        this.f41393l = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f41389h = interstitialVideoListener;
        this.f41391j = true;
        a aVar = this.f41383b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f41383b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f41391j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f41389h = interstitialVideoListener;
        this.f41391j = true;
        a aVar = this.f41383b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f41383b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f41391j = false;
    }

    public void show() {
        a();
        if (this.f41383b != null) {
            this.f41383b.a((String) null, (String) null, (String) null, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f41384c, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f41394m = i10;
        this.f41395n = (int) (d10 * 100.0d);
        this.f41396o = com.mbridge.msdk.foundation.same.a.J;
        this.f41393l = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f41383b == null) {
            b(this.f41382a, this.f41384c);
        }
        if (this.f41391j) {
            this.f41383b.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f41389h, this.f41384c, false));
            this.f41391j = false;
        }
        if (this.f41392k) {
            this.f41383b.a(this.f41385d, this.f41386e, this.f41387f, this.f41388g);
            this.f41392k = false;
        }
        if (!this.f41393l || (aVar = this.f41383b) == null) {
            return;
        }
        aVar.a(this.f41394m, this.f41396o, this.f41395n);
        this.f41393l = false;
    }

    private void b() {
        a aVar = this.f41383b;
        if (aVar != null) {
            aVar.a(this.f41394m, this.f41396o, this.f41395n);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
