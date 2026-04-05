package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzem {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzem(long j10) {
        zzd(0L);
    }

    public static long zzi(long j10) {
        return zzep.zzt(j10, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzj(long j10) {
        return zzep.zzt(j10, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long zza() {
        long j10 = this.zza;
        return (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) ? C.TIME_UNSET : j10;
    }

    public final synchronized long zzb() {
        long j10;
        try {
            j10 = this.zzc;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != C.TIME_UNSET ? j10 + this.zzb : zza();
    }

    public final synchronized long zzc() {
        return this.zzb;
    }

    public final synchronized void zzd(long j10) {
        this.zza = j10;
        this.zzb = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = C.TIME_UNSET;
    }

    public final synchronized long zze(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.zzc;
            if (j11 != C.TIME_UNSET) {
                long jZzj = zzj(j11);
                long j12 = (4294967296L + jZzj) / 8589934592L;
                long j13 = (((-1) + j12) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                j10 = Math.abs(j13 - jZzj) < Math.abs(j14 - jZzj) ? j13 : j14;
            }
            return zzg(zzi(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long zzf(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.zzc;
            if (j11 != C.TIME_UNSET) {
                long jZzj = zzj(j11);
                long j12 = jZzj / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 = j13 >= jZzj ? j13 : ((j12 + 1) * 8589934592L) + j10;
            }
            return zzg(zzi(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long zzg(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!zzh()) {
                long jLongValue = this.zza;
                if (jLongValue == 9223372036854775806L) {
                    Long l9 = (Long) this.zzd.get();
                    if (l9 == null) {
                        throw null;
                    }
                    jLongValue = l9.longValue();
                }
                this.zzb = jLongValue - j10;
                notifyAll();
            }
            this.zzc = j10;
            return j10 + this.zzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean zzh() {
        return this.zzb != C.TIME_UNSET;
    }
}
