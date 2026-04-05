package com.fyber.inneractive.sdk.external;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.factories.j;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.renderers.a0;
import com.fyber.inneractive.sdk.renderers.c0;
import com.fyber.inneractive.sdk.renderers.w;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class NativeAdUnitController extends s0 implements com.fyber.inneractive.sdk.flow.nativead.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f23509a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f23510b;

    public final void a() {
        ViewGroup viewGroup = this.f23510b;
        if (viewGroup != null) {
            this.f23510b = null;
            IAlog.a("%s: unbindView called with %s", logPrefix(), viewGroup);
            IAlog.a("%s: spot is %s", logPrefix(), getAdSpot());
            Iterator it = new HashSet(this.f23509a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                    com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                    if (dVar.b(viewGroup)) {
                        IAlog.a("%s: unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                        dVar.t();
                        break;
                    }
                }
            }
        }
        Iterator it2 = new HashSet(this.f23509a).iterator();
        while (it2.hasNext()) {
            ((InneractiveAdRenderer) it2.next()).destroy();
        }
        this.f23509a.clear();
        this.f23510b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.a
    public void bind(MediaView mediaView) {
        w c0Var;
        r rVar;
        IAlog.a("%s: bindView called with parent: %s", logPrefix(), mediaView);
        InneractiveAdSpot adSpot = getAdSpot();
        com.fyber.inneractive.sdk.response.e eVarB = null;
        if (adSpot == null) {
            IAlog.f("NativeAdUnitController was not attached to an ad spot", new Object[0]);
        } else {
            Iterator it = new HashSet(this.f23509a).iterator();
            while (true) {
                if (it.hasNext()) {
                    InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                    if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                        com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                        if (dVar.b(mediaView)) {
                            dVar.m();
                            IAlog.a("%s: bindView returning an already attached renderer %s", logPrefix(), dVar);
                            break;
                        }
                    }
                } else {
                    this.f23510b = mediaView;
                    Iterator it2 = j.f23526a.f23527a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            c0Var = null;
                            break;
                        }
                        ((com.fyber.inneractive.sdk.nativead.d) it2.next()).getClass();
                        if (adSpot.getAdContent() instanceof w0) {
                            x adContent = adSpot.getAdContent();
                            c0Var = ((adContent instanceof w0) && adContent.isVideoAd()) ? new c0() : new a0();
                        }
                    }
                    if (c0Var != null) {
                        ((w0) adSpot.getAdContent()).f23940u.f23712b = c0Var;
                        c0Var.initialize(adSpot);
                        selectContentController();
                        c0Var.b(mediaView);
                        this.f23509a.add(c0Var);
                        IAlog.a("%s: created renderer %s", logPrefix(), c0Var);
                    } else {
                        IAlog.f("%s: Could not find a renderer for the given spot!", logPrefix());
                    }
                }
            }
        }
        i0 i0Var = this.mAdSpot.get();
        if (i0Var == null || i0Var.getAdContent() == null) {
            rVar = null;
        } else {
            x adContent2 = i0Var.getAdContent();
            eVarB = adContent2.b();
            rVar = adContent2.f23946c;
        }
        View viewCreatePrivacyView = createPrivacyView(mediaView.getContext(), eVarB, rVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        mediaView.addView(viewCreatePrivacyView, layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean canRefreshAd() {
        return false;
    }

    public View createPrivacyView(Context context, com.fyber.inneractive.sdk.response.e eVar, r rVar) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.ia_layout_fyber_ad_identifier_relative, (ViewGroup) null, false);
        com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(context, false, null, eVar, rVar);
        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
        IFyberAdIdentifier iFyberAdIdentifier = gVar.f23645d;
        iFyberAdIdentifier.f26733k = corner;
        iFyberAdIdentifier.a(viewGroup);
        viewGroup.setVisibility(0);
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            com.fyber.inneractive.sdk.util.r.f26804b.post(new h(this));
        } else {
            a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof NativeAdContent;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return false;
    }
}
