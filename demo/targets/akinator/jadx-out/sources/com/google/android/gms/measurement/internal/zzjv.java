package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzjv implements Executor {
    final /* synthetic */ zzlj zza;

    public zzjv(zzlj zzljVar) {
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws IllegalStateException {
        this.zza.zzu.zzaW().zzj(runnable);
    }
}
