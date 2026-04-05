package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.p0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c<T> implements b<T> {
    private long startTime;
    public int adType = 0;
    public String placementId = "";
    public String unitId = "";
    private com.mbridge.msdk.foundation.same.report.campaignreport.b mRequestTime = null;

    public void calcRequestTime(long j10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = new com.mbridge.msdk.foundation.same.report.campaignreport.b(new h());
        this.mRequestTime = bVar;
        bVar.b(this.unitId);
        this.mRequestTime.b(1);
        this.mRequestTime.a((j10 - this.startTime) + "");
    }

    public void onPreExecute() {
        this.startTime = System.currentTimeMillis();
    }

    @Override // com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<T> eVar) {
        try {
            String str = com.mbridge.msdk.foundation.controller.c.m().b() + "_" + this.placementId + "_" + this.unitId + "_" + this.adType;
            com.mbridge.msdk.setting.h.b().a(this.unitId);
            p0.b("Listener", eVar.f40803c + " " + str);
            T t10 = eVar.f40803c;
            if (t10 instanceof JSONObject) {
                com.mbridge.msdk.foundation.same.net.utils.c.b().a(str, ((JSONObject) t10).optInt("status"), ((JSONObject) eVar.f40803c).toString(), System.currentTimeMillis());
            }
            if (eVar.f40803c instanceof String) {
                com.mbridge.msdk.foundation.same.net.utils.c.b().a(str, new JSONObject((String) eVar.f40803c).optInt("status"), (String) eVar.f40803c, System.currentTimeMillis());
            }
        } catch (Exception e10) {
            p0.b("Listener", e10.getMessage());
        }
    }

    public void saveHbState(int i10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public void saveRequestTime(int i10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.a(i10);
            this.mRequestTime.a();
        }
    }

    public void setAdType(int i10) {
        this.adType = i10;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void onCancel() {
    }

    public void onFinish() {
    }

    public void onNetworking() {
    }

    public void onRetry() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
    }

    public void onProgressChange(long j10, long j11) {
    }
}
