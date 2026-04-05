package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdth implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;
    private final zzifq zze;

    private zzdth(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar4;
        this.zze = zzifqVar5;
    }

    public static zzdth zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5) {
        return new zzdth(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4, zzifqVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcjv) this.zza).zza();
        final String strZzb = ((zzeaq) this.zzb).zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzckk) this.zzc).zza();
        final zzbdz.zza.EnumC0159zza enumC0159zza = (zzbdz.zza.EnumC0159zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbdt zzbdtVar = new zzbdt(new zzbdy(contextZza));
        zzbdz.zzar.zza zzaVarZzs = zzbdz.zzar.zzs();
        zzaVarZzs.zzc(versionInfoParcelZza.buddyApkVersion);
        zzaVarZzs.zzg(versionInfoParcelZza.clientJarVersion);
        zzaVarZzs.zzk(true != versionInfoParcelZza.isClientJar ? 2 : 0);
        final zzbdz.zzar zzarVarZzbu = zzaVarZzs.zzbu();
        zzbdtVar.zzb(new zzbds() { // from class: com.google.android.gms.internal.ads.zzdtg
            @Override // com.google.android.gms.internal.ads.zzbds
            public final /* synthetic */ void zza(zzbdz.zzt.zza zzaVar) {
                zzbdz.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbVarZzcc.zzc(enumC0159zza);
                zzaVar.zzaa(zzbVarZzcc);
                zzbdz.zzm.zza zzaVarZzcc = zzaVar.zzG().zzcc();
                zzaVarZzcc.zzd(strZzb);
                zzaVarZzcc.zzs(zzarVarZzbu);
                zzaVar.zzI(zzaVarZzcc);
                zzaVar.zzh(str);
            }
        });
        return zzbdtVar;
    }
}
