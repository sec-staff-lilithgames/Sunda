package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcju implements zzifh {
    private final zzifq zza;

    private zzcju(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzcju zza(zzifq zzifqVar) {
        return new zzcju(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzcjv) this.zza).zza().getApplicationInfo();
        zzifp.zzb(applicationInfo);
        return applicationInfo;
    }
}
