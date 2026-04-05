package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgyy {
    public static final /* synthetic */ int zza = 0;
    private static final zzhfp zzb = zzhfp.zzd(zzgyx.zza, zzgzd.class, zzgvm.class);
    private static final zzgvu zzc = zzhef.zze("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgvm.class, zzhkw.REMOTE, zzhlm.zze());
    private static final zzheq zzd = zzgyw.zza;

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i10 = zzgzk.zza;
        zzgzk.zza(zzhfb.zza());
        zzhey.zza().zzb(zzb);
        zzhes.zza().zzb(zzd, zzgzf.class);
        zzhdw.zza().zzb(zzc, true);
    }
}
