package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzetj implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzetj(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        this.zza = zzifqVar2;
        this.zzb = zzifqVar4;
    }

    public static zzetj zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        return new zzetj(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeso(zzevv.zzc(), ((Long) zzbgj.zzf.zze()).longValue(), (Clock) this.zza.zzb(), zzfjn.zzc(), (zzdvi) this.zzb.zzb());
    }
}
