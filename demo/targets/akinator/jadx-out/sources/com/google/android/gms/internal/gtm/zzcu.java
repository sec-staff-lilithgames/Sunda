package com.google.android.gms.internal.gtm;

import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcu implements Runnable {
    final /* synthetic */ zzcv zza;

    public zzcu(zzcv zzcvVar) {
        this.zza = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zza.zzb.zzd().zzi(this);
            return;
        }
        zzcv zzcvVar = this.zza;
        boolean zZzh = zzcvVar.zzh();
        zzcvVar.zzd = 0L;
        if (zZzh) {
            this.zza.zza();
        }
    }
}
