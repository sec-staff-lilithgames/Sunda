package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhbk implements zzgvm {
    private static final byte[] zza = zzhsj.zza("7a806c");
    private static final byte[] zzb = zzhsj.zza("46bb91c3c5");
    private static final byte[] zzc = zzhsj.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzhsj.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzhsj.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private final zzhbj zzf;
    private final SecretKey zzg;
    private final byte[] zzh;

    private zzhbk(byte[] bArr, byte[] bArr2, zzhbj zzhbjVar) throws GeneralSecurityException {
        this.zzh = bArr2;
        zzhsx.zza(bArr.length);
        this.zzg = new SecretKeySpec(bArr, "AES");
        this.zzf = zzhbjVar;
    }

    public static boolean zzb(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static zzgvm zzc(zzgyi zzgyiVar, zzhbj zzhbjVar) throws GeneralSecurityException {
        if (zzb((Cipher) zzhbjVar.zza())) {
            return new zzhbk(zzgyiVar.zze().zzc(zzgvr.zza()), zzgyiVar.zzc().zzc(), zzhbjVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzh;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhgi.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) this.zzf.zza();
        cipher.init(2, this.zzg, new GCMParameterSpec(128, bArr, length2, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
