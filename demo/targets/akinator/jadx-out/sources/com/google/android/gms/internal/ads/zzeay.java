package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeay implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;

    private zzeay(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar4;
        this.zzc = zzifqVar5;
    }

    public static zzeay zzc(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5) {
        return new zzeay(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4, zzifqVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeax zzb() {
        return new zzeax((ScheduledExecutorService) this.zza.zzb(), zzfjn.zzc(), zzfjt.zzc(), ((zzebx) this.zzb).zzb(), zzifg.zzc(this.zzc));
    }
}
