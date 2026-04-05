package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzctx implements zzguf {
    final /* synthetic */ zzguf zza;
    final /* synthetic */ zzcud zzb;

    public zzctx(zzcud zzcudVar, zzguf zzgufVar) {
        this.zza = zzgufVar;
        Objects.requireNonNull(zzcudVar);
        this.zzb = zzcudVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        this.zza.zza(th2);
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze(((zzctw) obj).zza, this.zza);
    }
}
