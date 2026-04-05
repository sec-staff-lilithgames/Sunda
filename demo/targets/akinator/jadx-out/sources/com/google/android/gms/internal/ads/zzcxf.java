package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcxf implements zzcyo, zzdga, zzddq, zzcze, zzbau {
    private final zzczg zza;
    private final zzdbh zzb;
    private final zzffu zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private ScheduledFuture zzg;
    private final String zzi;
    private final zzgvb zzf = zzgvb.zze();
    private final AtomicBoolean zzh = new AtomicBoolean();

    public zzcxf(zzczg zzczgVar, zzffu zzffuVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzdbh zzdbhVar) {
        this.zza = zzczgVar;
        this.zzc = zzffuVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzdbhVar;
    }

    private final boolean zzl() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final synchronized void zzdL() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzgvb zzgvbVar = this.zzf;
        if (zzgvbVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzgvbVar.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzdo(zzbat zzbatVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmx)).booleanValue() && zzl() && zzbatVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdy() {
        zzffu zzffuVar = this.zzc;
        if (zzffuVar.zze == 3) {
            return;
        }
        int i10 = zzffuVar.zzY;
        if (i10 == 0 || i10 == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmx)).booleanValue() && zzl()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzg() {
        zzffu zzffuVar = this.zzc;
        int i10 = zzffuVar.zze;
        if (i10 == 3) {
            return;
        }
        if (i10 == 4) {
            this.zzb.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbN)).booleanValue() && zzffuVar.zzY == 2) {
            int i11 = zzffuVar.zzq;
            if (i11 == 0) {
                this.zza.zza();
            } else {
                zzgui.zzr(this.zzf, new zzcxd(this), this.zze);
                this.zzg = this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi();
                    }
                }, i11, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final /* synthetic */ void zzi() {
        synchronized (this) {
            try {
                zzgvb zzgvbVar = this.zzf;
                if (zzgvbVar.isDone()) {
                    return;
                }
                zzgvbVar.zza(Boolean.TRUE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            zzgvb zzgvbVar = this.zzf;
            if (zzgvbVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzgvbVar.zzb(new Exception());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ zzczg zzk() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdM() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdx() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzd(zzbxv zzbxvVar, String str, String str2) {
    }
}
