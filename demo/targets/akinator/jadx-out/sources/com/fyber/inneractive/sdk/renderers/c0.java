package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 extends p implements w {

    /* renamed from: w, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.trackers.a f26555w;

    /* renamed from: x, reason: collision with root package name */
    public WeakReference f26556x;

    static {
        IAlog.a(c0.class);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean E() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean F() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.renderers.p
    public final void K() {
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.player.n nVar;
        InneractiveAdSpot inneractiveAdSpot = this.f23530a;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || (xVar = this.f23531b) == null || ((t0) xVar).f23893j) {
            return;
        }
        IAlog.a("%sTracking impression", IAlog.a(this));
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) this.f23530a.getAdContent());
        this.f26555w = aVar;
        aVar.a(this);
        d0 d0Var = this.f26598q;
        if (d0Var != null && (nVar = d0Var.f26569c) != null) {
            if (nVar.f26229w.compareAndSet(false, true)) {
                nVar.a(nVar.f26222p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_IMPRESSION, com.fyber.inneractive.sdk.model.vast.x.EVENT_START);
            } else {
                IAlog.a("%sreportPlayStartEvents called, but start events was already reported", IAlog.a(nVar));
            }
        }
        super.K();
    }

    @Override // com.fyber.inneractive.sdk.renderers.p
    public final d0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar != null) {
            return new x(tVar);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.c
    public final void b() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f26555w;
        if (aVar != null) {
            aVar.a();
            this.f26555w = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.p, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f26555w;
        if (aVar != null) {
            aVar.a();
            this.f26555w = null;
        }
        WeakReference weakReference = this.f26556x;
        com.fyber.inneractive.sdk.player.ui.t tVar = weakReference != null ? (com.fyber.inneractive.sdk.player.ui.t) weakReference.get() : null;
        if (tVar != null) {
            tVar.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
        l0.f26787a.a(this.f26597p);
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        if (inneractiveAdSpot.getAdContent() instanceof w0) {
            this.f23531b = ((w0) inneractiveAdSpot.getAdContent()).f23938s;
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z10) {
        l0.f26787a.a(c(this.f26597p).getApplicationContext());
        WeakReference weakReference = this.f26556x;
        com.fyber.inneractive.sdk.player.ui.t tVar = weakReference != null ? (com.fyber.inneractive.sdk.player.ui.t) weakReference.get() : null;
        if (tVar != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(new com.fyber.inneractive.sdk.player.ui.d(tVar, z10), 500L);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.p, com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        InneractiveAdSpot inneractiveAdSpot = this.f23530a;
        MediaView mediaView = (inneractiveAdSpot == null || !(inneractiveAdSpot.getAdContent() instanceof w0)) ? null : ((w0) this.f23530a.getAdContent()).f23933n;
        return mediaView != null ? mediaView : this.f26597p;
    }

    @Override // com.fyber.inneractive.sdk.renderers.p, com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof NativeAdContent;
    }

    @Override // com.fyber.inneractive.sdk.renderers.p
    public final boolean a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof NativeAdUnitController;
    }

    @Override // com.fyber.inneractive.sdk.renderers.p
    public final VideoContentListener a(InneractiveContentController inneractiveContentController) {
        if (!(inneractiveContentController instanceof NativeAdVideoContentController)) {
            IAlog.f("%s: Content controller expected to be NativeAdVideoContentController but it: %s", IAlog.a(this), inneractiveContentController);
            return null;
        }
        return (VideoContentListener) ((NativeAdVideoContentController) inneractiveContentController).getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.renderers.p, com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.player.ui.t tVar;
        com.fyber.inneractive.sdk.player.n nVar;
        InneractiveAdSpot inneractiveAdSpot = this.f23530a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f26597p = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (!a(selectedUnitController)) {
            IAlog.f("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.a(this));
        } else {
            this.f26595n = a(selectedUnitController.getSelectedContentController());
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        Float fValueOf = null;
        com.fyber.inneractive.sdk.player.t tVar2 = xVar != null ? ((t0) xVar).f23892i : null;
        Context context = viewGroup.getContext();
        d0 d0VarA = a(tVar2);
        this.f26598q = d0VarA;
        if (d0VarA != null) {
            com.fyber.inneractive.sdk.player.ui.m mVarA = d0VarA.a(context, ((t0) this.f23531b).f23946c);
            this.f26594m = mVarA;
            if (mVarA instanceof com.fyber.inneractive.sdk.player.ui.t) {
                tVar = (com.fyber.inneractive.sdk.player.ui.t) mVarA;
                tVar.getViewTreeObserver().addOnWindowFocusChangeListener(this);
            } else {
                tVar = null;
            }
            this.f26556x = new WeakReference(tVar);
            this.f26570k = (com.fyber.inneractive.sdk.player.controller.s) this.f26598q.a(this.f23530a, (t0) this.f23531b);
            viewGroup.addView((View) this.f26594m, new ViewGroup.LayoutParams(-1, -1));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f26570k;
            o oVar = this.f26603v;
            sVar.getClass();
            sVar.f24461g = oVar;
            com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.f26570k;
            this.f26598q.b();
            sVar2.b(false);
            this.f26598q.a(this.f26596o);
            InneractiveAdSpot inneractiveAdSpot2 = this.f23530a;
            if (inneractiveAdSpot2 != null && (inneractiveAdSpot2.getAdContent() instanceof w0)) {
                w0 w0Var = (w0) this.f23530a.getAdContent();
                d0 d0Var = this.f26598q;
                com.fyber.inneractive.sdk.player.controller.q qVar = (d0Var == null || (nVar = d0Var.f26569c) == null) ? null : nVar.f26160a;
                if (qVar != null && qVar.e() > 0 && qVar.f() > 0) {
                    fValueOf = Float.valueOf(qVar.f() / qVar.e());
                }
                w0Var.f23935p = fValueOf;
            }
            n0 n0Var = l0.f26787a;
            ViewGroup viewGroup2 = this.f26597p;
            n0Var.getClass();
            n0Var.a(viewGroup2.getContext(), viewGroup2, this);
            return;
        }
        IAlog.f("%s : can't render - video renderer is missing", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.k
    public final void a(String str, boolean z10, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        com.fyber.inneractive.sdk.flow.x xVar;
        InneractiveAdSpot inneractiveAdSpot = this.f23530a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && (xVar = this.f23531b) != null && !((t0) xVar).f23893j) {
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26570k;
            if (bVar instanceof com.fyber.inneractive.sdk.player.controller.c0) {
                ((com.fyber.inneractive.sdk.player.controller.c0) bVar).F.set(true);
            }
            com.fyber.inneractive.sdk.util.r.f26804b.post(new b0(this));
        }
        com.fyber.inneractive.sdk.util.r.f26804b.post(new com.fyber.inneractive.sdk.flow.y(this, c(this.f26597p), str, new g1(), gVar, z10, oVar));
    }
}
