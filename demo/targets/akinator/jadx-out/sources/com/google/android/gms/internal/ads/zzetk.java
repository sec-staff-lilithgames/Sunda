package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzetk implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzetk(zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
    }

    public static zzetk zza(zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzetk(zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfft((Clock) this.zza.zzb(), (zzdvi) this.zzb.zzb());
    }
}
