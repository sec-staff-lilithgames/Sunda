package com.fyber.inneractive.sdk.dv.interstitial;

import com.google.android.gms.ads.FullScreenContentCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f23449a;

    public c(d dVar) {
        this.f23449a = dVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        a aVar = this.f23449a.f23020j;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        a aVar = this.f23449a.f23020j;
        if (aVar != null) {
            aVar.w();
        }
    }
}
