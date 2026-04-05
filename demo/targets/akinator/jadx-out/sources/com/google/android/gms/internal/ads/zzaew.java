package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaew implements zzaed {
    final /* synthetic */ zzaey zza;
    private final long zzb;

    public zzaew(zzaey zzaeyVar, long j10) {
        Objects.requireNonNull(zzaeyVar);
        this.zza = zzaeyVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        zzaey zzaeyVar = this.zza;
        zzaeb zzaebVarZzg = zzaeyVar.zzg()[0].zzg(j10);
        for (int i10 = 1; i10 < zzaeyVar.zzg().length; i10++) {
            zzaeb zzaebVarZzg2 = zzaeyVar.zzg()[i10].zzg(j10);
            if (zzaebVarZzg2.zza.zzc < zzaebVarZzg.zza.zzc) {
                zzaebVarZzg = zzaebVarZzg2;
            }
        }
        return zzaebVarZzg;
    }
}
