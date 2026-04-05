package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdig implements zzifh {
    private final zzifq zza;

    private zzdig(zzdia zzdiaVar, zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzdig zza(zzdia zzdiaVar, zzifq zzifqVar) {
        return new zzdig(zzdiaVar, zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdgn((zzcxf) this.zza.zzb(), zzcbv.zzg));
        zzifp.zzb(setSingleton);
        return setSingleton;
    }
}
