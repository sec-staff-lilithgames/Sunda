package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaej extends zzadp {
    final /* synthetic */ zzaed zza;
    final /* synthetic */ zzaek zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaej(zzaek zzaekVar, zzaed zzaedVar, zzaed zzaedVar2) {
        super(zzaedVar);
        this.zza = zzaedVar2;
        Objects.requireNonNull(zzaekVar);
        this.zzb = zzaekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadp, com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        zzaeb zzaebVarZzc = this.zza.zzc(j10);
        zzaee zzaeeVar = zzaebVarZzc.zza;
        long j11 = zzaeeVar.zzb;
        zzaek zzaekVar = this.zzb;
        zzaee zzaeeVar2 = new zzaee(j11, zzaekVar.zza() + zzaeeVar.zzc);
        zzaee zzaeeVar3 = zzaebVarZzc.zzb;
        return new zzaeb(zzaeeVar2, new zzaee(zzaeeVar3.zzb, zzaekVar.zza() + zzaeeVar3.zzc));
    }
}
