package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzadl implements zzaed {
    private final zzadn zza;
    private final long zzb;

    public zzadl(zzadn zzadnVar, long j10) {
        this.zza = zzadnVar;
        this.zzb = j10;
    }

    private final zzaee zzd(long j10, long j11) {
        return new zzaee((j10 * 1000000) / this.zza.zze, this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        zzadn zzadnVar = this.zza;
        zzadm zzadmVar = zzadnVar.zzk;
        zzadmVar.getClass();
        long jZzb = zzadnVar.zzb(j10);
        long[] jArr = zzadmVar.zza;
        int iZzm = zzep.zzm(jArr, jZzb, true, false);
        long j11 = iZzm == -1 ? 0L : jArr[iZzm];
        long[] jArr2 = zzadmVar.zzb;
        zzaee zzaeeVarZzd = zzd(j11, iZzm != -1 ? jArr2[iZzm] : 0L);
        if (zzaeeVarZzd.zzb == j10 || iZzm == jArr.length - 1) {
            return new zzaeb(zzaeeVarZzd, zzaeeVarZzd);
        }
        int i10 = iZzm + 1;
        return new zzaeb(zzaeeVarZzd, zzd(jArr[i10], jArr2[i10]));
    }
}
