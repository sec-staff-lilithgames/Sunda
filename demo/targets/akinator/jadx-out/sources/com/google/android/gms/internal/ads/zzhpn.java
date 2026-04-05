package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhpn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhfp zzb = zzhfp.zzd(zzhpk.zza, zzhph.class, zzgwl.class);
    private static final zzhfp zzc = zzhfp.zzd(zzhpm.zza, zzhpj.class, zzgwm.class);
    private static final zzgwk zzd = zzhef.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzgwl.class, zzhmj.zzl());
    private static final zzgvu zze = zzhef.zze("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzgwm.class, zzhkw.ASYMMETRIC_PUBLIC, zzhml.zzi());
    private static final zzheq zzf = zzhpl.zza;
    private static final int zzg = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzg;
        if (!zzhcy.zza(i10)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = zzhrb.zza;
        zzhrb.zza(zzhfb.zza());
        zzhex zzhexVarZza = zzhex.zza();
        HashMap map = new HashMap();
        BigInteger bigInteger = zzhpf.zza;
        zzhpc zzhpcVar = new zzhpc(null);
        zzhpd zzhpdVar = zzhpd.zza;
        zzhpcVar.zzd(zzhpdVar);
        zzhpcVar.zze(zzhpdVar);
        zzhpcVar.zzf(32);
        zzhpcVar.zza(3072);
        BigInteger bigInteger2 = zzhpf.zza;
        zzhpcVar.zzb(bigInteger2);
        zzhpe zzhpeVar = zzhpe.zza;
        zzhpcVar.zzc(zzhpeVar);
        map.put("RSA_SSA_PSS_3072_SHA256_F4", zzhpcVar.zzg());
        zzhpc zzhpcVar2 = new zzhpc(null);
        zzhpcVar2.zzd(zzhpdVar);
        zzhpcVar2.zze(zzhpdVar);
        zzhpcVar2.zzf(32);
        zzhpcVar2.zza(3072);
        zzhpcVar2.zzb(bigInteger2);
        zzhpe zzhpeVar2 = zzhpe.zzd;
        zzhpcVar2.zzc(zzhpeVar2);
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", zzhpcVar2.zzg());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", zzhoh.zzk);
        zzhpc zzhpcVar3 = new zzhpc(null);
        zzhpd zzhpdVar2 = zzhpd.zzc;
        zzhpcVar3.zzd(zzhpdVar2);
        zzhpcVar3.zze(zzhpdVar2);
        zzhpcVar3.zzf(64);
        zzhpcVar3.zza(4096);
        zzhpcVar3.zzb(bigInteger2);
        zzhpcVar3.zzc(zzhpeVar);
        map.put("RSA_SSA_PSS_4096_SHA512_F4", zzhpcVar3.zzg());
        zzhpc zzhpcVar4 = new zzhpc(null);
        zzhpcVar4.zzd(zzhpdVar2);
        zzhpcVar4.zze(zzhpdVar2);
        zzhpcVar4.zzf(64);
        zzhpcVar4.zza(4096);
        zzhpcVar4.zzb(bigInteger2);
        zzhpcVar4.zzc(zzhpeVar2);
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", zzhpcVar4.zzg());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", zzhoh.zzl);
        zzhexVarZza.zzd(Collections.unmodifiableMap(map));
        zzhey.zza().zzb(zzb);
        zzhey.zza().zzb(zzc);
        zzhes.zza().zzb(zzf, zzhpf.class);
        zzhdw.zza().zzf(zzd, i10, true);
        zzhdw.zza().zzf(zze, i10, false);
    }
}
