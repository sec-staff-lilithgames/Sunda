package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.46, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass46 {
    public static byte[] A00;
    public static String[] A01 = {"xemy17oJESjX", "rPO8UlQzVoplqsv241x2vKH9ITvvG5RO", "lwnNPX4PInl", "3ZJzEwR8uVRMBQC0tqntIJ86zVyjP6", "EDwbiEJ5SEYx8yR18WYzWyNJdlpGFaeE", "Kr1YCqNPaz9XeY6", "vkRdwAWmOCKEbB6zjyqD0a8RWRR8tEwK", "9fnayNKVpPH2aeCe0iQJlqHqzIFqpYut"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {74, 86, 83, 86, 89, 20, 89, 72, 85, 78, 76, 11, 23, 20, 23, 26, -43, 27, 28, 9, 22, 12, 9, 26, 12, -22, -10, -13, -10, -7, -76, -5, -7, -24, -11, -6, -19, -20, -7, -29, -13, -28, -83, 85, 81, 95, 26, 96, 97, 78, 97, 86, 80, 26, 86, 91, 83, 92};
        if (A01[1].charAt(12) != 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "2QjkwbE64yFQhHjtiWmGMRmbrZEFKpMO";
        strArr[0] = "Fg5M50njpCut";
        A00 = bArr;
    }

    static {
        A01();
    }

    public static void A02(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            A04(mediaFormat, A00(25, 14, 23), colorInfo.A03);
            A04(mediaFormat, A00(11, 14, 56), colorInfo.A02);
            A04(mediaFormat, A00(0, 11, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), colorInfo.A01);
            A05(mediaFormat, A00(43, 15, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), colorInfo.A04);
        }
    }

    public static void A03(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void A04(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void A05(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(android.media.MediaFormat r5, java.util.List<byte[]> r6) {
        /*
            r4 = 0
        L1:
            int r0 = r6.size()
            if (r4 >= r0) goto L31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 39
            r1 = 4
            r0 = 16
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = r0.toString()
            java.lang.Object r0 = r6.get(r4)
            byte[] r0 = (byte[]) r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r5.setByteBuffer(r1, r0)
            int r4 = r4 + 1
            goto L1
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass46.A06(android.media.MediaFormat, java.util.List):void");
    }
}
