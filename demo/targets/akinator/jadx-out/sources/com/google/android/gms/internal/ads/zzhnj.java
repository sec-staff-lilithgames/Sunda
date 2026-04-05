package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhnj {
    public static final /* synthetic */ int zza = 0;
    private static final zzhfp zzb = zzhfp.zzd(zzhng.zza, zzhnd.class, zzgwl.class);
    private static final zzhfp zzc = zzhfp.zzd(zzhni.zza, zzhnf.class, zzgwm.class);
    private static final zzgwk zzd = zzhef.zzf("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", zzgwl.class, zzhkd.zzg());
    private static final zzgvu zze = zzhef.zze("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzgwm.class, zzhkw.ASYMMETRIC_PUBLIC, zzhkf.zzi());
    private static final zzheq zzf = zzhnh.zza;
    private static final int zzg = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzg;
        if (!zzhcy.zza(i10)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = zzhpy.zza;
        zzhpy.zza(zzhfb.zza());
        zzhex zzhexVarZza = zzhex.zza();
        HashMap map = new HashMap();
        map.put("ECDSA_P256", zzhoh.zza);
        map.put("ECDSA_P256_IEEE_P1363", zzhoh.zzd);
        zzhmw zzhmwVar = new zzhmw(null);
        zzhmwVar.zzc(zzhmy.zza);
        zzhmwVar.zzb(zzhmx.zza);
        zzhmwVar.zza(zzhmz.zza);
        zzhmwVar.zzd(zzhna.zzd);
        map.put("ECDSA_P256_RAW", zzhmwVar.zze());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", zzhoh.zzf);
        map.put("ECDSA_P384", zzhoh.zzb);
        map.put("ECDSA_P384_IEEE_P1363", zzhoh.zze);
        zzhmw zzhmwVar2 = new zzhmw(null);
        zzhmwVar2.zzc(zzhmy.zzc);
        zzhmx zzhmxVar = zzhmx.zzb;
        zzhmwVar2.zzb(zzhmxVar);
        zzhmz zzhmzVar = zzhmz.zzb;
        zzhmwVar2.zza(zzhmzVar);
        zzhna zzhnaVar = zzhna.zza;
        zzhmwVar2.zzd(zzhnaVar);
        map.put("ECDSA_P384_SHA512", zzhmwVar2.zze());
        zzhmw zzhmwVar3 = new zzhmw(null);
        zzhmwVar3.zzc(zzhmy.zzb);
        zzhmwVar3.zzb(zzhmxVar);
        zzhmwVar3.zza(zzhmzVar);
        zzhmwVar3.zzd(zzhnaVar);
        map.put("ECDSA_P384_SHA384", zzhmwVar3.zze());
        map.put("ECDSA_P521", zzhoh.zzc);
        map.put("ECDSA_P521_IEEE_P1363", zzhoh.zzg);
        zzhexVarZza.zzd(Collections.unmodifiableMap(map));
        zzhey.zza().zzb(zzb);
        zzhey.zza().zzb(zzc);
        zzhes.zza().zzb(zzf, zzhnb.class);
        zzhdw.zza().zzf(zzd, i10, true);
        zzhdw.zza().zzf(zze, i10, false);
    }
}
