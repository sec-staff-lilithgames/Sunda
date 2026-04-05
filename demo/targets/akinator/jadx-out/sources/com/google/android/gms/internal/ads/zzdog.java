package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdog implements zzguf {
    final /* synthetic */ zzduq zza;
    final /* synthetic */ zzdoj zzb;

    public zzdog(zzdoj zzdojVar, zzduq zzduqVar) {
        this.zza = zzduqVar;
        Objects.requireNonNull(zzdojVar);
        this.zzb = zzdojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zzb(Object obj) {
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzb.zzd().zze(), this.zza.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
    }
}
