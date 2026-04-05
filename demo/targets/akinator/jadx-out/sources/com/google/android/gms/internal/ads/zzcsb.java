package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcsb implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzcsb(zzcrn zzcrnVar, zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
    }

    public static zzcsb zzc(zzcrn zzcrnVar, zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzcsb(zzcrnVar, zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcac zzb() {
        return new zzcac(((zzcjv) this.zza).zza(), ((zzcyf) this.zzb).zza().zzg);
    }
}
