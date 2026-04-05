package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzeng implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdhx zza;

    public zzeng(zzenh zzenhVar, zzdhx zzdhxVar) {
        this.zza = zzdhxVar;
        Objects.requireNonNull(zzenhVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdhx zzdhxVar = this.zza;
        zzdhxVar.zzd().zza();
        zzdhxVar.zze().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }
}
