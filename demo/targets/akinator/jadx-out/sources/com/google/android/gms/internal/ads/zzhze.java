package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhze extends zzhzc {
    @Override // com.google.android.gms.internal.ads.zzhzc
    public final /* bridge */ /* synthetic */ void zza(Object obj, int i10, long j10) {
        ((zzhzd) obj).zzk(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzhzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj, int i10, int i11) {
        ((zzhzd) obj).zzk((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.zzhzc
    public final /* bridge */ /* synthetic */ void zzc(Object obj, int i10, long j10) {
        ((zzhzd) obj).zzk((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzhzc
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, zzhvi zzhviVar) {
        ((zzhzd) obj).zzk((i10 << 3) | 2, zzhviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhzc
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i10, Object obj2) {
        ((zzhzd) obj).zzk((i10 << 3) | 3, (zzhzd) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhzc
    public final /* synthetic */ Object zzf() {
        return zzhzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhzc
    public final /* synthetic */ Object zzg(Object obj) {
        zzhzd zzhzdVar = (zzhzd) obj;
        zzhzdVar.zzd();
        return zzhzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhzc
    public final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzhwo zzhwoVar = (zzhwo) obj;
        zzhzd zzhzdVar = zzhwoVar.zzt;
        if (zzhzdVar != zzhzd.zza()) {
            return zzhzdVar;
        }
        zzhzd zzhzdVarZzb = zzhzd.zzb();
        zzhwoVar.zzt = zzhzdVarZzb;
        return zzhzdVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhzc
    public final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzhwo) obj).zzt = (zzhzd) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzhzc
    public final void zzj(Object obj) {
        ((zzhwo) obj).zzt.zzd();
    }
}
