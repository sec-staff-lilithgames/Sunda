package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhcl {
    public static final /* synthetic */ int zza = 0;
    private static final zzhsz zzb;
    private static final zzhfi zzc;
    private static final zzhff zzd;
    private static final zzhec zze;
    private static final zzhdz zzf;

    static {
        zzhsz zzhszVarZza = zzhgi.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzhszVarZza;
        zzc = zzhfi.zzd(zzhck.zza, zzhak.class, zzhfx.class);
        zzd = zzhff.zzd(zzhch.zza, zzhszVarZza, zzhfx.class);
        zze = zzhec.zzd(zzhci.zza, zzhaf.class, zzhfw.class);
        zzf = zzhdz.zzd(zzhcj.zza, zzhszVarZza, zzhfw.class);
    }

    public static void zza(zzhfb zzhfbVar) throws GeneralSecurityException {
        zzhfbVar.zzd(zzc);
        zzhfbVar.zze(zzd);
        zzhfbVar.zzb(zze);
        zzhfbVar.zzc(zzf);
    }

    public static /* synthetic */ zzhfx zzb(zzhak zzhakVar) {
        zzhkz zzhkzVarZze = zzhla.zze();
        zzhkzVarZze.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzhmo zzhmoVarZzd = zzhmp.zzd();
        zzhmq zzhmqVarZzb = zzhmr.zzb();
        zzhmqVarZzb.zza(zzhakVar.zzd());
        zzhmoVarZzd.zza((zzhmr) zzhmqVarZzb.zzbu());
        zzhkzVarZze.zzb(((zzhmp) zzhmoVarZzd.zzbu()).zzaM());
        zzhkzVarZze.zzc(zzf(zzhakVar.zzc()));
        return zzhfx.zza((zzhla) zzhkzVarZze.zzbu());
    }

    public static /* synthetic */ zzhak zzc(zzhfx zzhfxVar) throws GeneralSecurityException {
        if (!zzhfxVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhfxVar.zzc().zza())));
        }
        try {
            zzhmp zzhmpVarZzc = zzhmp.zzc(zzhfxVar.zzc().zzb(), zzhvy.zza());
            if (zzhmpVarZzc.zza() == 0) {
                return zzhak.zzb(zzg(zzhfxVar.zzc().zzc()), zzhmpVarZzc.zzb().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhfw zzd(zzhaf zzhafVar, zzgwn zzgwnVar) {
        zzhmm zzhmmVarZze = zzhmn.zze();
        byte[] bArrZzc = zzhafVar.zze().zzc(zzgwnVar);
        zzhmmVarZze.zzb(zzhvi.zzr(bArrZzc, 0, bArrZzc.length));
        zzhmq zzhmqVarZzb = zzhmr.zzb();
        zzhmqVarZzb.zza(zzhafVar.zzf().zzd());
        zzhmmVarZze.zza((zzhmr) zzhmqVarZzb.zzbu());
        return zzhfw.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhmn) zzhmmVarZze.zzbu()).zzaM(), zzhkw.SYMMETRIC, zzf(zzhafVar.zzf().zzc()), zzhafVar.zzb());
    }

    public static /* synthetic */ zzhaf zze(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzhmn zzhmnVarZzd = zzhmn.zzd(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhmnVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhmnVarZzd.zzc().zzc() == 32) {
                return zzhaf.zzd(zzhak.zzb(zzg(zzhfwVar.zzd()), zzhmnVarZzd.zzb().zza()), zzhtb.zza(zzhmnVarZzd.zzc().zzv(), zzgwnVar), zzhfwVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzhxd unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzhlt zzf(zzhaj zzhajVar) throws GeneralSecurityException {
        if (Objects.equals(zzhajVar, zzhaj.zza)) {
            return zzhlt.TINK;
        }
        if (Objects.equals(zzhajVar, zzhaj.zzb)) {
            return zzhlt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhajVar.toString()));
    }

    private static zzhaj zzg(zzhlt zzhltVar) throws GeneralSecurityException {
        int iOrdinal = zzhltVar.ordinal();
        if (iOrdinal == 1) {
            return zzhaj.zza;
        }
        if (iOrdinal == 3) {
            return zzhaj.zzb;
        }
        int iZza = zzhltVar.zza();
        throw new GeneralSecurityException(o2.l(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }
}
