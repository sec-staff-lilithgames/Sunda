package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdxu implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;
    private final zzifq zze;
    private final zzifq zzf;
    private final zzifq zzg;
    private final zzifq zzh;
    private final zzifq zzi;

    private zzdxu(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7, zzifq zzifqVar8, zzifq zzifqVar9, zzifq zzifqVar10) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar5;
        this.zze = zzifqVar6;
        this.zzf = zzifqVar7;
        this.zzg = zzifqVar8;
        this.zzh = zzifqVar9;
        this.zzi = zzifqVar10;
    }

    public static zzdxu zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7, zzifq zzifqVar8, zzifq zzifqVar9, zzifq zzifqVar10) {
        return new zzdxu(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4, zzifqVar5, zzifqVar6, zzifqVar7, zzifqVar8, zzifqVar9, zzifqVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxt((Executor) this.zza.zzb(), ((zzcjv) this.zzb).zza(), ((zzcjw) this.zzc).zza(), zzfjn.zzc(), (zzdsy) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzdvt) this.zzf.zzb(), ((zzckk) this.zzg).zza(), ((zzdfv) this.zzh).zzb(), (zzflp) this.zzi.zzb());
    }
}
