package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzno implements Runnable {
    final /* synthetic */ zzpg zza;
    final /* synthetic */ Runnable zzb;

    public zzno(zznt zzntVar, zzpg zzpgVar, Runnable runnable) {
        this.zza = zzpgVar;
        this.zzb = runnable;
        Objects.requireNonNull(zzntVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        zzpgVar.zzY(this.zzb);
        zzpgVar.zzM();
    }
}
