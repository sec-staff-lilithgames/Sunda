package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhdq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzc = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzd = {67108863, 33554431};
    private static final int[] zze = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j11 + j11 + j12;
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j15 + j15 + j16;
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j19 + j19 + j20;
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j23 + j23 + j24;
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j27 + j27 + j28;
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j31 + j31 + j32;
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j35 + j35 + j36;
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j39 + j39 + j40;
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j43 + j43 + j44;
        jArr[0] = j45;
        jArr[0] = j45 + j43;
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j15 + j15 + j16;
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    public static void zze(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr2[0];
        long j11 = jArr3[0];
        long j12 = j10 * j11;
        long j13 = jArr3[1];
        long j14 = jArr2[1];
        long j15 = (j14 * j11) + (j10 * j13);
        long j16 = jArr3[2];
        long j17 = jArr2[2];
        long j18 = ((j14 + j14) * j13) + (j10 * j16) + (j17 * j11);
        long j19 = jArr3[3];
        long j20 = jArr2[3];
        long j21 = (j14 * j16) + (j17 * j13) + (j10 * j19) + (j20 * j11);
        long j22 = jArr3[4];
        long j23 = jArr2[4];
        long j24 = (j14 * j19) + (j20 * j13);
        long j25 = j24 + j24 + (j17 * j16) + (j10 * j22) + (j23 * j11);
        long j26 = jArr3[5];
        long j27 = jArr2[5];
        long j28 = (j17 * j19) + (j20 * j16) + (j14 * j22) + (j23 * j13) + (j10 * j26) + (j27 * j11);
        long j29 = jArr3[6];
        long j30 = jArr2[6];
        long j31 = (j20 * j19) + (j14 * j26) + (j27 * j13);
        long j32 = j31 + j31 + (j17 * j22) + (j23 * j16) + (j10 * j29) + (j30 * j11);
        long j33 = jArr3[7];
        long j34 = jArr2[7];
        long j35 = (j20 * j22) + (j23 * j19) + (j17 * j26) + (j27 * j16) + (j14 * j29) + (j30 * j13) + (j10 * j33) + (j34 * j11);
        long j36 = jArr3[8];
        long j37 = jArr2[8];
        long j38 = (j20 * j26) + (j27 * j19) + (j14 * j33) + (j34 * j13);
        long j39 = j38 + j38 + (j23 * j22) + (j17 * j29) + (j30 * j16) + (j10 * j36) + (j37 * j11);
        long j40 = jArr3[9];
        long j41 = jArr2[9];
        long j42 = (j23 * j26) + (j27 * j22) + (j20 * j29) + (j30 * j19) + (j17 * j33) + (j34 * j16) + (j14 * j36) + (j37 * j13) + (j10 * j40) + (j11 * j41);
        long j43 = (j27 * j26) + (j20 * j33) + (j34 * j19) + (j14 * j40) + (j13 * j41);
        long j44 = (j27 * j33) + (j34 * j26) + (j20 * j40) + (j19 * j41);
        long j45 = (j34 * j33) + (j27 * j40) + (j26 * j41);
        long j46 = (j34 * j36) + (j37 * j33) + (j30 * j40) + (j29 * j41);
        long j47 = (j33 * j41) + (j34 * j40);
        zzc(new long[]{j12, j15, j18, j21, j25, j28, j32, j35, j39, j42, j43 + j43 + (j23 * j29) + (j30 * j22) + (j17 * j36) + (j37 * j16), (j27 * j29) + (j30 * j26) + (j23 * j33) + (j34 * j22) + (j20 * j36) + (j37 * j19) + (j17 * j40) + (j16 * j41), j44 + j44 + (j30 * j29) + (j23 * j36) + (j37 * j22), (j30 * j33) + (j34 * j29) + (j27 * j36) + (j37 * j26) + (j23 * j40) + (j22 * j41), j45 + j45 + (j30 * j36) + (j37 * j29), j46, j47 + j47 + (j37 * j36), (j36 * j41) + (j37 * j40), (j41 + j41) * j40}, jArr);
    }

    public static void zzf(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = j10 * j10;
        long j12 = jArr2[1];
        long j13 = (j10 + j10) * j12;
        long j14 = jArr2[2];
        long j15 = (j10 * j14) + (j12 * j12);
        long j16 = jArr2[3];
        long j17 = (j10 * j16) + (j12 * j14);
        long j18 = jArr2[4];
        long j19 = (j14 * j14) + (j12 * 4 * j16) + ((j10 + j10) * j18);
        long j20 = jArr2[5];
        long j21 = (j14 * j16) + (j12 * j18) + (j10 * j20);
        long j22 = jArr2[6];
        long j23 = (j16 * j16) + (j14 * j18) + (j10 * j22) + ((j12 + j12) * j20);
        long j24 = jArr2[7];
        long j25 = (j16 * j18) + (j14 * j20) + (j12 * j22) + (j10 * j24);
        long j26 = jArr2[8];
        long j27 = (j16 * j20) + (j12 * j24);
        long j28 = j27 + j27 + (j14 * j22) + (j10 * j26);
        long j29 = j28 + j28 + (j18 * j18);
        long j30 = jArr2[9];
        long j31 = (j18 * j20) + (j16 * j22) + (j14 * j24) + (j12 * j26) + (j10 * j30);
        long j32 = (j12 * j30) + (j16 * j24);
        long j33 = j32 + j32 + (j20 * j20) + (j18 * j22) + (j14 * j26);
        long j34 = (j20 * j22) + (j18 * j24) + (j16 * j26) + (j14 * j30);
        long j35 = (j16 * j30) + (j20 * j24);
        long j36 = j35 + j35 + (j18 * j26);
        long j37 = j36 + j36 + (j22 * j22);
        long j38 = (j22 * j24) + (j20 * j26) + (j18 * j30);
        long j39 = (j24 * j24) + (j22 * j26) + ((j20 + j20) * j30);
        long j40 = (j22 * j30) + (j24 * j26);
        zzc(new long[]{j11, j13, j15 + j15, j17 + j17, j19, j21 + j21, j23 + j23, j25 + j25, j29, j31 + j31, j33 + j33, j34 + j34, j37, j38 + j38, j39 + j39, j40 + j40, (j24 * 4 * j30) + (j26 * j26), (j26 + j26) * j30, (j30 + j30) * j30}, jArr);
    }

    public static long[] zzg(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = zzb[i10];
            jArr[i10] = (((((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i11 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | ((bArr[i11 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16)) | ((bArr[i11 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24)) >> zzc[i10]) & zzd[i10 & 1];
        }
        return jArr;
    }

    public static byte[] zzh(long[] jArr) {
        int i10;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                break;
            }
            int i13 = 0;
            while (i13 < 9) {
                long j10 = jArrCopyOf[i13];
                int i14 = -((int) (((j10 >> 31) & j10) >> zze[i13 & 1]));
                jArrCopyOf[i13] = j10 + (i14 << r14);
                i13++;
                jArrCopyOf[i13] = jArrCopyOf[i13] - i14;
            }
            long j11 = jArrCopyOf[9];
            jArrCopyOf[9] = j11 + (r6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - ((-((int) (((j11 >> 31) & j11) >> 25))) * 19);
            i12++;
        }
        long j12 = jArrCopyOf[0];
        jArrCopyOf[0] = j12 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j12 >> 31) & j12) >> 26)));
        int i15 = 0;
        while (i15 < 2) {
            int i16 = i11;
            while (i16 < 9) {
                long j13 = jArrCopyOf[i16];
                int i17 = i11;
                long j14 = j13 >> zze[i16 & 1];
                jArrCopyOf[i16] = j13 & zzd[r14];
                i16++;
                jArrCopyOf[i16] = jArrCopyOf[i16] + ((int) j14);
                i11 = i17;
                i15 = i15;
            }
            i15++;
        }
        int i18 = i11;
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        jArrCopyOf[i18] = (((int) (r2 >> 25)) * 19) + jArrCopyOf[i18];
        int i19 = ~((((int) r6) - 67108845) >> 31);
        for (int i20 = 1; i20 < 10; i20++) {
            int i21 = ~(((int) jArrCopyOf[i20]) ^ zzd[i20 & 1]);
            int i22 = i21 & (i21 << 16);
            int i23 = i22 & (i22 << 8);
            int i24 = i23 & (i23 << 4);
            int i25 = i24 & (i24 << 2);
            i19 &= (i25 & (i25 + i25)) >> 31;
        }
        jArrCopyOf[i18] = jArrCopyOf[i18] - (67108845 & i19);
        long j15 = 33554431 & i19;
        jArrCopyOf[1] = jArrCopyOf[1] - j15;
        for (i10 = 2; i10 < 10; i10 += 2) {
            jArrCopyOf[i10] = jArrCopyOf[i10] - (67108863 & i19);
            int i26 = i10 + 1;
            jArrCopyOf[i26] = jArrCopyOf[i26] - j15;
        }
        for (int i27 = i18; i27 < 10; i27++) {
            jArrCopyOf[i27] = jArrCopyOf[i27] << zzc[i27];
        }
        byte[] bArr = new byte[32];
        for (int i28 = i18; i28 < 10; i28++) {
            int i29 = zzb[i28];
            long j16 = bArr[i29];
            long j17 = jArrCopyOf[i28];
            bArr[i29] = (byte) (j16 | (j17 & 255));
            bArr[i29 + 1] = (byte) (bArr[r5] | ((j17 >> 8) & 255));
            bArr[i29 + 2] = (byte) (bArr[r5] | ((j17 >> 16) & 255));
            bArr[i29 + 3] = (byte) (bArr[r4] | ((j17 >> 24) & 255));
        }
        return bArr;
    }
}
