package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfpd extends TimerTask {
    final /* synthetic */ zzfpf zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzfpg zzc;

    public zzfpd(zzfpg zzfpgVar, zzfpf zzfpfVar, Timer timer) {
        this.zza = zzfpfVar;
        this.zzb = timer;
        Objects.requireNonNull(zzfpgVar);
        this.zzc = zzfpgVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}
