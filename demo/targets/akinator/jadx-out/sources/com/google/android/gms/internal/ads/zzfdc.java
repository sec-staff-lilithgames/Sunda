package com.google.android.gms.internal.ads;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfdc implements zzfdm {
    private zzcxv zza;

    @Override // com.google.android.gms.internal.ads.zzfdm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcxv zzd() {
        return this.zza;
    }

    public final synchronized n1 zzb(zzfdn zzfdnVar, zzfdl zzfdlVar, zzcxv zzcxvVar) {
        zzcus zzcusVarZza;
        try {
            if (zzcxvVar != null) {
                this.zza = zzcxvVar;
            } else {
                this.zza = (zzcxv) zzfdlVar.zza(zzfdnVar.zzb).zzh();
            }
            zzcusVarZza = this.zza.zza();
        } catch (Throwable th2) {
            throw th2;
        }
        return zzcusVarZza.zzc(zzcusVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfdm
    public final /* bridge */ /* synthetic */ n1 zzc(zzfdn zzfdnVar, zzfdl zzfdlVar, Object obj) {
        return zzb(zzfdnVar, zzfdlVar, null);
    }
}
