package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfc implements Runnable {
    zzff zza;

    public zzfc(zzff zzffVar) {
        this.zza = zzffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeu zzeuVar;
        zzff zzffVar = this.zza;
        if (zzffVar == null || (zzeuVar = zzffVar.zzc) == null) {
            return;
        }
        this.zza = null;
        if (zzeuVar.isDone()) {
            zzffVar.zzp(zzeuVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzffVar.zzd;
            zzffVar.zzd = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    zzffVar.zzo(new zzfd(str, null));
                    throw th2;
                }
            }
            zzffVar.zzo(new zzfd(str + ": " + zzeuVar.toString(), null));
        } finally {
            zzeuVar.cancel(true);
        }
    }
}
