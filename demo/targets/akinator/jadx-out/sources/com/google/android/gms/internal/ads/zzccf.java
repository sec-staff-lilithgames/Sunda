package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzccf implements zzguf {
    final /* synthetic */ zzcch zza;

    public zzccf(zzcch zzcchVar) {
        Objects.requireNonNull(zzcchVar);
        this.zza = zzcchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zzb(Object obj) {
        this.zza.zzj().set(1);
    }
}
