package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzctd implements zzdac, zzbau, zzddq {
    private final zzffu zza;
    private final zzczg zzb;
    private final zzdal zzc;
    private final zzdbh zzf;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzctd(zzffu zzffuVar, zzczg zzczgVar, zzdal zzdalVar, zzdbh zzdbhVar) {
        this.zza = zzffuVar;
        this.zzb = zzczgVar;
        this.zzc = zzdalVar;
        this.zzf = zzdbhVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdL() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzdo(zzbat zzbatVar) {
        int i10 = this.zza.zze;
        if (i10 == 1) {
            if (zzbatVar.zzj) {
                zzd();
            }
        } else if (i10 == 4 && zzbatVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzbatVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final synchronized void zzg() {
        int i10 = this.zza.zze;
        if (i10 == 1 || i10 == 4) {
            return;
        }
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdM() {
    }
}
