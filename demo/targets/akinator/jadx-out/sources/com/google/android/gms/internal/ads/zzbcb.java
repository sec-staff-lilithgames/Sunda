package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbcb extends zzbbw {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final byte[] zza(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i10 = 4;
        if (length == 1) {
            int iZza = zzbca.zza(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int iZza2 = zzbca.zza(strArrSplit[i11]);
                    int i12 = (iZza2 >> 16) ^ ((char) iZza2);
                    byte b10 = (byte) i12;
                    byte b11 = (byte) (i12 >> 8);
                    int i13 = i11 + i11;
                    bArr[i13] = new byte[]{b10, b11}[0];
                    bArr[i13 + 1] = b11;
                }
            } else {
                bArr = new byte[length];
                for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                    int iZza3 = zzbca.zza(strArrSplit[i14]);
                    bArr[i14] = (byte) ((iZza3 >> 24) ^ (((iZza3 & 255) ^ ((iZza3 >> 8) & 255)) ^ ((iZza3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.zzb = zzb();
        synchronized (this.zza) {
            try {
                MessageDigest messageDigest = this.zzb;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.zzb.update(bArrArray);
                byte[] bArrDigest = this.zzb.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i10 = length2;
                }
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i10);
                return bArr2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
