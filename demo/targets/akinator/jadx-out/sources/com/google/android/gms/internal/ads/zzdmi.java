package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdmi implements zzifh {
    private final zzdmb zza;

    private zzdmi(zzdmb zzdmbVar) {
        this.zza = zzdmbVar;
    }

    public static zzdmi zzc(zzdmb zzdmbVar) {
        return new zzdmi(zzdmbVar);
    }

    public static zzdlq zzd(zzdmb zzdmbVar) {
        zzdlq zzdlqVarZza = zzdmbVar.zza();
        zzifp.zzb(zzdlqVarZza);
        return zzdlqVarZza;
    }

    public final zzdlq zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
