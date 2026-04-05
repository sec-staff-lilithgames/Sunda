package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzapk implements Runnable {
    private final zzapu zza;
    private final zzaqa zzb;
    private final Runnable zzc;

    public zzapk(zzapu zzapuVar, zzaqa zzaqaVar, Runnable runnable) {
        this.zza = zzapuVar;
        this.zzb = zzaqaVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzapu zzapuVar = this.zza;
        zzapuVar.zzl();
        zzaqa zzaqaVar = this.zzb;
        if (zzaqaVar.zzc()) {
            zzapuVar.zzs(zzaqaVar.zza);
        } else {
            zzapuVar.zzt(zzaqaVar.zzc);
        }
        if (zzaqaVar.zzd) {
            zzapuVar.zzc("intermediate-response");
        } else {
            zzapuVar.zzd("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
