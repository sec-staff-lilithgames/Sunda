package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgym {
    public static final /* synthetic */ int zza = 0;
    private static final zzhfp zzb = zzhfp.zzd(zzgyj.zza, zzgyi.class, zzgvm.class);
    private static final zzheq zzc = zzgyl.zza;
    private static final zzhet zzd = zzgyk.zza;
    private static final zzgvu zze = zzhef.zze("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgvm.class, zzhkw.SYMMETRIC, zzhjr.zze());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i10 = zzhbp.zza;
        zzhbp.zza(zzhfb.zza());
        zzhex zzhexVarZza = zzhex.zza();
        HashMap map = new HashMap();
        zzgyn zzgynVar = new zzgyn(null);
        zzgynVar.zza(16);
        zzgyo zzgyoVar = zzgyo.zza;
        zzgynVar.zzb(zzgyoVar);
        map.put(gjnZrsdA.SOQnwAkXoDJ, zzgynVar.zzc());
        zzgyn zzgynVar2 = new zzgyn(null);
        zzgynVar2.zza(16);
        zzgyo zzgyoVar2 = zzgyo.zzc;
        zzgynVar2.zzb(zzgyoVar2);
        map.put("AES128_GCM_SIV_RAW", zzgynVar2.zzc());
        zzgyn zzgynVar3 = new zzgyn(null);
        zzgynVar3.zza(32);
        zzgynVar3.zzb(zzgyoVar);
        map.put("AES256_GCM_SIV", zzgynVar3.zzc());
        zzgyn zzgynVar4 = new zzgyn(null);
        zzgynVar4.zza(32);
        zzgynVar4.zzb(zzgyoVar2);
        map.put("AES256_GCM_SIV_RAW", zzgynVar4.zzc());
        zzhexVarZza.zzd(Collections.unmodifiableMap(map));
        zzheu.zza().zzb(zzd, zzgyp.class);
        zzhes.zza().zzb(zzc, zzgyp.class);
        zzhey.zza().zzb(zzb);
        zzhdw.zza().zzb(zze, true);
    }
}
