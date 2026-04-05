package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzax implements Runnable {
    final /* synthetic */ zzjg zza;
    final /* synthetic */ zzay zzb;

    public zzax(zzay zzayVar, zzjg zzjgVar) {
        this.zza = zzjgVar;
        Objects.requireNonNull(zzayVar);
        this.zzb = zzayVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzjg zzjgVar = this.zza;
        zzjgVar.zzaU();
        if (zzae.zza()) {
            zzjgVar.zzaW().zzj(this);
            return;
        }
        zzay zzayVar = this.zzb;
        boolean zZzc = zzayVar.zzc();
        zzayVar.zze(0L);
        if (zZzc) {
            zzayVar.zza();
        }
    }
}
