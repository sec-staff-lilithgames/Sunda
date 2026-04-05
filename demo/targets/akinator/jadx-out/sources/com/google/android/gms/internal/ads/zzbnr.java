package com.google.android.gms.internal.ads;

import java.util.Objects;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbnr implements zzgtq {
    final /* synthetic */ zzbnj zza;

    public zzbnr(zzbnv zzbnvVar, zzbnj zzbnjVar) {
        this.zza = zzbnjVar;
        Objects.requireNonNull(zzbnvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtq
    public final /* bridge */ /* synthetic */ n1 zza(Object obj) throws Exception {
        zzcca zzccaVar = new zzcca();
        ((zzbnp) obj).zze(this.zza, new zzbnq(this, zzccaVar));
        return zzccaVar;
    }
}
