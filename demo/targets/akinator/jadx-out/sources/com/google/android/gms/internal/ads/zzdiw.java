package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdiw implements zzifh {
    private final zzdia zza;
    private final zzifq zzb;

    private zzdiw(zzdia zzdiaVar, zzifq zzifqVar) {
        this.zza = zzdiaVar;
        this.zzb = zzifqVar;
    }

    public static zzdiw zza(zzdia zzdiaVar, zzifq zzifqVar) {
        return new zzdiw(zzdiaVar, zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzg((Executor) this.zzb.zzb());
    }
}
