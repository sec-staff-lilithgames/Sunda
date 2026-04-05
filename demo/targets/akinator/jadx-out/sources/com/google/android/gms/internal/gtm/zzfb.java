package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfb {
    private final Clock zza;
    private long zzb;

    public zzfb(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final boolean zzc(long j10) {
        return this.zzb == 0 || this.zza.elapsedRealtime() - this.zzb > j10;
    }

    public zzfb(Clock clock, long j10) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
        this.zzb = j10;
    }
}
