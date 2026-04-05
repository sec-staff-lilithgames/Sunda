package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcrf implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;

    private zzcrf(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
    }

    public static zzcrf zzc(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        return new zzcrf(zzifqVar, zzifqVar2, zzifqVar3);
    }

    public static zzdbp zzd(ScheduledExecutorService scheduledExecutorService, Clock clock, zzdvi zzdviVar) {
        return new zzdbp(scheduledExecutorService, clock, zzdviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdbp zzb() {
        return zzd((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb(), (zzdvi) this.zzc.zzb());
    }
}
