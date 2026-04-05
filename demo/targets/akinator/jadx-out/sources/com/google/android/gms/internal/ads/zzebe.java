package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzebe implements zzguf {
    final /* synthetic */ zzebk zza;

    public zzebe(zzebk zzebkVar) {
        Objects.requireNonNull(zzebkVar);
        this.zza = zzebkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfgf zzfgfVar = (zzfgf) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcA)).booleanValue()) {
            this.zza.zzf().zzdU(zzfgfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
    }
}
