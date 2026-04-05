package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzvo extends zzadp {
    final /* synthetic */ zzvy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzvo(zzvy zzvyVar, zzaed zzaedVar) {
        super(zzaedVar);
        Objects.requireNonNull(zzvyVar);
        this.zza = zzvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadp, com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zza.zzQ();
    }
}
