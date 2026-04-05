package com.fyber.inneractive.sdk.dv.interstitial;

import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.google.android.gms.ads.AdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f23452a;

    public e(g gVar) {
        this.f23452a = gVar;
    }

    public final void onAdFailedToLoad(int i10) {
        com.fyber.inneractive.sdk.dv.c cVar = this.f23452a.f23428g;
        if (cVar != null) {
            cVar.j();
            InneractiveAdRequest inneractiveAdRequest = this.f23452a.f23944a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
            g gVar = this.f23452a;
            com.fyber.inneractive.sdk.dv.handler.e.a(spotId, aVar, gVar.f23944a, (i) gVar.f23945b, String.format("errorCode - %d", Integer.valueOf(i10)));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        g gVar = this.f23452a;
        if (gVar.f23428g != null) {
            gVar.g();
            this.f23452a.f23428g.g();
        }
    }
}
