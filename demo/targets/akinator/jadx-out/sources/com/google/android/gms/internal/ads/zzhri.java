package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhri implements zzgvm {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzhri(byte[] bArr, zzhsz zzhszVar) throws GeneralSecurityException {
        if (!zzhcy.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzhbd.zzb(bArr);
        this.zzb = zzhszVar.zzc();
    }

    public static zzgvm zzb(zzgxz zzgxzVar) throws GeneralSecurityException {
        zzgxzVar.zzf();
        zzgxzVar.zzf();
        return new zzhri(zzgxzVar.zze().zzc(zzgvr.zza()), zzgxzVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhgi.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecZzc = zzhbd.zzc(bArr, length2, 12);
        SecretKey secretKey = this.zza;
        Cipher cipherZza = zzhbd.zza();
        cipherZza.init(2, secretKey, algorithmParameterSpecZzc);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
