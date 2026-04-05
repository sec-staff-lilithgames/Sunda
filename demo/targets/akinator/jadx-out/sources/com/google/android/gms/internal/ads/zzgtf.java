package com.google.android.gms.internal.ads;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgtf extends zzgth {
    public zzgtf(n1 n1Var, zzgtq zzgtqVar) {
        super(n1Var, zzgtqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final /* synthetic */ void zze(Object obj) {
        zzk((n1) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgtq zzgtqVar = (zzgtq) obj;
        n1 n1VarZza = zzgtqVar.zza(obj2);
        zzgmd.zzl(n1VarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgtqVar);
        return n1VarZza;
    }
}
