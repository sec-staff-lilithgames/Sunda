package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzov implements Runnable {
    final /* synthetic */ zzph zza;
    final /* synthetic */ zzpg zzb;

    public zzov(zzpg zzpgVar, zzph zzphVar) {
        this.zza = zzphVar;
        Objects.requireNonNull(zzpgVar);
        this.zzb = zzpgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.zzb;
        zzpgVar.zzau(this.zza);
        zzpgVar.zzc();
    }
}
