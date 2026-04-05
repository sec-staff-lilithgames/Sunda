package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbox implements zzblx {
    final /* synthetic */ zzbpe zza;
    private final zzblx zzb;

    public zzbox(zzbpe zzbpeVar, zzblx zzblxVar) {
        Objects.requireNonNull(zzbpeVar);
        this.zza = zzbpeVar;
        this.zzb = zzblxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        this.zzb.zza(this.zza, map);
    }

    public final /* synthetic */ zzblx zzb() {
        return this.zzb;
    }
}
