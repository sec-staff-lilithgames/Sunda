package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaxi {
    private static Cipher zza;
    private static final Object zzb = new Object();
    private static final Object zzc = new Object();

    public zzaxi(SecureRandom secureRandom) {
    }

    private static final Cipher zzc() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (zzc) {
            try {
                if (zza == null) {
                    zza = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }

    public final String zza(byte[] bArr, byte[] bArr2) throws zzaxh {
        byte[] bArrDoFinal;
        byte[] iv2;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = zzc().doFinal(bArr2);
                iv2 = zzc().getIV();
            }
            int length2 = bArrDoFinal.length + iv2.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv2).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return zzavt.zza(bArr3, false);
        } catch (InvalidKeyException e10) {
            throw new zzaxh(this, e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new zzaxh(this, e11);
        } catch (BadPaddingException e12) {
            throw new zzaxh(this, e12);
        } catch (IllegalBlockSizeException e13) {
            throw new zzaxh(this, e13);
        } catch (NoSuchPaddingException e14) {
            throw new zzaxh(this, e14);
        }
    }

    public final byte[] zzb(byte[] bArr, String str) throws zzaxh {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrZzb = zzavt.zzb(str, false);
            int length2 = bArrZzb.length;
            if (length2 <= 16) {
                throw new zzaxh(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrZzb);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = zzc().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e10) {
            throw new zzaxh(this, e10);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new zzaxh(this, e11);
        } catch (InvalidKeyException e12) {
            throw new zzaxh(this, e12);
        } catch (NoSuchAlgorithmException e13) {
            throw new zzaxh(this, e13);
        } catch (BadPaddingException e14) {
            throw new zzaxh(this, e14);
        } catch (IllegalBlockSizeException e15) {
            throw new zzaxh(this, e15);
        } catch (NoSuchPaddingException e16) {
            throw new zzaxh(this, e16);
        }
    }
}
