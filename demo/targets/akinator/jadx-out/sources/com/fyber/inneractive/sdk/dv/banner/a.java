package com.fyber.inneractive.sdk.dv.banner;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.handler.e;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.x;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f23432a;

    public a(b bVar) {
        this.f23432a = bVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        InneractiveAdRequest inneractiveAdRequest = this.f23432a.f23944a;
        String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
        com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
        b bVar = this.f23432a;
        e.a(spotId, aVar, bVar.f23944a, (i) bVar.f23945b, loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        b bVar = this.f23432a;
        c cVar = bVar.f23429h;
        if (cVar != null) {
            cVar.w();
        } else {
            bVar.f23433j = true;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        b bVar = this.f23432a;
        com.fyber.inneractive.sdk.dv.c cVar = bVar.f23428g;
        if (cVar != null) {
            bVar.f23434k = true;
            cVar.g();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        i iVar;
        l0 l0Var;
        c cVar = this.f23432a.f23429h;
        if (cVar != null) {
            cVar.a(cVar.y(), false, Float.NaN, Float.NaN);
            x xVar = cVar.f23531b;
            if (xVar == null || (iVar = (i) ((b) xVar).f23945b) == null) {
                return;
            }
            b0.a(iVar);
            s0 s0Var = ((b) cVar.f23531b).f23947d;
            if (s0Var == null || (l0Var = ((r0) s0Var).f23345c) == null) {
                return;
            }
            b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, l0Var.f23330b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY);
        }
    }
}
