package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class GB {
    public static byte[] A00;
    public static String[] A01 = {"jnpQs", "68vQr4mYnLI0oxp3WZBPcyc6w04l8sdO", "1OtBqA6VhuQLpqBNtIteBoMpw2BUtlZT", "iBOJpCpDP8DiwQrVeW3OV9Em66L9h1f8", "Xaj0HtPMuTBdCp8NFbjtiHIpdpZCFdAK", "i4DAEtymK6yFJNiO2QALezQZgNrDh5qR", "4Bsy9O0lknqqP9xR2TNdH0U1zi1weR0A", "FgP5ewPOxCae6ADOyhugLxvte5BfjSLb"};
    public static final int[] A02;
    public static final int[] A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-10, -10, -8, -43, 29, 26, 22, 25, 26, 39, -43, 30, 35, 40, 42, 27, 27, 30, 24, 30, 26, 35, 41, -43, 25, 22, 41, 22, -13, -13, -11, -46, 26, 23, 19, 22, 23, 36, -46, 41, 36, 33, 32, 25, -46, 5, 19, 31, 34, 30, 27, 32, 25, -46, -8, 36, 23, 35, 39, 23, 32, 21, 43, -46, -5, 32, 22, 23, 42, 5, 37, 39, 25, 56, 45, 48, 16, 41, 32, 51, 43, 32, 30, 47, 32, 31, -37, 33, 45, 28, 40, 32, 7, 32, 41, 34, 47, 35, 1, 39, 28, 34, -37, -8, -37, -20, -8, 17, 22, 24, 19, 19, 18, 21, 23, 8, 7, -61, 4, 24, 7, 12, 18, -61, 18, 5, 13, 8, 6, 23, -61, 23, 28, 19, 8, -35, -61, 68, 93, 98, 100, 95, 95, 94, 97, 99, 84, 83, 15, 84, 95, 50, 94, 93, 85, 88, 86, 41, 15, -19, -16, -76, -31, -82, -76, -80, -82};
    }

    static {
        A05();
        A03 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A02 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C4I c4i) {
        int iA04 = c4i.A04(5);
        if (iA04 == 31) {
            int audioObjectType = c4i.A04(6);
            return audioObjectType + 32;
        }
        return iA04;
    }

    public static int A01(C4I c4i) throws C08822i {
        int iA04 = c4i.A04(4);
        if (iA04 == 15) {
            int iA01 = c4i.A01();
            if (A01[0].length() != 5) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "q0W1UZuAU1h4xSNvnmv6o4fLVDdZ81si";
            strArr[4] = "TmcMI11py7mWue9QV51Oyh4sKPsH3Jhr";
            if (iA01 >= 24) {
                int frequencyIndex = c4i.A04(24);
                return frequencyIndex;
            }
            throw C08822i.A01(A04(0, 28, 60), null);
        }
        if (iA04 < 13) {
            int frequencyIndex2 = A03[iA04];
            return frequencyIndex2;
        }
        throw C08822i.A01(A04(28, 41, 57), null);
    }

    public static GA A02(C4I c4i, boolean z10) throws C08822i {
        int iA00 = A00(c4i);
        int iA01 = A01(c4i);
        int iA04 = c4i.A04(4);
        String str = A04(159, 8, 7) + iA00;
        if (iA00 == 5 || iA00 == 29) {
            iA01 = A01(c4i);
            iA00 = A00(c4i);
            if (iA00 == 22) {
                iA04 = c4i.A04(4);
            }
        }
        if (z10) {
            switch (iA00) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    A06(c4i, iA00, iA04);
                    int sampleRateHz = A01[0].length();
                    if (sampleRateHz == 5) {
                        String[] strArr = A01;
                        strArr[6] = "3cbQZ4WWsbXwvX2zvxOiUlmwqxsyxREi";
                        strArr[3] = "nPAxNfqqgI9TB5NmScWQIj27S1nluV3e";
                        switch (iA00) {
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                int iA042 = c4i.A04(2);
                                if (iA042 == 2 || iA042 == 3) {
                                    throw C08822i.A00(A04(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 22, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE) + iA042);
                                }
                                break;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                case 5:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                default:
                    throw C08822i.A00(A04(106, 31, 42) + iA00);
            }
        }
        int channelCount = A02[iA04];
        if (channelCount != -1) {
            return new GA(iA01, channelCount, str);
        }
        throw C08822i.A01(null, null);
    }

    public static GA A03(byte[] bArr) throws C08822i {
        return A02(new C4I(bArr), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(com.facebook.ads.redexgen.core.C4I r4, int r5, int r6) {
        /*
            boolean r0 = r4.A0H()
            if (r0 == 0) goto L1c
            r2 = 69
            r1 = 7
            r0 = 75
            java.lang.String r3 = A04(r2, r1, r0)
            r2 = 76
            r1 = 30
            r0 = 66
            java.lang.String r0 = A04(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A07(r3, r0)
        L1c:
            boolean r0 = r4.A0H()
            if (r0 == 0) goto L42
            r3 = 14
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.GB.A01
            r0 = 5
            r1 = r1[r0]
            r0 = 15
            char r1 = r1.charAt(r0)
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L9a
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.GB.A01
            java.lang.String r1 = "v2arTuVBFpHRdd6zD5uQKVaL6J866891"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "F7KamgaQFU4osqLd0R7CHRmLJ4QhMqsw"
            r0 = 2
            r2[r0] = r1
            r4.A09(r3)
        L42:
            boolean r3 = r4.A0H()
            if (r6 == 0) goto L94
            r0 = 6
            r2 = 20
            r1 = 3
            if (r5 == r0) goto L50
            if (r5 != r2) goto L53
        L50:
            r4.A09(r1)
        L53:
            if (r3 == 0) goto L93
            r0 = 22
            if (r5 != r0) goto L5e
            r0 = 16
            r4.A09(r0)
        L5e:
            r0 = 17
            if (r5 == r0) goto L6c
            r0 = 19
            if (r5 == r0) goto L6c
            if (r5 == r2) goto L6c
            r0 = 23
            if (r5 != r0) goto L6f
        L6c:
            r4.A09(r1)
        L6f:
            r3 = 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.GB.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L9a
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.GB.A01
            java.lang.String r1 = "QrL8Tr8yy4gY8AXmFxmkTTkkR7JmfqMW"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "IjkFi7C6bNI16jdHGSbHtjLd4dsdDQNH"
            r0 = 3
            r2[r0] = r1
            r4.A09(r3)
        L93:
            return
        L94:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L9a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.GB.A06(com.facebook.ads.redexgen.X.4I, int, int):void");
    }

    public static byte[] A07(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL))};
    }
}
