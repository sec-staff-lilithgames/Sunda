package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzhnh implements zzheq {
    static final /* synthetic */ zzhnh zza = new zzhnh();

    private /* synthetic */ zzhnh() {
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ zzgvt zza(zzgwj zzgwjVar, Integer num) throws GeneralSecurityException {
        zzhnb zzhnbVar = (zzhnb) zzgwjVar;
        int i10 = zzhnj.zza;
        ECParameterSpec eCParameterSpecZza = zzhnbVar.zzd().zza();
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhrz.zze.zzb("EC");
        keyPairGenerator.initialize(eCParameterSpecZza);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        zzhne zzhneVar = new zzhne(null);
        zzhneVar.zza(zzhnbVar);
        zzhneVar.zzc(num);
        zzhneVar.zzb(eCPublicKey.getW());
        zzhnf zzhnfVarZzd = zzhneVar.zzd();
        zzhnc zzhncVar = new zzhnc(null);
        zzhncVar.zza(zzhnfVarZzd);
        zzhncVar.zzb(zzhta.zza(eCPrivateKey.getS(), zzgvr.zza()));
        return zzhncVar.zzc();
    }
}
