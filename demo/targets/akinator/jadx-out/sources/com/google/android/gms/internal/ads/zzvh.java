package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzvh extends zzym {
    private final zzbg zza;

    public zzvh(zzyk zzykVar, zzbg zzbgVar) {
        super(zzykVar);
        this.zza = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof zzvh)) {
            return this.zza.equals(((zzvh) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final int hashCode() {
        return this.zza.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzym, com.google.android.gms.internal.ads.zzyp
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzym, com.google.android.gms.internal.ads.zzyp
    public final zzv zzb(int i10) {
        return this.zza.zza(zzd().zzf(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzym, com.google.android.gms.internal.ads.zzyk
    public final zzv zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
