package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzmf extends zzgg {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zznl zzb;

    public zzmf(zznl zznlVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final void zze(zzoq zzoqVar) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            this.zzb.zzu.zzaV().zzk().zzb("[sgtm] Got upload batches from service. count", Integer.valueOf(zzoqVar.zza.size()));
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
