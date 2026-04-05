package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcrk implements zzifh {
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

    private zzcrk(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7, zzifq zzifqVar8, zzifq zzifqVar9, zzifq zzifqVar10) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar4;
        this.zze = zzifqVar5;
        this.zzf = zzifqVar6;
        this.zzg = zzifqVar7;
        this.zzh = zzifqVar8;
        this.zzi = zzifqVar9;
        this.zzj = zzifqVar10;
    }

    public static zzcrk zzc(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7, zzifq zzifqVar8, zzifq zzifqVar9, zzifq zzifqVar10) {
        return new zzcrk(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4, zzifqVar5, zzifqVar6, zzifqVar7, zzifqVar8, zzifqVar9, zzifqVar10);
    }

    public static zzcrj zzd(zzctn zzctnVar, Context context, zzffv zzffvVar, View view, zzcgy zzcgyVar, zzctm zzctmVar, zzdma zzdmaVar, zzdgx zzdgxVar, zzifb zzifbVar, Executor executor) {
        return new zzcrj(zzctnVar, context, zzffvVar, view, zzcgyVar, zzctmVar, zzdmaVar, zzdgxVar, zzifbVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcrj zzb() {
        return new zzcrj(((zzcvv) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcrq) this.zzc).zza(), ((zzcrp) this.zzd).zza(), ((zzcse) this.zze).zza(), ((zzcrr) this.zzf).zza(), ((zzdjx) this.zzg).zza(), (zzdgx) this.zzh.zzb(), zzifg.zzc(this.zzi), (Executor) this.zzj.zzb());
    }
}
