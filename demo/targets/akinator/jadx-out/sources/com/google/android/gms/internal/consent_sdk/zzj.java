package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzj implements ConsentInformation {
    private final zzaq zza;
    private final zzw zzb;
    private final zzbo zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private ConsentRequestParameters zzh = new ConsentRequestParameters.Builder().build();

    public zzj(zzaq zzaqVar, zzw zzwVar, zzbo zzboVar) {
        this.zza = zzaqVar;
        this.zzb = zzwVar;
        this.zzc = zzboVar;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean canRequestAds() {
        zzaq zzaqVar = this.zza;
        if (!zzaqVar.zzk()) {
            int iZza = !zzc() ? 0 : zzaqVar.zza();
            if (iZza != 1 && iZza != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus() {
        return !zzc() ? ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN : this.zza.zzb();
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void requestConsentInfoUpdate(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = consentRequestParameters;
        this.zzb.zzc(activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener);
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
                public final void onConsentInfoUpdateSuccess() {
                    this.zza.zzb(false);
                }
            }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
                public final void onConsentInfoUpdateFailure(FormError formError) {
                    this.zza.zzb(false);
                }
            });
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z10) {
        synchronized (this.zze) {
            this.zzg = z10;
        }
    }

    public final boolean zzc() {
        boolean z10;
        synchronized (this.zzd) {
            z10 = this.zzf;
        }
        return z10;
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzg;
        }
        return z10;
    }
}
