package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzejh implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;
    private final zzifq zze;
    private final zzifq zzf;
    private final zzifq zzg;
    private final zzifq zzh;
    private final zzifq zzi;

    private zzejh(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7, zzifq zzifqVar8, zzifq zzifqVar9, zzifq zzifqVar10) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar4;
        this.zze = zzifqVar5;
        this.zzf = zzifqVar6;
        this.zzg = zzifqVar8;
        this.zzh = zzifqVar9;
        this.zzi = zzifqVar10;
    }

    public static zzejh zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7, zzifq zzifqVar8, zzifq zzifqVar9, zzifq zzifqVar10) {
        return new zzejh(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4, zzifqVar5, zzifqVar6, zzifqVar7, zzifqVar8, zzifqVar9, zzifqVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzejg((Context) this.zza.zzb(), ((zzckk) this.zzb).zza(), ((zzcyf) this.zzc).zza(), (Executor) this.zzd.zzb(), (zzdjd) this.zze.zzb(), (zzdse) this.zzf.zzb(), new zzbma(), (zzegj) this.zzg.zzb(), (zzdvc) this.zzh.zzb(), (zzdvi) this.zzi.zzb());
    }
}
