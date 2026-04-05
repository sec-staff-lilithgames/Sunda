package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzhbz {
    int[] zza;
    private final int zzb;

    public zzhbz(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhbx.zzd(bArr);
        this.zzb = i10;
    }

    public abstract int[] zza(int[] iArr, int i10);

    public abstract int zzb();

    public final byte[] zzc(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zzb()) {
            int iZzb = zzb();
            throw new GeneralSecurityException(o2.l(iZzb, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(iZzb).length() + 36)));
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining / 64;
        for (int i11 = 0; i11 < i10 + 1; i11++) {
            ByteBuffer byteBufferZzd = zzd(bArr, this.zzb + i11);
            if (i11 == i10) {
                zzhrm.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, iRemaining % 64);
            } else {
                zzhrm.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, 64);
            }
        }
        return byteBufferAllocate.array();
    }

    public final ByteBuffer zzd(byte[] bArr, int i10) {
        int[] iArrZza = zza(zzhbx.zzd(bArr), i10);
        int[] iArr = (int[]) iArrZza.clone();
        zzhbx.zzb(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            iArrZza[i11] = iArrZza[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }
}
