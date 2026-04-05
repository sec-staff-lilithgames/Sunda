package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdno implements zzguf {
    final /* synthetic */ zzdnq zza;

    public zzdno(zzdnq zzdnqVar) {
        Objects.requireNonNull(zzdnqVar);
        this.zza = zzdnqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfX)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcgy zzcgyVar = (zzcgy) list.get(0);
            if (zzcgyVar != null) {
                this.zza.zza(zzcgyVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfX)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "omid native display exp");
            }
        }
    }
}
