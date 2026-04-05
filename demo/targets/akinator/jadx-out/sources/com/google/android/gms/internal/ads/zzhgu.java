package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhgu implements zzhfv {
    private static final zzhgu zza = new zzhgu();

    private zzhgu() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzhey.zza().zzc(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhfv
    public final Class zza() {
        return zzhgs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhfv
    public final Class zzb() {
        return zzhgs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhfv
    public final /* bridge */ /* synthetic */ Object zze(zzhed zzhedVar, zzhel zzhelVar, zzhfu zzhfuVar) throws GeneralSecurityException {
        zzhsz zzhszVarZzd;
        zzgwc zzgwcVarZzc = ((zzgwe) zzhedVar).zzc();
        zzhfk zzhfkVar = new zzhfk();
        for (int i10 = 0; i10 < zzhedVar.zzd(); i10++) {
            zzgwc zzgwcVarZze = ((zzgwe) zzhedVar).zze(i10);
            if (zzgwcVarZze.zzb().equals(zzgvv.zza)) {
                zzhgs zzhgsVar = (zzhgs) zzhfuVar.zza(zzgwcVarZze);
                zzgvt zzgvtVarZza = zzgwcVarZze.zza();
                if (zzgvtVarZza instanceof zzhhh) {
                    zzhszVarZzd = ((zzhhh) zzgvtVarZza).zze();
                } else {
                    if (!(zzgvtVarZza instanceof zzhei)) {
                        String name = zzgvtVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzgvtVarZza.zza());
                        throw new GeneralSecurityException(o2.r(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzhszVarZzd = ((zzhei) zzgvtVarZza).zzd();
                }
                zzhfkVar.zza(zzhszVarZzd, zzhgsVar);
            }
        }
        return new zzhgt(zzhfkVar.zzb(), (zzhgs) zzhfuVar.zza(zzgwcVarZzc), null);
    }
}
