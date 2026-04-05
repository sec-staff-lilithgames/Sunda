package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdvw implements zzifh {
    private final zzifq zza;

    private zzdvw(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzdvw zza(zzifq zzifqVar) {
        return new zzdvw(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvv((Clock) this.zza.zzb());
    }
}
