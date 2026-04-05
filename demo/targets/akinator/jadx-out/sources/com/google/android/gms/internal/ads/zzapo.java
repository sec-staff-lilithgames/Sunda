package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzapo extends Thread {
    private final BlockingQueue zza;
    private final zzapn zzb;
    private final zzape zzc;
    private volatile boolean zzd = false;
    private final zzapl zze;

    public zzapo(BlockingQueue blockingQueue, zzapn zzapnVar, zzape zzapeVar, zzapl zzaplVar) {
        this.zza = blockingQueue;
        this.zzb = zzapnVar;
        this.zzc = zzapeVar;
        this.zze = zzaplVar;
    }

    private void zzb() throws InterruptedException {
        zzapu zzapuVar = (zzapu) this.zza.take();
        SystemClock.elapsedRealtime();
        zzapuVar.zze(3);
        try {
            try {
                zzapuVar.zzc("network-queue-take");
                zzapuVar.zzl();
                TrafficStats.setThreadStatsTag(zzapuVar.zzb());
                zzapq zzapqVarZza = this.zzb.zza(zzapuVar);
                zzapuVar.zzc("network-http-complete");
                if (zzapqVarZza.zze && zzapuVar.zzq()) {
                    zzapuVar.zzd("not-modified");
                    zzapuVar.zzw();
                } else {
                    zzaqa zzaqaVarZzr = zzapuVar.zzr(zzapqVarZza);
                    zzapuVar.zzc("network-parse-complete");
                    zzapd zzapdVar = zzaqaVarZzr.zzb;
                    if (zzapdVar != null) {
                        this.zzc.zzb(zzapuVar.zzi(), zzapdVar);
                        zzapuVar.zzc("network-cache-written");
                    }
                    zzapuVar.zzp();
                    this.zze.zza(zzapuVar, zzaqaVarZzr, null);
                    zzapuVar.zzv(zzaqaVarZzr);
                }
            } catch (zzaqd e10) {
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzapuVar, e10);
                zzapuVar.zzw();
            } catch (Exception e11) {
                zzaqg.zzd(e11, "Unhandled exception %s", e11.toString());
                zzaqd zzaqdVar = new zzaqd(e11);
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzapuVar, zzaqdVar);
                zzapuVar.zzw();
            }
            zzapuVar.zze(4);
        } catch (Throwable th2) {
            zzapuVar.zze(4);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqg.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
