package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhbw {
    public static final /* synthetic */ int zza = 0;
    private static final zzhsz zzb;
    private static final zzhfi zzc;
    private static final zzhff zzd;
    private static final zzhec zze;
    private static final zzhdz zzf;

    static {
        zzhsz zzhszVarZza = zzhgi.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzhszVarZza;
        zzc = zzhfi.zzd(zzhbv.zza, zzgyv.class, zzhfx.class);
        zzd = zzhff.zzd(zzhbs.zza, zzhszVarZza, zzhfx.class);
        zze = zzhec.zzd(zzhbt.zza, zzgyq.class, zzhfw.class);
        zzf = zzhdz.zzd(zzhbu.zza, zzhszVarZza, zzhfw.class);
    }

    public static void zza(zzhfb zzhfbVar) throws GeneralSecurityException {
        zzhfbVar.zzd(zzc);
        zzhfbVar.zze(zzd);
        zzhfbVar.zzb(zze);
        zzhfbVar.zzc(zzf);
    }

    public static /* synthetic */ zzhfx zzb(zzgyv zzgyvVar) {
        zzhkz zzhkzVarZze = zzhla.zze();
        zzhkzVarZze.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzhkzVarZze.zzb(zzhjx.zzb().zzaM());
        zzhkzVarZze.zzc(zzf(zzgyvVar.zzc()));
        return zzhfx.zza((zzhla) zzhkzVarZze.zzbu());
    }

    public static /* synthetic */ zzgyv zzc(zzhfx zzhfxVar) throws GeneralSecurityException {
        if (!zzhfxVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhfxVar.zzc().zza())));
        }
        try {
            zzhjx.zza(zzhfxVar.zzc().zzb(), zzhvy.zza());
            return zzgyv.zzb(zzg(zzhfxVar.zzc().zzc()));
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhfw zzd(zzgyq zzgyqVar, zzgwn zzgwnVar) {
        zzhju zzhjuVarZzd = zzhjv.zzd();
        byte[] bArrZzc = zzgyqVar.zze().zzc(zzgwnVar);
        zzhjuVarZzd.zza(zzhvi.zzr(bArrZzc, 0, bArrZzc.length));
        return zzhfw.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhjv) zzhjuVarZzd.zzbu()).zzaM(), zzhkw.SYMMETRIC, zzf(zzgyqVar.zzf().zzc()), zzgyqVar.zzb());
    }

    public static /* synthetic */ zzgyq zze(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhjv zzhjvVarZzc = zzhjv.zzc(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhjvVarZzc.zza() == 0) {
                return zzgyq.zzd(zzg(zzhfwVar.zzd()), zzhtb.zza(zzhjvVarZzc.zzb().zzv(), zzgwnVar), zzhfwVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhxd unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzhlt zzf(zzgyu zzgyuVar) throws GeneralSecurityException {
        if (zzgyu.zza.equals(zzgyuVar)) {
            return zzhlt.TINK;
        }
        if (zzgyu.zzb.equals(zzgyuVar)) {
            return zzhlt.CRUNCHY;
        }
        if (zzgyu.zzc.equals(zzgyuVar)) {
            return zzhlt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgyuVar.toString()));
    }

    private static zzgyu zzg(zzhlt zzhltVar) throws GeneralSecurityException {
        int iOrdinal = zzhltVar.ordinal();
        if (iOrdinal == 1) {
            return zzgyu.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgyu.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhltVar.zza();
                throw new GeneralSecurityException(o2.l(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzgyu.zzb;
    }
}
