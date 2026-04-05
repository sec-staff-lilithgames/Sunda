package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcpj implements zzguf {
    final /* synthetic */ zzcpq zza;

    public zzcpj(zzcpq zzcpqVar) {
        Objects.requireNonNull(zzcpqVar);
        this.zza = zzcpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpq zzcpqVar = this.zza;
        zzcpqVar.zzu().zzb(zzcpqVar.zzt().zzb(zzcpqVar.zzr(), zzcpqVar.zzs(), false, "", (String) obj, zzcpqVar.zzs().zzc, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcpqVar.zzq()) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
    }
}
