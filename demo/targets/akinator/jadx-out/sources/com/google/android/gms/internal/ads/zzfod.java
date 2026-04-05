package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfod {
    private final Object zza;
    private final long zzb;
    private final Clock zzc;
    private final long zzd = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzI)).longValue() * 1000;

    public zzfod(Object obj, Clock clock) {
        this.zza = obj;
        this.zzc = clock;
        this.zzb = clock.currentTimeMillis();
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzc.currentTimeMillis() >= this.zzb + this.zzd;
    }

    public final long zzc() {
        return (this.zzd + Math.min(Math.max(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzC)).longValue(), -900000L), 10000L)) - (this.zzc.currentTimeMillis() - this.zzb);
    }

    public final long zzd() {
        return this.zzb;
    }
}
