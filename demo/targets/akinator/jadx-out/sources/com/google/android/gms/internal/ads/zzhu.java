package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhu {
    private final long zza;
    private final long zzb;
    private long zzc = C.TIME_UNSET;
    private long zzd = C.TIME_UNSET;
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = C.TIME_UNSET;
    private long zze = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private long zzm = C.TIME_UNSET;
    private long zzn = C.TIME_UNSET;

    public /* synthetic */ zzhu(float f10, float f11, long j10, float f12, long j11, long j12, float f13, byte[] bArr) {
        this.zza = j11;
        this.zzb = j12;
    }

    private final void zzf() {
        long j10;
        long j11 = this.zzc;
        if (j11 != C.TIME_UNSET) {
            j10 = this.zzd;
            if (j10 == C.TIME_UNSET) {
                long j12 = this.zzf;
                if (j12 != C.TIME_UNSET && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.zzg;
                if (j10 == C.TIME_UNSET || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.zze == j10) {
            return;
        }
        this.zze = j10;
        this.zzh = j10;
        this.zzm = C.TIME_UNSET;
        this.zzn = C.TIME_UNSET;
        this.zzl = C.TIME_UNSET;
    }

    private static long zzg(long j10, long j11, float f10) {
        return (long) ((j11 * 9.999871E-4f) + (j10 * 0.999f));
    }

    public final void zza(zzaf zzafVar) {
        long j10 = zzafVar.zza;
        this.zzc = zzep.zzq(C.TIME_UNSET);
        this.zzf = zzep.zzq(C.TIME_UNSET);
        this.zzg = zzep.zzq(C.TIME_UNSET);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j10) {
        this.zzd = j10;
        zzf();
    }

    public final void zzc() {
        long j10 = this.zzh;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        long j11 = j10 + this.zzb;
        this.zzh = j11;
        long j12 = this.zzg;
        if (j12 != C.TIME_UNSET && j11 > j12) {
            this.zzh = j12;
        }
        this.zzl = C.TIME_UNSET;
    }

    public final float zzd(long j10, long j11) {
        long jMax;
        if (this.zzc == C.TIME_UNSET) {
            return 1.0f;
        }
        long j12 = j10 - j11;
        long j13 = this.zzm;
        if (j13 == C.TIME_UNSET) {
            this.zzm = j12;
            this.zzn = 0L;
        } else {
            long jMax2 = Math.max(j12, zzg(j13, j12, 0.999f));
            this.zzm = jMax2;
            this.zzn = zzg(this.zzn, Math.abs(j12 - jMax2), 0.999f);
        }
        if (this.zzl != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j14 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j14) {
            long jZzq = zzep.zzq(1000L);
            float f10 = this.zzk - 1.0f;
            float f11 = this.zzi - 1.0f;
            long j15 = this.zze;
            float f12 = jZzq;
            long j16 = this.zzh - (((long) (f10 * f12)) + ((long) (f11 * f12)));
            long[] jArr = {j14, j15, j16};
            jMax = jArr[0];
            for (int i10 = 1; i10 < 3; i10++) {
                long j17 = jArr[i10];
                if (j17 > jMax) {
                    jMax = j17;
                }
            }
            this.zzh = jMax;
        } else {
            long jMax3 = j10 - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j18 = this.zzh;
            String str = zzep.zza;
            jMax = Math.max(j18, Math.min(jMax3, j14));
            this.zzh = jMax;
            long j19 = this.zzg;
            if (j19 != C.TIME_UNSET && jMax > j19) {
                this.zzh = j19;
                jMax = j19;
            }
        }
        long j20 = j10 - jMax;
        if (Math.abs(j20) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j20 * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zze() {
        return this.zzh;
    }
}
