package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdbp extends zzdem {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private final zzdvi zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private ScheduledFuture zzj;
    private ScheduledFuture zzk;

    public zzdbp(ScheduledExecutorService scheduledExecutorService, Clock clock, zzdvi zzdviVar) {
        super(Collections.EMPTY_SET);
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
        this.zzd = zzdviVar;
    }

    private final synchronized void zzf(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            this.zze = this.zzc.elapsedRealtime() + j10;
            this.zzj = this.zzb.schedule(new zzdbn(this, null), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzg(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.zzk;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzk.cancel(false);
            }
            this.zzf = this.zzc.elapsedRealtime() + j10;
            this.zzk = this.zzb.schedule(new zzdbo(this, null), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zza() {
        try {
            if (this.zzi) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                this.zzg = this.zze - this.zzc.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.zzk;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzh = -1L;
            } else {
                this.zzk.cancel(false);
                this.zzh = this.zzf - this.zzc.elapsedRealtime();
            }
            this.zzi = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.zzi) {
                if (this.zzg > 0 && (scheduledFuture2 = this.zzj) != null && scheduledFuture2.isCancelled()) {
                    zzf(this.zzg);
                }
                if (this.zzh > 0 && (scheduledFuture = this.zzk) != null && scheduledFuture.isCancelled()) {
                    zzg(this.zzh);
                }
                this.zzi = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzc() {
        this.zzi = false;
        zzf(0L);
    }

    public final synchronized void zzd(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
        sb2.append("In scheduleRefresh: ");
        sb2.append(i10);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.zzi) {
                long j10 = this.zzg;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.zzg = millis;
                return;
            }
            long jElapsedRealtime = this.zzc.elapsedRealtime();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzom)).booleanValue()) {
                long j11 = this.zze;
                if (jElapsedRealtime >= j11 || j11 - jElapsedRealtime > millis) {
                    zzf(millis);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoC)).booleanValue()) {
                        zzdvh zzdvhVarZza = this.zzd.zza();
                        zzdvhVarZza.zzc("action", "rtnc");
                        zzdvhVarZza.zzf();
                    }
                }
            } else {
                long j12 = this.zze;
                if (jElapsedRealtime > j12 || j12 - jElapsedRealtime > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 28);
        sb2.append("In scheduleShowRefreshedAd: ");
        sb2.append(i10);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.zzi) {
                long j10 = this.zzh;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.zzh = millis;
                return;
            }
            long jElapsedRealtime = this.zzc.elapsedRealtime();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzom)).booleanValue()) {
                if (jElapsedRealtime == this.zzf) {
                    com.google.android.gms.ads.internal.util.zze.zza("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j11 = this.zzf;
                if (jElapsedRealtime >= j11 || j11 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            } else {
                long j12 = this.zzf;
                if (jElapsedRealtime > j12 || j12 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            }
        }
    }
}
