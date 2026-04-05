package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdkf implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;
    private final zzifq zze;
    private final zzifq zzf;

    private zzdkf(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar4;
        this.zze = zzifqVar5;
        this.zzf = zzifqVar6;
    }

    public static zzdkf zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6) {
        return new zzdkf(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4, zzifqVar5, zzifqVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcjn zzcjnVar = (zzcjn) this.zza.zzb();
        zzcxw zzcxwVarZza = ((zzcyg) this.zzb).zza();
        zzdeo zzdeoVarZza = ((zzdfj) this.zzc).zza();
        zzdju zzdjuVarZza = ((zzdjw) this.zzd).zza();
        zzdbp zzdbpVarZzb = ((zzcrf) this.zze).zzb();
        zzekv zzekvVar = (zzekv) this.zzf.zzb();
        zzcsk zzcskVarZzi = zzcjnVar.zzi();
        zzcskVarZzi.zzl(zzcxwVarZza.zze());
        zzcskVarZzi.zzm(zzdeoVarZza);
        zzcskVarZzi.zzd(zzdjuVarZza);
        zzcskVarZzi.zzk(new zzena(null));
        zzcskVarZzi.zzg(new zzctg(zzdbpVarZzb, null));
        zzcskVarZzi.zze(new zzcrd(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeh)).booleanValue()) {
            zzcskVarZzi.zzf(zzele.zza(zzekvVar));
        }
        zzctr zzctrVarZzd = zzcskVarZzi.zzh().zzd();
        zzifp.zzb(zzctrVarZzd);
        return zzctrVarZzd;
    }
}
