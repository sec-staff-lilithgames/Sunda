package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzccg implements zzguf {
    final /* synthetic */ zzcce zza;
    final /* synthetic */ zzccc zzb;

    public zzccg(zzcch zzcchVar, zzcce zzcceVar, zzccc zzcccVar) {
        this.zza = zzcceVar;
        this.zzb = zzcccVar;
        Objects.requireNonNull(zzcchVar);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
