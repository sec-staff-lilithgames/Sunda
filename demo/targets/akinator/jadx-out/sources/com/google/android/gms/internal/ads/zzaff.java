package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaff implements zzada {
    private final zzeg zza = new zzeg(4);
    private final zzaef zzb = new zzaef(-1, -1, "image/avif");

    private final boolean zzg(zzadb zzadbVar, int i10) throws IOException {
        zzeg zzegVar = this.zza;
        zzegVar.zza(4);
        ((zzacr) zzadbVar).zzh(zzegVar.zzi(), 0, 4, false);
        return zzegVar.zzz() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        ((zzacr) zzadbVar).zzj(4, false);
        return zzg(zzadbVar, 1718909296) && zzg(zzadbVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zzb.zzc(zzaddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws IOException {
        return this.zzb.zzd(zzadbVar, zzaeaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        this.zzb.zze(j10, j11);
    }
}
