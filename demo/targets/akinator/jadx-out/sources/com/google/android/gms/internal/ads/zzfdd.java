package com.google.android.gms.internal.ads;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfdd implements zzfdm {
    private final zzfdm zza;
    private zzcxv zzb;

    public zzfdd(zzfdm zzfdmVar) {
        this.zza = zzfdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcxv zzd() {
        return this.zzb;
    }

    public final synchronized n1 zzb(zzfdn zzfdnVar, zzfdl zzfdlVar, zzcxv zzcxvVar) {
        zzbxj zzbxjVar;
        this.zzb = zzcxvVar;
        if (zzcxvVar == null || (zzbxjVar = zzfdnVar.zza) == null) {
            return ((zzfdc) this.zza).zzb(zzfdnVar, zzfdlVar, zzcxvVar);
        }
        zzcus zzcusVarZza = zzcxvVar.zza();
        return zzcusVarZza.zzc(zzcusVarZza.zza(zzgui.zza(zzbxjVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzfdm
    public final /* bridge */ /* synthetic */ n1 zzc(zzfdn zzfdnVar, zzfdl zzfdlVar, Object obj) {
        return zzb(zzfdnVar, zzfdlVar, null);
    }
}
