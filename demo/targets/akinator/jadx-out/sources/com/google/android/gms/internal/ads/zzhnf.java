package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhnf extends zzhpr {
    private final zzhnb zza;
    private final ECPoint zzb;
    private final zzhsz zzc;
    private final Integer zzd;

    public /* synthetic */ zzhnf(zzhnb zzhnbVar, ECPoint eCPoint, zzhsz zzhszVar, Integer num, byte[] bArr) {
        this.zza = zzhnbVar;
        this.zzb = eCPoint;
        this.zzc = zzhszVar;
        this.zzd = num;
    }

    public static zzhne zzc() {
        return new zzhne(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhpr, com.google.android.gms.internal.ads.zzgvt
    public final /* synthetic */ zzgwj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final Integer zzb() {
        return this.zzd;
    }

    public final ECPoint zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhpr
    public final zzhsz zze() {
        return this.zzc;
    }

    public final zzhnb zzf() {
        return this.zza;
    }
}
