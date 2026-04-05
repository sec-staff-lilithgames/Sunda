package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzffp implements zzepi {
    final /* synthetic */ zzffr zza;

    public zzffp(zzffr zzffrVar) {
        Objects.requireNonNull(zzffrVar);
        this.zza = zzffrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final void zza() {
        zzffr zzffrVar = this.zza;
        synchronized (zzffrVar) {
            zzffrVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffr zzffrVar = this.zza;
        zzdri zzdriVar = (zzdri) obj;
        synchronized (zzffrVar) {
            try {
                zzffrVar.zzx(zzdriVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzec)).booleanValue()) {
                    zzdriVar.zzh().zza = zzffrVar.zzv();
                }
                zzffrVar.zzw().zzj();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
