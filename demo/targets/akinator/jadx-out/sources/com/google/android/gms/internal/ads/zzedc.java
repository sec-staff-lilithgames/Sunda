package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzedc implements zzebo {
    final /* synthetic */ zzedf zza;

    public zzedc(zzedf zzedfVar) {
        Objects.requireNonNull(zzedfVar);
        this.zza = zzedfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebo
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoS)).booleanValue()) {
            zzdvh zzdvhVarZza = this.zza.zzd().zza();
            zzdvhVarZza.zzc("action", "ptard");
            zzdvhVarZza.zzc("ptard", "r");
            zzdvhVarZza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebo
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoT)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(remoteException, "Preconnect Remote");
        }
    }
}
