package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfkb {
    final /* synthetic */ zzfkk zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfkb(zzfkk zzfkkVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfkkVar);
        this.zza = zzfkkVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfkj zza(Callable callable) {
        List list = this.zzc;
        zzguh zzguhVarZzp = zzgui.zzp(list);
        n1 n1VarZza = zzguhVarZzp.zza(zzfka.zza, zzcbv.zzg);
        zzfkk zzfkkVar = this.zza;
        return new zzfkj(zzfkkVar, this.zzb, null, n1VarZza, list, zzguhVarZzp.zza(callable, zzfkkVar.zze()), null);
    }
}
