package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaci {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzaci(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.zza = j10;
        this.zzb = j11;
        this.zze = j13;
        this.zzf = j14;
        this.zzg = j15;
        this.zzc = j16;
        this.zzh = zza(j11, 0L, j13, j14, j15, j16);
    }

    public static long zza(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) (((j14 - j13) / (j12 - j11)) * (j10 - j11));
        String str = zzep.zza;
        return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
    }

    private final void zzi() {
        this.zzh = zza(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }

    public final /* synthetic */ long zzb() {
        return this.zzf;
    }

    public final /* synthetic */ long zzc() {
        return this.zzg;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ void zzf(long j10, long j11) {
        this.zzd = j10;
        this.zzf = j11;
        zzi();
    }

    public final /* synthetic */ void zzg(long j10, long j11) {
        this.zze = j10;
        this.zzg = j11;
        zzi();
    }

    public final /* synthetic */ long zzh() {
        return this.zzh;
    }
}
