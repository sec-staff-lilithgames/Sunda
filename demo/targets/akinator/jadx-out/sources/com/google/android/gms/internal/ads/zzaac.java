package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaac {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final void zza() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zzb() {
        return this.zzd > 15 && this.zzh == 0;
    }

    public final boolean zzc() {
        long j10 = this.zzd;
        if (j10 == 0) {
            return false;
        }
        return this.zzg[(int) ((j10 - 1) % 15)];
    }

    public final long zzd() {
        return this.zzf;
    }

    public final long zze() {
        long j10 = this.zze;
        if (j10 == 0) {
            return 0L;
        }
        return this.zzf / j10;
    }

    public final void zzf(long j10) {
        long j11 = this.zzd;
        if (j11 == 0) {
            this.zza = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.zza;
            this.zzb = j12;
            this.zzf = j12;
            this.zze = 1L;
        } else {
            long j13 = j10 - this.zzc;
            int i10 = (int) (j11 % 15);
            if (Math.abs(j13 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j13;
                boolean[] zArr = this.zzg;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.zzh--;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.zzh++;
                }
            }
        }
        this.zzd++;
        this.zzc = j10;
    }
}
