package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.google.common.math.ElementTypesAreNonnullByDefault;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.9D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C9D {
    public static int[] A00;
    public static byte[] A01;
    public static String[] A02 = {"xE1uVhGB69CiXPpHcJa10wbSlC3W3Pqt", "6IpI1YgYEWBIhrDPxczszndZYzSCWcQF", "bz", "MzPVaMVFsogiMWrn4KMw3MbbkZJMuH", "2ugKETTJdLvfYrUKb1TohGbXSYfe6n6C", "hmUXQG87xVCBxVGQbZ2KvW4kNx5lzwQm", "IXb1TBLYeY5D6VfxvuWbchUwU2o2Kpep", "MzSHxO025yCTKgxZvpDu7SYsFbhNKTLL"};
    public static final byte[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[0].charAt(20) != '0') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "Wzlt7pC9sZ6E4twls83s4vi3o8ZTUgJv";
            strArr[5] = "VyCJESJZLvIfYV7xXyp1DHPmX8SMlxdC";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 97);
            i13++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-46, -61, 5, 28, -61, 29, 8, 21, 18};
    }

    static {
        A02();
        A03 = new byte[]{9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
        A05 = new int[]{1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};
        A04 = new int[]{3, 31, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
        A06 = new int[]{1, 1, 2, 6, 24, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
        A00 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, C.DEFAULT_BUFFER_SEGMENT_SIZE, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(int r6, int r7, java.math.RoundingMode r8) {
        /*
            com.facebook.ads.redexgen.core.AbstractC2279jA.A04(r8)
            if (r7 == 0) goto L65
            int r5 = r6 / r7
            int r0 = r7 * r5
            int r4 = r6 - r0
            if (r4 != 0) goto Le
            return r5
        Le:
            r6 = r6 ^ r7
            int r3 = r6 >> 31
            r2 = 1
            r3 = r3 | r2
            int[] r1 = com.facebook.ads.redexgen.core.C09003a.A00
            int r0 = r8.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L59;
                case 2: goto L5e;
                case 3: goto L54;
                case 4: goto L52;
                case 5: goto L4d;
                case 6: goto L24;
                case 7: goto L24;
                case 8: goto L24;
                default: goto L1e;
            }
        L1e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L24:
            int r1 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r7)
            int r0 = r0 - r1
            int r1 = r1 - r0
            if (r1 != 0) goto L48
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            if (r8 == r0) goto L5f
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_EVEN
            if (r8 != r0) goto L44
            r1 = 1
        L39:
            r0 = r5 & 1
            if (r0 == 0) goto L42
            r0 = 1
        L3e:
            r1 = r1 & r0
            if (r1 == 0) goto L46
            goto L5f
        L42:
            r0 = 0
            goto L3e
        L44:
            r1 = 0
            goto L39
        L46:
            r2 = 0
            goto L5f
        L48:
            if (r1 <= 0) goto L4b
            goto L5f
        L4b:
            r2 = 0
            goto L5f
        L4d:
            if (r3 <= 0) goto L50
            goto L5f
        L50:
            r2 = 0
            goto L5f
        L52:
            r2 = 1
            goto L5f
        L54:
            if (r3 >= 0) goto L57
            goto L5f
        L57:
            r2 = 0
            goto L5f
        L59:
            if (r4 != 0) goto L63
        L5b:
            com.facebook.ads.redexgen.core.C0.A02(r2)
        L5e:
            r2 = 0
        L5f:
            if (r2 == 0) goto L62
            int r5 = r5 + r3
        L62:
            return r5
        L63:
            r2 = 0
            goto L5b
        L65:
            r2 = 0
            r1 = 9
            r0 = 66
            java.lang.String r1 = A01(r2, r1, r0)
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9D.A00(int, int, java.math.RoundingMode):int");
    }
}
