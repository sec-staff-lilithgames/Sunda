package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhcg implements zzgvm {
    private final byte[] zza;
    private final int zzb;
    private final zzhik zzc;

    private zzhcg(byte[] bArr, zzhsz zzhszVar, int i10) throws GeneralSecurityException {
        this.zzc = zzhsm.zzb(zzhii.zzc(zzhij.zzb(bArr.length), zzhtb.zza(bArr, zzgvr.zza())));
        this.zza = zzhszVar.zzc();
        this.zzb = i10;
    }

    public static zzgvm zzb(zzhaf zzhafVar) throws GeneralSecurityException {
        zzhafVar.zzf();
        zzhafVar.zzf();
        return new zzhcg(zzhafVar.zze().zzc(zzgvr.zza()), zzhafVar.zzc(), zzhafVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i10 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i11 = i10 + length2;
        if (length < i11 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhgi.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        zzhik zzhikVar = this.zzc;
        byte[] bArr6 = new byte[32];
        System.arraycopy(zzhikVar.zza(bArr4, 16), 0, bArr6, 0, 16);
        System.arraycopy(zzhikVar.zza(bArr5, 16), 0, bArr6, 16, 16);
        if (!zzhcy.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyZzb = zzhbd.zzb(bArr6);
        int i12 = i11 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, i12);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i11 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZzc = zzhbd.zzc(bArrCopyOfRange2, 0, 12);
        Cipher cipherZza = zzhbd.zza();
        cipherZza.init(2, secretKeyZzb, algorithmParameterSpecZzc);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, i12, length - i12);
    }
}
