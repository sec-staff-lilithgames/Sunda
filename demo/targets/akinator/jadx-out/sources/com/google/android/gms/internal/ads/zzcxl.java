package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcxl implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzcxl(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
    }

    public static zzcxl zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        return new zzcxl(zzifqVar, zzifqVar2, zzifqVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcxk((Context) this.zza.zzb(), ((zzcuf) this.zzb).zza(), new zzbvn());
    }
}
