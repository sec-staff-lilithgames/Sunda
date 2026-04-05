package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgyz implements zzgvm {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zze;
    private final String zzc;
    private final zzgvm zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zze = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzgyz(zzhla zzhlaVar, zzgvm zzgvmVar) throws GeneralSecurityException {
        if (!zze.contains(zzhlaVar.zza())) {
            String strZza = zzhlaVar.zza();
            throw new IllegalArgumentException(a.b.o(new StringBuilder(String.valueOf(strZza).length() + 67), "Unsupported DEK key type: ", strZza, ". Only Tink AEAD key types are supported."));
        }
        this.zzc = zzhlaVar.zza();
        zzhkz zzhkzVarZzg = zzhla.zzg(zzhlaVar);
        zzhkzVarZzg.zzc(zzhlt.RAW);
        zzgwp.zzb(((zzhla) zzhkzVarZzg.zzbu()).zzaN());
        this.zzd = zzgvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > 4096 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zzd.zza(bArr3, zzb);
            String str = this.zzc;
            zzhvi zzhviVar = zzhvi.zzb;
            return ((zzgvm) zzhey.zza().zzd(zzhfb.zza().zzg(zzhfw.zza(str, zzhvi.zzr(bArrZza, 0, bArrZza.length), zzhkw.SYMMETRIC, zzhlt.RAW, null), zzgvr.zza()), zzgvm.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
