package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.o f24252a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f24253b = false;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f24254c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24255d;

    public m(com.fyber.inneractive.sdk.config.global.r rVar, String str, com.fyber.inneractive.sdk.flow.o oVar) {
        this.f24252a = oVar;
        this.f24254c = rVar;
        this.f24255d = str;
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        com.fyber.inneractive.sdk.flow.o oVar;
        com.fyber.inneractive.sdk.flow.x xVar;
        if (this.f24252a == null) {
            return;
        }
        if (this.f24253b) {
            IAlog.e("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.config.r0 r0VarA = com.fyber.inneractive.sdk.config.a.a(eVar.f26643o);
        if (inneractiveAdRequest != null) {
            inneractiveAdRequest.setSelectedUnitConfig(r0VarA);
        }
        com.fyber.inneractive.sdk.config.global.e eVar2 = new com.fyber.inneractive.sdk.config.global.e();
        ImpressionData impressionData = eVar.f26648t;
        eVar2.f23283a = impressionData != null ? impressionData.getDemandId() : null;
        try {
            eVar2.f23284b = Long.valueOf(IAConfigManager.O.f23209d);
        } catch (NumberFormatException unused) {
            IAlog.a("invalid publisherId", new Object[0]);
        }
        this.f24254c.a(eVar2);
        InneractiveErrorCode inneractiveErrorCodeA = r0VarA == null ? InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH : eVar.a(inneractiveAdRequest, this.f24254c);
        if (inneractiveErrorCodeA != null) {
            com.fyber.inneractive.sdk.flow.i iVar = com.fyber.inneractive.sdk.flow.i.CONTENT_ERROR_UNSPECIFIED;
            if (r0VarA == null || inneractiveErrorCodeA == InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH) {
                iVar = com.fyber.inneractive.sdk.flow.i.NO_APP_CONFIG_AVAILABLE;
                IAlog.b("%sGot configuration mismatch!", IAlog.a(this));
                IAConfigManager.a();
            }
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCodeA, iVar);
            Exception exc = eVar.f26654z;
            if (exc != null) {
                inneractiveInfrastructureError.setCause(exc);
            }
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(eVar.f26635g);
            if (aVarA != null) {
                Exception exc2 = eVar.f26654z;
                if (exc2 != null) {
                    inneractiveInfrastructureError.setCause(exc2);
                }
                com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(eVar, inneractiveAdRequest, aVarA == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_HTML ? "send_failed_display_creatives" : "send_failed_vast_creatives", this.f24254c.b()), inneractiveInfrastructureError));
            }
            com.fyber.inneractive.sdk.config.global.r rVar = this.f24254c;
            if (rVar == null) {
                InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(this.f24255d);
                rVar = (spot == null || spot.getAdContent() == null) ? null : spot.getAdContent().f23946c;
            }
            com.fyber.inneractive.sdk.flow.a.a(inneractiveAdRequest, inneractiveInfrastructureError, null, eVar, rVar != null ? rVar.b() : null);
            if (this.f24253b || (oVar = this.f24252a) == null) {
                return;
            }
            oVar.a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
            return;
        }
        com.fyber.inneractive.sdk.flow.o oVar2 = this.f24252a;
        if (oVar2.f23761f) {
            IAlog.e("IAAdSourceBase: load cancelled: ignoring response. Previous load request was cancelled", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.config.global.r rVar2 = oVar2.f23758c;
        IAlog.e("%sonAdDataAvailable: got response data: %s", oVar2.d(), eVar);
        if (eVar.a()) {
            com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
            if (hVar.f23983f) {
                hVar.a((bb.a) null);
            }
        }
        com.fyber.inneractive.sdk.response.a aVarA2 = com.fyber.inneractive.sdk.response.a.a(eVar.f26635g);
        com.fyber.inneractive.sdk.interfaces.c cVar = oVar2.f23756a;
        if (cVar != null && (xVar = ((com.fyber.inneractive.sdk.flow.k) cVar).f23663c) != null) {
            xVar.destroy();
        }
        com.fyber.inneractive.sdk.factories.e eVar3 = (com.fyber.inneractive.sdk.factories.e) com.fyber.inneractive.sdk.factories.d.f23522a.f23523a.get(aVarA2);
        com.fyber.inneractive.sdk.interfaces.c cVarA = eVar3 != null ? eVar3.a() : null;
        oVar2.f23756a = cVarA;
        if (cVarA == null) {
            IAlog.f("%sonAdDataAvailable: Cannot find content handler for ad type: %s", oVar2.d(), aVarA2);
            com.fyber.inneractive.sdk.flow.n nVar = oVar2.f23757b;
            if (nVar != null) {
                ((com.fyber.inneractive.sdk.flow.e0) nVar).a(inneractiveAdRequest, eVar, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.NO_CONTENT_LOADER_AVAILABLE));
            }
        } else {
            IAlog.e("%sonAdDataAvailable: found response loader: %s", oVar2.d(), oVar2.f23756a);
        }
        com.fyber.inneractive.sdk.interfaces.c cVar2 = oVar2.f23756a;
        if (cVar2 != null) {
            ((com.fyber.inneractive.sdk.flow.k) cVar2).a(inneractiveAdRequest, eVar, rVar2, oVar2, oVar2);
        } else {
            z.a("NullPointerException prevented", "mAdContentLoader is null", inneractiveAdRequest, eVar);
        }
    }

    public String b() {
        return null;
    }

    public void a() {
        this.f24253b = true;
        this.f24252a = null;
    }
}
