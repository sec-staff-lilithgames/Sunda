package com.mbridge.msdk.advanced.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private NativeAdvancedAdListener f39542a;

    /* renamed from: b, reason: collision with root package name */
    private c f39543b;

    /* renamed from: c, reason: collision with root package name */
    private MBridgeIds f39544c;

    /* renamed from: d, reason: collision with root package name */
    private String f39545d;

    /* renamed from: e, reason: collision with root package name */
    private String f39546e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f39543b = cVar;
        this.f39544c = mBridgeIds;
        this.f39545d = mBridgeIds.getUnitId();
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f39542a = nativeAdvancedAdListener;
    }

    public void a(String str) {
        this.f39546e = str;
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        p0.b("NativeAdvancedLoadManager", "onLoadSuccessed: " + i10);
        c cVar2 = this.f39543b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f39542a;
        if (nativeAdvancedAdListener != null && this.f39543b != null) {
            nativeAdvancedAdListener.onLoadSuccessed(this.f39544c);
        }
        this.f39543b.a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.m().d(), arrayList, this.f39545d, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f39543b) == null) {
            return;
        }
        cVar.a(campaignEx, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f39543b;
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
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f39542a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f39544c, str);
        }
        this.f39543b.a(false);
        j.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, this.f39545d, !TextUtils.isEmpty(this.f39546e), bVar != null ? bVar.a() : null);
    }
}
