package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzapl {
    private final Executor zza;

    public zzapl(Handler handler) {
        this.zza = new zzapj(this, handler);
    }

    public final void zza(zzapu zzapuVar, zzaqa zzaqaVar, Runnable runnable) {
        zzapuVar.zzp();
        zzapuVar.zzc("post-response");
        ((zzapj) this.zza).zza.post(new zzapk(zzapuVar, zzaqaVar, runnable));
    }

    public final void zzb(zzapu zzapuVar, zzaqd zzaqdVar) {
        zzapuVar.zzc("post-error");
        ((zzapj) this.zza).zza.post(new zzapk(zzapuVar, zzaqa.zzb(zzaqdVar), null));
    }
}
