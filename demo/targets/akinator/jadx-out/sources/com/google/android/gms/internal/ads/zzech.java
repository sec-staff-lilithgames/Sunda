package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzech implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzech(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar3;
    }

    public static zzech zzc(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        return new zzech(zzifqVar, zzifqVar2, zzifqVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzecg zzb() {
        return new zzecg(((zzifo) this.zza).zzd(), zzfjn.zzc(), ((zzdbt) this.zzb).zzb());
    }
}
