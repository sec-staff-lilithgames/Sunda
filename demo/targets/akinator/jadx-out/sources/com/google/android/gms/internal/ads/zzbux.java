package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbux extends zzbjv {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbux(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zze(zzbkc zzbkcVar) {
        this.zza.onNativeAdLoaded(new zzbus(zzbkcVar));
    }
}
