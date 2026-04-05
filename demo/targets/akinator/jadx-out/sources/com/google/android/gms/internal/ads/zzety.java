package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzety implements zzifh {
    private final zzifq zza;

    private zzety(zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar2;
    }

    public static zzety zza(zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzety(zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgpo zzgpoVarZzh;
        zzesq zzesqVarZzc = zzess.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeG)).booleanValue()) {
            zzgpoVarZzh = zzgpo.zzi(new zzewm(zzesqVarZzc, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeH)).intValue(), scheduledExecutorService));
        } else {
            zzgpoVarZzh = zzgpo.zzh();
        }
        zzifp.zzb(zzgpoVarZzh);
        return zzgpoVarZzh;
    }
}
