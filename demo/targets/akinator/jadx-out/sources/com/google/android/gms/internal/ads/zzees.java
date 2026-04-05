package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzees implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzees(zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
    }

    public static zzees zzc(zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzees(zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeer zzb() {
        return new zzeer(((zzeeo) this.zza).zzb(), (zzgus) this.zzb.zzb());
    }
}
