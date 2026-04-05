package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaz implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzbc zza;
    private final Activity zzb;

    public zzaz(zzbc zzbcVar, Activity activity) {
        this.zza = zzbcVar;
        this.zzb = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb() {
        this.zza.zzb.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzbc zzbcVar = this.zza;
        if (zzbcVar.zzg == null || !zzbcVar.zza) {
            return;
        }
        zzbcVar.zzg.setOwnerActivity(activity);
        if (zzbcVar.zzc != null) {
            zzbcVar.zzc.zza(activity);
        }
        zzaz zzazVar = (zzaz) zzbcVar.zzl.getAndSet(null);
        if (zzazVar != null) {
            zzazVar.zzb();
            zzaz zzazVar2 = new zzaz(zzbcVar, activity);
            zzbcVar.zzb.registerActivityLifecycleCallbacks(zzazVar2);
            zzbcVar.zzl.set(zzazVar2);
        }
        if (zzbcVar.zzg != null) {
            zzbcVar.zzg.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity != this.zzb) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            zzbc zzbcVar = this.zza;
            if (zzbcVar.zza && zzbcVar.zzg != null) {
                zzbcVar.zzg.dismiss();
                return;
            }
        }
        this.zza.zzh(new zzg(3, "Activity is destroyed."));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
