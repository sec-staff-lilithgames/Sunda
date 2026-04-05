package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdkr implements zzifh {
    private final zzdkm zza;

    private zzdkr(zzdkm zzdkmVar) {
        this.zza = zzdkmVar;
    }

    public static zzdkr zzc(zzdkm zzdkmVar) {
        return new zzdkr(zzdkmVar);
    }

    public static zzdqt zzd(zzdkm zzdkmVar) {
        zzdqt zzdqtVarZzd = zzdkmVar.zzd();
        zzifp.zzb(zzdqtVarZzd);
        return zzdqtVarZzd;
    }

    public final zzdqt zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
