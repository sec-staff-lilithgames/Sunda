package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzne implements Runnable {
    final /* synthetic */ ConnectionResult zza;
    final /* synthetic */ zznf zzb;

    public zzne(zznf zznfVar, ConnectionResult connectionResult) {
        this.zza = connectionResult;
        Objects.requireNonNull(zznfVar);
        this.zzb = zznfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb.zza;
        zznlVar.zzaa(null);
        if (this.zza.getErrorCode() != 7777) {
            zznlVar.zzX();
            return;
        }
        if (zznlVar.zzab() == null) {
            zznlVar.zzac(Executors.newScheduledThreadPool(1));
        }
        zznlVar.zzab().schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IllegalStateException {
                final zznl zznlVar2 = this.zza.zzb.zza;
                zznlVar2.zzu.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zznlVar2.zzI();
                    }
                });
            }
        }, ((Long) zzfy.zzZ.zzb(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
