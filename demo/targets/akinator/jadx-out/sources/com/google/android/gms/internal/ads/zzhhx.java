package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhhx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhsz zzb;
    private static final zzhfi zzc;
    private static final zzhff zzd;
    private static final zzhec zze;
    private static final zzhdz zzf;

    static {
        zzhsz zzhszVarZza = zzhgi.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzhszVarZza;
        zzc = zzhfi.zzd(zzhhw.zza, zzhgr.class, zzhfx.class);
        zzd = zzhff.zzd(zzhht.zza, zzhszVarZza, zzhfx.class);
        zze = zzhec.zzd(zzhhu.zza, zzhgk.class, zzhfw.class);
        zzf = zzhdz.zzd(zzhhv.zza, zzhszVarZza, zzhfw.class);
    }

    public static void zza(zzhfb zzhfbVar) throws GeneralSecurityException {
        zzhfbVar.zzd(zzc);
        zzhfbVar.zze(zzd);
        zzhfbVar.zzb(zze);
        zzhfbVar.zzc(zzf);
    }

    public static /* synthetic */ zzhfx zzb(zzhgr zzhgrVar) {
        zzhkz zzhkzVarZze = zzhla.zze();
        zzhkzVarZze.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzhis zzhisVarZzd = zzhit.zzd();
        zzhisVarZzd.zzb(zzh(zzhgrVar));
        zzhisVarZzd.zza(zzhgrVar.zzc());
        zzhkzVarZze.zzb(((zzhit) zzhisVarZzd.zzbu()).zzaM());
        zzhkzVarZze.zzc(zzf(zzhgrVar.zzf()));
        return zzhfx.zza((zzhla) zzhkzVarZze.zzbu());
    }

    public static /* synthetic */ zzhgr zzc(zzhfx zzhfxVar) throws GeneralSecurityException {
        if (!zzhfxVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhfxVar.zzc().zza())));
        }
        try {
            zzhit zzhitVarZzc = zzhit.zzc(zzhfxVar.zzc().zzb(), zzhvy.zza());
            zzhgp zzhgpVarZzb = zzhgr.zzb();
            zzhgpVarZzb.zza(zzhitVarZzc.zza());
            zzhgpVarZzb.zzb(zzhitVarZzc.zzb().zza());
            zzhgpVarZzb.zzc(zzg(zzhfxVar.zzc().zzc()));
            return zzhgpVarZzb.zzd();
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhfw zzd(zzhgk zzhgkVar, zzgwn zzgwnVar) {
        zzhiq zzhiqVarZze = zzhir.zze();
        zzhiqVarZze.zzb(zzh(zzhgkVar.zzf()));
        byte[] bArrZzc = zzhgkVar.zzd().zzc(zzgwnVar);
        zzhiqVarZze.zza(zzhvi.zzr(bArrZzc, 0, bArrZzc.length));
        return zzhfw.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhir) zzhiqVarZze.zzbu()).zzaM(), zzhkw.SYMMETRIC, zzf(zzhgkVar.zzf().zzf()), zzhgkVar.zzb());
    }

    public static /* synthetic */ zzhgk zze(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzhir zzhirVarZzd = zzhir.zzd(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhirVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhgp zzhgpVarZzb = zzhgr.zzb();
            zzhgpVarZzb.zza(zzhirVarZzd.zzb().zzc());
            zzhgpVarZzb.zzb(zzhirVarZzd.zzc().zza());
            zzhgpVarZzb.zzc(zzg(zzhfwVar.zzd()));
            zzhgr zzhgrVarZzd = zzhgpVarZzb.zzd();
            zzhgj zzhgjVarZzc = zzhgk.zzc();
            zzhgjVarZzc.zza(zzhgrVarZzd);
            zzhgjVarZzc.zzb(zzhtb.zza(zzhirVarZzd.zzb().zzv(), zzgwnVar));
            zzhgjVarZzc.zzc(zzhfwVar.zze());
            return zzhgjVarZzc.zzd();
        } catch (zzhxd | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzhlt zzf(zzhgq zzhgqVar) throws GeneralSecurityException {
        if (zzhgq.zza.equals(zzhgqVar)) {
            return zzhlt.TINK;
        }
        if (zzhgq.zzb.equals(zzhgqVar)) {
            return zzhlt.CRUNCHY;
        }
        if (zzhgq.zzd.equals(zzhgqVar)) {
            return zzhlt.RAW;
        }
        if (zzhgq.zzc.equals(zzhgqVar)) {
            return zzhlt.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhgqVar)));
    }

    private static zzhgq zzg(zzhlt zzhltVar) throws GeneralSecurityException {
        int iOrdinal = zzhltVar.ordinal();
        if (iOrdinal == 1) {
            return zzhgq.zza;
        }
        if (iOrdinal == 2) {
            return zzhgq.zzc;
        }
        if (iOrdinal == 3) {
            return zzhgq.zzd;
        }
        if (iOrdinal == 4) {
            return zzhgq.zzb;
        }
        int iZza = zzhltVar.zza();
        throw new GeneralSecurityException(o2.l(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }

    private static zzhiv zzh(zzhgr zzhgrVar) {
        zzhiu zzhiuVarZzb = zzhiv.zzb();
        zzhiuVarZzb.zza(zzhgrVar.zzd());
        return (zzhiv) zzhiuVarZzb.zzbu();
    }
}
