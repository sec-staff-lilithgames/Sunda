package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhqs {
    public static final /* synthetic */ int zza = 0;
    private static final zzhsz zzb;
    private static final zzhsz zzc;
    private static final zzhfi zzd;
    private static final zzhff zze;
    private static final zzhec zzf;
    private static final zzhdz zzg;
    private static final zzhec zzh;
    private static final zzhdz zzi;
    private static final zzhdp zzj;
    private static final zzhdp zzk;

    static {
        zzhsz zzhszVarZza = zzhgi.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zzhszVarZza;
        zzhsz zzhszVarZza2 = zzhgi.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zzhszVarZza2;
        zzd = zzhfi.zzd(zzhqr.zza, zzhot.class, zzhfx.class);
        zze = zzhff.zzd(zzhqm.zza, zzhszVarZza, zzhfx.class);
        zzf = zzhec.zzd(zzhqn.zza, zzhox.class, zzhfw.class);
        zzg = zzhdz.zzd(zzhqo.zza, zzhszVarZza2, zzhfw.class);
        zzh = zzhec.zzd(zzhqp.zza, zzhov.class, zzhfw.class);
        zzi = zzhdz.zzd(zzhqq.zza, zzhszVarZza, zzhfw.class);
        zzhdo zzhdoVarZza = zzhdp.zza();
        zzhdoVarZza.zza(zzhlt.RAW, zzhos.zzd);
        zzhdoVarZza.zza(zzhlt.TINK, zzhos.zza);
        zzhdoVarZza.zza(zzhlt.CRUNCHY, zzhos.zzb);
        zzhdoVarZza.zza(zzhlt.LEGACY, zzhos.zzc);
        zzj = zzhdoVarZza.zzb();
        zzhdo zzhdoVarZza2 = zzhdp.zza();
        zzhdoVarZza2.zza(zzhko.SHA256, zzhor.zza);
        zzhdoVarZza2.zza(zzhko.SHA384, zzhor.zzb);
        zzhdoVarZza2.zza(zzhko.SHA512, zzhor.zzc);
        zzk = zzhdoVarZza2.zzb();
    }

    public static void zza(zzhfb zzhfbVar) throws GeneralSecurityException {
        zzhfbVar.zzd(zzd);
        zzhfbVar.zze(zze);
        zzhfbVar.zzb(zzf);
        zzhfbVar.zzc(zzg);
        zzhfbVar.zzb(zzh);
        zzhfbVar.zzc(zzi);
    }

    public static /* synthetic */ zzhfx zzb(zzhot zzhotVar) {
        zzhkz zzhkzVarZze = zzhla.zze();
        zzhkzVarZze.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzhlw zzhlwVarZze = zzhlx.zze();
        zzhlwVarZze.zza(zzh(zzhotVar));
        zzhlwVarZze.zzb(zzhotVar.zzc());
        byte[] bArrZza = zzhdb.zza(zzhotVar.zzd());
        zzhvi zzhviVar = zzhvi.zzb;
        zzhlwVarZze.zzc(zzhvi.zzr(bArrZza, 0, bArrZza.length));
        zzhkzVarZze.zzb(((zzhlx) zzhlwVarZze.zzbu()).zzaM());
        zzhkzVarZze.zzc((zzhlt) zzj.zzb(zzhotVar.zze()));
        return zzhfx.zza((zzhla) zzhkzVarZze.zzbu());
    }

    public static /* synthetic */ zzhot zzc(zzhfx zzhfxVar) throws GeneralSecurityException {
        if (!zzhfxVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhfxVar.zzc().zza())));
        }
        try {
            zzhlx zzhlxVarZzd = zzhlx.zzd(zzhfxVar.zzc().zzb(), zzhvy.zza());
            zzhoq zzhoqVarZzb = zzhot.zzb();
            zzhoqVarZzb.zzd((zzhor) zzk.zzc(zzhlxVarZzd.zza().zza()));
            zzhoqVarZzb.zzb(new BigInteger(1, zzhlxVarZzd.zzc().zzv()));
            zzhoqVarZzb.zza(zzhlxVarZzd.zzb());
            zzhoqVarZzb.zzc((zzhos) zzj.zzc(zzhfxVar.zzc().zzc()));
            return zzhoqVarZzb.zze();
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhox zze(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhfwVar.zzg())));
        }
        try {
            zzhmd zzhmdVarZze = zzhmd.zze(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhmdVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhmdVarZze.zzc().zzv());
            int iBitLength = bigInteger.bitLength();
            zzhoq zzhoqVarZzb = zzhot.zzb();
            zzhoqVarZzb.zzd((zzhor) zzk.zzc(zzhmdVarZze.zzb().zza()));
            zzhoqVarZzb.zzb(new BigInteger(1, zzhmdVarZze.zzd().zzv()));
            zzhoqVarZzb.zza(iBitLength);
            zzhoqVarZzb.zzc((zzhos) zzj.zzc(zzhfwVar.zzd()));
            zzhot zzhotVarZze = zzhoqVarZzb.zze();
            zzhow zzhowVarZzc = zzhox.zzc();
            zzhowVarZzc.zza(zzhotVarZze);
            zzhowVarZzc.zzb(bigInteger);
            zzhowVarZzc.zzc(zzhfwVar.zze());
            return zzhowVarZzc.zzd();
        } catch (zzhxd | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static /* synthetic */ zzhfw zzf(zzhov zzhovVar, zzgwn zzgwnVar) {
        zzhma zzhmaVarZzk = zzhmb.zzk();
        zzhmaVarZzk.zza(0);
        zzhmaVarZzk.zzb(zzi(zzhovVar.zze()));
        byte[] bArrZza = zzhdb.zza(zzhovVar.zzh().zzb(zzgwnVar));
        zzhvi zzhviVar = zzhvi.zzb;
        zzhmaVarZzk.zzc(zzhvi.zzr(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhdb.zza(zzhovVar.zzf().zzb(zzgwnVar));
        zzhmaVarZzk.zzd(zzhvi.zzr(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhdb.zza(zzhovVar.zzg().zzb(zzgwnVar));
        zzhmaVarZzk.zze(zzhvi.zzr(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhdb.zza(zzhovVar.zzi().zzb(zzgwnVar));
        zzhmaVarZzk.zzf(zzhvi.zzr(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhdb.zza(zzhovVar.zzj().zzb(zzgwnVar));
        zzhmaVarZzk.zzg(zzhvi.zzr(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhdb.zza(zzhovVar.zzk().zzb(zzgwnVar));
        zzhmaVarZzk.zzh(zzhvi.zzr(bArrZza6, 0, bArrZza6.length));
        return zzhfw.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((zzhmb) zzhmaVarZzk.zzbu()).zzaM(), zzhkw.ASYMMETRIC_PRIVATE, (zzhlt) zzj.zzb(zzhovVar.zzd().zze()), zzhovVar.zze().zzb());
    }

    public static /* synthetic */ zzhov zzg(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhfwVar.zzg())));
        }
        try {
            zzhmb zzhmbVarZzj = zzhmb.zzj(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhmbVarZzj.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhmd zzhmdVarZzb = zzhmbVarZzj.zzb();
            if (zzhmdVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhmdVarZzb.zzc().zzv());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzhmdVarZzb.zzd().zzv());
            zzhoq zzhoqVarZzb = zzhot.zzb();
            zzhoqVarZzb.zzd((zzhor) zzk.zzc(zzhmdVarZzb.zzb().zza()));
            zzhoqVarZzb.zzb(bigInteger2);
            zzhoqVarZzb.zza(iBitLength);
            zzhoqVarZzb.zzc((zzhos) zzj.zzc(zzhfwVar.zzd()));
            zzhot zzhotVarZze = zzhoqVarZzb.zze();
            zzhow zzhowVarZzc = zzhox.zzc();
            zzhowVarZzc.zza(zzhotVarZze);
            zzhowVarZzc.zzb(bigInteger);
            zzhowVarZzc.zzc(zzhfwVar.zze());
            zzhox zzhoxVarZzd = zzhowVarZzc.zzd();
            zzhou zzhouVarZzc = zzhov.zzc();
            zzhouVarZzc.zza(zzhoxVarZzd);
            zzhouVarZzc.zzb(zzj(zzhmbVarZzj.zzd(), zzgwnVar), zzj(zzhmbVarZzj.zze(), zzgwnVar));
            zzhouVarZzc.zzc(zzj(zzhmbVarZzj.zzc(), zzgwnVar));
            zzhouVarZzc.zzd(zzj(zzhmbVarZzj.zzg(), zzgwnVar), zzj(zzhmbVarZzj.zzh(), zzgwnVar));
            zzhouVarZzc.zze(zzj(zzhmbVarZzj.zzi(), zzgwnVar));
            return zzhouVarZzc.zzf();
        } catch (zzhxd | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static zzhlz zzh(zzhot zzhotVar) throws GeneralSecurityException {
        zzhly zzhlyVarZzb = zzhlz.zzb();
        zzhlyVarZzb.zza((zzhko) zzk.zzb(zzhotVar.zzf()));
        return (zzhlz) zzhlyVarZzb.zzbu();
    }

    private static zzhmd zzi(zzhox zzhoxVar) throws GeneralSecurityException {
        zzhmc zzhmcVarZzg = zzhmd.zzg();
        zzhmcVarZzg.zza(zzh(zzhoxVar.zzf()));
        byte[] bArrZza = zzhdb.zza(zzhoxVar.zzd());
        zzhvi zzhviVar = zzhvi.zzb;
        zzhmcVarZzg.zzb(zzhvi.zzr(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhdb.zza(zzhoxVar.zzf().zzd());
        zzhmcVarZzg.zzc(zzhvi.zzr(bArrZza2, 0, bArrZza2.length));
        return (zzhmd) zzhmcVarZzg.zzbu();
    }

    private static zzhta zzj(zzhvi zzhviVar, zzgwn zzgwnVar) {
        return zzhta.zza(new BigInteger(1, zzhviVar.zzv()), zzgwnVar);
    }
}
