package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfgv implements zzguf {
    final /* synthetic */ zzcgy zza;
    final /* synthetic */ zzcpe zzb;
    final /* synthetic */ zzfng zzc;
    final /* synthetic */ zzefy zzd;

    public zzfgv(zzcgy zzcgyVar, zzcpe zzcpeVar, zzfng zzfngVar, zzefy zzefyVar) {
        this.zza = zzcgyVar;
        this.zzb = zzcpeVar;
        this.zzc = zzfngVar;
        this.zzd = zzefyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpe zzcpeVar;
        String str = (String) obj;
        zzcgy zzcgyVar = this.zza;
        zzffu zzffuVarZzC = zzcgyVar.zzC();
        if (zzffuVarZzC != null && !zzffuVarZzC.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzffuVarZzC.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlb)).booleanValue() && (zzcpeVar = this.zzb) != null && zzcpe.zzc(str)) {
                zzcpeVar.zza(str, this.zzc, com.google.android.gms.ads.internal.client.zzbb.zze(), zzvVar);
                return;
            } else {
                this.zzc.zzb(str, zzvVar, null, null);
                return;
            }
        }
        zzffx zzffxVarZzaC = zzcgyVar.zzaC();
        if (zzffxVarZzaC == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        boolean zZzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcgyVar.getContext());
        boolean z10 = false;
        boolean z11 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgN)).booleanValue() && zzffuVarZzC != null && zzffuVarZzC.zzS;
        if (zzffuVarZzC != null && zzffuVarZzC.zzad != null) {
            z10 = true;
        }
        this.zzd.zze(new zzega(jCurrentTimeMillis, zzffxVarZzaC.zzb, str, (zZzs || z11 || z10) ? 2 : 1));
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
    }
}
