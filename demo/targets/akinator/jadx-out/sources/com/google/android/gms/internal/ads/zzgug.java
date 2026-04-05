package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgug implements Runnable {
    final Future zza;
    final zzguf zzb;

    public zzgug(Future future, zzguf zzgufVar) {
        this.zza = future;
        this.zzb = zzgufVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Future future = this.zza;
        if ((future instanceof zzgvk) && (thZza = zzgvl.zza((zzgvk) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzgui.zzs(future));
        } catch (ExecutionException e10) {
            this.zzb.zza(e10.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzglz zzglzVarZzb = zzgma.zzb(this);
        zzglzVarZzb.zza(this.zzb);
        return zzglzVarZzb.toString();
    }
}
