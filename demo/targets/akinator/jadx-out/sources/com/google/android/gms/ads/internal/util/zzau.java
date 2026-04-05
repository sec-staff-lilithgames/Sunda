package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzdm;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzau extends zzdm {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzax zzb;

    public zzau(zzax zzaxVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzaxVar);
        this.zzb = zzaxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.zzb.zzn(this.zza, zzeVar.zzb, true, true);
    }
}
