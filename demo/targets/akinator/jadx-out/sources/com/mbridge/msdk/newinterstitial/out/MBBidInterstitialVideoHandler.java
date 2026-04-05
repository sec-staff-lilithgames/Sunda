package com.mbridge.msdk.newinterstitial.out;

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
@Deprecated
/* loaded from: classes7.dex */
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f42107a;

    /* renamed from: b, reason: collision with root package name */
    private String f42108b;

    /* renamed from: c, reason: collision with root package name */
    private String f42109c;

    /* renamed from: d, reason: collision with root package name */
    private String f42110d;

    /* renamed from: e, reason: collision with root package name */
    private String f42111e;

    /* renamed from: f, reason: collision with root package name */
    private a f42112f;

    /* renamed from: g, reason: collision with root package name */
    private NewInterstitialListener f42113g;

    /* renamed from: h, reason: collision with root package name */
    private int f42114h = 2;

    /* renamed from: i, reason: collision with root package name */
    private boolean f42115i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f42116j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f42117k = false;

    /* renamed from: l, reason: collision with root package name */
    private int f42118l;

    /* renamed from: m, reason: collision with root package name */
    private int f42119m;
    public String mUnitId;

    /* renamed from: n, reason: collision with root package name */
    private int f42120n;

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
        this.mUnitId = str2;
        this.f42107a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f42112f == null) {
                a aVar = new a();
                this.f42112f = aVar;
                aVar.d(true);
                this.f42112f.e(true);
                this.f42112f.c(str, str2);
            }
        } catch (Throwable th2) {
            p0.b("MBBidInterstitialVideoHandler", th2.getMessage(), th2);
        }
    }

    private void c() {
        a aVar = this.f42112f;
        if (aVar != null) {
            aVar.a(this.f42118l, this.f42120n, this.f42119m);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f42112f;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f42112f;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f42112f;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f42112f;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f42112f != null) {
            this.f42112f.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f42112f != null) {
            this.f42112f.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f42114h = i10;
        a aVar = this.f42112f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f42109c = str;
        this.f42108b = str2;
        this.f42110d = str3;
        this.f42111e = str4;
        this.f42116j = true;
        MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) throws JSONException {
        c.m().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f42118l = i10;
        this.f42119m = i11;
        this.f42120n = com.mbridge.msdk.foundation.same.a.K;
        this.f42117k = true;
        c();
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f42113g = newInterstitialListener;
        this.f42115i = true;
        a aVar = this.f42112f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f42112f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f42115i = false;
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f42113g = newInterstitialListener;
        this.f42115i = true;
        a aVar = this.f42112f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f42112f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f42115i = false;
    }

    public void showFromBid() {
        a();
        if (this.f42112f != null) {
            this.f42112f.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f42118l = i10;
        this.f42119m = (int) (d10 * 100.0d);
        this.f42120n = com.mbridge.msdk.foundation.same.a.J;
        this.f42117k = true;
        c();
    }

    private void a() {
        if (this.f42112f == null) {
            b(this.f42107a, this.mUnitId);
        }
        b();
    }

    private void b() {
        a aVar;
        if (this.f42115i) {
            a aVar2 = this.f42112f;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.newinterstitial.listener.a(this.f42113g));
            }
            this.f42115i = false;
        }
        if (this.f42116j) {
            a aVar3 = this.f42112f;
            if (aVar3 != null) {
                aVar3.a(this.f42109c, this.f42108b, this.f42110d, this.f42111e);
            }
            this.f42116j = false;
        }
        if (!this.f42117k || (aVar = this.f42112f) == null) {
            return;
        }
        aVar.a(this.f42118l, this.f42120n, this.f42119m);
        this.f42117k = false;
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
