package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfit implements zzguf {
    final /* synthetic */ zzfiw zza;
    final /* synthetic */ zzfiy zzb;

    public zzfit(zzfiy zzfiyVar, zzfiw zzfiwVar) {
        this.zza = zzfiwVar;
        Objects.requireNonNull(zzfiyVar);
        this.zzb = zzfiyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        zzfiy zzfiyVar = this.zzb;
        synchronized (zzfiyVar) {
            zzfiyVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfiy zzfiyVar = this.zzb;
        synchronized (zzfiyVar) {
            try {
                zzfiyVar.zzf(null);
                zzfiyVar.zze().addFirst(this.zza);
                if (zzfiyVar.zzg() == 1) {
                    zzfiyVar.zzd();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
