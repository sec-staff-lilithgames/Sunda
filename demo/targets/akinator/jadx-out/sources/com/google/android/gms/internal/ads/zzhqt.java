package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhqt implements zzgwl {
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};
    private static final byte[] zzd = {1, 2, 3};
    Provider zza;
    private final RSAPrivateCrtKey zze;
    private final String zzf;
    private final byte[] zzg;
    private final byte[] zzh;
    private final zzgwm zzi;

    private zzhqt(RSAPrivateCrtKey rSAPrivateCrtKey, zzhor zzhorVar, byte[] bArr, byte[] bArr2, zzgwm zzgwmVar, Provider provider) throws GeneralSecurityException {
        if (!zzhcy.zza(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (zzhorVar != zzhor.zza && zzhorVar != zzhor.zzb && zzhorVar != zzhor.zzc) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzhorVar)));
        }
        zzhsx.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzhsx.zzd(rSAPrivateCrtKey.getPublicExponent());
        this.zze = rSAPrivateCrtKey;
        this.zzf = zzhqu.zzc(zzhorVar);
        this.zzg = bArr;
        this.zzh = bArr2;
        this.zzi = zzgwmVar;
        this.zza = provider;
    }

    public static zzgwl zzb(zzhov zzhovVar) throws GeneralSecurityException {
        Provider providerZzb = zzhqu.zzb();
        zzhqt zzhqtVar = new zzhqt((RSAPrivateCrtKey) (providerZzb != null ? KeyFactory.getInstance("RSA", providerZzb) : (KeyFactory) zzhrz.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhovVar.zze().zzd(), zzhovVar.zzd().zzd(), zzhovVar.zzh().zzb(zzgvr.zza()), zzhovVar.zzf().zzb(zzgvr.zza()), zzhovVar.zzg().zzb(zzgvr.zza()), zzhovVar.zzi().zzb(zzgvr.zza()), zzhovVar.zzj().zzb(zzgvr.zza()), zzhovVar.zzk().zzb(zzgvr.zza()))), zzhovVar.zzd().zzf(), zzhovVar.zze().zze().zzc(), zzhovVar.zzd().zze().equals(zzhos.zzc) ? zzc : zzb, providerZzb != null ? zzhqu.zze(zzhovVar.zze(), providerZzb) : zzhsr.zzb(zzhovVar.zze()), providerZzb);
        zzhqtVar.zza(zzd);
        return zzhqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        Signature signature;
        Provider provider = this.zza;
        if (provider != null) {
            signature = Signature.getInstance(this.zzf, provider);
        } else {
            signature = (Signature) zzhrz.zzc.zzb(this.zzf);
        }
        signature.initSign(this.zze);
        signature.update(bArr);
        byte[] bArr2 = this.zzh;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.zzg;
        if (bArr3.length > 0) {
            bArrSign = zzhrm.zza(bArr3, bArrSign);
        }
        try {
            this.zzi.zza(bArrSign, bArr);
            return bArrSign;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("RSA signature computation error", e10);
        }
    }
}
