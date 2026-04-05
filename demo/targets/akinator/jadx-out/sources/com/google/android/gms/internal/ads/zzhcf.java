package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhcf {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzc = zzc(bArr, 0, 0);
        long jZzc2 = zzc(bArr, 3, 2) & 67108611;
        long jZzc3 = zzc(bArr, 6, 4) & 67092735;
        long jZzc4 = zzc(bArr, 9, 6) & 66076671;
        long jZzc5 = zzc(bArr, 12, 8) & 1048575;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j10 = 0;
        int i11 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 >= length) {
                long j15 = j10 + (j11 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j12 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j13 + (j17 >> 26);
                long j20 = j19 & 67108863;
                long j21 = ((j19 >> 26) * 5) + j14;
                long j22 = j21 >> 26;
                long j23 = j21 & 67108863;
                long j24 = j23 + 5;
                long j25 = (j11 & 67108863) + j22;
                long j26 = j25 + (j24 >> 26);
                long j27 = (j26 >> 26) + j16;
                long j28 = j18 + (j27 >> 26);
                long j29 = (j20 + (j28 >> 26)) - 67108864;
                long j30 = j29 >> 63;
                long j31 = ~j30;
                long j32 = (j25 & j30) | (j26 & 67108863 & j31);
                long j33 = (j16 & j30) | (j27 & 67108863 & j31);
                long j34 = (j18 & j30) | (j28 & 67108863 & j31);
                long j35 = (j20 & j30) | (j29 & j31);
                long jZzb = (((j23 & j30) | (j24 & 67108863 & j31) | (j32 << 26)) & 4294967295L) + zzb(bArr, 16);
                long jZzb2 = (((j32 >> 6) | (j33 << 20)) & 4294967295L) + zzb(bArr, 20);
                long jZzb3 = (((j34 << 14) | (j33 >> 12)) & 4294967295L) + zzb(bArr, 24);
                long jZzb4 = (((j34 >> 18) | (j35 << 8)) & 4294967295L) + zzb(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzb & 4294967295L, 0);
                long j36 = jZzb2 + (jZzb >> 32);
                zzd(bArr4, j36 & 4294967295L, 4);
                long j37 = jZzb3 + (j36 >> 32);
                zzd(bArr4, j37 & 4294967295L, 8);
                zzd(bArr4, (jZzb4 + (j37 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i10, (byte) 0);
            }
            long j38 = jZzc5 * 5;
            long j39 = jZzc4 * 5;
            long j40 = jZzc3 * 5;
            long jZzc6 = j14 + zzc(bArr3, 0, 0);
            long jZzc7 = j11 + zzc(bArr3, 3, 2);
            long jZzc8 = j10 + zzc(bArr3, 6, 4);
            long jZzc9 = j12 + zzc(bArr3, 9, 6);
            long jZzc10 = j13 + (zzc(bArr3, 12, 8) | (bArr3[16] << 24));
            long j41 = jZzc7 * jZzc;
            long j42 = jZzc7 * jZzc2;
            long j43 = jZzc8 * jZzc;
            long j44 = jZzc7 * jZzc3;
            long j45 = jZzc8 * jZzc2;
            long j46 = jZzc9 * jZzc;
            long j47 = jZzc7 * jZzc4;
            long j48 = jZzc8 * jZzc3;
            long j49 = jZzc9 * jZzc2;
            long j50 = jZzc10 * jZzc;
            long j51 = (jZzc2 * 5 * jZzc10) + (jZzc9 * j40) + (jZzc8 * j39) + (jZzc7 * j38) + (jZzc6 * jZzc);
            long j52 = j51 & 67108863;
            long j53 = jZzc9 * j39;
            long j54 = j40 * jZzc10;
            long j55 = j54 + j53 + (jZzc8 * j38) + (jZzc6 * jZzc2) + j41 + (j51 >> 26);
            long j56 = j39 * jZzc10;
            long j57 = j56 + (jZzc9 * j38) + (jZzc6 * jZzc3) + j42 + j43 + (j55 >> 26);
            long j58 = (jZzc10 * j38) + (jZzc6 * jZzc4) + j44 + j45 + j46 + (j57 >> 26);
            long j59 = (jZzc6 * jZzc5) + j47 + j48 + j49 + j50 + (j58 >> 26);
            long j60 = ((j59 >> 26) * 5) + j52;
            j11 = (j55 & 67108863) + (j60 >> 26);
            i11 += 16;
            j10 = j57 & 67108863;
            j12 = j58 & 67108863;
            j13 = j59 & 67108863;
            i10 = 17;
            j14 = j60 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return (((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i12 << 8) | i11 | (i13 << 16)) & 4294967295L;
    }

    private static long zzc(byte[] bArr, int i10, int i11) {
        return (zzb(bArr, i10) >> i11) & 67108863;
    }

    private static void zzd(byte[] bArr, long j10, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) (255 & j10);
            j10 >>= 8;
        }
    }
}
