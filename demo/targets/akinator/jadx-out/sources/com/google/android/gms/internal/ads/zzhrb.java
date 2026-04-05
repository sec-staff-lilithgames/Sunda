package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhrb {
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
        zzhsz zzhszVarZza = zzhgi.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zzhszVarZza;
        zzhsz zzhszVarZza2 = zzhgi.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zzhszVarZza2;
        zzd = zzhfi.zzd(zzhra.zza, zzhpf.class, zzhfx.class);
        zze = zzhff.zzd(zzhqv.zza, zzhszVarZza, zzhfx.class);
        zzf = zzhec.zzd(zzhqw.zza, zzhpj.class, zzhfw.class);
        zzg = zzhdz.zzd(zzhqx.zza, zzhszVarZza2, zzhfw.class);
        zzh = zzhec.zzd(zzhqy.zza, zzhph.class, zzhfw.class);
        zzi = zzhdz.zzd(zzhqz.zza, zzhszVarZza, zzhfw.class);
        zzhdo zzhdoVarZza = zzhdp.zza();
        zzhdoVarZza.zza(zzhlt.RAW, zzhpe.zzd);
        zzhdoVarZza.zza(zzhlt.TINK, zzhpe.zza);
        zzhdoVarZza.zza(zzhlt.CRUNCHY, zzhpe.zzb);
        zzhdoVarZza.zza(zzhlt.LEGACY, zzhpe.zzc);
        zzj = zzhdoVarZza.zzb();
        zzhdo zzhdoVarZza2 = zzhdp.zza();
        zzhdoVarZza2.zza(zzhko.SHA256, zzhpd.zza);
        zzhdoVarZza2.zza(zzhko.SHA384, zzhpd.zzb);
        zzhdoVarZza2.zza(zzhko.SHA512, zzhpd.zzc);
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

    public static /* synthetic */ zzhfx zzb(zzhpf zzhpfVar) {
        zzhkz zzhkzVarZze = zzhla.zze();
        zzhkzVarZze.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzhme zzhmeVarZze = zzhmf.zze();
        zzhmeVarZze.zza(zzh(zzhpfVar));
        zzhmeVarZze.zzb(zzhpfVar.zzc());
        byte[] bArrZza = zzhdb.zza(zzhpfVar.zzd());
        zzhvi zzhviVar = zzhvi.zzb;
        zzhmeVarZze.zzc(zzhvi.zzr(bArrZza, 0, bArrZza.length));
        zzhkzVarZze.zzb(((zzhmf) zzhmeVarZze.zzbu()).zzaM());
        zzhkzVarZze.zzc((zzhlt) zzj.zzb(zzhpfVar.zze()));
        return zzhfx.zza((zzhla) zzhkzVarZze.zzbu());
    }

    public static /* synthetic */ zzhpf zzc(zzhfx zzhfxVar) throws GeneralSecurityException {
        if (!zzhfxVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(zzhfxVar.zzc().zza())));
        }
        try {
            zzhmf zzhmfVarZzd = zzhmf.zzd(zzhfxVar.zzc().zzb(), zzhvy.zza());
            zzhpc zzhpcVarZzb = zzhpf.zzb();
            zzhdp zzhdpVar = zzk;
            zzhpcVarZzb.zzd((zzhpd) zzhdpVar.zzc(zzhmfVarZzd.zza().zza()));
            zzhpcVarZzb.zze((zzhpd) zzhdpVar.zzc(zzhmfVarZzd.zza().zzb()));
            zzhpcVarZzb.zzb(new BigInteger(1, zzhmfVarZzd.zzc().zzv()));
            zzhpcVarZzb.zza(zzhmfVarZzd.zzb());
            zzhpcVarZzb.zzf(zzhmfVarZzd.zza().zzc());
            zzhpcVarZzb.zzc((zzhpe) zzj.zzc(zzhfxVar.zzc().zzc()));
            return zzhpcVarZzb.zzg();
        } catch (zzhxd e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhpj zze(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhfwVar.zzg())));
        }
        try {
            zzhml zzhmlVarZze = zzhml.zze(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhmlVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhmlVarZze.zzc().zzv());
            int iBitLength = bigInteger.bitLength();
            zzhpc zzhpcVarZzb = zzhpf.zzb();
            zzhdp zzhdpVar = zzk;
            zzhpcVarZzb.zzd((zzhpd) zzhdpVar.zzc(zzhmlVarZze.zzb().zza()));
            zzhpcVarZzb.zze((zzhpd) zzhdpVar.zzc(zzhmlVarZze.zzb().zzb()));
            zzhpcVarZzb.zzb(new BigInteger(1, zzhmlVarZze.zzd().zzv()));
            zzhpcVarZzb.zza(iBitLength);
            zzhpcVarZzb.zzf(zzhmlVarZze.zzb().zzc());
            zzhpcVarZzb.zzc((zzhpe) zzj.zzc(zzhfwVar.zzd()));
            zzhpf zzhpfVarZzg = zzhpcVarZzb.zzg();
            zzhpi zzhpiVarZzc = zzhpj.zzc();
            zzhpiVarZzc.zza(zzhpfVarZzg);
            zzhpiVarZzc.zzb(bigInteger);
            zzhpiVarZzc.zzc(zzhfwVar.zze());
            return zzhpiVarZzc.zzd();
        } catch (zzhxd | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    public static /* synthetic */ zzhfw zzf(zzhph zzhphVar, zzgwn zzgwnVar) {
        zzhmi zzhmiVarZzk = zzhmj.zzk();
        zzhmiVarZzk.zza(0);
        zzhmiVarZzk.zzb(zzi(zzhphVar.zze()));
        byte[] bArrZza = zzhdb.zza(zzhphVar.zzh().zzb(zzgwnVar));
        zzhvi zzhviVar = zzhvi.zzb;
        zzhmiVarZzk.zzc(zzhvi.zzr(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhdb.zza(zzhphVar.zzf().zzb(zzgwnVar));
        zzhmiVarZzk.zzd(zzhvi.zzr(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhdb.zza(zzhphVar.zzg().zzb(zzgwnVar));
        zzhmiVarZzk.zze(zzhvi.zzr(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhdb.zza(zzhphVar.zzi().zzb(zzgwnVar));
        zzhmiVarZzk.zzf(zzhvi.zzr(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhdb.zza(zzhphVar.zzj().zzb(zzgwnVar));
        zzhmiVarZzk.zzg(zzhvi.zzr(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhdb.zza(zzhphVar.zzk().zzb(zzgwnVar));
        zzhmiVarZzk.zzh(zzhvi.zzr(bArrZza6, 0, bArrZza6.length));
        return zzhfw.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((zzhmj) zzhmiVarZzk.zzbu()).zzaM(), zzhkw.ASYMMETRIC_PRIVATE, (zzhlt) zzj.zzb(zzhphVar.zzd().zze()), zzhphVar.zze().zzb());
    }

    public static /* synthetic */ zzhph zzg(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        if (!zzhfwVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhfwVar.zzg())));
        }
        try {
            zzhmj zzhmjVarZzj = zzhmj.zzj(zzhfwVar.zzb(), zzhvy.zza());
            if (zzhmjVarZzj.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhml zzhmlVarZzb = zzhmjVarZzj.zzb();
            if (zzhmlVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhmlVarZzb.zzc().zzv());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzhmlVarZzb.zzd().zzv());
            zzhpc zzhpcVarZzb = zzhpf.zzb();
            zzhdp zzhdpVar = zzk;
            zzhpcVarZzb.zzd((zzhpd) zzhdpVar.zzc(zzhmlVarZzb.zzb().zza()));
            zzhpcVarZzb.zze((zzhpd) zzhdpVar.zzc(zzhmlVarZzb.zzb().zzb()));
            zzhpcVarZzb.zzb(bigInteger2);
            zzhpcVarZzb.zza(iBitLength);
            zzhpcVarZzb.zzf(zzhmlVarZzb.zzb().zzc());
            zzhpcVarZzb.zzc((zzhpe) zzj.zzc(zzhfwVar.zzd()));
            zzhpf zzhpfVarZzg = zzhpcVarZzb.zzg();
            zzhpi zzhpiVarZzc = zzhpj.zzc();
            zzhpiVarZzc.zza(zzhpfVarZzg);
            zzhpiVarZzc.zzb(bigInteger);
            zzhpiVarZzc.zzc(zzhfwVar.zze());
            zzhpj zzhpjVarZzd = zzhpiVarZzc.zzd();
            zzhpg zzhpgVarZzc = zzhph.zzc();
            zzhpgVarZzc.zza(zzhpjVarZzd);
            zzhpgVarZzc.zzb(zzj(zzhmjVarZzj.zzd(), zzgwnVar), zzj(zzhmjVarZzj.zze(), zzgwnVar));
            zzhpgVarZzc.zzc(zzj(zzhmjVarZzj.zzc(), zzgwnVar));
            zzhpgVarZzc.zzd(zzj(zzhmjVarZzj.zzg(), zzgwnVar), zzj(zzhmjVarZzj.zzh(), zzgwnVar));
            zzhpgVarZzc.zze(zzj(zzhmjVarZzj.zzi(), zzgwnVar));
            return zzhpgVarZzc.zzf();
        } catch (zzhxd | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static zzhmh zzh(zzhpf zzhpfVar) throws GeneralSecurityException {
        zzhmg zzhmgVarZzd = zzhmh.zzd();
        zzhdp zzhdpVar = zzk;
        zzhmgVarZzd.zza((zzhko) zzhdpVar.zzb(zzhpfVar.zzf()));
        zzhmgVarZzd.zzb((zzhko) zzhdpVar.zzb(zzhpfVar.zzg()));
        zzhmgVarZzd.zzc(zzhpfVar.zzh());
        return (zzhmh) zzhmgVarZzd.zzbu();
    }

    private static zzhml zzi(zzhpj zzhpjVar) throws GeneralSecurityException {
        zzhmk zzhmkVarZzg = zzhml.zzg();
        zzhmkVarZzg.zzb(zzh(zzhpjVar.zzf()));
        byte[] bArrZza = zzhdb.zza(zzhpjVar.zzd());
        zzhvi zzhviVar = zzhvi.zzb;
        zzhmkVarZzg.zzc(zzhvi.zzr(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhdb.zza(zzhpjVar.zzf().zzd());
        zzhmkVarZzg.zzd(zzhvi.zzr(bArrZza2, 0, bArrZza2.length));
        zzhmkVarZzg.zza(0);
        return (zzhml) zzhmkVarZzg.zzbu();
    }

    private static zzhta zzj(zzhvi zzhviVar, zzgwn zzgwnVar) {
        return zzhta.zza(new BigInteger(1, zzhviVar.zzv()), zzgwnVar);
    }
}
