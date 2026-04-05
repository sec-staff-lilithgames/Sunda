package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdqj implements zzguf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzblx zzb;

    public zzdqj(zzdqt zzdqtVar, String str, zzblx zzblxVar) {
        this.zza = str;
        this.zzb = zzblxVar;
        Objects.requireNonNull(zzdqtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcgy) obj).zzab(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
    }
}
