package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaor implements zzaed {
    private final zzaoo zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaor(zzaoo zzaooVar, int i10, long j10, long j11) {
        this.zza = zzaooVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / zzaooVar.zzd;
        this.zzd = j12;
        this.zze = zzd(j12);
    }

    private final long zzd(long j10) {
        return zzep.zzt(j10 * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        long j11 = this.zzb;
        zzaoo zzaooVar = this.zza;
        long j12 = (zzaooVar.zzc * j10) / (j11 * 1000000);
        String str = zzep.zza;
        long j13 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j12, j13));
        long j14 = zzaooVar.zzd;
        long jZzd = zzd(jMax);
        long j15 = this.zzc;
        zzaee zzaeeVar = new zzaee(jZzd, (jMax * j14) + j15);
        if (jZzd >= j10 || jMax == j13) {
            return new zzaeb(zzaeeVar, zzaeeVar);
        }
        long j16 = jMax + 1;
        return new zzaeb(zzaeeVar, new zzaee(zzd(j16), (j14 * j16) + j15));
    }
}
