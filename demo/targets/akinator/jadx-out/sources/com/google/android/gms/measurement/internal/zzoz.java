package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzoz implements Callable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzpg zzb;

    public zzoz(zzpg zzpgVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zzpgVar);
        this.zzb = zzpgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzr zzrVar = this.zza;
        String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        zzpg zzpgVar = this.zzb;
        zzjl zzjlVarZzB = zzpgVar.zzB(str);
        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
        if (zzjlVarZzB.zzo(zzjkVar) && zzjl.zzf(zzrVar.zzs, 100).zzo(zzjkVar)) {
            return zzpgVar.zzao(zzrVar).zzd();
        }
        zzpgVar.zzaV().zzk().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
