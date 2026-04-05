package com.fyber.inneractive.sdk.flow;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.y f23541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r f23542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23543c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f23544d;

    public c0(h0 h0Var, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        this.f23544d = h0Var;
        this.f23541a = yVar;
        this.f23542b = rVar;
        this.f23543c = str;
    }

    public final void a() {
        com.fyber.inneractive.sdk.config.global.b bVar;
        com.fyber.inneractive.sdk.config.global.k kVar;
        com.fyber.inneractive.sdk.config.global.l lVar;
        IAlog.a("%s : InneractiveAdSpotImpl markup data available", h0.a(this.f23544d));
        if (this.f23544d.f23658m.get()) {
            h0 h0Var = this.f23544d;
            p pVar = h0Var.f23657l;
            h0Var.a(h0Var.f23650e);
            return;
        }
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f23541a.f23079a;
        if (admParametersOuterClass$AdmParameters != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f23542b;
            List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
            rVar.getClass();
            com.fyber.inneractive.sdk.config.global.a aVar = IAConfigManager.O.f23231z;
            aVar.getClass();
            for (com.fyber.inneractive.sdk.config.global.features.h hVar : rVar.f23309b.values()) {
                if (hVar != null && (lVar = aVar.f23275a) != null) {
                    com.fyber.inneractive.sdk.config.global.q qVar = (com.fyber.inneractive.sdk.config.global.q) lVar.f23303a.get(hVar.f23290b);
                    if (qVar != null) {
                        hVar.f23305a = qVar.f23305a;
                    }
                }
            }
            if (abExperimentsList == null || abExperimentsList.size() <= 0) {
                return;
            }
            com.fyber.inneractive.sdk.config.global.a aVar2 = IAConfigManager.O.f23231z;
            aVar2.f23276b = rVar;
            for (com.fyber.inneractive.sdk.config.global.features.h hVar2 : rVar.f23309b.values()) {
                for (AdmParametersOuterClass$AdmParameters.Experiment experiment : abExperimentsList) {
                    String identifier = experiment.getIdentifier();
                    String variant = experiment.getVariant();
                    com.fyber.inneractive.sdk.config.global.l lVar2 = aVar2.f23275a;
                    if (lVar2 != null) {
                        com.fyber.inneractive.sdk.config.global.q qVar2 = (com.fyber.inneractive.sdk.config.global.q) lVar2.f23303a.get(hVar2.f23290b);
                        if (qVar2 != null && (bVar = (com.fyber.inneractive.sdk.config.global.b) qVar2.f23307c.get(identifier)) != null) {
                            Iterator it = bVar.f23279c.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    kVar = (com.fyber.inneractive.sdk.config.global.k) it.next();
                                    if (kVar.f23301b.equals(variant)) {
                                        break;
                                    }
                                } else {
                                    kVar = null;
                                    break;
                                }
                            }
                            hVar2.f23291c.put(bVar.f23277a, bVar);
                            if (kVar != null) {
                                hVar2.f23292d.put(bVar.f23277a, kVar);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(Exception exc, InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.response.e... eVarArr) throws JSONException {
        i iVar;
        com.fyber.inneractive.sdk.network.t tVar;
        if (this.f23544d.f23658m.get()) {
            IAlog.a("%s : onResponseDataError: spot is already destroyed won't continue", h0.a(this.f23544d));
            h0 h0Var = this.f23544d;
            p pVar = h0Var.f23657l;
            h0Var.a(h0Var.f23650e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl data error", h0.a(this.f23544d));
        com.fyber.inneractive.sdk.response.e eVar = eVarArr.length > 0 ? eVarArr[0] : null;
        this.f23544d.getClass();
        if (exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a) {
            iVar = i.NATIVE_AD_PARSING_ERROR;
        } else {
            iVar = i.ADM_FETCH_FAILED;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, iVar);
        e0 e0Var = this.f23544d.f23649d;
        if (e0Var != null) {
            e0Var.a(null, eVar, inneractiveInfrastructureError);
        }
        p pVar2 = this.f23544d.f23657l;
        if (pVar2 != null) {
            IAlog.e("%sgot handleFailedLoading! with: %s", pVar2.d(), inneractiveInfrastructureError);
            n nVar = pVar2.f23757b;
            if (nVar != null) {
                ((e0) nVar).a(null, eVar, inneractiveInfrastructureError);
            }
            if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
                pVar2.a(null, eVar);
            }
        }
        h0 h0Var2 = this.f23544d;
        String str = this.f23543c;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f23542b;
        h0Var2.getClass();
        int i10 = f0.f23641a[inneractiveErrorCode.ordinal()];
        if (i10 == 1 || i10 == 2) {
            tVar = com.fyber.inneractive.sdk.network.t.FATAL_ADM_MARKUP_FETCHING_ERROR;
        } else if (i10 != 3) {
            tVar = com.fyber.inneractive.sdk.network.t.FATAL_ADM_PARSING_ERROR;
        } else {
            tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_INVALID_NATIVE_RESPONSE;
        }
        if (eVar != null) {
            eVar.D = false;
        }
        String name = exc.getClass().getName();
        if (exc instanceof k1) {
            name = "NetworkStackException";
        }
        JSONArray jSONArrayB = rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.f24325b = tVar;
        wVar.f24324a = null;
        wVar.f24327d = jSONArrayB;
        com.fyber.inneractive.sdk.network.x xVar = new com.fyber.inneractive.sdk.network.x();
        xVar.a(name, "exception").a(exc.getLocalizedMessage() != null ? exc.getLocalizedMessage() : exc, PglCryptUtils.KEY_MESSAGE);
        InneractiveErrorCode inneractiveErrorCode2 = InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD;
        if (inneractiveErrorCode == inneractiveErrorCode2 && exc.getCause() != null && exc.getCause().getCause() != null) {
            xVar.a(exc.getCause().getCause().getMessage(), "reason");
        } else if (inneractiveErrorCode != inneractiveErrorCode2) {
            xVar.a(str, "admPayload");
        }
        wVar.f24329f.put(xVar.f24331a);
        wVar.a((String) null);
    }
}
