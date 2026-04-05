package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzlz implements Runnable {
    final /* synthetic */ zzlu zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzmb zzc;

    public zzlz(zzmb zzmbVar, zzlu zzluVar, long j10) {
        this.zza = zzluVar;
        this.zzb = j10;
        Objects.requireNonNull(zzmbVar);
        this.zzc = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmb zzmbVar = this.zzc;
        zzmbVar.zzv(this.zza, false, this.zzb);
        zzmbVar.zza = null;
        zzmbVar.zzu.zzt().zzG(null);
    }
}
