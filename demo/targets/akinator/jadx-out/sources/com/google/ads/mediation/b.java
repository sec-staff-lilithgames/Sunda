package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends AdListener implements AppEventListener, zza {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractAdViewAdapter f27000b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationBannerListener f27001c;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f27000b = abstractAdViewAdapter;
        this.f27001c = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f27001c.onAdClicked(this.f27000b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f27001c.onAdClosed(this.f27000b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f27001c.onAdFailedToLoad(this.f27000b, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f27001c.onAdLoaded(this.f27000b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f27001c.onAdOpened(this.f27000b);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f27001c.zza(this.f27000b, str, str2);
    }
}
