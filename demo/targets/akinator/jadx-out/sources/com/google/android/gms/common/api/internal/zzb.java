package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzb implements Runnable {
    final /* synthetic */ LifecycleCallback zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzc zzc;

    public zzb(zzc zzcVar, LifecycleCallback lifecycleCallback, String str) {
        this.zza = lifecycleCallback;
        this.zzb = str;
        this.zzc = zzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        zzc zzcVar = this.zzc;
        if (zzcVar.zzb > 0) {
            LifecycleCallback lifecycleCallback = this.zza;
            if (zzcVar.zzc != null) {
                bundle = zzcVar.zzc.getBundle(this.zzb);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.zzc.zzb >= 2) {
            this.zza.onStart();
        }
        if (this.zzc.zzb >= 3) {
            this.zza.onResume();
        }
        if (this.zzc.zzb >= 4) {
            this.zza.onStop();
        }
        if (this.zzc.zzb >= 5) {
            this.zza.onDestroy();
        }
    }
}
