package com.mbridge.msdk.splash.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private MBSplashLoadListener f42916a;

    /* renamed from: b, reason: collision with root package name */
    private c f42917b;

    /* renamed from: c, reason: collision with root package name */
    private String f42918c;

    /* renamed from: d, reason: collision with root package name */
    private String f42919d;

    /* renamed from: e, reason: collision with root package name */
    private MBridgeIds f42920e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f42917b = cVar;
        this.f42920e = mBridgeIds;
        if (mBridgeIds != null) {
            this.f42918c = mBridgeIds.getUnitId();
        }
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        this.f42916a = mBSplashLoadListener;
    }

    public void a(String str) {
        this.f42919d = str;
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        c cVar2 = this.f42917b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.f42916a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.f42920e, i10);
            this.f42916a.isSupportZoomOut(this.f42920e, campaignEx.getFlb() == 1);
        }
        this.f42917b.b(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.m().d(), arrayList, this.f42918c, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f42917b) == null) {
            return;
        }
        cVar.b(campaignEx, 0, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f42917b;
        if (cVar == null || !cVar.g()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String strG = bVar.g();
            if (!TextUtils.isEmpty(strG)) {
                str = strG;
            }
        }
        MBSplashLoadListener mBSplashLoadListener = this.f42916a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.f42920e, str, i10);
        }
        this.f42917b.b(false);
        j.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, this.f42918c, !TextUtils.isEmpty(this.f42919d), bVar != null ? bVar.a() : null);
    }
}
