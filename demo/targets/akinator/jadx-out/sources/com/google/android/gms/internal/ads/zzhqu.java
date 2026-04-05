package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhqu implements zzgwm {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final Provider zzg;

    private zzhqu(RSAPublicKey rSAPublicKey, zzhor zzhorVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhcy.zza(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhsx.zzc(rSAPublicKey.getModulus().bitLength());
        zzhsx.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhorVar);
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = provider;
    }

    public static Provider zzb() {
        if (zzhgi.zzc()) {
            zzhgi.zzd().getClass();
        }
        return zzhdc.zza();
    }

    public static String zzc(zzhor zzhorVar) throws GeneralSecurityException {
        if (zzhorVar == zzhor.zza) {
            return "SHA256withRSA";
        }
        if (zzhorVar == zzhor.zzb) {
            return "SHA384withRSA";
        }
        if (zzhorVar == zzhor.zzc) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static zzgwm zzd(zzhox zzhoxVar) throws GeneralSecurityException {
        Provider providerZzb = zzb();
        if (providerZzb != null) {
            return zze(zzhoxVar, providerZzb);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static zzgwm zze(zzhox zzhoxVar, Provider provider) throws GeneralSecurityException {
        return new zzhqu((RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(zzhoxVar.zzd(), zzhoxVar.zzf().zzd())), zzhoxVar.zzf().zzf(), zzhoxVar.zze().zzc(), zzhoxVar.zzf().zze().equals(zzhos.zzc) ? zzb : zza, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        if (!zzhgi.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzg;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.zzf;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
