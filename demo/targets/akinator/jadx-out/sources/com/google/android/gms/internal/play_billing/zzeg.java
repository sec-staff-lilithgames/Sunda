package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzeg extends zzcf implements Future {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return zzc().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return zzc().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zzc().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zzc().isDone();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract Future zzc();

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zzc().get(j10, timeUnit);
    }
}
