package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfke implements zzguf {
    final /* synthetic */ zzfjz zza;
    final /* synthetic */ zzfkj zzb;

    public zzfke(zzfkj zzfkjVar, zzfjz zzfjzVar) {
        this.zza = zzfjzVar;
        Objects.requireNonNull(zzfkjVar);
        this.zzb = zzfkjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        this.zzb.zza.zzg().zzc(this.zza, th2);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
