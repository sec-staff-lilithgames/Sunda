package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbtp implements MediationAdLoadCallback {
    final /* synthetic */ zzbsz zza;
    final /* synthetic */ zzbrp zzb;
    final /* synthetic */ zzbtv zzc;

    public zzbtp(zzbtv zzbtvVar, zzbsz zzbszVar, zzbrp zzbrpVar) {
        this.zza = zzbszVar;
        this.zzb = zzbrpVar;
        Objects.requireNonNull(zzbtvVar);
        this.zzc = zzbtvVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
        if (mediationInterstitialAd != null) {
            try {
                this.zzc.zzc(mediationInterstitialAd);
                this.zza.zze();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            }
            return new zzbtw(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
