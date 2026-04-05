package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhhb {
    public static final /* synthetic */ int zza = 0;
    private static final zzhfp zzb = zzhfp.zzd(zzhgx.zza, zzhgw.class, zzhgs.class);
    private static final zzhfp zzc = zzhfp.zzd(zzhha.zza, zzhgw.class, zzgwi.class);
    private static final zzgvu zzd = zzhef.zze("type.googleapis.com/google.crypto.tink.HmacKey", zzgwi.class, zzhkw.SYMMETRIC, zzhkq.zzh());
    private static final zzhet zze = zzhgz.zza;
    private static final zzheq zzf = zzhgy.zza;
    private static final int zzg = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzg;
        if (!zzhcy.zza(i10)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = zzhig.zza;
        zzhig.zza(zzhfb.zza());
        zzhey.zza().zzb(zzb);
        zzhey.zza().zzb(zzc);
        zzhex zzhexVarZza = zzhex.zza();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzhhs.zza);
        zzhhc zzhhcVar = new zzhhc(null);
        zzhhcVar.zza(32);
        zzhhcVar.zzb(16);
        zzhhe zzhheVar = zzhhe.zzd;
        zzhhcVar.zzc(zzhheVar);
        zzhhd zzhhdVar = zzhhd.zzc;
        zzhhcVar.zzd(zzhhdVar);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzhhcVar.zze());
        zzhhc zzhhcVar2 = new zzhhc(null);
        zzhhcVar2.zza(32);
        zzhhcVar2.zzb(32);
        zzhhe zzhheVar2 = zzhhe.zza;
        zzhhcVar2.zzc(zzhheVar2);
        zzhhcVar2.zzd(zzhhdVar);
        map.put("HMAC_SHA256_256BITTAG", zzhhcVar2.zze());
        zzhhc zzhhcVar3 = new zzhhc(null);
        zzhhcVar3.zza(32);
        zzhhcVar3.zzb(32);
        zzhhcVar3.zzc(zzhheVar);
        zzhhcVar3.zzd(zzhhdVar);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzhhcVar3.zze());
        zzhhc zzhhcVar4 = new zzhhc(null);
        zzhhcVar4.zza(64);
        zzhhcVar4.zzb(16);
        zzhhcVar4.zzc(zzhheVar2);
        zzhhd zzhhdVar2 = zzhhd.zze;
        zzhhcVar4.zzd(zzhhdVar2);
        map.put("HMAC_SHA512_128BITTAG", zzhhcVar4.zze());
        zzhhc zzhhcVar5 = new zzhhc(null);
        zzhhcVar5.zza(64);
        zzhhcVar5.zzb(16);
        zzhhcVar5.zzc(zzhheVar);
        zzhhcVar5.zzd(zzhhdVar2);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzhhcVar5.zze());
        zzhhc zzhhcVar6 = new zzhhc(null);
        zzhhcVar6.zza(64);
        zzhhcVar6.zzb(32);
        zzhhcVar6.zzc(zzhheVar2);
        zzhhcVar6.zzd(zzhhdVar2);
        map.put("HMAC_SHA512_256BITTAG", zzhhcVar6.zze());
        zzhhc zzhhcVar7 = new zzhhc(null);
        zzhhcVar7.zza(64);
        zzhhcVar7.zzb(32);
        zzhhcVar7.zzc(zzhheVar);
        zzhhcVar7.zzd(zzhhdVar2);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzhhcVar7.zze());
        map.put(PtLatqAYjEFT.dCkEtsWu, zzhhs.zzb);
        zzhhc zzhhcVar8 = new zzhhc(null);
        zzhhcVar8.zza(64);
        zzhhcVar8.zzb(64);
        zzhhcVar8.zzc(zzhheVar);
        zzhhcVar8.zzd(zzhhdVar2);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzhhcVar8.zze());
        zzhexVarZza.zzd(Collections.unmodifiableMap(map));
        zzhes.zza().zzb(zzf, zzhhf.class);
        zzheu.zza().zzb(zze, zzhhf.class);
        zzhdw.zza().zzf(zzd, i10, true);
    }
}
