package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhrt {
    public static byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i10;
        int length = bArr.length;
        if ((length & 1) != 0 || length == 0 || length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        int i11 = length >> 1;
        byte[] bArrZzc = zzc(Arrays.copyOf(bArr, i11));
        byte[] bArrZzc2 = zzc(Arrays.copyOfRange(bArr, i11, length));
        int length2 = bArrZzc.length;
        int length3 = bArrZzc2.length;
        int i12 = length2 + 4 + length3;
        if (i12 >= 128) {
            bArr2 = new byte[i12 + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) i12;
            i10 = 3;
        } else {
            bArr2 = new byte[i12 + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) i12;
            i10 = 2;
        }
        int i13 = i10 + 1;
        bArr2[i10] = 2;
        int i14 = i10 + 2;
        bArr2[i13] = (byte) length2;
        System.arraycopy(bArrZzc, 0, bArr2, i14, length2);
        int i15 = i14 + length2;
        bArr2[i15] = 2;
        bArr2[i15 + 1] = (byte) length3;
        System.arraycopy(bArrZzc2, 0, bArr2, i15 + 2, length3);
        return bArr2;
    }

    public static ECParameterSpec zzb(zzhrr zzhrrVar) throws NoSuchAlgorithmException {
        int iOrdinal = zzhrrVar.ordinal();
        if (iOrdinal == 0) {
            return zzhdn.zza;
        }
        if (iOrdinal == 1) {
            return zzhdn.zzb;
        }
        if (iOrdinal == 2) {
            return zzhdn.zzc;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(zzhrrVar.toString()));
    }

    private static byte[] zzc(byte[] bArr) {
        int length;
        int i10 = 0;
        while (true) {
            length = bArr.length;
            if (i10 >= length || bArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == length) {
            i10 = length - 1;
        }
        int i11 = (bArr[i10] & 128) == 128 ? 1 : 0;
        int i12 = length - i10;
        byte[] bArr2 = new byte[i12 + i11];
        System.arraycopy(bArr, i10, bArr2, i11, i12);
        return bArr2;
    }
}
