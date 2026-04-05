package com.google.android.gms.internal.ads;

import android.os.Bundle;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzekl extends zzekk {
    private final zzcjn zza;
    private final zzcxw zzb;
    private final zzdeo zzc;
    private final zzekv zzd;
    private final zzehp zze;

    public zzekl(zzcjn zzcjnVar, zzcxw zzcxwVar, zzdeo zzdeoVar, zzekv zzekvVar, zzehp zzehpVar) {
        this.zza = zzcjnVar;
        this.zzb = zzcxwVar;
        this.zzc = zzdeoVar;
        this.zzd = zzekvVar;
        this.zze = zzehpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekk
    public final n1 zzc(zzfgn zzfgnVar, Bundle bundle, zzffu zzffuVar, zzfgf zzfgfVar) {
        zzcxw zzcxwVar = this.zzb;
        zzcxwVar.zzb(zzfgnVar);
        zzcxwVar.zzc(bundle);
        zzcxwVar.zzd(new zzcxp(zzfgfVar, zzffuVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzee)).booleanValue()) {
            zzcxwVar.zzg(this.zze);
        }
        zzcqt zzcqtVarZzk = this.zza.zzk();
        zzcqtVarZzk.zzd(zzcxwVar.zze());
        zzcqtVarZzk.zze(this.zzc);
        zzcus zzcusVarZza = zzcqtVarZzk.zzh().zza();
        return zzcusVarZza.zzc(zzcusVarZza.zzb());
    }
}
