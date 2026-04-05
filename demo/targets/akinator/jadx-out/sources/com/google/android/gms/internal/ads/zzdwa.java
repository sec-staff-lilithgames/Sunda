package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdwa implements zzifh {
    private final zzifq zza;

    private zzdwa(zzdvx zzdvxVar, zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
    }

    public static zzdwa zza(zzdvx zzdvxVar, zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzdwa(zzdvxVar, zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzc = zzdvx.zzc((zzdwh) this.zza.zzb(), zzfjn.zzc());
        zzifp.zzb(setZzc);
        return setZzc;
    }
}
