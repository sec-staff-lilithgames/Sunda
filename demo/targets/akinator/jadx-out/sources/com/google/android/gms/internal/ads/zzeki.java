package com.google.android.gms.internal.ads;

import android.os.Bundle;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeki extends zzekk {
    private final zzcjn zza;
    private final zzdju zzb;
    private final zzcxw zzc;
    private final zzdeo zzd;
    private final zzekv zze;
    private final zzehp zzf;

    public zzeki(zzcjn zzcjnVar, zzdju zzdjuVar, zzcxw zzcxwVar, zzdeo zzdeoVar, zzekv zzekvVar, zzehp zzehpVar) {
        this.zza = zzcjnVar;
        this.zzb = zzdjuVar;
        this.zzc = zzcxwVar;
        this.zzd = zzdeoVar;
        this.zze = zzekvVar;
        this.zzf = zzehpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekk
    public final n1 zzc(zzfgn zzfgnVar, Bundle bundle, zzffu zzffuVar, zzfgf zzfgfVar) {
        zzcxw zzcxwVar = this.zzc;
        zzcxwVar.zzb(zzfgnVar);
        zzcxwVar.zzc(bundle);
        zzcxwVar.zzd(new zzcxp(zzfgfVar, zzffuVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzee)).booleanValue()) {
            zzcxwVar.zzg(this.zzf);
        }
        zzdjy zzdjyVarZzo = this.zza.zzo();
        zzdjyVarZzo.zzf(zzcxwVar.zze());
        zzdjyVarZzo.zzg(this.zzd);
        zzdjyVarZzo.zze(this.zzb);
        zzdjyVarZzo.zzd(new zzcrd(null));
        zzcus zzcusVarZza = zzdjyVarZzo.zzh().zza();
        return zzcusVarZza.zzc(zzcusVarZza.zzb());
    }
}
