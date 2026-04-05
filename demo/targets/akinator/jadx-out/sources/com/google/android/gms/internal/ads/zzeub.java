package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeub implements zzifh {
    private final zzifq zza;

    private zzeub(zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar2;
    }

    public static zzeub zza(zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzeub(zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzewm(zzeuy.zzc(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznl)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
