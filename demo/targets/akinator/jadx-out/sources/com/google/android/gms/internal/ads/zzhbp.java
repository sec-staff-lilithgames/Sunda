package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhbp {
    public static final /* synthetic */ int zza = 0;
    private static final zzhsz zzb;
    private static final zzhfi zzc;
    private static final zzhff zzd;
    private static final zzhec zze;
    private static final zzhdz zzf;

    static {
        zzhsz zzhszVarZza = zzhgi.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzhszVarZza;
        zzc = zzhfi.zzd(zzhbo.zza, zzgyp.class, zzhfx.class);
        zzd = zzhff.zzd(zzhbl.zza, zzhszVarZza, zzhfx.class);
        zze = zzhec.zzd(zzhbm.zza, zzgyi.class, zzhfw.class);
        zzf = zzhdz.zzd(zzhbn.zza, zzhszVarZza, zzhfw.class);
    }

    public static void zza(zzhfb zzhfbVar) throws GeneralSecurityException {
        zzhfbVar.zzd(zzc);
        zzhfbVar.zze(zzd);
        zzhfbVar.zzb(zze);
        zzhfbVar.zzc(zzf);
    }

    public static /* synthetic */ zzhfx zzb(zzgyp zzgypVar) {
        zzhkz zzhkzVarZze = zzhla.zze();
        zzhkzVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzhjs zzhjsVarZzd = zzhjt.zzd();
        zzhjsVarZzd.zza(zzgypVar.zzc());
        zzhkzVarZze.zzb(((zzhjt) zzhjsVarZzd.zzbu()).zzaM());
        zzhkzVarZze.zzc(zzf(zzgypVar.zzd()));
        return zzhfx.zza((zzhla) zzhkzVarZze.zzbu());
    }

    public static /* synthetic */ zzgyp zzc(zzhfx zzhfxVar) throws GeneralSecurityException {
        if (!zzhfxVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzhfxVar.zzc().zza())));
        }
        try {
            zzhjt zzhjtVarZzc = zzhjt.zzc(zzhfxVar.zzc().zzb(), zzhvy.zza());
            if (zzhjtVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgyn zzgynVarZzb = zzgyp.zzb();
            zzgynVarZzb.zza(zzhjtVarZzc.zza());
            zzgynVarZzb.zzb(zzg(zzhfxVar.zzc().zzc()));
            return zzgynVarZzb.zzc();
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhfw zzd(zzgyi zzgyiVar, zzgwn zzgwnVar) {
        zzhjq zzhjqVarZzd = zzhjr.zzd();
        byte[] bArrZzc = zzgyiVar.zze().zzc(zzgwnVar);
        zzhjqVarZzd.zza(zzhvi.zzr(bArrZzc, 0, bArrZzc.length));
        return zzhfw.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhjr) zzhjqVarZzd.zzbu()).zzaM(), zzhkw.SYMMETRIC, zzf(zzgyiVar.zzf().zzd()), zzgyiVar.zzb());
    }

    public static /* synthetic */ zzgyi zze(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhjr zzhjrVarZzc = zzhjr.zzc(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhjrVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgyn zzgynVarZzb = zzgyp.zzb();
            zzgynVarZzb.zza(zzhjrVarZzc.zzb().zzc());
            zzgynVarZzb.zzb(zzg(zzhfwVar.zzd()));
            zzgyp zzgypVarZzc = zzgynVarZzb.zzc();
            zzgyh zzgyhVarZzd = zzgyi.zzd();
            zzgyhVarZzd.zza(zzgypVarZzc);
            zzgyhVarZzd.zzb(zzhtb.zza(zzhjrVarZzc.zzb().zzv(), zzgwnVar));
            zzgyhVarZzd.zzc(zzhfwVar.zze());
            return zzgyhVarZzd.zzd();
        } catch (zzhxd unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhlt zzf(zzgyo zzgyoVar) throws GeneralSecurityException {
        if (zzgyo.zza.equals(zzgyoVar)) {
            return zzhlt.TINK;
        }
        if (zzgyo.zzb.equals(zzgyoVar)) {
            return zzhlt.CRUNCHY;
        }
        if (zzgyo.zzc.equals(zzgyoVar)) {
            return zzhlt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgyoVar)));
    }

    private static zzgyo zzg(zzhlt zzhltVar) throws GeneralSecurityException {
        int iOrdinal = zzhltVar.ordinal();
        if (iOrdinal == 1) {
            return zzgyo.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgyo.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhltVar.zza();
                throw new GeneralSecurityException(o2.l(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzgyo.zzb;
    }
}
