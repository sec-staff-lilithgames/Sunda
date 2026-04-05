package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 extends e implements w, m0 {

    /* renamed from: l, reason: collision with root package name */
    public ViewGroup f26548l;

    /* renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.trackers.a f26550n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f26551o;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26549m = false;

    /* renamed from: p, reason: collision with root package name */
    public final y f26552p = new y(this);

    static {
        IAlog.a(a0.class);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean E() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26570k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.ui.controller.a) bVar).a(f10);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.w
    public final void b(ViewGroup viewGroup) {
        if (this.f23530a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f26548l = viewGroup;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ImageView imageView = new ImageView(this.f26548l.getContext());
        this.f26551o = imageView;
        imageView.setImageURI(((w0) this.f23531b).f23932m);
        this.f26551o.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        this.f26548l.setLayoutParams(layoutParams);
        this.f26548l.addView(this.f26551o, layoutParams);
        com.fyber.inneractive.sdk.ui.controller.a aVar = new com.fyber.inneractive.sdk.ui.controller.a();
        this.f26570k = aVar;
        aVar.f26738a = this.f26552p;
        n0 n0Var = l0.f26787a;
        ViewGroup viewGroup2 = this.f26548l;
        n0Var.getClass();
        n0Var.a(viewGroup2.getContext(), viewGroup2, this);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f26550n;
        if (aVar != null) {
            aVar.a();
            this.f26550n = null;
        }
        ImageView imageView = this.f26551o;
        if (imageView != null) {
            imageView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.f26551o = null;
        }
        l0.f26787a.a(this.f26548l);
        com.fyber.inneractive.sdk.util.v.a(this.f26548l);
        this.f26548l = null;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26570k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.ui.controller.a) bVar).f26738a = null;
        }
        super.destroy();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z10) {
        l0.f26787a.a(com.fyber.inneractive.sdk.util.o.a(z()).getApplicationContext());
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        MediaView mediaView;
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        return (xVar == null || (mediaView = ((w0) xVar).f23933n) == null) ? this.f26548l : mediaView;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.k
    public final void a(String str, boolean z10, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        if (!this.f26549m) {
            com.fyber.inneractive.sdk.util.r.f26804b.post(new z(this));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26570k;
            if (bVar instanceof com.fyber.inneractive.sdk.ui.controller.a) {
                ((com.fyber.inneractive.sdk.ui.controller.a) bVar).f26739b.set(true);
            }
        }
        com.fyber.inneractive.sdk.util.r.f26804b.post(new com.fyber.inneractive.sdk.flow.y(this, com.fyber.inneractive.sdk.util.o.a(z()), str, new g1(), gVar, z10, oVar));
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.c
    public final void b() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f26550n;
        if (aVar != null) {
            aVar.a();
        }
    }
}
