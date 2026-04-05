package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgvc implements Runnable {
    zzgve zza;

    public zzgvc(zzgve zzgveVar) {
        this.zza = zzgveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n1 n1VarZzf;
        zzgve zzgveVar = this.zza;
        if (zzgveVar == null || (n1VarZzf = zzgveVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (n1VarZzf.isDone()) {
            zzgveVar.zzk(n1VarZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzgveVar.zzx();
            zzgveVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb2.append("Timed out (timeout delayed by ");
                        sb2.append(jAbs);
                        sb2.append(" ms after scheduled time)");
                        string = sb2.toString();
                    }
                } catch (Throwable th2) {
                    zzgveVar.zzb(new zzgvd(string, null));
                    throw th2;
                }
            }
            String string2 = n1VarZzf.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
            sb3.append(string);
            sb3.append(": ");
            sb3.append(string2);
            zzgveVar.zzb(new zzgvd(sb3.toString(), null));
        } finally {
            n1VarZzf.cancel(true);
        }
    }
}
