package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcrz implements zzifh {
    private final zzcrn zza;
    private final zzifq zzb;

    private zzcrz(zzcrn zzcrnVar, zzifq zzifqVar) {
        this.zza = zzcrnVar;
        this.zzb = zzifqVar;
    }

    public static zzcrz zza(zzcrn zzcrnVar, zzifq zzifqVar) {
        return new zzcrz(zzcrnVar, zzifqVar);
    }

    public static zzdgn zzc(zzcrn zzcrnVar, zzctb zzctbVar) {
        return new zzdgn(zzctbVar, zzcbv.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzctb) this.zzb.zzb());
    }
}
