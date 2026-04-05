package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbjd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends AdListener implements zzg, zze, zzd {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractAdViewAdapter f27006b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationNativeListener f27007c;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f27006b = abstractAdViewAdapter;
        this.f27007c = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f27007c.onAdClicked(this.f27006b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f27007c.onAdClosed(this.f27006b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f27007c.onAdFailedToLoad(this.f27006b, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f27007c.onAdImpression(this.f27006b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f27007c.onAdOpened(this.f27006b);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        this.f27007c.onAdLoaded(this.f27006b, new a(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbjd zzbjdVar) {
        this.f27007c.zzc(this.f27006b, zzbjdVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbjd zzbjdVar, String str) {
        this.f27007c.zzd(this.f27006b, zzbjdVar, str);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }
}
