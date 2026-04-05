package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhss implements zzgwl {
    public /* synthetic */ zzhss(RSAPrivateCrtKey rSAPrivateCrtKey, zzhsi zzhsiVar, zzhsi zzhsiVar2, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhcz.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhsx.zzb(zzhsiVar);
        if (!zzhsiVar.equals(zzhsiVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzhsx.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzhsx.zzd(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
