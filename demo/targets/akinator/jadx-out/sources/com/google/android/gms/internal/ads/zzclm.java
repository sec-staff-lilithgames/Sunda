package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzclm implements zzdws {
    private final zzckz zza;
    private final zzclp zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzclm(zzckz zzckzVar, zzclp zzclpVar, byte[] bArr) {
        this.zza = zzckzVar;
        this.zzb = zzclpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdws
    public final zzdwt zza() {
        zzifp.zzc(this.zzc, Long.class);
        zzifp.zzc(this.zzd, String.class);
        return new zzcln(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzdws
    public final /* bridge */ /* synthetic */ zzdws zzb(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdws
    public final /* bridge */ /* synthetic */ zzdws zzc(long j10) {
        this.zzc = Long.valueOf(j10);
        return this;
    }
}
