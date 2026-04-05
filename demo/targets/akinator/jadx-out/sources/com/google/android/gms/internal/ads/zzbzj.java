package com.google.android.gms.internal.ads;

import java.util.Objects;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbzj implements zzguf {
    final /* synthetic */ n1 zza;

    public zzbzj(zzbzo zzbzoVar, n1 n1Var) {
        this.zza = n1Var;
        Objects.requireNonNull(zzbzoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        zzbzo.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbzo.zzc.remove(this.zza);
    }
}
