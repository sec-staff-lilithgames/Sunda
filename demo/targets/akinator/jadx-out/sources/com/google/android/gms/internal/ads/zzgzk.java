package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgzk {
    public static final /* synthetic */ int zza = 0;
    private static final zzhsz zzb;
    private static final zzhfi zzc;
    private static final zzhff zzd;
    private static final zzhec zze;
    private static final zzhdz zzf;

    static {
        zzhsz zzhszVarZza = zzhgi.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzhszVarZza;
        zzc = zzhfi.zzd(zzgzj.zza, zzgzf.class, zzhfx.class);
        zzd = zzhff.zzd(zzgzg.zza, zzhszVarZza, zzhfx.class);
        zze = zzhec.zzd(zzgzh.zza, zzgzd.class, zzhfw.class);
        zzf = zzhdz.zzd(zzgzi.zza, zzhszVarZza, zzhfw.class);
    }

    public static void zza(zzhfb zzhfbVar) throws GeneralSecurityException {
        zzhfbVar.zzd(zzc);
        zzhfbVar.zze(zzd);
        zzhfbVar.zzb(zze);
        zzhfbVar.zzc(zzf);
    }

    public static /* synthetic */ zzhfx zzb(zzgzf zzgzfVar) {
        zzhkz zzhkzVarZze = zzhla.zze();
        zzhkzVarZze.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzhln zzhlnVarZzc = zzhlo.zzc();
        zzhlnVarZzc.zza(zzgzfVar.zzc());
        zzhkzVarZze.zzb(((zzhlo) zzhlnVarZzc.zzbu()).zzaM());
        zzhkzVarZze.zzc(zzf(zzgzfVar.zzd()));
        return zzhfx.zza((zzhla) zzhkzVarZze.zzbu());
    }

    public static /* synthetic */ zzgzf zzc(zzhfx zzhfxVar) throws GeneralSecurityException {
        if (!zzhfxVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhfxVar.zzc().zza())));
        }
        try {
            return zzgzf.zzb(zzhlo.zzb(zzhfxVar.zzc().zzb(), zzhvy.zza()).zza(), zzg(zzhfxVar.zzc().zzc()));
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
        }
    }

    public static /* synthetic */ zzhfw zzd(zzgzd zzgzdVar, zzgwn zzgwnVar) {
        zzhll zzhllVarZzd = zzhlm.zzd();
        zzhln zzhlnVarZzc = zzhlo.zzc();
        zzhlnVarZzc.zza(zzgzdVar.zze().zzc());
        zzhllVarZzd.zza((zzhlo) zzhlnVarZzc.zzbu());
        return zzhfw.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhlm) zzhllVarZzd.zzbu()).zzaM(), zzhkw.REMOTE, zzf(zzgzdVar.zze().zzd()), zzgzdVar.zzb());
    }

    public static /* synthetic */ zzgzd zze(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhlm zzhlmVarZzc = zzhlm.zzc(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhlmVarZzc.zza() == 0) {
                return zzgzd.zzd(zzgzf.zzb(zzhlmVarZzc.zzb().zza(), zzg(zzhfwVar.zzd())), zzhfwVar.zze());
            }
            String strValueOf = String.valueOf(zzhlmVarZzc);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
            sb2.append("KmsAeadKey are only accepted with version 0, got ");
            sb2.append(strValueOf);
            throw new GeneralSecurityException(sb2.toString());
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    private static zzhlt zzf(zzgze zzgzeVar) throws GeneralSecurityException {
        if (zzgze.zza.equals(zzgzeVar)) {
            return zzhlt.TINK;
        }
        if (zzgze.zzb.equals(zzgzeVar)) {
            return zzhlt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgzeVar.toString()));
    }

    private static zzgze zzg(zzhlt zzhltVar) throws GeneralSecurityException {
        int iOrdinal = zzhltVar.ordinal();
        if (iOrdinal == 1) {
            return zzgze.zza;
        }
        if (iOrdinal == 3) {
            return zzgze.zzb;
        }
        int iZza = zzhltVar.zza();
        throw new GeneralSecurityException(o2.l(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }
}
