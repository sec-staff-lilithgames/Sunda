package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzelf implements zzifh {
    private final zzele zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;
    private final zzifq zze;

    private zzelf(zzele zzeleVar, zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        this.zza = zzeleVar;
        this.zzb = zzifqVar;
        this.zzc = zzifqVar2;
        this.zzd = zzifqVar3;
        this.zze = zzifqVar4;
    }

    public static zzelf zza(zzele zzeleVar, zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        return new zzelf(zzeleVar, zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb((Clock) this.zzb.zzb(), ((zzeky) this.zzc).zzb(), (zzehp) this.zzd.zzb(), (zzfng) this.zze.zzb());
    }
}
