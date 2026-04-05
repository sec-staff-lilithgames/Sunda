package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x3.r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbc implements ConsentForm {
    private final Application zzb;
    private final zzbx zzc;
    private final zzaq zzd;
    private final zzbq zze;
    private final zzdt zzf;
    private Dialog zzg;
    private zzbv zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    boolean zza = false;

    public zzbc(Application application, zzad zzadVar, zzbx zzbxVar, zzaq zzaqVar, zzbq zzbqVar, zzdt zzdtVar) {
        this.zzb = application;
        this.zzc = zzbxVar;
        this.zzd = zzaqVar;
        this.zze = zzbqVar;
        this.zzf = zzdtVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzaz zzazVar = (zzaz) this.zzl.getAndSet(null);
        if (zzazVar != null) {
            zzazVar.zzb();
        }
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzcs.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        this.zzh.zzc();
        zzaz zzazVar = new zzaz(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzazVar);
        this.zzl.set(zzazVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        r2.setDecorFitsSystemWindows(window, false);
        this.zzk.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    public final zzbv zzc() {
        return this.zzh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzbv zzbvVarZzb = ((zzbw) this.zzf).zza();
        this.zzh = zzbvVarZzb;
        zzbvVarZzb.setBackgroundColor(0);
        zzbvVarZzb.getSettings().setJavaScriptEnabled(true);
        zzbvVarZzb.getSettings().setAllowFileAccess(false);
        zzbvVarZzb.getSettings().setAllowContentAccess(false);
        zzbvVarZzb.setWebViewClient(new zzbt(zzbvVarZzb, null));
        this.zzj.set(new zzba(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, 0 == true ? 1 : 0));
        zzbv zzbvVar = this.zzh;
        zzbq zzbqVar = this.zze;
        zzbvVar.loadDataWithBaseURL(zzbqVar.zza(), zzbqVar.zzb(), "text/html", C.UTF8_NAME, null);
        zzcs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzay
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzg(int i10) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        this.zzd.zzg(i10);
        onConsentFormDismissedListener.onConsentFormDismissed(null);
    }

    public final void zzh(zzg zzgVar) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        onConsentFormDismissedListener.onConsentFormDismissed(zzgVar.zza());
    }

    public final void zzi() {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadSuccess(this);
    }

    public final void zzj(zzg zzgVar) {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
