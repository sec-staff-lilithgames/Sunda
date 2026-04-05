package com.google.android.gms.ads.internal.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbu {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbu(long j10) {
        this.zza = j10;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                if (this.zzb + this.zza > jElapsedRealtime) {
                    return false;
                }
                this.zzb = jElapsedRealtime;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(long j10) {
        synchronized (this.zzc) {
            this.zza = j10;
        }
    }
}
