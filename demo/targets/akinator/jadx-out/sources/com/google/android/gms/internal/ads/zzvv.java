package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzvv implements zzwk {
    final /* synthetic */ zzvy zza;
    private final int zzb;

    public zzvv(zzvy zzvyVar, int i10) {
        Objects.requireNonNull(zzvyVar);
        this.zza = zzvyVar;
        this.zzb = i10;
    }

    public final /* synthetic */ int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final boolean zzb() {
        return this.zza.zzp(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzc() throws IOException {
        this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final int zzd(zzkj zzkjVar, zzhh zzhhVar, int i10) {
        return this.zza.zzs(this.zzb, zzkjVar, zzhhVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final int zze(long j10) {
        return this.zza.zzt(this.zzb, j10);
    }
}
