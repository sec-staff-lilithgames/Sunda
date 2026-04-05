package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zziv implements Callable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjd zzc;

    public zziv(zzjd zzjdVar, zzr zzrVar, Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = bundle;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzZ();
        return zzjdVar.zzL().zzaq(this.zza, this.zzb);
    }
}
