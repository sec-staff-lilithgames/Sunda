package com.mbridge.msdk.foundation.same.report.campaignreport;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricReport;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.tracker.e;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected Context f40897a;

    /* renamed from: b, reason: collision with root package name */
    protected h f40898b;

    public a(h hVar) {
        this.f40898b = hVar;
        Context contextD = c.m().d();
        this.f40897a = contextD;
        if (this.f40898b == null || contextD == null) {
            return;
        }
        int iS = l0.s(contextD);
        this.f40898b.c(iS);
        this.f40898b.a(l0.a(this.f40897a, iS));
    }

    public void a() {
        if (this.f40898b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DTBMetricReport.TIME, this.f40898b.f());
                jSONObject.put(CampaignEx.JSON_KEY_HB, this.f40898b.i());
                jSONObject.put("fb", this.f40898b.b());
                jSONObject.put("num", this.f40898b.e());
                jSONObject.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, this.f40898b.a());
                jSONObject.put("timeout", this.f40898b.g());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f40898b.h());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", this.f40898b.d());
                    jSONObject.put("network_str", this.f40898b.c());
                }
                e eVar = new e("2000006");
                eVar.a(0);
                eVar.b(0);
                eVar.a(jSONObject);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
                d.b().d().d(eVar);
            } catch (Throwable unused) {
            }
        }
    }

    public void b(int i10) {
        h hVar = this.f40898b;
        if (hVar != null) {
            hVar.a(i10);
        }
    }

    public void c(int i10) {
        h hVar = this.f40898b;
        if (hVar != null) {
            hVar.b(i10);
        }
    }

    public void b(String str) {
        h hVar = this.f40898b;
        if (hVar != null) {
            hVar.c(str);
        }
    }

    public void a(int i10) {
        h hVar = this.f40898b;
        if (hVar != null) {
            hVar.d(i10);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f40898b.b(str);
    }
}
