package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhih implements zzgwi {
    private zzhih(zzgwi zzgwiVar, zzhlt zzhltVar, byte[] bArr) {
    }

    public static zzgwi zza(zzhei zzheiVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhfw zzhfwVarZzc = zzheiVar.zzc(zzgvr.zza());
        zzgwi zzgwiVar = (zzgwi) zzhdw.zza().zzc(zzhfwVarZzc.zzg(), zzgwi.class).zza(zzhfwVarZzc.zzb());
        zzhlt zzhltVarZzd = zzhfwVarZzc.zzd();
        int iOrdinal = zzhltVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzhfc.zzb(zzheiVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzhfc.zza(zzheiVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzhfc.zza(zzheiVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzhfc.zza.zzc();
        }
        return new zzhih(zzgwiVar, zzhltVarZzd, bArrZzc);
    }
}
