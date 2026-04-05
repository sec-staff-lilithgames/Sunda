package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfzo implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;
    private final zzifq zze;

    private zzfzo(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar4;
        this.zze = zzifqVar5;
    }

    public static zzfzo zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5) {
        return new zzfzo(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4, zzifqVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        ExecutorService executorService = (ExecutorService) this.zzc.zzb();
        zzfys zzfysVar = (zzfys) this.zzd.zzb();
        zzfxt zzfxtVar = (zzfxt) this.zze.zzb();
        return new zzfzw(context, scheduledExecutorService, executorService, zzfysVar, new Random(), zzfxtVar.zzd().zza(), zzfxtVar.zzd().zzc(), zzfxtVar.zzd().zzd(), zzfxtVar.zzd().zzb(), zzfxtVar.zzb(), zzfxtVar.zzC() - 1);
    }
}
