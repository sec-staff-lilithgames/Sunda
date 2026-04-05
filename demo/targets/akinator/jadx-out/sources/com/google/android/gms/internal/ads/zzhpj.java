package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhpj extends zzhpr {
    private final zzhpf zza;
    private final BigInteger zzb;
    private final zzhsz zzc;
    private final Integer zzd;

    public /* synthetic */ zzhpj(zzhpf zzhpfVar, BigInteger bigInteger, zzhsz zzhszVar, Integer num, byte[] bArr) {
        this.zza = zzhpfVar;
        this.zzb = bigInteger;
        this.zzc = zzhszVar;
        this.zzd = num;
    }

    public static zzhpi zzc() {
        return new zzhpi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhpr, com.google.android.gms.internal.ads.zzgvt
    public final /* synthetic */ zzgwj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final Integer zzb() {
        return this.zzd;
    }

    public final BigInteger zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhpr
    public final zzhsz zze() {
        return this.zzc;
    }

    public final zzhpf zzf() {
        return this.zza;
    }
}
