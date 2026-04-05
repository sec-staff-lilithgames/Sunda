package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcbq {
    private zzgus zza;
    private zzdvi zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private long zze = -1;
    private long zzf = -1;

    public final void zza(zzgus zzgusVar, zzdvi zzdviVar) {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zza = zzgusVar;
        this.zzb = zzdviVar;
        this.zze = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoF)).longValue();
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoG)).longValue();
    }

    public final void zzb() {
        zzgus zzgusVar;
        if (!this.zzc.get() || this.zze < 0 || this.zzf < 0 || !this.zzd.compareAndSet(false, true) || (zzgusVar = this.zza) == null) {
            return;
        }
        zzgusVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws InterruptedException {
                this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ void zzc() throws InterruptedException {
        zzdvi zzdviVar;
        while (this.zzd.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(this.zze);
                if (!atomicBoolean.get()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoH)).booleanValue() && (zzdviVar = this.zzb) != null) {
                        zzdvh zzdvhVarZza = zzdviVar.zza();
                        zzdvhVarZza.zzc("action", "paa");
                        zzdvhVarZza.zzf();
                    }
                }
                do {
                    try {
                        Thread.sleep(this.zzf);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
