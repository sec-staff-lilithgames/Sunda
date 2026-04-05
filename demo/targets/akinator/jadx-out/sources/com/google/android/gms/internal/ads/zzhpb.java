package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhpb {
    public static final /* synthetic */ int zza = 0;
    private static final zzhfp zzb = zzhfp.zzd(zzhoy.zza, zzhov.class, zzgwl.class);
    private static final zzhfp zzc = zzhfp.zzd(zzhpa.zza, zzhox.class, zzgwm.class);
    private static final zzgwk zzd = zzhef.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzgwl.class, zzhmb.zzl());
    private static final zzgvu zze = zzhef.zze("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzgwm.class, zzhkw.ASYMMETRIC_PUBLIC, zzhmd.zzi());
    private static final zzheq zzf = zzhoz.zza;
    private static final int zzg = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzg;
        if (!zzhcy.zza(i10)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = zzhqs.zza;
        zzhqs.zza(zzhfb.zza());
        zzhex zzhexVarZza = zzhex.zza();
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", zzhoh.zzh);
        BigInteger bigInteger = zzhot.zza;
        zzhoq zzhoqVar = new zzhoq(null);
        zzhoqVar.zzd(zzhor.zza);
        zzhoqVar.zza(3072);
        BigInteger bigInteger2 = zzhot.zza;
        zzhoqVar.zzb(bigInteger2);
        zzhos zzhosVar = zzhos.zzd;
        zzhoqVar.zzc(zzhosVar);
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzhoqVar.zze());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", zzhoh.zzi);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", zzhoh.zzj);
        zzhoq zzhoqVar2 = new zzhoq(null);
        zzhoqVar2.zzd(zzhor.zzc);
        zzhoqVar2.zza(4096);
        zzhoqVar2.zzb(bigInteger2);
        zzhoqVar2.zzc(zzhosVar);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzhoqVar2.zze());
        zzhexVarZza.zzd(map);
        zzhey.zza().zzb(zzb);
        zzhey.zza().zzb(zzc);
        zzhes.zza().zzb(zzf, zzhot.class);
        zzhdw.zza().zzf(zzd, i10, true);
        zzhdw.zza().zzf(zze, i10, false);
    }
}
