package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhaw {
    public static final /* synthetic */ int zza = 0;
    private static final zzhsz zzb;
    private static final zzhfi zzc;
    private static final zzhff zzd;
    private static final zzhec zze;
    private static final zzhdz zzf;

    static {
        zzhsz zzhszVarZza = zzhgi.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzhszVarZza;
        zzc = zzhfi.zzd(zzhav.zza, zzgxp.class, zzhfx.class);
        zzd = zzhff.zzd(zzhas.zza, zzhszVarZza, zzhfx.class);
        zze = zzhec.zzd(zzhat.zza, zzgxh.class, zzhfw.class);
        zzf = zzhdz.zzd(zzhau.zza, zzhszVarZza, zzhfw.class);
    }

    public static void zza(zzhfb zzhfbVar) throws GeneralSecurityException {
        zzhfbVar.zzd(zzc);
        zzhfbVar.zze(zzd);
        zzhfbVar.zzb(zze);
        zzhfbVar.zzc(zzf);
    }

    public static /* synthetic */ zzhfx zzb(zzgxp zzgxpVar) {
        zzhkz zzhkzVarZze = zzhla.zze();
        zzhkzVarZze.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzhiy zzhiyVarZzd = zzhiz.zzd();
        zzhjc zzhjcVarZzc = zzhjd.zzc();
        zzhje zzhjeVarZzb = zzhjf.zzb();
        zzhjeVarZzb.zza(zzgxpVar.zzf());
        zzhjcVarZzc.zza((zzhjf) zzhjeVarZzb.zzbu());
        zzhjcVarZzc.zzb(zzgxpVar.zzc());
        zzhiyVarZzd.zza((zzhjd) zzhjcVarZzc.zzbu());
        zzhkr zzhkrVarZze = zzhks.zze();
        zzhkrVarZze.zza(zzi(zzgxpVar));
        zzhkrVarZze.zzb(zzgxpVar.zzd());
        zzhiyVarZzd.zzb((zzhks) zzhkrVarZze.zzbu());
        zzhkzVarZze.zzb(((zzhiz) zzhiyVarZzd.zzbu()).zzaM());
        zzhkzVarZze.zzc(zzf(zzgxpVar.zzg()));
        return zzhfx.zza((zzhla) zzhkzVarZze.zzbu());
    }

    public static /* synthetic */ zzgxp zzc(zzhfx zzhfxVar) throws GeneralSecurityException {
        if (!zzhfxVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhfxVar.zzc().zza())));
        }
        try {
            zzhiz zzhizVarZzc = zzhiz.zzc(zzhfxVar.zzc().zzb(), zzhvy.zza());
            if (zzhizVarZzc.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgxm zzgxmVarZzb = zzgxp.zzb();
            zzgxmVarZzb.zza(zzhizVarZzc.zza().zzb());
            zzgxmVarZzb.zzb(zzhizVarZzc.zzb().zzb());
            zzgxmVarZzb.zzc(zzhizVarZzc.zza().zza().zza());
            zzgxmVarZzb.zzd(zzhizVarZzc.zzb().zza().zzb());
            zzgxmVarZzb.zzf(zzh(zzhizVarZzc.zzb().zza().zza()));
            zzgxmVarZzb.zze(zzg(zzhfxVar.zzc().zzc()));
            return zzgxmVarZzb.zzg();
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhfw zzd(zzgxh zzgxhVar, zzgwn zzgwnVar) {
        zzhiw zzhiwVarZze = zzhix.zze();
        zzhja zzhjaVarZzd = zzhjb.zzd();
        zzhje zzhjeVarZzb = zzhjf.zzb();
        zzhjeVarZzb.zza(zzgxhVar.zzg().zzf());
        zzhjaVarZzd.zza((zzhjf) zzhjeVarZzb.zzbu());
        byte[] bArrZzc = zzgxhVar.zze().zzc(zzgwnVar);
        zzhjaVarZzd.zzb(zzhvi.zzr(bArrZzc, 0, bArrZzc.length));
        zzhiwVarZze.zza((zzhjb) zzhjaVarZzd.zzbu());
        zzhkp zzhkpVarZze = zzhkq.zze();
        zzhkpVarZze.zza(zzi(zzgxhVar.zzg()));
        byte[] bArrZzc2 = zzgxhVar.zzf().zzc(zzgwnVar);
        zzhkpVarZze.zzb(zzhvi.zzr(bArrZzc2, 0, bArrZzc2.length));
        zzhiwVarZze.zzb((zzhkq) zzhkpVarZze.zzbu());
        return zzhfw.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhix) zzhiwVarZze.zzbu()).zzaM(), zzhkw.SYMMETRIC, zzf(zzgxhVar.zzg().zzg()), zzgxhVar.zzb());
    }

    public static /* synthetic */ zzgxh zze(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhix zzhixVarZzd = zzhix.zzd(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhixVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhixVarZzd.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzhixVarZzd.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzgxm zzgxmVarZzb = zzgxp.zzb();
            zzgxmVarZzb.zza(zzhixVarZzd.zzb().zzc().zzc());
            zzgxmVarZzb.zzb(zzhixVarZzd.zzc().zzc().zzc());
            zzgxmVarZzb.zzc(zzhixVarZzd.zzb().zzb().zza());
            zzgxmVarZzb.zzd(zzhixVarZzd.zzc().zzb().zzb());
            zzgxmVarZzb.zzf(zzh(zzhixVarZzd.zzc().zzb().zza()));
            zzgxmVarZzb.zze(zzg(zzhfwVar.zzd()));
            zzgxp zzgxpVarZzg = zzgxmVarZzb.zzg();
            zzgxg zzgxgVarZzd = zzgxh.zzd();
            zzgxgVarZzd.zza(zzgxpVarZzg);
            zzgxgVarZzd.zzb(zzhtb.zza(zzhixVarZzd.zzb().zzc().zzv(), zzgwnVar));
            zzgxgVarZzd.zzc(zzhtb.zza(zzhixVarZzd.zzc().zzc().zzv(), zzgwnVar));
            zzgxgVarZzd.zzd(zzhfwVar.zze());
            return zzgxgVarZzd.zze();
        } catch (zzhxd unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhlt zzf(zzgxo zzgxoVar) throws GeneralSecurityException {
        if (zzgxo.zza.equals(zzgxoVar)) {
            return zzhlt.TINK;
        }
        if (zzgxo.zzb.equals(zzgxoVar)) {
            return zzhlt.CRUNCHY;
        }
        if (zzgxo.zzc.equals(zzgxoVar)) {
            return zzhlt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgxoVar)));
    }

    private static zzgxo zzg(zzhlt zzhltVar) throws GeneralSecurityException {
        int iOrdinal = zzhltVar.ordinal();
        if (iOrdinal == 1) {
            return zzgxo.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgxo.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhltVar.zza();
                throw new GeneralSecurityException(o2.l(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzgxo.zzb;
    }

    private static zzgxn zzh(zzhko zzhkoVar) throws GeneralSecurityException {
        int iOrdinal = zzhkoVar.ordinal();
        if (iOrdinal == 1) {
            return zzgxn.zza;
        }
        if (iOrdinal == 2) {
            return zzgxn.zzd;
        }
        if (iOrdinal == 3) {
            return zzgxn.zzc;
        }
        if (iOrdinal == 4) {
            return zzgxn.zze;
        }
        if (iOrdinal == 5) {
            return zzgxn.zzb;
        }
        int iZza = zzhkoVar.zza();
        throw new GeneralSecurityException(o2.l(iZza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iZza).length() + 26)));
    }

    private static zzhku zzi(zzgxp zzgxpVar) throws GeneralSecurityException {
        zzhko zzhkoVar;
        zzhkt zzhktVarZzc = zzhku.zzc();
        zzhktVarZzc.zzb(zzgxpVar.zze());
        zzgxn zzgxnVarZzh = zzgxpVar.zzh();
        if (zzgxn.zza.equals(zzgxnVarZzh)) {
            zzhkoVar = zzhko.SHA1;
        } else if (zzgxn.zzb.equals(zzgxnVarZzh)) {
            zzhkoVar = zzhko.SHA224;
        } else if (zzgxn.zzc.equals(zzgxnVarZzh)) {
            zzhkoVar = zzhko.SHA256;
        } else if (zzgxn.zzd.equals(zzgxnVarZzh)) {
            zzhkoVar = zzhko.SHA384;
        } else {
            if (!zzgxn.zze.equals(zzgxnVarZzh)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzgxnVarZzh)));
            }
            zzhkoVar = zzhko.SHA512;
        }
        zzhktVarZzc.zza(zzhkoVar);
        return (zzhku) zzhktVarZzc.zzbu();
    }
}
