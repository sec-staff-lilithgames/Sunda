package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfop extends zzbyu {
    final /* synthetic */ zzgvb zza;
    final /* synthetic */ zzbyo zzb;
    final /* synthetic */ zzfoq zzc;

    public zzfop(zzfoq zzfoqVar, zzgvb zzgvbVar, zzbyo zzbyoVar) {
        this.zza = zzgvbVar;
        this.zzb = zzbyoVar;
        Objects.requireNonNull(zzfoqVar);
        this.zzc = zzfoqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zze() {
        Objects.requireNonNull(this.zzc);
        zzfnj.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfoq zzfoqVar = this.zzc;
        String str = zzfoqVar.zze.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb2.append("Failed to load rewarded ad with error: ");
        sb2.append(string);
        sb2.append(", adUnitId: ");
        sb2.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        zzfoqVar.zzv(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzf(int i10) {
    }
}
