package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzekn extends zzekk {
    private final zzcjn zza;
    private final zzcxw zzb;
    private final zzena zzc;
    private final zzdeo zzd;
    private final zzdju zze;
    private final zzdbp zzf;
    private final ViewGroup zzg;
    private final zzddu zzh;
    private final zzekv zzi;
    private final zzehp zzj;

    public zzekn(zzcjn zzcjnVar, zzcxw zzcxwVar, zzena zzenaVar, zzdeo zzdeoVar, zzdju zzdjuVar, zzdbp zzdbpVar, ViewGroup viewGroup, zzddu zzdduVar, zzekv zzekvVar, zzehp zzehpVar) {
        this.zza = zzcjnVar;
        this.zzb = zzcxwVar;
        this.zzc = zzenaVar;
        this.zzd = zzdeoVar;
        this.zze = zzdjuVar;
        this.zzf = zzdbpVar;
        this.zzg = viewGroup;
        this.zzh = zzdduVar;
        this.zzi = zzekvVar;
        this.zzj = zzehpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekk
    public final n1 zzc(zzfgn zzfgnVar, Bundle bundle, zzffu zzffuVar, zzfgf zzfgfVar) {
        zzcxw zzcxwVar = this.zzb;
        zzcxwVar.zzb(zzfgnVar);
        zzcxwVar.zzc(bundle);
        zzcxwVar.zzd(new zzcxp(zzfgfVar, zzffuVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzee)).booleanValue()) {
            zzcxwVar.zzg(this.zzj);
        }
        zzcsk zzcskVarZzi = this.zza.zzi();
        zzcskVarZzi.zzl(zzcxwVar.zze());
        zzcskVarZzi.zzm(this.zzd);
        zzcskVarZzi.zzk(this.zzc);
        zzcskVarZzi.zzd(this.zze);
        zzcskVarZzi.zzg(new zzctg(this.zzf, this.zzh));
        zzcskVarZzi.zze(new zzcrd(this.zzg));
        zzcus zzcusVarZzc = zzcskVarZzi.zzh().zzc();
        return zzcusVarZzc.zzc(zzcusVarZzc.zzb());
    }
}
