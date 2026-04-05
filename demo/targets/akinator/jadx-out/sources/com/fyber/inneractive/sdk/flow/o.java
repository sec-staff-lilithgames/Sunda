package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o implements com.fyber.inneractive.sdk.interfaces.a, com.fyber.inneractive.sdk.interfaces.b {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.c f23756a;

    /* renamed from: b, reason: collision with root package name */
    public n f23757b;

    /* renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f23758c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.m f23759d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23760e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23761f = false;

    public o(String str) {
        this.f23760e = str;
    }

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
    }

    public final com.fyber.inneractive.sdk.response.e c() {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f23756a;
        if (cVar == null) {
            return null;
        }
        k kVar = (k) cVar;
        x xVar = kVar.f23663c;
        return xVar != null ? xVar.b() : kVar.f23662b;
    }

    public String d() {
        return IAlog.a(this);
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (IAlog.f26748a <= 3) {
            Thread.dumpStack();
        }
        IAlog.e("%sgot onAdRequestFailed! with: %s", d(), inneractiveInfrastructureError.getErrorCode());
        if (this.f23757b != null) {
            if (eVar != null && eVar.f26637i != null) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.f26637i + ": " + eVar.f26638j));
            }
            ((e0) this.f23757b).a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public void a(InneractiveAdRequest inneractiveAdRequest) {
        x xVar;
        com.fyber.inneractive.sdk.response.e eVar;
        s0 s0Var;
        IAlog.e("%sgot onAdLoaded!", d());
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f23756a;
        if (cVar != null) {
            n nVar = this.f23757b;
            if (nVar != null && (xVar = ((k) cVar).f23663c) != null) {
                e0 e0Var = (e0) nVar;
                if (e0Var.f23552a.f23658m.get()) {
                    IAlog.a("%s: onAdLoaded: spot is already destroyed", h0.a(e0Var.f23552a));
                    h0 h0Var = e0Var.f23552a;
                    p pVar = h0Var.f23657l;
                    h0Var.a(xVar);
                } else {
                    h0 h0Var2 = e0Var.f23552a;
                    if (!h0Var2.f23655j && (s0Var = h0Var2.f23651f) != null && s0Var.supportsRefresh()) {
                        if (e0Var.f23552a.f23651f.canRefreshAd()) {
                            h0 h0Var3 = e0Var.f23552a;
                            h0Var3.f23650e = xVar;
                            xVar.f23944a = inneractiveAdRequest;
                            g0 g0Var = h0Var3.f23654i;
                            if (g0Var != null) {
                                g0Var.onAdRefreshed(h0Var3);
                            } else {
                                s0 s0Var2 = h0Var3.f23651f;
                                if (s0Var2 instanceof InneractiveAdViewUnitController) {
                                    ((InneractiveAdViewUnitController) s0Var2).onAdRefreshed(h0Var3);
                                }
                            }
                        } else {
                            IAlog.a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", h0.a(e0Var.f23552a));
                            h0 h0Var4 = e0Var.f23552a;
                            h0Var4.f23654i.onAdRefreshFailed(h0Var4, InneractiveErrorCode.CANCELLED);
                        }
                    } else {
                        h0 h0Var5 = e0Var.f23552a;
                        h0Var5.f23650e = xVar;
                        xVar.f23944a = inneractiveAdRequest;
                        Iterator it = h0Var5.f23652g.iterator();
                        while (it.hasNext()) {
                            s0 s0Var3 = (s0) it.next();
                            if (s0Var3.supports(h0Var5)) {
                                h0Var5.f23651f = s0Var3;
                                h0 h0Var6 = e0Var.f23552a;
                                InneractiveAdSpot.RequestListener requestListener = h0Var6.f23647b;
                                if (requestListener != null) {
                                    if (requestListener instanceof InneractiveAdSpot.NativeAdRequestListener) {
                                        InneractiveAdSpot.NativeAdRequestListener nativeAdRequestListener = (InneractiveAdSpot.NativeAdRequestListener) requestListener;
                                        s0 s0Var4 = h0Var6.f23651f;
                                        if ((xVar instanceof w0) && (s0Var4 instanceof NativeAdUnitController)) {
                                            w0 w0Var = (w0) xVar;
                                            w0Var.f23941v = (NativeAdUnitController) s0Var4;
                                            nativeAdRequestListener.onInneractiveSuccessfulNativeAdRequest(h0Var6, w0Var);
                                        } else {
                                            IAlog.b("%s: Invalid native response: controller or/and content mismatch", IAlog.a(h0Var6));
                                            nativeAdRequestListener.onInneractiveFailedAdRequest(h0Var6, InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH);
                                        }
                                    } else {
                                        requestListener.onInneractiveSuccessfulAdRequest(h0Var6);
                                    }
                                }
                                e0Var.f23552a.f23655j = false;
                            }
                        }
                        IAlog.a("%sCannot find appropriate unit controller for unit: %s", h0.a(e0Var.f23552a), e0Var.f23552a.f23650e.f23947d);
                        m mVar = e0Var.f23552a.f23653h;
                        com.fyber.inneractive.sdk.response.e eVarC = mVar != null ? mVar.c() : null;
                        e0Var.a(inneractiveAdRequest, eVarC, new InneractiveInfrastructureError(InneractiveErrorCode.INVALID_INPUT, i.COULD_NOT_SELECT_UNIT_CONTROLLER, new Exception("Cannot find appropriate unit controller for unit: " + e0Var.f23552a.f23650e.f23947d)));
                        h0 h0Var7 = e0Var.f23552a;
                        h0Var7.f23650e = null;
                        h0Var7.f23655j = false;
                    }
                    String str = e0Var.f23552a.f23646a;
                    com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f24047d;
                    dVar.a(str).e();
                    dVar.a(str).b();
                    h0 h0Var8 = e0Var.f23552a;
                    x xVar2 = h0Var8.f23650e;
                    if (xVar2 != null && (eVar = xVar2.f23945b) != null && eVar.f26644p != null) {
                        x xVar3 = h0Var8.f23650e;
                        com.fyber.inneractive.sdk.response.e eVar2 = xVar3.f23945b;
                        new com.fyber.inneractive.sdk.metrics.c(eVar2, h0Var8.f23648c, h0Var8.f23646a, eVar2.f26644p, xVar3.f23946c.b()).a();
                    }
                }
            } else {
                IAlog.b("%sgot onAdLoaded! but content or listener is null", d());
            }
            this.f23756a = null;
        }
        b(inneractiveAdRequest);
    }

    public void b(InneractiveAdRequest inneractiveAdRequest) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        x xVar;
        IAlog.e("%sgot onFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f23756a;
        InneractiveAdRequest inneractiveAdRequest = (cVar == null || (xVar = ((k) cVar).f23663c) == null) ? null : xVar.f23944a;
        com.fyber.inneractive.sdk.response.e eVarC = c();
        IAlog.e("%sgot handleFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        n nVar = this.f23757b;
        if (nVar != null) {
            ((e0) nVar).a(inneractiveAdRequest, eVarC, inneractiveInfrastructureError);
        }
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
            a(inneractiveAdRequest, eVarC);
        }
    }

    public void a(boolean z10) {
        this.f23761f = true;
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f23756a;
        if (cVar == null || !z10) {
            return;
        }
        cVar.cancel();
        x xVar = ((k) this.f23756a).f23663c;
        if (xVar != null) {
            xVar.destroy();
        }
        this.f23756a = null;
    }
}
