package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfnr extends com.google.android.gms.ads.internal.client.zzbm {
    final /* synthetic */ zzgvb zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx zzb;
    final /* synthetic */ zzfns zzc;

    public zzfnr(zzfns zzfnsVar, zzgvb zzgvbVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zza = zzgvbVar;
        this.zzb = zzbxVar;
        Objects.requireNonNull(zzfnsVar);
        this.zzc = zzfnsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzb() {
        Objects.requireNonNull(this.zzc);
        zzfnj.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfns zzfnsVar = this.zzc;
        String str = zzfnsVar.zze.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb2.append("Failed to load interstitial ad with error: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        zzfnsVar.zzv(zzeVar);
    }
}
