package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzahx implements zzahu {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzahx(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzd = i11;
        this.zze = j12;
        this.zzg = jArr;
        this.zzf = j12 != -1 ? j10 + j12 : -1L;
    }

    public static zzahx zzd(zzahw zzahwVar, long j10) {
        long jZzb = zzahwVar.zzb();
        if (jZzb == C.TIME_UNSET) {
            return null;
        }
        zzadw zzadwVar = zzahwVar.zza;
        return new zzahx(j10, zzadwVar.zzc, jZzb, zzadwVar.zzf, zzahwVar.zzc, zzahwVar.zzf);
    }

    private final long zzh(int i10) {
        return (this.zzc * i10) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        if (!zzb()) {
            zzaee zzaeeVar = new zzaee(0L, this.zza + this.zzb);
            return new zzaeb(zzaeeVar, zzaeeVar);
        }
        long j11 = this.zzc;
        String str = zzep.zza;
        long jMax = Math.max(0L, Math.min(j10, j11));
        double d10 = (jMax * 100.0d) / j11;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d12 = jArr[i10];
                d11 = (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d10 - i10)) + d12;
            }
        }
        long j12 = this.zze;
        zzaee zzaeeVar2 = new zzaee(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d11 / 256.0d) * j12), j12 - 1)));
        return new zzaeb(zzaeeVar2, zzaeeVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zze(long j10) {
        if (!zzb()) {
            return 0L;
        }
        long j11 = j10 - this.zza;
        if (j11 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d10 = (j11 * 256.0d) / this.zze;
        int iZzm = zzep.zzm(jArr, (long) d10, true, true);
        long jZzh = zzh(iZzm);
        long j12 = jArr[iZzm];
        int i10 = iZzm + 1;
        long jZzh2 = zzh(i10);
        return Math.round((j12 == (iZzm == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jZzh2 - jZzh)) + jZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final int zzg() {
        return this.zzd;
    }
}
