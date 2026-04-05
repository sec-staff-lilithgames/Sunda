package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdwb implements zzifh {
    private final zzdvx zza;
    private final zzifq zzb;

    private zzdwb(zzdvx zzdvxVar, zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzdvxVar;
        this.zzb = zzifqVar;
    }

    public static zzdwb zza(zzdvx zzdvxVar, zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzdwb(zzdvxVar, zzifqVar, zzifqVar2);
    }

    public static Set zzc(zzdvx zzdvxVar, zzdwh zzdwhVar, Executor executor) {
        Set setZzd = zzdvx.zzd(zzdwhVar, executor);
        zzifp.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzdwh) this.zzb.zzb(), zzfjn.zzc());
    }
}
