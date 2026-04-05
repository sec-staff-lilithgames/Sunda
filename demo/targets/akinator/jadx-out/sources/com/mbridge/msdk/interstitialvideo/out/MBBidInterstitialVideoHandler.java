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

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes7.dex */
public class MBBidInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private a f41366a;

    /* renamed from: b, reason: collision with root package name */
    private String f41367b;

    /* renamed from: c, reason: collision with root package name */
    private String f41368c;

    /* renamed from: d, reason: collision with root package name */
    private String f41369d;

    /* renamed from: e, reason: collision with root package name */
    private String f41370e;

    /* renamed from: f, reason: collision with root package name */
    private String f41371f;

    /* renamed from: g, reason: collision with root package name */
    private String f41372g;

    /* renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f41373h;

    /* renamed from: i, reason: collision with root package name */
    private int f41374i = 2;

    /* renamed from: j, reason: collision with root package name */
    private boolean f41375j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f41376k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41377l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f41378m = false;

    /* renamed from: n, reason: collision with root package name */
    private int f41379n;

    /* renamed from: o, reason: collision with root package name */
    private int f41380o;

    /* renamed from: p, reason: collision with root package name */
    private int f41381p;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
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
        this.f41367b = str2;
        this.f41368c = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f41366a == null) {
                a aVar = new a();
                this.f41366a = aVar;
                aVar.d(true);
                this.f41366a.e(true);
                this.f41366a.c(str, str2);
            }
        } catch (Throwable th2) {
            p0.b("MBBidRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f41366a;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f41366a;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f41366a;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f41366a;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f41366a != null) {
            this.f41366a.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f41367b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f41366a != null) {
            this.f41366a.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f41367b, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f41374i = i10;
        a aVar = this.f41366a;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f41369d = str;
        this.f41370e = str2;
        this.f41371f = str3;
        this.f41372g = str4;
        this.f41376k = true;
        this.f41377l = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f41367b, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f41379n = i10;
        this.f41380o = i11;
        this.f41381p = com.mbridge.msdk.foundation.same.a.K;
        this.f41378m = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f41373h = interstitialVideoListener;
        this.f41375j = true;
        a aVar = this.f41366a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f41366a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f41367b, true));
        this.f41375j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f41373h = interstitialVideoListener;
        this.f41375j = true;
        a aVar = this.f41366a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f41366a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f41367b, true));
        this.f41375j = false;
    }

    public void showFromBid() {
        a();
        if (this.f41366a != null) {
            this.f41366a.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f41367b, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f41379n = i10;
        this.f41380o = (int) (d10 * 100.0d);
        this.f41381p = com.mbridge.msdk.foundation.same.a.J;
        this.f41378m = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f41366a == null) {
            b(this.f41368c, this.f41367b);
        }
        if (this.f41375j) {
            a aVar2 = this.f41366a;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f41373h, this.f41367b, true));
            }
            this.f41375j = false;
        }
        if (this.f41376k) {
            a aVar3 = this.f41366a;
            if (aVar3 != null) {
                aVar3.a(this.f41369d, this.f41370e, this.f41371f, this.f41372g);
            }
            this.f41376k = false;
        }
        if (!this.f41378m || (aVar = this.f41366a) == null) {
            return;
        }
        aVar.a(this.f41379n, this.f41381p, this.f41380o);
        this.f41378m = false;
    }

    private void b() {
        a aVar = this.f41366a;
        if (aVar != null) {
            aVar.a(this.f41379n, this.f41381p, this.f41380o);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
