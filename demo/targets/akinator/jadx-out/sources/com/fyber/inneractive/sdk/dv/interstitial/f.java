package com.fyber.inneractive.sdk.dv.interstitial;

import com.google.android.gms.ads.AdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f23453a;

    public f(g gVar) {
        this.f23453a = gVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        a aVar = this.f23453a.f23020j;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        a aVar = this.f23453a.f23020j;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        a aVar = this.f23453a.f23020j;
        if (aVar != null) {
            aVar.w();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        a aVar = this.f23453a.f23020j;
        if (aVar != null) {
            aVar.w();
        }
    }
}
