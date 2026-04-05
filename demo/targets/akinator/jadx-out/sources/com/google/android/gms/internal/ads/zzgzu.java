package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgzu {
    public static final /* synthetic */ int zza = 0;
    private static final zzhsz zzb;
    private static final zzhfi zzc;
    private static final zzhff zzd;
    private static final zzhec zze;
    private static final zzhdz zzf;

    static {
        zzhsz zzhszVarZza = zzhgi.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzhszVarZza;
        zzc = zzhfi.zzd(zzgzt.zza, zzgzp.class, zzhfx.class);
        zzd = zzhff.zzd(zzgzq.zza, zzhszVarZza, zzhfx.class);
        zze = zzhec.zzd(zzgzr.zza, zzgzl.class, zzhfw.class);
        zzf = zzhdz.zzd(zzgzs.zza, zzhszVarZza, zzhfw.class);
    }

    public static void zza(zzhfb zzhfbVar) throws GeneralSecurityException {
        zzhfbVar.zzd(zzc);
        zzhfbVar.zze(zzd);
        zzhfbVar.zzb(zze);
        zzhfbVar.zzc(zzf);
    }

    public static /* synthetic */ zzhfx zzb(zzgzp zzgzpVar) {
        zzhkz zzhkzVarZze = zzhla.zze();
        zzhkzVarZze.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzhkzVarZze.zzb(zzg(zzgzpVar).zzaM());
        zzhkzVarZze.zzc(zzf(zzgzpVar.zzc()));
        return zzhfx.zza((zzhla) zzhkzVarZze.zzbu());
    }

    public static /* synthetic */ zzgzp zzc(zzhfx zzhfxVar) throws GeneralSecurityException {
        if (!zzhfxVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhfxVar.zzc().zza())));
        }
        try {
            return zzh(zzhls.zzc(zzhfxVar.zzc().zzb(), zzhvy.zza()), zzhfxVar.zzc().zzc());
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    public static /* synthetic */ zzhfw zzd(zzgzl zzgzlVar, zzgwn zzgwnVar) {
        zzhlp zzhlpVarZzd = zzhlq.zzd();
        zzhlpVarZzd.zza(zzg(zzgzlVar.zze()));
        return zzhfw.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhlq) zzhlpVarZzd.zzbu()).zzaM(), zzhkw.REMOTE, zzf(zzgzlVar.zze().zzc()), zzgzlVar.zzb());
    }

    public static /* synthetic */ zzgzl zze(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzhlq zzhlqVarZzc = zzhlq.zzc(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhlqVarZzc.zza() == 0) {
                return zzgzl.zzd(zzh(zzhlqVarZzc.zzb(), zzhfwVar.zzd()), zzhfwVar.zze());
            }
            String strValueOf = String.valueOf(zzhlqVarZzc);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 58);
            sb2.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb2.append(strValueOf);
            throw new GeneralSecurityException(sb2.toString());
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
        }
    }

    private static zzhlt zzf(zzgzo zzgzoVar) throws GeneralSecurityException {
        if (zzgzo.zza.equals(zzgzoVar)) {
            return zzhlt.TINK;
        }
        if (zzgzo.zzb.equals(zzgzoVar)) {
            return zzhlt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgzoVar)));
    }

    private static zzhls zzg(zzgzp zzgzpVar) throws GeneralSecurityException {
        try {
            zzhla zzhlaVarZzd = zzhla.zzd(zzgwp.zza(zzgzpVar.zzd()), zzhvy.zza());
            zzhlr zzhlrVarZzd = zzhls.zzd();
            zzhlrVarZzd.zza(zzgzpVar.zzb());
            zzhlrVarZzd.zzb(zzhlaVarZzd);
            return (zzhls) zzhlrVarZzd.zzbu();
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    private static zzgzp zzh(zzhls zzhlsVar, zzhlt zzhltVar) throws GeneralSecurityException {
        zzgzn zzgznVar;
        zzgzo zzgzoVar;
        zzhkz zzhkzVarZze = zzhla.zze();
        zzhkzVarZze.zza(zzhlsVar.zzb().zza());
        zzhkzVarZze.zzb(zzhlsVar.zzb().zzb());
        zzhkzVarZze.zzc(zzhlt.RAW);
        zzgwj zzgwjVarZzb = zzgwp.zzb(((zzhla) zzhkzVarZze.zzbu()).zzaN());
        if (zzgwjVarZzb instanceof zzgyg) {
            zzgznVar = zzgzn.zza;
        } else if (zzgwjVarZzb instanceof zzgyv) {
            zzgznVar = zzgzn.zzc;
        } else if (zzgwjVarZzb instanceof zzhar) {
            zzgznVar = zzgzn.zzb;
        } else if (zzgwjVarZzb instanceof zzgxp) {
            zzgznVar = zzgzn.zzd;
        } else if (zzgwjVarZzb instanceof zzgxx) {
            zzgznVar = zzgzn.zze;
        } else {
            if (!(zzgwjVarZzb instanceof zzgyp)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzgwjVarZzb.toString()));
            }
            zzgznVar = zzgzn.zzf;
        }
        zzgzm zzgzmVar = new zzgzm(null);
        int iOrdinal = zzhltVar.ordinal();
        if (iOrdinal == 1) {
            zzgzoVar = zzgzo.zza;
        } else {
            if (iOrdinal != 3) {
                int iZza = zzhltVar.zza();
                throw new GeneralSecurityException(o2.l(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
            zzgzoVar = zzgzo.zzb;
        }
        zzgzmVar.zza(zzgzoVar);
        zzgzmVar.zzb(zzhlsVar.zza());
        zzgzmVar.zzd((zzgxb) zzgwjVarZzb);
        zzgzmVar.zzc(zzgznVar);
        return zzgzmVar.zze();
    }
}
