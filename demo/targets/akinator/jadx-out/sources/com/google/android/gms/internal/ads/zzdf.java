package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdf {
    private boolean zza;

    public zzdf() {
        throw null;
    }

    public final synchronized boolean zza() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean zzb() {
        boolean z10;
        z10 = this.zza;
        this.zza = false;
        return z10;
    }

    public final synchronized void zzc() throws InterruptedException {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzd() {
        boolean z10 = false;
        while (!this.zza) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zze(long j10) {
        if (j10 > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = j10 + jElapsedRealtime;
                if (j11 < jElapsedRealtime) {
                    zzd();
                } else {
                    boolean z10 = false;
                    while (!this.zza && jElapsedRealtime < j11) {
                        try {
                            wait(j11 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z10 = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.zza;
    }

    public final synchronized boolean zzf() {
        return this.zza;
    }

    public zzdf(zzdc zzdcVar) {
    }
}
