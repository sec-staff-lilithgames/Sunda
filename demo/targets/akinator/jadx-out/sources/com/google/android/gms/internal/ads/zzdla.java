package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdla implements zzbau {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdll zzb;

    public zzdla(zzdll zzdllVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdllVar);
        this.zzb = zzdllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzdo(zzbat zzbatVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzca)).booleanValue()) {
            synchronized (this) {
                try {
                    if (zzbatVar.zzj) {
                        zzdll zzdllVar = this.zzb;
                        if (zzdllVar.zzaa() != null) {
                            zzdllVar.zzab().put(this.zza, Boolean.TRUE);
                            if (zzdllVar.zzaa() == null) {
                                return;
                            } else {
                                zzdllVar.zzu(zzdllVar.zzaa().zzdJ(), zzdllVar.zzaa().zzj(), zzdllVar.zzaa().zzk(), true);
                            }
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (zzbatVar.zzj) {
            zzdll zzdllVar2 = this.zzb;
            if (zzdllVar2.zzaa() != null) {
                zzdllVar2.zzab().put(this.zza, Boolean.TRUE);
                if (zzdllVar2.zzaa() == null) {
                    return;
                }
                zzdllVar2.zzu(zzdllVar2.zzaa().zzdJ(), zzdllVar2.zzaa().zzj(), zzdllVar2.zzaa().zzk(), true);
            }
        }
    }
}
