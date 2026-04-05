package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgwo {
    public static zzgwe zza(String str) throws GeneralSecurityException {
        try {
            try {
                try {
                    zzhlg zzhlgVarZze = zzhlg.zze(zzgvs.zza(str).zzb().zzaN(), zzhvy.zza());
                    for (zzhlf zzhlfVar : zzhlgVarZze.zzb()) {
                        if (zzhlfVar.zzb().zzc() == zzhkw.UNKNOWN_KEYMATERIAL || zzhlfVar.zzb().zzc() == zzhkw.SYMMETRIC || zzhlfVar.zzb().zzc() == zzhkw.ASYMMETRIC_PRIVATE) {
                            throw new GeneralSecurityException("keyset contains key material of type " + zzhlfVar.zzb().zzc().name() + " for type url " + zzhlfVar.zzb().zza());
                        }
                    }
                    return zzgwe.zza(zzhlgVarZze);
                } catch (zzhxd unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzhxd unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
