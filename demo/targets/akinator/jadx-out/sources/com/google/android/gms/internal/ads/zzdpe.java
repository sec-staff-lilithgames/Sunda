package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdpe implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzdpe(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        this.zza = zzifqVar2;
        this.zzb = zzifqVar3;
    }

    public static zzdpe zzc(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        return new zzdpe(zzifqVar, zzifqVar2, zzifqVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdpd zzb() {
        return new zzdpd(zzfjn.zzc(), ((zzdoz) this.zza).zzb(), (zzdvc) this.zzb.zzb());
    }
}
