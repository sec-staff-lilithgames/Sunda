package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhop implements zzhfv {
    private static final zzhop zza = new zzhop();
    private static final zzhfp zzb = zzhfp.zzd(zzhom.zza, zzhei.class, zzgwm.class);

    public static void zzc() throws GeneralSecurityException {
        zzhey.zza().zzc(zza);
        zzhey.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhfv
    public final Class zza() {
        return zzgwm.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhfv
    public final Class zzb() {
        return zzgwm.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhfv
    public final /* bridge */ /* synthetic */ Object zze(zzhed zzhedVar, zzhel zzhelVar, zzhfu zzhfuVar) throws GeneralSecurityException {
        zzhsz zzhszVarZzd;
        zzhfk zzhfkVar = new zzhfk();
        for (int i10 = 0; i10 < zzhedVar.zzd(); i10++) {
            zzgwc zzgwcVarZze = ((zzgwe) zzhedVar).zze(i10);
            if (zzgwcVarZze.zzb().equals(zzgvv.zza)) {
                zzgwm zzgwmVar = (zzgwm) zzhfuVar.zza(zzgwcVarZze);
                zzgvt zzgvtVarZza = zzgwcVarZze.zza();
                if (zzgvtVarZza instanceof zzhpr) {
                    zzhszVarZzd = ((zzhpr) zzgvtVarZza).zze();
                } else {
                    if (!(zzgvtVarZza instanceof zzhei)) {
                        String name = zzgvtVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzgvtVarZza.zza());
                        throw new GeneralSecurityException(o2.r(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzhszVarZzd = ((zzhei) zzgvtVarZza).zzd();
                }
                zzhfkVar.zza(zzhszVarZzd, new zzhon(zzgwmVar, zzgwcVarZze.zzc()));
            }
        }
        return new zzhoo(zzhfkVar.zzb(), !zzhelVar.zza() ? zzhew.zza().zzb().zza(zzhedVar, zzhelVar, "public_key_verify", "verify") : zzhep.zza);
    }
}
