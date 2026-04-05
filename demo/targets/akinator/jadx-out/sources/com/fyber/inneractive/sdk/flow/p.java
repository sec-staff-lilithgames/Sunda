package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends o implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f23763g;

    public p(String str) {
        super(str);
    }

    @Override // com.fyber.inneractive.sdk.flow.o, com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveAdRequest inneractiveAdRequest) {
        com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f24047d.b(this.f23760e);
        iVarB.f24062b.put(new com.fyber.inneractive.sdk.metrics.h("success"), Long.valueOf(System.currentTimeMillis() - iVarB.f24064d));
        super.a(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f24047d.b(this.f23760e);
        iVarB.f24062b.put(new com.fyber.inneractive.sdk.metrics.h("retrying"), Long.valueOf(System.currentTimeMillis() - iVarB.f24064d));
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
        IAConfigManager.removeListener(this);
        if (z10) {
            return;
        }
        a(null, c(), new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.NO_APP_CONFIG_AVAILABLE, exc));
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final void b(InneractiveAdRequest inneractiveAdRequest) {
        a(inneractiveAdRequest, this.f23763g);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f24047d.b(this.f23760e);
        iVarB.f24062b.put(new com.fyber.inneractive.sdk.metrics.h("dyn_timeout"), Long.valueOf(System.currentTimeMillis() - iVarB.f24064d));
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final void a(boolean z10) {
        com.fyber.inneractive.sdk.network.m mVar = this.f23759d;
        if (mVar != null) {
            mVar.a();
        }
        super.a(true);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        String str;
        if (eVar == null || (str = eVar.B) == null) {
            return;
        }
        com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f24047d.b(str);
        com.fyber.inneractive.sdk.config.global.r rVarA = this.f23758c;
        if (rVarA == null) {
            rVarA = com.fyber.inneractive.sdk.config.global.r.a();
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayA = com.fyber.inneractive.sdk.metrics.i.a(iVarB.f24062b);
        try {
            jSONObject.put("adl", jSONArrayA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "adl", jSONArrayA);
        }
        JSONArray jSONArrayA2 = com.fyber.inneractive.sdk.metrics.i.a(iVarB.f24061a);
        try {
            jSONObject.put("adml", jSONArrayA2);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", "adml", jSONArrayA2);
        }
        if (!TextUtils.isEmpty(null)) {
            try {
                jSONObject.put("dns_failed", (Object) null);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "dns_failed", null);
            }
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.SDK_BIDDING_METRICS;
        JSONArray jSONArrayB = rVarA.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.f24326c = uVar;
        wVar.f24324a = inneractiveAdRequest;
        wVar.f24327d = jSONArrayB;
        wVar.f24329f.put(jSONObject);
        wVar.a((String) null);
    }
}
