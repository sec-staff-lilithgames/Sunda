package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzffk implements zzepi {
    final /* synthetic */ zzffl zza;

    public zzffk(zzffl zzfflVar) {
        Objects.requireNonNull(zzfflVar);
        this.zza = zzfflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final void zza() {
        zzffl zzfflVar = this.zza;
        synchronized (zzfflVar) {
            zzfflVar.zzw(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffl zzfflVar = this.zza;
        zzdri zzdriVar = (zzdri) obj;
        synchronized (zzfflVar) {
            try {
                zzfflVar.zzw(zzdriVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzec)).booleanValue()) {
                    zzdriVar.zzh().zza = zzfflVar.zzu();
                }
                zzfflVar.zzv().zzj();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
