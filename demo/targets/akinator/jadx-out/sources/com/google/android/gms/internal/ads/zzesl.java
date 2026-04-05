package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzesl {
    public final n1 zza;
    private final long zzb;
    private final Clock zzc;

    public zzesl(n1 n1Var, long j10, Clock clock) {
        this.zza = n1Var;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j10;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
