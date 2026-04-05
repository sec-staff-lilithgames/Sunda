package com.google.android.gms.internal.ads;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgsy extends zzgta {
    public zzgsy(n1 n1Var, Class cls, zzgtq zzgtqVar) {
        super(n1Var, cls, zzgtqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final /* synthetic */ void zze(Object obj) {
        zzk((n1) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th2) throws Exception {
        zzgtq zzgtqVar = (zzgtq) obj;
        n1 n1VarZza = zzgtqVar.zza(th2);
        zzgmd.zzl(n1VarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgtqVar);
        return n1VarZza;
    }
}
