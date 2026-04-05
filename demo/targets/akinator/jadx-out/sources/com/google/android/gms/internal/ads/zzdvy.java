package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdvy implements zzifh {
    private final zzifq zza;

    private zzdvy(zzdvx zzdvxVar, zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
    }

    public static zzdvy zza(zzdvx zzdvxVar, zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzdvy(zzdvxVar, zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZza = zzdvx.zza((zzdwh) this.zza.zzb(), zzfjn.zzc());
        zzifp.zzb(setZza);
        return setZza;
    }
}
