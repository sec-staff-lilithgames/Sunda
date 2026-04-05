package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzefa implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzefa(zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
    }

    public static zzefa zzc(zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzefa(zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeez zzb() {
        return new zzeez(((zzees) this.zza).zzb(), ((zzcjq) this.zzb).zzb());
    }
}
