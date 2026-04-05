package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzek implements Runnable {
    final Future zza;
    final zzej zzb;

    public zzek(Future future, zzej zzejVar) {
        this.zza = future;
        this.zzb = zzejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thZza;
        Object obj2 = this.zza;
        if ((obj2 instanceof zzfi) && (thZza = zzfj.zza((zzfi) obj2)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            Future future = this.zza;
            if (!future.isDone()) {
                throw new IllegalStateException(zzbf.zza("Future was expected to be done: %s", future));
            }
            boolean z10 = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e10) {
            this.zzb.zza(e10.getCause());
        } catch (Throwable th3) {
            this.zzb.zza(th3);
        }
    }

    public final String toString() {
        zzba zzbaVarZza = zzbc.zza(this);
        zzbaVarZza.zza(this.zzb);
        return zzbaVarZza.toString();
    }
}
