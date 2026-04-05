package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcrx implements zzifh {
    private final zzcrn zza;
    private final zzifq zzb;

    private zzcrx(zzcrn zzcrnVar, zzifq zzifqVar) {
        this.zza = zzcrnVar;
        this.zzb = zzifqVar;
    }

    public static zzcrx zza(zzcrn zzcrnVar, zzifq zzifqVar) {
        return new zzcrx(zzcrnVar, zzifqVar);
    }

    public static Set zzc(zzcrn zzcrnVar, zzctd zzctdVar) {
        Set setSingleton = Collections.singleton(new zzdgn(zzctdVar, zzcbv.zzg));
        zzifp.zzb(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzctd) this.zzb.zzb());
    }
}
