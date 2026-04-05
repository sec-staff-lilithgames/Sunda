package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzemw implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcca zza;
    final /* synthetic */ zzfgf zzb;
    final /* synthetic */ zzffu zzc;
    final /* synthetic */ zzend zzd;
    final /* synthetic */ zzemy zze;

    public zzemw(zzemy zzemyVar, zzcca zzccaVar, zzfgf zzfgfVar, zzffu zzffuVar, zzend zzendVar) {
        this.zza = zzccaVar;
        this.zzb = zzfgfVar;
        this.zzc = zzffuVar;
        this.zzd = zzendVar;
        Objects.requireNonNull(zzemyVar);
        this.zze = zzemyVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzend zzendVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzendVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
