package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzly implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzmb zzb;

    public zzly(zzmb zzmbVar, long j10) {
        this.zza = j10;
        Objects.requireNonNull(zzmbVar);
        this.zzb = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmb zzmbVar = this.zzb;
        zzmbVar.zzu.zzw().zzc(this.zza);
        zzmbVar.zza = null;
    }
}
