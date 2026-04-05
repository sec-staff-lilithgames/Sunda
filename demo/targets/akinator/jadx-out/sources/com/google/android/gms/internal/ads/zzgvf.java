package com.google.android.gms.internal.ads;

import java.util.Objects;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgvf extends zzgup {
    final /* synthetic */ zzgvh zza;
    private final zzgtp zzb;

    public zzgvf(zzgvh zzgvhVar, zzgtp zzgtpVar) {
        Objects.requireNonNull(zzgvhVar);
        this.zza = zzgvhVar;
        this.zzb = zzgtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgtp zzgtpVar = this.zzb;
        n1 n1VarZza = zzgtpVar.zza();
        zzgmd.zzl(n1VarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgtpVar);
        return n1VarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    public final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((n1) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    public final void zzg(Throwable th2) {
        this.zza.zzb(th2);
    }
}
