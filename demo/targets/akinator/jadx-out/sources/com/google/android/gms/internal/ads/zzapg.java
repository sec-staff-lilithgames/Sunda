package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzapg extends Thread {
    private static final boolean zza = zzaqg.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzape zzd;
    private volatile boolean zze = false;
    private final zzaqh zzf;
    private final zzapl zzg;

    public zzapg(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzape zzapeVar, zzapl zzaplVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzapeVar;
        this.zzg = zzaplVar;
        this.zzf = new zzaqh(this, blockingQueue2, zzaplVar);
    }

    private void zzc() throws InterruptedException {
        zzapu zzapuVar = (zzapu) this.zzb.take();
        zzapuVar.zzc("cache-queue-take");
        zzapuVar.zze(1);
        try {
            zzapuVar.zzl();
            zzape zzapeVar = this.zzd;
            zzapd zzapdVarZza = zzapeVar.zza(zzapuVar.zzi());
            if (zzapdVarZza == null) {
                zzapuVar.zzc("cache-miss");
                if (!this.zzf.zzc(zzapuVar)) {
                    this.zzc.put(zzapuVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzapdVarZza.zza(jCurrentTimeMillis)) {
                    zzapuVar.zzc("cache-hit-expired");
                    zzapuVar.zzj(zzapdVarZza);
                    if (!this.zzf.zzc(zzapuVar)) {
                        this.zzc.put(zzapuVar);
                    }
                } else {
                    zzapuVar.zzc("cache-hit");
                    zzaqa zzaqaVarZzr = zzapuVar.zzr(new zzapq(zzapdVarZza.zza, zzapdVarZza.zzg));
                    zzapuVar.zzc("cache-hit-parsed");
                    if (!zzaqaVarZzr.zzc()) {
                        zzapuVar.zzc("cache-parsing-failed");
                        zzapeVar.zzd(zzapuVar.zzi(), true);
                        zzapuVar.zzj(null);
                        if (!this.zzf.zzc(zzapuVar)) {
                            this.zzc.put(zzapuVar);
                        }
                    } else if (zzapdVarZza.zzf < jCurrentTimeMillis) {
                        zzapuVar.zzc("cache-hit-refresh-needed");
                        zzapuVar.zzj(zzapdVarZza);
                        zzaqaVarZzr.zzd = true;
                        if (this.zzf.zzc(zzapuVar)) {
                            this.zzg.zza(zzapuVar, zzaqaVarZzr, null);
                        } else {
                            this.zzg.zza(zzapuVar, zzaqaVarZzr, new zzapf(this, zzapuVar));
                        }
                    } else {
                        this.zzg.zza(zzapuVar, zzaqaVarZzr, null);
                    }
                }
            }
            zzapuVar.zze(2);
        } catch (Throwable th2) {
            zzapuVar.zze(2);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (zza) {
            zzaqg.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqg.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zze = true;
        interrupt();
    }

    public final /* synthetic */ BlockingQueue zzb() {
        return this.zzc;
    }
}
