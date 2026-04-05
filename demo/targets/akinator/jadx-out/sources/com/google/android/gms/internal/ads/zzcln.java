package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcln implements zzdwt {
    private final Long zza;
    private final String zzb;
    private final zzckz zzc;
    private final zzclp zzd;

    public zzcln(zzckz zzckzVar, zzclp zzclpVar, Long l9, String str) {
        this.zzc = zzckzVar;
        this.zzd = zzclpVar;
        this.zza = l9;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdwt
    public final zzdxc zza() {
        long jLongValue = this.zza.longValue();
        zzclp zzclpVar = this.zzd;
        return zzdxd.zza(jLongValue, zzclpVar.zzd(), zzclpVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdwt
    public final zzdxg zzb() {
        long jLongValue = this.zza.longValue();
        zzclp zzclpVar = this.zzd;
        return zzdxh.zza(jLongValue, zzclpVar.zzd(), zzclpVar.zza(), this.zzc, this.zzb);
    }
}
