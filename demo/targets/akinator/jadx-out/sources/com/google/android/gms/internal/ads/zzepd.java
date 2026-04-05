package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzepd implements zzepi {
    final /* synthetic */ zzepe zza;

    public zzepd(zzepe zzepeVar) {
        Objects.requireNonNull(zzepeVar);
        this.zza = zzepeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcto zzctoVar = (zzcto) obj;
        zzepe zzepeVar = this.zza;
        synchronized (zzepeVar) {
            zzepeVar.zze(zzctoVar.zzn());
            zzctoVar.zzj();
        }
    }
}
