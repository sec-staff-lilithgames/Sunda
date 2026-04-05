package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhrc implements zzgwl {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhrc(RSAPrivateCrtKey rSAPrivateCrtKey, zzhpd zzhpdVar, zzhpd zzhpdVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhcy.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhsx.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzhsx.zzd(rSAPrivateCrtKey.getPublicExponent());
        zzhrd.zzc(zzhpdVar);
        zzhrd.zzd(zzhpdVar, zzhpdVar2, i10);
    }

    public static zzgwl zzb(zzhph zzhphVar) throws GeneralSecurityException {
        Provider providerZzb = zzhrd.zzb();
        if (providerZzb == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerZzb);
        zzhpf zzhpfVarZzd = zzhphVar.zzd();
        return new zzhrc((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(zzhphVar.zze().zzd(), zzhpfVarZzd.zzd(), zzhphVar.zzh().zzb(zzgvr.zza()), zzhphVar.zzf().zzb(zzgvr.zza()), zzhphVar.zzg().zzb(zzgvr.zza()), zzhphVar.zzi().zzb(zzgvr.zza()), zzhphVar.zzj().zzb(zzgvr.zza()), zzhphVar.zzk().zzb(zzgvr.zza()))), zzhpfVarZzd.zzf(), zzhpfVarZzd.zzg(), zzhpfVarZzd.zzh(), zzhphVar.zze().zze().zzc(), zzhpfVarZzd.zze().equals(zzhpe.zzc) ? zzb : zza, providerZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
