package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhsr implements zzgwm {
    static final zzhdp zza;
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};

    static {
        zzhdo zzhdoVarZza = zzhdp.zza();
        zzhdoVarZza.zza(zzhsi.SHA256, zzhor.zza);
        zzhdoVarZza.zza(zzhsi.SHA384, zzhor.zzb);
        zzhdoVarZza.zza(zzhsi.SHA512, zzhor.zzc);
        zza = zzhdoVarZza.zzb();
    }

    public static zzgwm zzb(zzhox zzhoxVar) throws GeneralSecurityException {
        try {
            return zzhqu.zzd(zzhoxVar);
        } catch (NoSuchProviderException unused) {
            return new zzhsq((RSAPublicKey) ((KeyFactory) zzhrz.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhoxVar.zzd(), zzhoxVar.zzf().zzd())), (zzhsi) zza.zzb(zzhoxVar.zzf().zzf()), zzhoxVar.zze().zzc(), zzhoxVar.zzf().zze().equals(zzhos.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
