package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbzh extends zzbyu {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbzi zzb;

    public zzbzh(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbzi zzbziVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zze() {
        zzbzi zzbziVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbziVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbziVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzf(int i10) {
    }
}
