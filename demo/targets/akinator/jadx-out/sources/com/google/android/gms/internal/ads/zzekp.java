package com.google.android.gms.internal.ads;

import android.os.Bundle;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzekp extends zzekk {
    private final zzcjn zza;
    private final zzcxw zzb;
    private final zzena zzc;
    private final zzdeo zzd;
    private final zzekv zze;
    private final zzehp zzf;

    public zzekp(zzcjn zzcjnVar, zzcxw zzcxwVar, zzena zzenaVar, zzdeo zzdeoVar, zzekv zzekvVar, zzehp zzehpVar) {
        this.zza = zzcjnVar;
        this.zzb = zzcxwVar;
        this.zzc = zzenaVar;
        this.zzd = zzdeoVar;
        this.zze = zzekvVar;
        this.zzf = zzehpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekk
    public final n1 zzc(zzfgn zzfgnVar, Bundle bundle, zzffu zzffuVar, zzfgf zzfgfVar) {
        zzcxw zzcxwVar = this.zzb;
        zzcxwVar.zzb(zzfgnVar);
        zzcxwVar.zzc(bundle);
        zzcxwVar.zzd(new zzcxp(zzfgfVar, zzffuVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzee)).booleanValue()) {
            zzcxwVar.zzg(this.zzf);
        }
        zzdjc zzdjcVarZzm = this.zza.zzm();
        zzdjcVarZzm.zze(zzcxwVar.zze());
        zzdjcVarZzm.zzf(this.zzd);
        zzdjcVarZzm.zzd(this.zzc);
        zzcus zzcusVarZzb = zzdjcVarZzm.zzh().zzb();
        return zzcusVarZzb.zzc(zzcusVarZzb.zzb());
    }
}
