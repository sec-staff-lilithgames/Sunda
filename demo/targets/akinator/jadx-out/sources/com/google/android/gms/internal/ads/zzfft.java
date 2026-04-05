package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfft {
    private final Clock zza;
    private final zzdvi zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfft(Clock clock, zzdvi zzdviVar) {
        this.zza = clock;
        this.zzb = zzdviVar;
    }

    private final void zze() {
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgz)).longValue() <= jCurrentTimeMillis) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzf(int i10, int i11) {
        zze();
        Object obj = this.zzc;
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zze != i10) {
                    return;
                }
                this.zze = i11;
                if (this.zze == 3) {
                    this.zzd = jCurrentTimeMillis;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zza(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzod)).booleanValue()) {
            zzdvh zzdvhVarZza = this.zzb.zza();
            zzdvhVarZza.zzc("action", "mbs_state");
            zzdvhVarZza.zzc("mbs_state", true != z10 ? "0" : "1");
            zzdvhVarZza.zzd();
        }
        if (z10) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z10;
        synchronized (this.zzc) {
            zze();
            z10 = this.zze == 2;
        }
        return z10;
    }

    public final boolean zzc() {
        boolean z10;
        synchronized (this.zzc) {
            zze();
            z10 = this.zze == 3;
        }
        return z10;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
