package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbsj implements MediationAdLoadCallback {
    final /* synthetic */ zzbrp zza;
    final /* synthetic */ zzbsk zzb;

    public zzbsj(zzbsk zzbskVar, zzbrp zzbrpVar) {
        this.zza = zzbrpVar;
        Objects.requireNonNull(zzbskVar);
        this.zzb = zzbskVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
            sb2.append(canonicalName);
            sb2.append("failed to load mediation ad: ErrorCode = ");
            sb2.append(code);
            sb2.append(". ErrorMessage = ");
            sb2.append(message);
            sb2.append(". ErrorDomain = ");
            sb2.append(domain);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
            zzbrp zzbrpVar = this.zza;
            zzbrpVar.zzx(adError.zza());
            zzbrpVar.zzw(adError.getCode(), adError.getMessage());
            zzbrpVar.zzg(adError.getCode());
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzU((MediationAppOpenAd) obj);
            this.zza.zzj();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
        return new zzbsa(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb2.append(canonicalName);
            sb2.append("failed to loaded mediation ad: ");
            sb2.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
            zzbrp zzbrpVar = this.zza;
            zzbrpVar.zzw(0, str);
            zzbrpVar.zzg(0);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }
}
