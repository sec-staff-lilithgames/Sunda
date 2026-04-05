package com.mbridge.msdk.newinterstitial.out;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBBidNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f42121a;

    /* renamed from: b, reason: collision with root package name */
    private String f42122b;

    /* renamed from: c, reason: collision with root package name */
    private String f42123c;

    /* renamed from: d, reason: collision with root package name */
    private String f42124d;

    /* renamed from: e, reason: collision with root package name */
    private String f42125e;

    /* renamed from: f, reason: collision with root package name */
    private a f42126f;

    /* renamed from: g, reason: collision with root package name */
    private String f42127g;

    /* renamed from: h, reason: collision with root package name */
    private NewInterstitialListener f42128h;

    /* renamed from: i, reason: collision with root package name */
    private int f42129i = 2;

    /* renamed from: j, reason: collision with root package name */
    private boolean f42130j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f42131k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f42132l = false;

    /* renamed from: m, reason: collision with root package name */
    private int f42133m;

    /* renamed from: n, reason: collision with root package name */
    private int f42134n;

    /* renamed from: o, reason: collision with root package name */
    private int f42135o;

    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().d() == null && context != null) {
            c.m().b(context);
        }
        if (context instanceof Activity) {
            c.m().a(context);
        }
        a(str, str2);
    }

    private void a(String str, String str2) {
        String strE = u0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            u0.b(str2, strE);
        }
        this.f42121a = str;
        this.f42127g = str2;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f42126f == null) {
                a aVar = new a();
                this.f42126f = aVar;
                aVar.d(true);
                this.f42126f.e(true);
                this.f42126f.c(str, str2);
            }
        } catch (Throwable th2) {
            p0.b("MBBidNewInterstitialHandler", th2.getMessage(), th2);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f42126f;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f42126f;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f42126f;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f42126f;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f42126f != null) {
            this.f42126f.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42127g, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f42126f != null) {
            this.f42126f.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42127g, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f42129i = i10;
        a aVar = this.f42126f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f42123c = str;
        this.f42122b = str2;
        this.f42124d = str3;
        this.f42125e = str4;
        this.f42131k = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f42127g, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) throws JSONException {
        c.m().a(this.f42127g, jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f42133m = i10;
        this.f42134n = i11;
        this.f42135o = com.mbridge.msdk.foundation.same.a.K;
        this.f42132l = true;
        b();
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f42128h = newInterstitialListener;
        this.f42130j = true;
        a aVar = this.f42126f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f42126f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener, this.f42127g, true));
        this.f42130j = false;
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f42128h = newInterstitialListener;
        this.f42130j = true;
        a aVar = this.f42126f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f42126f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener, this.f42127g, true));
        this.f42130j = false;
    }

    public void showFromBid() {
        a();
        if (this.f42126f != null) {
            this.f42126f.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42127g, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f42133m = i10;
        this.f42134n = (int) (d10 * 100.0d);
        this.f42135o = com.mbridge.msdk.foundation.same.a.J;
        this.f42132l = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f42126f == null) {
            b(this.f42121a, this.f42127g);
        }
        if (this.f42130j) {
            a aVar2 = this.f42126f;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.newinterstitial.listener.a(this.f42128h, this.f42127g, true));
            }
            this.f42130j = false;
        }
        if (this.f42131k) {
            a aVar3 = this.f42126f;
            if (aVar3 != null) {
                aVar3.a(this.f42123c, this.f42122b, this.f42124d, this.f42125e);
            }
            this.f42131k = false;
        }
        if (!this.f42132l || (aVar = this.f42126f) == null) {
            return;
        }
        aVar.a(this.f42133m, this.f42135o, this.f42134n);
        this.f42132l = false;
    }

    private void b() {
        a aVar = this.f42126f;
        if (aVar != null) {
            aVar.a(this.f42133m, this.f42135o, this.f42134n);
        }
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        a(str, str2);
    }
}
