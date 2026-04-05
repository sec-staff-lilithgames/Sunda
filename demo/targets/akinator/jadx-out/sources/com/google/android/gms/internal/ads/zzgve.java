package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgve extends zzgtz {
    private n1 zza;
    private ScheduledFuture zzb;

    private zzgve(n1 n1Var) {
        n1Var.getClass();
        this.zza = n1Var;
    }

    public static n1 zze(n1 n1Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgve zzgveVar = new zzgve(n1Var);
        zzgvc zzgvcVar = new zzgvc(zzgveVar);
        zzgveVar.zzb = scheduledExecutorService.schedule(zzgvcVar, j10, timeUnit);
        n1Var.addListener(zzgvcVar, zzgtx.INSTANCE);
        return zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final String zzd() {
        n1 n1Var = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (n1Var == null) {
            return null;
        }
        String string = n1Var.toString();
        String strO = a.b.o(new StringBuilder(string.length() + 14), "inputFuture=[", string, C3191e4.i.f36531e);
        if (scheduledFuture == null) {
            return strO;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strO;
        }
        int length = strO.length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb2.append(strO);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public final /* synthetic */ n1 zzf() {
        return this.zza;
    }

    public final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    public final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
