package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzezb implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;
    private final zzifq zze;

    private zzezb(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7) {
        this.zza = zzifqVar2;
        this.zzb = zzifqVar3;
        this.zzc = zzifqVar5;
        this.zzd = zzifqVar6;
        this.zze = zzifqVar7;
    }

    public static zzezb zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7) {
        return new zzezb(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4, zzifqVar5, zzifqVar6, zzifqVar7);
    }

    public static zzeyz zzc(zzcbb zzcbbVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        return new zzeyz(zzcbbVar, context, scheduledExecutorService, executor, i10, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeyz(zzcnn.zza(), ((zzcjv) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzfjn.zzc(), ((zzfah) this.zzc).zzb().intValue(), ((zzfai) this.zzd).zzb().booleanValue(), ((zzfaj) this.zze).zzb().booleanValue());
    }
}
