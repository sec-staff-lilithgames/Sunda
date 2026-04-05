package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzguw extends zzgud implements zzgur {
    private final ScheduledFuture zza;

    public zzguw(n1 n1Var, ScheduledFuture scheduledFuture) {
        super(n1Var);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzguc, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zCancel = zza().cancel(z10);
        if (zCancel) {
            this.zza.cancel(z10);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
