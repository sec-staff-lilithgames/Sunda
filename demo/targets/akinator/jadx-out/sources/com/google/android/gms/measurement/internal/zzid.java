package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzid implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzjd zzb;

    public zzid(zzjd zzjdVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzjdVar);
        this.zzb = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjd zzjdVar = this.zzb;
        zzjdVar.zzL().zzZ();
        return zzjdVar.zzL().zzj().zzn(this.zza);
    }
}
