package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzebl implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;
    private final zzifq zze;
    private final zzifq zzf;
    private final zzifq zzg;
    private final zzifq zzh;
    private final zzifq zzi;
    private final zzifq zzj;

    private zzebl(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7, zzifq zzifqVar8, zzifq zzifqVar9, zzifq zzifqVar10, zzifq zzifqVar11, zzifq zzifqVar12, zzifq zzifqVar13) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar4;
        this.zze = zzifqVar6;
        this.zzf = zzifqVar7;
        this.zzg = zzifqVar8;
        this.zzh = zzifqVar11;
        this.zzi = zzifqVar12;
        this.zzj = zzifqVar13;
    }

    public static zzebl zzc(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7, zzifq zzifqVar8, zzifq zzifqVar9, zzifq zzifqVar10, zzifq zzifqVar11, zzifq zzifqVar12, zzifq zzifqVar13) {
        return new zzebl(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4, zzifqVar5, zzifqVar6, zzifqVar7, zzifqVar8, zzifqVar9, zzifqVar10, zzifqVar11, zzifqVar12, zzifqVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzebk zzb() {
        return new zzebk((zzcjn) this.zza.zzb(), ((zzcjv) this.zzb).zza(), ((zzckk) this.zzc).zza(), ((zzcyf) this.zzd).zza(), zzfjn.zzc(), (String) this.zze.zzb(), (zzflm) this.zzf.zzb(), (zzdvc) this.zzg.zzb(), zzcku.zza(), zzckr.zza(), (ScheduledExecutorService) this.zzh.zzb(), (zzfng) this.zzi.zzb(), ((zzdbt) this.zzj).zzb());
    }
}
