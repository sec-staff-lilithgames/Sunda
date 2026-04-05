package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdjx implements zzifh {
    private final zzdju zza;

    private zzdjx(zzdju zzdjuVar) {
        this.zza = zzdjuVar;
    }

    public static zzdjx zzc(zzdju zzdjuVar) {
        return new zzdjx(zzdjuVar);
    }

    public static zzdma zzd(zzdju zzdjuVar) {
        zzdma zzdmaVarZza = zzdjuVar.zza();
        zzifp.zzb(zzdmaVarZza);
        return zzdmaVarZza;
    }

    public final zzdma zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
