package com.google.android.gms.internal.play_billing;

import a.b;
import com.ironsource.C3191e4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzff extends zzee {
    private zzeu zzc;
    private ScheduledFuture zzd;

    private zzff(zzeu zzeuVar) {
        this.zzc = zzeuVar;
    }

    public static zzeu zzs(zzeu zzeuVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzff zzffVar = new zzff(zzeuVar);
        zzfc zzfcVar = new zzfc(zzffVar);
        zzffVar.zzd = scheduledExecutorService.schedule(zzfcVar, 28500L, timeUnit);
        zzeuVar.zzb(zzfcVar, zzed.INSTANCE);
        return zzffVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final String zzg() {
        zzeu zzeuVar = this.zzc;
        ScheduledFuture scheduledFuture = this.zzd;
        if (zzeuVar == null) {
            return null;
        }
        String strL = b.l("inputFuture=[", zzeuVar.toString(), C3191e4.i.f36531e);
        if (scheduledFuture == null) {
            return strL;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strL;
        }
        return strL + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final void zzm() {
        zzeu zzeuVar = this.zzc;
        if ((zzeuVar != null) & isCancelled()) {
            zzeuVar.cancel(zzq());
        }
        ScheduledFuture scheduledFuture = this.zzd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzc = null;
        this.zzd = null;
    }
}
