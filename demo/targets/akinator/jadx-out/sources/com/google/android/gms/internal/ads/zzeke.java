package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzeke implements zzguf {
    final /* synthetic */ zzffu zza;
    final /* synthetic */ zzekf zzb;

    public zzeke(zzekf zzekfVar, zzffu zzffuVar) {
        this.zza = zzffuVar;
        Objects.requireNonNull(zzekfVar);
        this.zzb = zzekfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        zzekf zzekfVar = this.zzb;
        synchronized (zzekfVar) {
            try {
                zzekg zzekgVarZzc = zzekfVar.zzc();
                zzffu zzffuVar = this.zza;
                zzekgVarZzc.zzc(th2, zzffuVar);
                zzffu zzffuVarZza = zzekfVar.zzc().zza();
                if (zzffuVar.zzav) {
                    while (zzffuVarZza != null) {
                        zzekfVar.zzb(zzffuVarZza);
                        zzffuVarZza = zzekfVar.zzc().zza();
                    }
                } else if (zzffuVarZza != null) {
                    zzekfVar.zzb(zzffuVarZza);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzekf zzekfVar = this.zzb;
        zzekw zzekwVar = (zzekw) obj;
        synchronized (zzekfVar) {
            try {
                zzekfVar.zzc().zzb(zzekwVar, this.zza);
                zzffu zzffuVarZza = zzekfVar.zzc().zza();
                if (zzffuVarZza != null) {
                    zzekfVar.zzb(zzffuVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
