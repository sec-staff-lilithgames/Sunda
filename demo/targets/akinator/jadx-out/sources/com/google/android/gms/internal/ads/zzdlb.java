package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdlb implements zzguf {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdll zzb;

    public zzdlb(zzdll zzdllVar, String str, boolean z10) {
        Objects.requireNonNull(zzdllVar);
        this.zzb = zzdllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfX)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdll zzdllVar = this.zzb;
        zzdllVar.zzZ().zzo((zzcgy) obj);
        String str = this.zza;
        zzcca zzccaVarZzY = zzdllVar.zzZ().zzY();
        zzehf zzehfVarZzL = zzdllVar.zzL(str, true);
        if (zzehfVarZzL != null && zzccaVarZzY != null) {
            zzccaVarZzY.zzc(zzehfVarZzL);
        } else if (zzccaVarZzY != null) {
            zzccaVarZzY.cancel(false);
        }
    }
}
