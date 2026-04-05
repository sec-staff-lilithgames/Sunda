package com.google.android.gms.tasks;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzi implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzj zzb;

    public zzi(zzj zzjVar, Task task) {
        this.zzb = zzjVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zzb) {
            try {
                zzj zzjVar = this.zzb;
                if (zzjVar.zzc != null) {
                    zzjVar.zzc.onComplete(this.zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
