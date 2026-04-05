package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zznz extends zzay {
    final /* synthetic */ zzoa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznz(zzoa zzoaVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzoaVar);
        this.zza = zzoaVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        zzoa zzoaVar = this.zza;
        zzoc zzocVar = zzoaVar.zzc;
        zzocVar.zzg();
        zzic zzicVar = zzocVar.zzu;
        zzoaVar.zzd(false, false, zzicVar.zzaZ().elapsedRealtime());
        zzocVar.zzu.zzw().zzc(zzicVar.zzaZ().elapsedRealtime());
    }
}
