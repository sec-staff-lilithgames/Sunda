package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfol implements Runnable {
    final /* synthetic */ zzfom zza;

    public zzfol(zzfom zzfomVar) {
        Objects.requireNonNull(zzfomVar);
        this.zza = zzfomVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfom zzfomVar = this.zza;
        if (zzfomVar.zzA() != null) {
            zzfnv zzfnvVarZzA = zzfomVar.zzA();
            Clock clockZzB = zzfomVar.zzB();
            zzfnvVarZzA.zzj(clockZzB.currentTimeMillis(), zzfomVar.zzC(), zzfomVar.zze.zzd, zzfomVar.zzz());
        }
    }
}
