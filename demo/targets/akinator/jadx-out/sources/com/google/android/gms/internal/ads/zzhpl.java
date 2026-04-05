package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzhpl implements zzheq {
    static final /* synthetic */ zzhpl zza = new zzhpl();

    private /* synthetic */ zzhpl() {
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ zzgvt zza(zzgwj zzgwjVar, Integer num) throws GeneralSecurityException {
        zzhpf zzhpfVar = (zzhpf) zzgwjVar;
        int i10 = zzhpn.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhrz.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhpfVar.zzc(), new BigInteger(1, zzhpfVar.zzd().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        zzhpi zzhpiVar = new zzhpi(null);
        zzhpiVar.zza(zzhpfVar);
        zzhpiVar.zzb(rSAPublicKey.getModulus());
        zzhpiVar.zzc(num);
        zzhpj zzhpjVarZzd = zzhpiVar.zzd();
        zzhpg zzhpgVar = new zzhpg(null);
        zzhpgVar.zza(zzhpjVarZzd);
        zzhpgVar.zzb(zzhta.zza(rSAPrivateCrtKey.getPrimeP(), zzgvr.zza()), zzhta.zza(rSAPrivateCrtKey.getPrimeQ(), zzgvr.zza()));
        zzhpgVar.zzc(zzhta.zza(rSAPrivateCrtKey.getPrivateExponent(), zzgvr.zza()));
        zzhpgVar.zzd(zzhta.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzgvr.zza()), zzhta.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzgvr.zza()));
        zzhpgVar.zze(zzhta.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzgvr.zza()));
        return zzhpgVar.zzf();
    }
}
