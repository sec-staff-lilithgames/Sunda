package com.mbridge.msdk.splash.middle;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private MBSplashShowListener f42951a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f42952b;

    /* renamed from: c, reason: collision with root package name */
    private c f42953c;

    public d(c cVar, MBSplashShowListener mBSplashShowListener, CampaignEx campaignEx) {
        this.f42953c = cVar;
        this.f42951a = mBSplashShowListener;
        this.f42952b = campaignEx;
    }

    public void a(MBridgeIds mBridgeIds, String str) {
        c cVar = this.f42953c;
        if (cVar != null) {
            cVar.f42944x = false;
        }
        j.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42952b, mBridgeIds.getUnitId(), str);
        MBSplashShowListener mBSplashShowListener = this.f42951a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(mBridgeIds, str);
        }
    }

    public void b(MBridgeIds mBridgeIds) throws JSONException {
        c cVar = this.f42953c;
        if (cVar != null) {
            cVar.f42944x = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_to", this.f42953c.e());
            jSONObject.put("allow_skip", this.f42953c.f() ? 1 : 0);
            jSONObject.put("countdown", this.f42953c.d());
        } catch (JSONException e10) {
            p0.b("SplashShowListenerImpl", "e:" + e10.getMessage());
        }
        j.b(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42952b, mBridgeIds.getUnitId(), jSONObject.toString());
        MBSplashShowListener mBSplashShowListener = this.f42951a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowSuccessed(mBridgeIds);
        }
    }

    public void a(MBridgeIds mBridgeIds) {
        MBSplashShowListener mBSplashShowListener = this.f42951a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdClicked(mBridgeIds);
        }
    }

    public void a(MBridgeIds mBridgeIds, int i10) {
        MBSplashShowListener mBSplashShowListener = this.f42951a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onDismiss(mBridgeIds, i10);
        }
        c cVar = this.f42953c;
        if (cVar != null) {
            cVar.f42944x = false;
        }
        if (i10 == 6 || i10 == 4 || i10 == 5) {
            com.mbridge.msdk.splash.report.a.a(this.f42952b, mBridgeIds.getUnitId(), i10);
        }
    }

    public void a(MBridgeIds mBridgeIds, long j10) {
        MBSplashShowListener mBSplashShowListener = this.f42951a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdTick(mBridgeIds, j10);
        }
    }

    public void a(MBridgeIds mBridgeIds, int i10, int i11, int i12) throws JSONException {
        MBSplashShowListener mBSplashShowListener = this.f42951a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayStart(mBridgeIds);
        }
        com.mbridge.msdk.splash.report.a.a(this.f42952b, mBridgeIds.getUnitId(), i10, i11, i12);
    }
}
