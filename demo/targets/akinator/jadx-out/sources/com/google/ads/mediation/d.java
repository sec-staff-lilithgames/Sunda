package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends FullScreenContentCallback {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractAdViewAdapter f27004b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationInterstitialListener f27005c;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f27004b = abstractAdViewAdapter;
        this.f27005c = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f27005c.onAdClosed(this.f27004b);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f27005c.onAdOpened(this.f27004b);
    }
}
