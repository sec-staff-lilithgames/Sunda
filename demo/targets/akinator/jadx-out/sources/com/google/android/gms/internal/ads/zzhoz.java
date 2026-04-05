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
final /* synthetic */ class zzhoz implements zzheq {
    static final /* synthetic */ zzhoz zza = new zzhoz();

    private /* synthetic */ zzhoz() {
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ zzgvt zza(zzgwj zzgwjVar, Integer num) throws GeneralSecurityException {
        zzhot zzhotVar = (zzhot) zzgwjVar;
        int i10 = zzhpb.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhrz.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhotVar.zzc(), new BigInteger(1, zzhotVar.zzd().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        zzhow zzhowVar = new zzhow(null);
        zzhowVar.zza(zzhotVar);
        zzhowVar.zzb(rSAPublicKey.getModulus());
        zzhowVar.zzc(num);
        zzhox zzhoxVarZzd = zzhowVar.zzd();
        zzhou zzhouVar = new zzhou(null);
        zzhouVar.zza(zzhoxVarZzd);
        zzhouVar.zzb(zzhta.zza(rSAPrivateCrtKey.getPrimeP(), zzgvr.zza()), zzhta.zza(rSAPrivateCrtKey.getPrimeQ(), zzgvr.zza()));
        zzhouVar.zzc(zzhta.zza(rSAPrivateCrtKey.getPrivateExponent(), zzgvr.zza()));
        zzhouVar.zzd(zzhta.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzgvr.zza()), zzhta.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzgvr.zza()));
        zzhouVar.zze(zzhta.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzgvr.zza()));
        return zzhouVar.zzf();
    }
}
