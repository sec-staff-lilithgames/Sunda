package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaag implements zzabv {
    final /* synthetic */ zzsv zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzaak zzd;

    public zzaag(zzaak zzaakVar, zzsv zzsvVar, int i10, long j10) {
        this.zza = zzsvVar;
        this.zzb = i10;
        this.zzc = j10;
        Objects.requireNonNull(zzaakVar);
        this.zzd = zzaakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zza(long j10) {
        this.zzd.zzay(this.zza, this.zzb, this.zzc, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzb() {
        this.zzd.zzav(this.zza, this.zzb, this.zzc);
    }
}
