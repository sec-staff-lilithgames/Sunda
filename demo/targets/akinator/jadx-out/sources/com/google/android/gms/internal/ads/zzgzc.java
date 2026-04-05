package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgzc {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvu zzb = zzhef.zze("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgvm.class, zzhkw.SYMMETRIC, zzhlq.zze());
    private static final zzheq zzc = zzgzb.zza;
    private static final zzhfp zzd = zzhfp.zzd(zzgza.zza, zzgzl.class, zzgvm.class);

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i10 = zzgzu.zza;
        zzgzu.zza(zzhfb.zza());
        zzhes.zza().zzb(zzc, zzgzp.class);
        zzhey.zza().zzb(zzd);
        zzhdw.zza().zzb(zzb, true);
    }
}
