package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.h0;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f24451a;

    public w(z zVar) {
        this.f24451a = zVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        z zVar = this.f24451a;
        zVar.getClass();
        sb2.append(IAlog.a(zVar));
        sb2.append("web view callback: onSuspiciousNoUserWebActionDetected");
        IAlog.a(sb2.toString(), new Object[0]);
        g0 g0Var = this.f24451a.f24461g;
        if (g0Var != null) {
            g0Var.a(str, str2);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b() {
        z zVar = this.f24451a;
        if (zVar.f24461g != null) {
            com.fyber.inneractive.sdk.player.ui.s sVar = zVar.f24458d;
            this.f24451a.f24461g.a(sVar != null ? sVar.getEndCardView() : null);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        z zVar = this.f24451a;
        if (zVar.f24461g != null) {
            com.fyber.inneractive.sdk.player.ui.s sVar = zVar.f24458d;
            this.f24451a.f24461g.a(sVar != null ? sVar.getEndCardView() : null);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        z zVar = this.f24451a;
        zVar.getClass();
        IAlog.a("%sweb view callback: onClickedAndOpen", IAlog.a(zVar));
        this.f24451a.a(w0.COMPANION.a());
        z zVar2 = this.f24451a;
        if (zVar2.f24461g != null) {
            com.fyber.inneractive.sdk.player.f fVar = zVar2.f24455a;
            if (fVar != null) {
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = ((com.fyber.inneractive.sdk.player.n) fVar).f26226t.f23574b.a();
                if (bVarA instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                    fVar.a((com.fyber.inneractive.sdk.flow.endcard.c) bVarA, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            }
            IAlog.d("AD_CLICKED", new Object[0]);
            this.f24451a.f24461g.f();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        g0 g0Var = this.f24451a.f24461g;
        if (g0Var != null) {
            g0Var.j();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z10) {
        z zVar = this.f24451a;
        zVar.getClass();
        IAlog.a("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.a(zVar), Boolean.valueOf(z10));
        g0 g0Var = this.f24451a.f24461g;
        if (g0Var == null || !z10) {
            return;
        }
        g0Var.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        z zVar = this.f24451a;
        zVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(zVar));
        this.f24451a.a(w0.COMPANION.a());
        z zVar2 = this.f24451a;
        if (zVar2.f24461g != null) {
            com.fyber.inneractive.sdk.player.f fVar = zVar2.f24455a;
            if (fVar != null) {
                com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.f26226t;
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVar.f23574b.a();
                com.fyber.inneractive.sdk.flow.endcard.c cVar = bVarA;
                if (bVarA != 0) {
                    boolean zJ = bVarA.j();
                    cVar = bVarA;
                    if (zJ) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar2 = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f23574b.a(com.fyber.inneractive.sdk.model.vast.i.Other);
                        cVar = cVar2;
                        if (cVar2 == null) {
                            com.fyber.inneractive.sdk.flow.endcard.c cVar3 = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f23574b.a(com.fyber.inneractive.sdk.model.vast.i.Html);
                            cVar = cVar3;
                            if (cVar3 == null) {
                                com.fyber.inneractive.sdk.flow.endcard.c cVar4 = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f23574b.a(com.fyber.inneractive.sdk.model.vast.i.Iframe);
                                cVar = cVar4;
                                if (cVar4 == null) {
                                    cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f23574b.a(com.fyber.inneractive.sdk.model.vast.i.Static);
                                }
                            }
                        }
                    }
                }
                com.fyber.inneractive.sdk.flow.endcard.b bVarA2 = nVar.f26226t.f23574b.a();
                com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK;
                com.fyber.inneractive.sdk.flow.endcard.c cVar5 = cVar instanceof com.fyber.inneractive.sdk.response.i ? cVar : null;
                List listA = cVar5 != null ? cVar5.a(xVar) : null;
                if (listA != null && !listA.isEmpty()) {
                    fVar.a(cVar, VideoClickOrigin.COMPANION, xVar);
                } else {
                    this.f24451a.getClass();
                    if ((bVarA2 instanceof com.fyber.inneractive.sdk.flow.endcard.o) && ((com.fyber.inneractive.sdk.flow.endcard.o) bVarA2).f23614h.f26834b > 0) {
                        nVar.a(nVar.f26222p, VideoClickOrigin.COMPANION, xVar);
                    }
                }
            }
            IAlog.d("AD_CLICKED", new Object[0]);
            com.fyber.inneractive.sdk.player.ui.s sVar = this.f24451a.f24458d;
            if (sVar != null) {
                sVar.f();
            }
            return this.f24451a.f24461g.a(str, g1Var, false);
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("mListener is null, internal SDK fatal error"));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        g0 g0Var = this.f24451a.f24461g;
        if (g0Var != null) {
            g0Var.i();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        View endCardView = this.f24451a.f24458d.getEndCardView();
        g0 g0Var = this.f24451a.f24461g;
        if (g0Var == null) {
            return false;
        }
        g0Var.a(endCardView, str);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        g0 g0Var = this.f24451a.f24461g;
        if (g0Var != null) {
            g0Var.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z10, Orientation orientation) {
        z zVar = this.f24451a;
        zVar.getClass();
        IAlog.a("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.a(zVar), Boolean.valueOf(z10), orientation.toString());
        g0 g0Var = this.f24451a.f24461g;
        if (g0Var != null) {
            g0Var.a(z10, orientation);
        }
    }
}
