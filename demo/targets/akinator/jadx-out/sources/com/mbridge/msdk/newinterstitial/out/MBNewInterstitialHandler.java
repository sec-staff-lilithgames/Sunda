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
import com.mbridge.msdk.setting.h;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f42136a;

    /* renamed from: b, reason: collision with root package name */
    private String f42137b;

    /* renamed from: c, reason: collision with root package name */
    private String f42138c;

    /* renamed from: d, reason: collision with root package name */
    private String f42139d;

    /* renamed from: e, reason: collision with root package name */
    private String f42140e;

    /* renamed from: f, reason: collision with root package name */
    private a f42141f;

    /* renamed from: g, reason: collision with root package name */
    private String f42142g;

    /* renamed from: h, reason: collision with root package name */
    private NewInterstitialListener f42143h;

    /* renamed from: i, reason: collision with root package name */
    private int f42144i = 2;

    /* renamed from: j, reason: collision with root package name */
    private boolean f42145j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f42146k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f42147l = false;

    /* renamed from: m, reason: collision with root package name */
    private int f42148m;

    /* renamed from: n, reason: collision with root package name */
    private int f42149n;

    /* renamed from: o, reason: collision with root package name */
    private int f42150o;

    public MBNewInterstitialHandler(Context context, String str, String str2) {
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
        this.f42136a = str;
        this.f42142g = str2;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f42141f == null) {
                a aVar = new a();
                this.f42141f = aVar;
                aVar.d(true);
                this.f42141f.c(str, str2);
                h.b().g(str2);
            }
        } catch (Throwable th2) {
            p0.b("MBRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f42141f;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f42141f;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f42141f;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isReady() {
        a();
        a aVar = this.f42141f;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void load() {
        a();
        if (this.f42141f != null) {
            this.f42141f.a(true, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42142g, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f42141f != null) {
            this.f42141f.a(false, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42142g, true, 1));
        }
    }

    public void playVideoMute(int i10) {
        this.f42144i = i10;
        a aVar = this.f42141f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f42137b = str;
        this.f42138c = str2;
        this.f42139d = str3;
        this.f42140e = str4;
        this.f42146k = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f42142g, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) throws JSONException {
        c.m().a(this.f42142g, jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f42148m = i10;
        this.f42149n = i11;
        this.f42150o = com.mbridge.msdk.foundation.same.a.K;
        this.f42147l = true;
        b();
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f42143h = newInterstitialListener;
        this.f42145j = true;
        a aVar = this.f42141f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f42141f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener, this.f42142g, false));
        this.f42145j = false;
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f42143h = newInterstitialListener;
        this.f42145j = true;
        a aVar = this.f42141f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f42141f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener, this.f42142g, false));
        this.f42145j = false;
    }

    public void show() {
        a();
        if (this.f42141f != null) {
            this.f42141f.a((String) null, (String) null, (String) null, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42142g, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f42148m = i10;
        this.f42149n = (int) (d10 * 100.0d);
        this.f42150o = com.mbridge.msdk.foundation.same.a.J;
        this.f42147l = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f42141f == null) {
            b(this.f42136a, this.f42142g);
        }
        if (this.f42145j) {
            a aVar2 = this.f42141f;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.newinterstitial.listener.a(this.f42143h, this.f42142g, false));
            }
            this.f42145j = false;
        }
        if (this.f42146k) {
            a aVar3 = this.f42141f;
            if (aVar3 != null) {
                aVar3.a(this.f42137b, this.f42138c, this.f42139d, this.f42140e);
            }
            this.f42146k = false;
        }
        if (!this.f42147l || (aVar = this.f42141f) == null) {
            return;
        }
        aVar.a(this.f42148m, this.f42150o, this.f42149n);
        this.f42147l = false;
    }

    private void b() {
        a aVar = this.f42141f;
        if (aVar != null) {
            aVar.a(this.f42148m, this.f42150o, this.f42149n);
        }
    }

    public MBNewInterstitialHandler(String str, String str2) {
        a(str, str2);
    }
}
