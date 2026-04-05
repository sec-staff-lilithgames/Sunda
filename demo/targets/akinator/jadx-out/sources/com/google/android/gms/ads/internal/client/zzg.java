package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzg extends zzbj {
    private final AdListener zza;

    public zzg(AdListener adListener) {
        this.zza = adListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzd(zze zzeVar) {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzf() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzg() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzh() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzi() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzj() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final AdListener zzk() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(int i10) {
    }
}
