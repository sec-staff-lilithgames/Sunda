package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhrn implements zzgvm {
    private final zzhca zza;
    private final byte[] zzb;

    private zzhrn(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zza = new zzhca(bArr);
        this.zzb = bArr2;
    }

    public static zzgvm zzb(zzgyq zzgyqVar) throws GeneralSecurityException {
        return new zzhrn(zzgyqVar.zze().zzc(zzgvr.zza()), zzgyqVar.zzc().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.zza.zzb(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzhgi.zze(bArr3, bArr)) {
            return zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
