package com.google.android.gms.internal.gtm;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzcv {
    private static volatile Handler zza;
    private final zzbu zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzcv(zzbu zzbuVar) {
        Preconditions.checkNotNull(zzbuVar);
        this.zzb = zzbuVar;
        this.zzc = new zzcu(this);
    }

    private final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcv.class) {
            try {
                if (zza == null) {
                    zza = new zzfy(this.zzb.zza().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public abstract void zza();

    public final long zzb() {
        if (this.zzd == 0) {
            return 0L;
        }
        return Math.abs(this.zzb.zzr().currentTimeMillis() - this.zzd);
    }

    public final void zze(long j10) {
        if (zzh()) {
            if (j10 < 0) {
                zzf();
                return;
            }
            long jAbs = j10 - Math.abs(this.zzb.zzr().currentTimeMillis() - this.zzd);
            long j11 = jAbs >= 0 ? jAbs : 0L;
            zzi().removeCallbacks(this.zzc);
            if (zzi().postDelayed(this.zzc, j11)) {
                return;
            }
            this.zzb.zzm().zzJ("Failed to adjust delayed post. time", Long.valueOf(j11));
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j10) {
        zzf();
        if (j10 >= 0) {
            this.zzd = this.zzb.zzr().currentTimeMillis();
            if (zzi().postDelayed(this.zzc, j10)) {
                return;
            }
            this.zzb.zzm().zzJ("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean zzh() {
        return this.zzd != 0;
    }
}
