package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhrh implements zzgvm {
    private static final ThreadLocal zza = new zzhrg();
    private final byte[] zzb;
    private final zzhik zzc;
    private final SecretKeySpec zzd;
    private final int zze;

    private zzhrh(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zze = i10;
        int length = bArr.length;
        zzhsx.zza(length);
        this.zzd = new SecretKeySpec(bArr, "AES");
        this.zzc = zzhsm.zzb(zzhii.zzc(zzhij.zzb(length), zzhtb.zza(bArr, zzgvr.zza())));
        this.zzb = bArr2;
    }

    public static zzgvm zzb(zzgxr zzgxrVar) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        zzgxrVar.zzf();
        return new zzhrh(zzgxrVar.zze().zzc(zzgvr.zza()), zzgxrVar.zzf().zzd(), zzgxrVar.zzc().zzc());
    }

    private final byte[] zzc(int i10, byte[] bArr, int i11, int i12) throws GeneralSecurityException {
        byte[] bArr2 = new byte[i12 + 16];
        bArr2[15] = (byte) i10;
        System.arraycopy(bArr, i11, bArr2, 16, i12);
        return this.zzc.zza(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i10 = this.zze;
        int i11 = ((length - length2) - i10) - 16;
        if (i11 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhgi.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrZzc = zzc(0, bArr, length2, i10);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrZzc2 = zzc(1, bArr2, 0, bArr2.length);
        byte[] bArrZzc3 = zzc(2, bArr, length2 + i10, i11);
        int i12 = length - 16;
        byte b10 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            b10 = (byte) (b10 | (((bArr[i12 + i13] ^ bArrZzc2[i13]) ^ bArrZzc[i13]) ^ bArrZzc3[i13]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zzd, new IvParameterSpec(bArrZzc));
        return cipher.doFinal(bArr, bArr3.length + i10, i11);
    }
}
