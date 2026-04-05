package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.n0;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p extends e implements com.fyber.inneractive.sdk.interfaces.d, InneractiveNativeVideoContentController.Renderer, m0 {

    /* renamed from: l, reason: collision with root package name */
    public FrameLayout f26593l;

    /* renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.m f26594m;

    /* renamed from: n, reason: collision with root package name */
    public VideoContentListener f26595n;

    /* renamed from: p, reason: collision with root package name */
    public ViewGroup f26597p;

    /* renamed from: q, reason: collision with root package name */
    public d0 f26598q;

    /* renamed from: t, reason: collision with root package name */
    public n f26601t;

    /* renamed from: o, reason: collision with root package name */
    public final m f26596o = new m(this);

    /* renamed from: r, reason: collision with root package name */
    public float f26599r = 0.0f;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f26600s = new Rect();

    /* renamed from: u, reason: collision with root package name */
    public boolean f26602u = false;

    /* renamed from: v, reason: collision with root package name */
    public final o f26603v = new o(this);

    public void K() {
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        if (xVar != null) {
            t0 t0Var = (t0) xVar;
            if (t0Var.f23893j) {
                return;
            }
            t0Var.f23893j = true;
            G();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i10) {
    }

    public void b(ViewGroup viewGroup) {
        a(viewGroup);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        this.f26595n = null;
        t();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int e() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void m() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26570k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int o() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void pauseVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26570k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).z();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void playVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26570k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).c(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void r() throws JSONException {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26570k;
        if (bVar != null) {
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) bVar;
            IAlog.a("%sfullscreenExited called", IAlog.a(sVar));
            sVar.E = false;
            sVar.j(sVar.D);
            com.fyber.inneractive.sdk.player.f fVar = sVar.f24455a;
            if (fVar == null || (qVar = fVar.f26160a) == null) {
                return;
            }
            sVar.a(qVar.f24434e);
            sVar.a(sVar.f24455a.f26160a.b());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void t() {
        ViewGroup viewGroup;
        n nVar = this.f26601t;
        if (nVar != null && (viewGroup = this.f26597p) != null) {
            viewGroup.removeCallbacks(nVar);
            this.f26601t = null;
        }
        l0.f26787a.a(this.f26597p);
        IAlog.a("%sunbind called. root is %s", IAlog.a(this), this.f26597p);
        if (this.f26570k != null) {
            IAlog.a("%sdestroying video ui controller", IAlog.a(this));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f26570k;
            sVar.getClass();
            sVar.f24461g = null;
            ((com.fyber.inneractive.sdk.player.controller.s) this.f26570k).destroy();
            this.f26570k = null;
        }
        if (this.f26594m != null) {
            this.f26597p.setLayoutTransition(null);
            this.f26597p.removeView(this.f26593l);
            this.f26594m.destroy();
            this.f26594m = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context y() {
        return c(this.f26597p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public View z() {
        return this.f26593l;
    }

    public boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof t0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.f26597p);
    }

    public void a(ViewGroup viewGroup) {
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
        this.f26602u = false;
        this.f26593l = new FrameLayout(viewGroup.getContext());
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        com.fyber.inneractive.sdk.player.t tVar = xVar != null ? ((t0) xVar).f23892i : null;
        Context context = viewGroup.getContext();
        d0 d0VarA = a(tVar);
        this.f26598q = d0VarA;
        if (d0VarA != null) {
            this.f26594m = d0VarA.a(context, ((t0) this.f23531b).f23946c);
            this.f26570k = (com.fyber.inneractive.sdk.player.controller.s) this.f26598q.a(this.f23530a, (t0) this.f23531b);
            this.f26597p.addView(this.f26593l, new ViewGroup.LayoutParams(-1, -2));
            this.f26597p.setLayoutTransition(null);
            this.f26593l.addView((View) this.f26594m, new FrameLayout.LayoutParams(-2, -2, 17));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f26570k;
            o oVar = this.f26603v;
            sVar.getClass();
            sVar.f24461g = oVar;
            com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.f26570k;
            this.f26598q.b();
            sVar2.b(false);
            this.f26598q.a(this.f26596o);
            n0 n0Var = l0.f26787a;
            ViewGroup viewGroup2 = this.f26597p;
            n0Var.getClass();
            n0Var.a(viewGroup2.getContext(), viewGroup2, this);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
    }

    public boolean a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof InneractiveAdViewUnitController;
    }

    public VideoContentListener a(InneractiveContentController inneractiveContentController) {
        if (!(inneractiveContentController instanceof InneractiveAdViewVideoContentController)) {
            IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), inneractiveContentController.getClass().getSimpleName());
            return null;
        }
        return (VideoContentListener) ((InneractiveAdViewVideoContentController) inneractiveContentController).getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.f26599r == f10 && this.f26600s.equals(rect)) {
            return;
        }
        this.f26599r = f10;
        this.f26600s.set(rect);
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26570k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).D = false;
            ((com.fyber.inneractive.sdk.player.ui.e) this.f26594m).e();
            ((com.fyber.inneractive.sdk.player.controller.s) this.f26570k).a(f10);
        }
        if (f10 > 0.0f) {
            n nVar = this.f26601t;
            if (nVar != null && (viewGroup2 = this.f26597p) != null) {
                viewGroup2.removeCallbacks(nVar);
                this.f26601t = null;
            }
            n nVar2 = new n(this);
            this.f26601t = nVar2;
            this.f26597p.postDelayed(nVar2, 100L);
            return;
        }
        n nVar3 = this.f26601t;
        if (nVar3 == null || (viewGroup = this.f26597p) == null) {
            return;
        }
        viewGroup.removeCallbacks(nVar3);
        this.f26601t = null;
    }

    public d0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar == null || tVar.f26241f == null) {
            return null;
        }
        return new a(tVar);
    }
}
