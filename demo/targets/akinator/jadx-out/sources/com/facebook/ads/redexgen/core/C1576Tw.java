package com.facebook.ads.redexgen.core;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1576Tw {
    public static byte[] A04;
    public static String[] A05 = {"EPfM4EfRxbpEP9gtrDRMlskxYfXi3EIy", "2RTdQxHpZZ8AiQDKhWe0eMGOKfA6zgcU", "emglrqM7KcB96xrWPAlCT1HSFCX", "BYlHqNK3eo406tIlZNUH5uGyHKGLxPsS", "SGf6K716h04aYOies8bsBexpWYiEkey6", "TSOJfYWCxzAl33AyQiIcTNEFCW2LweGK", "8CMs5hd6IV548hO09SYKxFdjcmyhV", "SdeZw3a81E33UQl"};
    public int A00;
    public long A01;
    public final RandomAccessFile A02;
    public final long[] A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1576Tw A04(File file) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(TTAdConstant.PACKAGE_NAME_CODE, 3, 33));
            if (file.length() < A00()) {
                throw new IOException(String.format(Locale.US, A05(50, 27, 97), Long.valueOf(file.length()), Long.valueOf(A00())));
            }
            long j10 = randomAccessFile.readLong();
            if (j10 != -360011992771067903L) {
                throw new IOException(String.format(Locale.US, A05(180, 27, 45), Long.valueOf(j10), -360011992771067903L));
            }
            long j11 = randomAccessFile.readLong();
            if (A05[4].charAt(13) != 'O') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "qh47im7POLSb1uwOXceGvb4YvfCz05wk";
            strArr[1] = "3iy4rWBQ3YjawiJr5gwpSuoHtfNura2H";
            if (j11 < 0 || j11 > 100000) {
                throw new IOException(String.format(Locale.US, A05(77, 40, 27), Long.valueOf(j11)));
            }
            if (randomAccessFile.length() < A02((int) j11)) {
                throw new IOException(String.format(Locale.US, A05(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 63, 56), Long.valueOf(j11), Long.valueOf(file.length())));
            }
            long[] jArr = new long[(int) j11];
            for (int i10 = 0; i10 < jArr.length; i10++) {
                jArr[i10] = randomAccessFile.readLong();
            }
            return new C1576Tw(randomAccessFile, jArr, randomAccessFile.length());
        } catch (IOException unused) {
            if (0 != 0) {
                A07(null);
            }
            throw new IOException(String.format(Locale.US, A05(26, 24, 114), file.getCanonicalPath()));
        }
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{-106, -79, -71, -68, -75, -76, 112, -60, -65, 112, -77, -62, -75, -79, -60, -75, 112, -74, -71, -68, -75, 112, 119, 117, -61, 119, -52, -25, -17, -14, -21, -22, -90, -6, -11, -90, -11, -10, -21, -12, -90, -20, -17, -14, -21, -90, -83, -85, -7, -83, -69, -34, -31, -38, -107, -102, -39, -107, -41, -18, -23, -38, -24, -95, -107, -31, -38, -24, -24, -107, -23, -35, -42, -29, -107, -102, -39, 117, -104, -101, -108, 79, -109, -108, -110, -101, -112, -95, -108, -94, 79, -112, 79, -93, -98, -93, -112, -101, 79, -98, -107, 79, 84, -109, 79, -95, -108, -110, -98, -95, -109, 79, -94, -101, -98, -93, -94, -110, -75, -72, -79, 108, -80, -79, -81, -72, -83, -66, -79, -65, 108, -83, 108, -64, -69, -64, -83, -72, 108, -69, -78, 108, 113, -80, 108, -66, -79, -81, -69, -66, -80, 108, -65, -72, -69, -64, -65, 120, 108, -82, -63, -64, 108, -69, -70, -72, -59, 108, -76, -83, -65, 108, 113, -80, 108, -82, -59, -64, -79, -65, -121, -86, -83, -90, 97, -82, -94, -88, -86, -92, 97, 102, -91, 97, -86, -81, -76, -75, -90, -94, -91, 97, -80, -89, 97, 102, -91, -78, -59, -61, -49, -46, -60, -128, -123, -60, -128, -49, -58, -58, -45, -59, -44, -128, -55, -45, -128, -123, -60, -116, -128, -62, -43, -44, -128, -46, -59, -61, -49, -46, -60, -128, -123, -60, -128, -49, -58, -58, -45, -59, -44, -128, -55, -45, -128, -123, -60, -97, -78, -80, -68, -65, -79, 109, 114, -79, 109, -68, -77, -77, -64, -78, -63, 109, -64, -75, -68, -62, -71, -79, 109, -81, -78, 109, 125, 109, -81, -78, -80, -82, -62, -64, -78, 109, -65, -78, -80, -68, -65, -79, 109, -80, -68, -62, -69, -63, 109, -74, -64, 109, 114, -79, 121, 109, -81, -62, -63, 109, -74, -64, 109, 114, -79, -37, -18, -20, -8, -5, -19, -87, -82, -19, -87, -4, -3, -22, -5, -3, -4, -87, -22, -3, -87, -8, -17, -17, -4, -18, -3, -87, -82, -19, -75, -87, -21, -2, -3, -87, -17, -14, -11, -18, -87, -4, -14, 3, -18, -87, -14, -4, -87, -82, -19, -63, -44, -46, -34, -31, -45, -113, -97, -113, -34, -43, -43, -30, -44, -29, -113, -44, -25, -33, -44, -46, -29, -44, -45, -113, -48, -29, -113, -108, -45, -113, -47, -28, -29, -113, -40, -30, -113, -48, -29, -113, -108, -45, -89, -84, -88};
    }

    static {
        A06();
    }

    public C1576Tw(RandomAccessFile randomAccessFile, long[] jArr, long j10) throws IOException {
        this.A02 = randomAccessFile;
        this.A03 = jArr;
        this.A01 = j10;
        for (int i10 = 0; i10 < jArr.length && jArr[i10] != 0; i10++) {
            this.A00++;
        }
        if (this.A00 > 0) {
            long jA01 = A01();
            if (jArr[0] != jA01) {
                throw new IOException(String.format(Locale.US, A05(373, 43, 91), Long.valueOf(jA01), Long.valueOf(jArr[0])));
            }
        }
        for (int i11 = this.A00; i11 < jArr.length; i11++) {
            if (jArr[i11] != 0) {
                throw new IOException(String.format(Locale.US, A05(257, 66, 57), Integer.valueOf(i11), Integer.valueOf(this.A00), Long.valueOf(jArr[i11])));
            }
        }
        for (int i12 = 1; i12 < this.A00; i12++) {
            if (jArr[i12 - 1] > jArr[i12]) {
                throw new IOException(String.format(Locale.US, A05(207, 50, 76), Integer.valueOf(i12 - 1), Long.valueOf(jArr[i12 - 1]), Integer.valueOf(i12), Long.valueOf(jArr[i12])));
            }
        }
        if (this.A00 > 0 && jArr[this.A00 - 1] > j10) {
            throw new IOException(String.format(Locale.US, A05(323, 50, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), Integer.valueOf(this.A00 - 1), Long.valueOf(jArr[this.A00 - 1]), Long.valueOf(j10)));
        }
    }

    public static long A00() {
        return 16L;
    }

    private final long A01() {
        return A00() + (this.A03.length * 8);
    }

    public static long A02(int i10) {
        return A00() + (i10 * 8);
    }

    public static C1576Tw A03(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(TTAdConstant.PACKAGE_NAME_CODE, 3, 33));
        try {
            randomAccessFile.writeLong(-360011992771067903L);
            randomAccessFile.writeLong(C1577Tx.A03);
            randomAccessFile.write(new byte[C1577Tx.A03 * 8]);
            randomAccessFile.getFD().sync();
            return new C1576Tw(randomAccessFile, new long[C1577Tx.A03], randomAccessFile.length());
        } catch (IOException unused) {
            A07(randomAccessFile);
            throw new IOException(String.format(Locale.US, A05(0, 26, 60), file.getCanonicalPath()));
        }
    }

    public static void A07(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }
}
