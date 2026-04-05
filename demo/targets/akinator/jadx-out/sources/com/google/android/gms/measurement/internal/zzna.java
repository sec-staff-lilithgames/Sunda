package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzna implements Runnable {
    final /* synthetic */ zzgb zza;
    final /* synthetic */ zznf zzb;

    public zzna(zznf zznfVar, zzgb zzgbVar) {
        this.zza = zzgbVar;
        Objects.requireNonNull(zznfVar);
        this.zzb = zznfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznf zznfVar = this.zzb;
        synchronized (zznfVar) {
            try {
                zznfVar.zzd(false);
                zznl zznlVar = zznfVar.zza;
                if (!zznlVar.zzh()) {
                    zznlVar.zzu.zzaV().zzj().zza("Connected to remote service");
                    zznlVar.zzL(this.zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zznl zznlVar2 = this.zzb.zza;
        if (zznlVar2.zzab() != null) {
            zznlVar2.zzab().shutdownNow();
            zznlVar2.zzac(null);
        }
    }
}
