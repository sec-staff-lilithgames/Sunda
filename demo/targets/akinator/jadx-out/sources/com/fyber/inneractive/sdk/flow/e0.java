package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f23552a;

    public e0(h0 h0Var) {
        this.f23552a = h0Var;
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (this.f23552a.f23658m.get()) {
            IAlog.a("%s : onAdRequestFailed: spot is already destroyed", h0.a(this.f23552a));
            h0 h0Var = this.f23552a;
            p pVar = h0Var.f23657l;
            h0Var.a(h0Var.f23650e);
            return;
        }
        if (this.f23552a.f23647b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.f23552a.a(inneractiveAdRequest, eVar);
            }
            h0 h0Var2 = this.f23552a;
            if (!h0Var2.f23655j) {
                g0 g0Var = h0Var2.f23654i;
                if (g0Var != null) {
                    g0Var.onAdRefreshFailed(h0Var2, inneractiveInfrastructureError.getErrorCode());
                    return;
                }
                return;
            }
            m mVar = h0Var2.f23653h;
            p pVar2 = h0Var2.f23657l;
            JSONArray jSONArrayB = null;
            com.fyber.inneractive.sdk.config.global.r rVar2 = pVar2 != null ? pVar2.f23758c : null;
            if (mVar != null && (rVar = mVar.f23758c) != null) {
                jSONArrayB = rVar.b();
            } else if (rVar2 != null) {
                jSONArrayB = rVar2.b();
            }
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, h0Var2.f23650e, eVar, jSONArrayB);
            h0 h0Var3 = this.f23552a;
            InneractiveAdSpot.RequestListener requestListener = h0Var3.f23647b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(h0Var3, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}
