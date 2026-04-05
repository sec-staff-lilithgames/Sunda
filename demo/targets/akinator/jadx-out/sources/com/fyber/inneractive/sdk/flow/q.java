package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements com.fyber.inneractive.sdk.web.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f23776a;

    public q(s sVar) {
        this.f23776a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        s sVar = this.f23776a;
        sVar.getClass();
        IAlog.a("%sweb view returned onReady!", IAlog.a(sVar));
        com.fyber.inneractive.sdk.response.e eVar = this.f23776a.f23662b;
        UnitDisplayType unitDisplayType = eVar != null ? ((com.fyber.inneractive.sdk.response.f) eVar).f26644p : null;
        if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
            s sVar2 = this.f23776a;
            sVar2.getClass();
            try {
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EVENT_READY_ON_CLIENT;
                InneractiveAdRequest inneractiveAdRequest = sVar2.f23661a;
                x xVar = sVar2.f23663c;
                new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, xVar != null ? ((q0) xVar).f23945b : null).a((String) null);
            } catch (Exception unused) {
            }
        }
        this.f23776a.g();
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        s sVar = this.f23776a;
        sVar.getClass();
        com.fyber.inneractive.sdk.util.r.f26803a.execute(new e(new f(sVar.f23662b, sVar.f23661a, "send_failed_display_creatives", sVar.f23667g.b()), inneractiveInfrastructureError));
        s sVar2 = this.f23776a;
        sVar2.getClass();
        IAlog.a("%sweb view returned onFailedLoading!", IAlog.a(sVar2));
        this.f23776a.b(inneractiveInfrastructureError);
        if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.MRAID_ERROR_UNSECURE_CONTENT;
            s sVar3 = this.f23776a;
            new com.fyber.inneractive.sdk.network.w(tVar, sVar3.f23661a, sVar3.f23662b).a((String) null);
        }
    }
}
