package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdv {
    private int zza;
    private int zzb;
    private int zzc;
    private long[] zzd;
    private int zze;

    public zzdv() {
        throw null;
    }

    public final void zza(long j10) {
        int i10 = this.zzc;
        long[] jArr = this.zzd;
        int length = jArr.length;
        if (i10 == length) {
            int i11 = length + length;
            if (i11 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i11];
            int i12 = this.zza;
            int i13 = length - i12;
            System.arraycopy(jArr, i12, jArr2, 0, i13);
            System.arraycopy(this.zzd, 0, jArr2, i13, i12);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = jArr2;
            this.zze = jArr2.length - 1;
            jArr = jArr2;
        }
        int i14 = (this.zzb + 1) & this.zze;
        this.zzb = i14;
        jArr[i14] = j10;
        this.zzc++;
    }

    public final long zzb() {
        int i10 = this.zzc;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzd;
        int i11 = this.zza;
        long j10 = jArr[i11];
        this.zza = this.zze & (i11 + 1);
        this.zzc = i10 - 1;
        return j10;
    }

    public final long zzc() {
        if (this.zzc != 0) {
            return this.zzd[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final boolean zzd() {
        return this.zzc == 0;
    }

    public final void zze() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public zzdv(int i10) {
        int i11 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
        this.zzd = new long[i11];
        this.zze = r3.length - 1;
    }
}
