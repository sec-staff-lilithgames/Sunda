package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeev {
    private long zza = 0;
    private int zzb = 0;
    private long zzc = 0;
    private long zzd = 0;
    private long zze = 0;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private final Object zzh = new Object();
    private final Object zzi = new Object();
    private final Object zzj = new Object();

    public final synchronized void zza(long j10) {
        synchronized (this.zzf) {
            this.zza = j10;
        }
    }

    public final synchronized long zzb() {
        long j10;
        synchronized (this.zzf) {
            j10 = this.zza;
        }
        return j10;
    }

    public final void zzc(int i10) {
        synchronized (this.zzg) {
            this.zzb = i10;
        }
    }

    public final int zzd() {
        int i10;
        synchronized (this.zzg) {
            i10 = this.zzb;
        }
        return i10;
    }

    public final void zze(long j10) {
        synchronized (this.zzh) {
            this.zzc = j10;
        }
    }

    public final long zzf() {
        long j10;
        synchronized (this.zzh) {
            j10 = this.zzc;
        }
        return j10;
    }

    public final synchronized void zzg(long j10) {
        synchronized (this.zzi) {
            this.zzd = j10;
        }
    }

    public final synchronized long zzh() {
        long j10;
        synchronized (this.zzi) {
            j10 = this.zzd;
        }
        return j10;
    }

    public final synchronized void zzi(long j10) {
        synchronized (this.zzj) {
            this.zze = j10;
        }
    }

    public final synchronized long zzj() {
        long j10;
        synchronized (this.zzj) {
            j10 = this.zze;
        }
        return j10;
    }
}
