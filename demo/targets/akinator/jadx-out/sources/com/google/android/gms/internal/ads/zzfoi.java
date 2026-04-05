package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfoi implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb;
    final /* synthetic */ zzfom zzc;

    public zzfoi(zzfom zzfomVar, long j10, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = j10;
        this.zzb = zzeaVar;
        Objects.requireNonNull(zzfomVar);
        this.zzc = zzfomVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfom zzfomVar = this.zzc;
        if (zzfomVar.zzA() != null) {
            zzfnv zzfnvVarZzA = zzfomVar.zzA();
            long j10 = this.zza;
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            zzfnvVarZzA.zzi(j10, zzfom.zzQ(zzeaVar), zzfomVar.zzC(), zzfomVar.zze.zzd, zzfomVar.zzn(), zzfomVar.zzz());
        }
    }
}
