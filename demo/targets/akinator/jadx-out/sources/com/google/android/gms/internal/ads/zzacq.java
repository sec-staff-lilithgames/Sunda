package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzacq implements zzaed {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacq(long j10, long j11, int i10, int i11, boolean z10) {
        long jZze;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j10 == -1) {
            this.zzd = -1L;
            jZze = C.TIME_UNSET;
        } else {
            this.zzd = j10 - j11;
            jZze = zze(j10, j11, i10);
        }
        this.zzf = jZze;
    }

    private static long zze(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        long j11 = this.zzd;
        if (j11 == -1) {
            zzaee zzaeeVar = new zzaee(0L, this.zzb);
            return new zzaeb(zzaeeVar, zzaeeVar);
        }
        long j12 = this.zzc;
        long jMin = (((this.zze * j10) / 8000000) / j12) * j12;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j12);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzd = zzd(jMax);
        zzaee zzaeeVar2 = new zzaee(jZzd, jMax);
        if (j11 != -1 && jZzd < j10) {
            long j13 = jMax + j12;
            if (j13 < this.zza) {
                return new zzaeb(zzaeeVar2, new zzaee(zzd(j13), j13));
            }
        }
        return new zzaeb(zzaeeVar2, zzaeeVar2);
    }

    public final long zzd(long j10) {
        return zze(j10, this.zzb, this.zze);
    }
}
