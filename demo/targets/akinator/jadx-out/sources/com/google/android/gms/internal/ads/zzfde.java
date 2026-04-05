package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfde implements zzglu {
    final /* synthetic */ zzfdi zza;

    public zzfde(zzfdi zzfdiVar) {
        Objects.requireNonNull(zzfdiVar);
        this.zza = zzfdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzglu
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", (zzecj) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfdi zzfdiVar = this.zza;
        zzfdiVar.zzd(new zzfdg(null, zzfdiVar.zzb(), null));
        return zzfdiVar.zzc();
    }
}
