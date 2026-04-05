package com.google.android.gms.internal.ads;

import com.amazon.device.ads.DtbConstants;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzetv implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;

    private zzetv(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar4;
    }

    public static zzetv zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        return new zzetv(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzery zzeryVarZzb = ((zzesa) this.zza).zzb();
        zzeso zzesoVar = (zzeso) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains(DtbConstants.NETWORK_TYPE_LTE)) {
            return new zzewm(zzesoVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznp)).intValue(), scheduledExecutorService);
        }
        return new zzewm(zzeryVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznp)).intValue(), scheduledExecutorService);
    }
}
