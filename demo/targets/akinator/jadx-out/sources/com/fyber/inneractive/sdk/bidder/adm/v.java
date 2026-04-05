package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.flow.e0;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f23074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.response.e f23075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f23076c;

    public v(y yVar, c0 c0Var, com.fyber.inneractive.sdk.response.e eVar) {
        this.f23076c = yVar;
        this.f23074a = c0Var;
        this.f23075b = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) throws JSONException {
        com.fyber.inneractive.sdk.response.e eVar = (com.fyber.inneractive.sdk.response.e) obj;
        if (eVar == null || exc != null) {
            String message = exc != null ? exc.getMessage() : "empty";
            com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f24047d.b(this.f23076c.f23082d);
            iVarB.f24061a.put(new com.fyber.inneractive.sdk.metrics.h(message), Long.valueOf(System.currentTimeMillis() - iVarB.f24063c));
            if (this.f23074a != null) {
                Exception exc2 = exc != null ? exc : new Exception("adm markup network result is empty");
                c0 c0Var = this.f23074a;
                this.f23076c.getClass();
                c0Var.a(exc2, (exc == null || !(exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a)) ? ((exc instanceof k1) && ((k1) exc).f24236a == 404) ? InneractiveErrorCode.NO_FILL : InneractiveErrorCode.CONNECTION_ERROR : InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, this.f23075b);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f24047d;
        com.fyber.inneractive.sdk.metrics.i iVarB2 = dVar.b(this.f23076c.f23082d);
        iVarB2.f24061a.put(new com.fyber.inneractive.sdk.metrics.h("success"), Long.valueOf(System.currentTimeMillis() - iVarB2.f24063c));
        c0 c0Var2 = this.f23074a;
        if (c0Var2 != null) {
            IAlog.a("%s : InneractiveAdSpotImpl data available", h0.a(c0Var2.f23544d));
            h0 h0Var = c0Var2.f23544d;
            com.fyber.inneractive.sdk.config.global.r rVar = c0Var2.f23542b;
            e0 e0Var = h0Var.f23649d;
            if (h0Var.f23658m.get()) {
                IAlog.a("%s: loadAdWithRetries: spot is already destroyed won't continue", IAlog.a(h0Var));
                h0Var.a(h0Var.f23650e);
                return;
            }
            com.fyber.inneractive.sdk.flow.p pVar = h0Var.f23657l;
            if (pVar != null) {
                pVar.f23757b = e0Var;
                dVar.b(h0Var.f23646a).f24064d = System.currentTimeMillis();
                pVar.f23763g = eVar;
                if (!IAConfigManager.e()) {
                    IAConfigManager.addListener(pVar);
                    IAConfigManager.a();
                } else {
                    pVar.f23758c = rVar;
                    com.fyber.inneractive.sdk.network.p pVar2 = new com.fyber.inneractive.sdk.network.p(rVar, eVar, h0Var.f23646a, pVar);
                    pVar.f23759d = pVar2;
                    pVar2.c();
                }
            }
        }
    }
}
