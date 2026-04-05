package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzgtv extends zzgup {
    private final Executor zza;
    final /* synthetic */ zzgtw zzb;

    public zzgtv(zzgtw zzgtwVar, Executor executor) {
        Objects.requireNonNull(zzgtwVar);
        this.zzb = zzgtwVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgup
    public final boolean zzd() {
        return this.zzb.isDone();
    }

    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzb(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    public final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    public final void zzg(Throwable th2) {
        zzgtw zzgtwVar = this.zzb;
        zzgtwVar.zzD(null);
        if (th2 instanceof ExecutionException) {
            zzgtwVar.zzb(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            zzgtwVar.cancel(false);
        } else {
            zzgtwVar.zzb(th2);
        }
    }
}
