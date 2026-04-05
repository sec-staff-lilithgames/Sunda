package com.fyber.inneractive.sdk.dv.banner;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.interfaces.d;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends b0 implements d {

    /* renamed from: k, reason: collision with root package name */
    public ViewGroup f23436k;

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i10) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        ViewGroup viewGroup = this.f23436k;
        return viewGroup != null && viewGroup.equals(view);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        x xVar = this.f23531b;
        if (xVar != null) {
            Object obj = ((b) xVar).f23430i;
            if (obj != null) {
                ((AdView) obj).destroy();
            }
            b bVar = (b) this.f23531b;
            bVar.f23428g = null;
            bVar.f23430i = null;
        }
        ViewGroup viewGroup = this.f23436k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f23436k = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int e() {
        Object obj;
        x xVar = this.f23531b;
        if (xVar == null || (obj = ((b) xVar).f23430i) == null || ((AdView) obj).getAdSize() == null) {
            return 0;
        }
        return o.b(((AdView) ((b) this.f23531b).f23430i).getAdSize().getWidth());
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int o() {
        Object obj;
        x xVar = this.f23531b;
        if (xVar == null || (obj = ((b) xVar).f23430i) == null || ((AdView) obj).getAdSize() == null) {
            return 0;
        }
        return o.b(((AdView) ((b) this.f23531b).f23430i).getAdSize().getHeight());
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void t() {
        ViewGroup viewGroup = this.f23436k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f23436k = null;
        }
    }

    public final void w() {
        i iVar;
        l0 l0Var;
        G();
        x xVar = this.f23531b;
        if (xVar == null || (iVar = (i) ((b) xVar).f23945b) == null) {
            return;
        }
        b(iVar);
        s0 s0Var = ((b) this.f23531b).f23947d;
        if (s0Var == null || (l0Var = ((r0) s0Var).f23345c) == null) {
            return;
        }
        b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION, l0Var.f23330b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        return this.f23436k;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        x xVar;
        if (this.f23530a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        if (viewGroup == null || (xVar = this.f23531b) == null) {
            return;
        }
        b bVar = (b) xVar;
        if (bVar.f23430i != null) {
            bVar.f23429h = this;
            if (bVar.f23433j) {
                w();
                bVar.f23433j = false;
            }
            this.f23436k = viewGroup;
            viewGroup.addView((View) ((b) this.f23531b).f23430i);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(x xVar) {
        return xVar instanceof com.fyber.inneractive.sdk.dv.a;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void m() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void r() {
    }
}
