package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeqj implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzeqj(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar3;
    }

    public static zzeqj zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        return new zzeqj(zzifqVar, zzifqVar2, zzifqVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqh((n1) this.zza.zzb(), zzfjn.zzc(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
