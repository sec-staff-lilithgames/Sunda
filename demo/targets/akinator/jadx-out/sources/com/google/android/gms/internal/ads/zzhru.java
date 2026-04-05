package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhru implements zzgvm {
    private final zzhsk zza;
    private final zzgwi zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzhru(zzhsk zzhskVar, zzgwi zzgwiVar, int i10, byte[] bArr) {
        this.zza = zzhskVar;
        this.zzb = zzgwiVar;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public static zzgvm zzb(zzgxh zzgxhVar) throws GeneralSecurityException {
        zzhrf zzhrfVar = new zzhrf(zzgxhVar.zze().zzc(zzgvr.zza()), zzgxhVar.zzg().zzf());
        String strValueOf = String.valueOf(zzgxhVar.zzg().zzh());
        return new zzhru(zzhrfVar, new zzhsp(new zzhso("HMAC".concat(strValueOf), new SecretKeySpec(zzgxhVar.zzf().zzc(zzgvr.zza()), "HMAC")), zzgxhVar.zzg().zze()), zzgxhVar.zzg().zze(), zzgxhVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i10 = this.zzc;
        int length2 = bArr3.length;
        if (length < i10 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhgi.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i11 = length - i10;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzhsp) this.zzb).zzc(zzhrm.zza(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
