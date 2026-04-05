package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzadv implements zzaed {
    private final zzdu zza;
    private final zzdu zzb;
    private long zzc;

    public zzadv(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzgmd.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzdu(length2);
            this.zzb = new zzdu(length2);
        } else {
            int i10 = length2 + 1;
            zzdu zzduVar = new zzdu(i10);
            this.zza = zzduVar;
            zzdu zzduVar2 = new zzdu(i10);
            this.zzb = zzduVar2;
            zzduVar.zza(0L);
            zzduVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        zzdu zzduVar = this.zzb;
        if (zzduVar.zzd() == 0) {
            zzaee zzaeeVar = zzaee.zza;
            return new zzaeb(zzaeeVar, zzaeeVar);
        }
        int iZzn = zzep.zzn(zzduVar, j10, true, true);
        long jZzc = zzduVar.zzc(iZzn);
        zzdu zzduVar2 = this.zza;
        zzaee zzaeeVar2 = new zzaee(jZzc, zzduVar2.zzc(iZzn));
        if (zzaeeVar2.zzb == j10 || iZzn == zzduVar.zzd() - 1) {
            return new zzaeb(zzaeeVar2, zzaeeVar2);
        }
        int i10 = iZzn + 1;
        return new zzaeb(zzaeeVar2, new zzaee(zzduVar.zzc(i10), zzduVar2.zzc(i10)));
    }
}
