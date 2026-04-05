package com.google.android.gms.internal.ads;

import k4.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfwp implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzfwp(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar3;
    }

    public static zzfwp zzc(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        return new zzfwp(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfwo zzb() {
        return new zzfwo((n) this.zza.zzb(), zzcjx.zzc(), (zzdss) this.zzb.zzb(), new zzfvq());
    }
}
