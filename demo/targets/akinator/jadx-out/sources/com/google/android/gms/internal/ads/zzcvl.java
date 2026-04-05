package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcvl implements zzifh {
    private final zzifq zza;

    private zzcvl(zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
    }

    public static zzcvl zza(zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzcvl(zzifqVar, zzifqVar2);
    }

    public static zzdgn zzc(zzcpq zzcpqVar, Executor executor) {
        return new zzdgn(zzcpqVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzcpq) this.zza.zzb(), zzfjn.zzc());
    }
}
