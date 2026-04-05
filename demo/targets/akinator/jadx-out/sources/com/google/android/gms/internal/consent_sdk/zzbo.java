package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbo {
    private final zzdt zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbo(zzdt zzdtVar, Executor executor) {
        this.zza = zzdtVar;
        this.zzb = executor;
    }

    public static /* synthetic */ void zza(zzbo zzboVar, zzbc zzbcVar) {
        final AtomicReference atomicReference = zzboVar.zzd;
        Objects.requireNonNull(atomicReference);
        zzbcVar.zzf(new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                atomicReference.set(consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(formError.getMessage())));
            }
        });
    }

    public final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzcs.zza();
        zzbq zzbqVar = (zzbq) this.zzc.get();
        if (zzbqVar == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzaw) this.zza.zza()).zza(zzbqVar).zzb().zza().zzf(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
        }
    }

    public final void zzc() {
        zzbq zzbqVar = (zzbq) this.zzc.get();
        if (zzbqVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final zzbc zzbcVarZza = ((zzaw) this.zza.zza()).zza(zzbqVar).zzb().zza();
        zzbcVarZza.zza = true;
        zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                zzbo.zza(this.zza, zzbcVarZza);
            }
        });
    }

    public final void zzd(zzbq zzbqVar) {
        this.zzc.set(zzbqVar);
    }

    public final void zze(Activity activity, final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzcs.zza();
        zzj zzjVarZzb = zza.zza(activity).zzb();
        if (zzjVarZzb == null) {
            zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentFormDismissedListener.onConsentFormDismissed(new zzg(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        if (!zzjVarZzb.isConsentFormAvailable() && zzjVarZzb.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "No valid response received yet.").zza());
                }
            });
            zzjVarZzb.zza(activity);
        } else {
            if (zzjVarZzb.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                    @Override // java.lang.Runnable
                    public final void run() {
                        onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            ConsentForm consentForm = (ConsentForm) this.zzd.get();
            if (consentForm == null) {
                zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                consentForm.show(activity, onConsentFormDismissedListener);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
