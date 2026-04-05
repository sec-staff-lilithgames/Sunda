package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzhzl {
    public static final String zzc(ByteBuffer byteBuffer, int i10, int i11) throws zzhxd {
        int i12;
        if ((((byteBuffer.limit() - i10) - i11) | i10 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i13 = i10 + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (i10 < i13) {
            byte b10 = byteBuffer.get(i10);
            if (!zzhzk.zza(b10)) {
                break;
            }
            i10++;
            cArr[i14] = (char) b10;
            i14++;
        }
        int i15 = i14;
        while (i10 < i13) {
            int i16 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (zzhzk.zza(b11)) {
                cArr[i15] = (char) b11;
                i15++;
                i10 = i16;
                while (i10 < i13) {
                    byte b12 = byteBuffer.get(i10);
                    if (zzhzk.zza(b12)) {
                        i10++;
                        cArr[i15] = (char) b12;
                        i15++;
                    }
                }
            } else {
                if (zzhzk.zzb(b11)) {
                    if (i16 >= i13) {
                        throw new zzhxd("Protocol message had invalid UTF-8.");
                    }
                    i12 = i15 + 1;
                    i10 += 2;
                    zzhzk.zzd(b11, byteBuffer.get(i16), cArr, i15);
                } else if (zzhzk.zzc(b11)) {
                    if (i16 >= i13 - 1) {
                        throw new zzhxd("Protocol message had invalid UTF-8.");
                    }
                    i12 = i15 + 1;
                    int i17 = i10 + 2;
                    i10 += 3;
                    zzhzk.zze(b11, byteBuffer.get(i16), byteBuffer.get(i17), cArr, i15);
                } else {
                    if (i16 >= i13 - 2) {
                        throw new zzhxd("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = byteBuffer.get(i16);
                    int i18 = i10 + 3;
                    byte b14 = byteBuffer.get(i10 + 2);
                    i10 += 4;
                    zzhzk.zzf(b11, b13, b14, byteBuffer.get(i18), cArr, i15);
                    i15 += 2;
                }
                i15 = i12;
            }
        }
        return new String(cArr, 0, i15);
    }

    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    public abstract String zzb(byte[] bArr, int i10, int i11) throws zzhxd;
}
