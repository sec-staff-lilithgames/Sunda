package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfac implements zzeya {
    final ScheduledExecutorService zza;

    public zzfac(zzbvm zzbvmVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return zzgui.zzk(zzgui.zzi(zzgui.zza(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeM)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzfab.zza, zzcbv.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 49;
    }
}
