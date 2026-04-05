package com.google.android.gms.tasks;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzg implements Runnable {
    final /* synthetic */ zzh zza;

    public zzg(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzb) {
            try {
                zzh zzhVar = this.zza;
                if (zzhVar.zzc != null) {
                    zzhVar.zzc.onCanceled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
