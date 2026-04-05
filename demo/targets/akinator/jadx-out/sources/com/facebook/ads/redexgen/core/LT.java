package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum LT {
    A0D(A00(191, 5, 106)),
    A0B(A00(178, 5, 95)),
    A04(A00(109, 8, 91)),
    A0C(A00(183, 8, 25)),
    A08(A00(150, 10, 89)),
    A0A(A00(169, 9, 102)),
    A09(A00(160, 9, 13)),
    A05(A00(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 7, 40)),
    A06(A00(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 13, 36)),
    A07(A00(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 13, 39)),
    A0E(A00(196, 22, 1));

    public static byte[] A01;
    public static String[] A02 = {"oCsQT6uSz7ndvPMuhNCnHwcy1cykmRIP", "dxQgW1fHfG7Li9QwjA", "TlDnXloLJlBDv", "qrnaS13DqrzNxoM4SqOtGSj6SkXXKDQP", "QLSlnpUZPESqj81ZgNRIADff9IPI", "BL2v8T5j9auQgeZuOiJA3Si6ird26Og", "iKYEyte3TNWgl6dOfYC56N4OH", "66RXzOK8gCySKfU5jrDKZ2dh9bBiLsuP"};
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-55, -57, -40, -43, -37, -39, -53, -46, -42, -37, -44, -36, -31, -40, -41, 26, 31, 24, 32, 37, 28, 27, 54, 32, 36, 24, 30, 28, -55, -50, -57, -49, -44, -53, -54, -27, -36, -49, -54, -53, -43, 25, 40, 33, 52, 29, 46, 23, 39, 30, 25, -8, 7, 0, 19, -3, 1, -11, -5, -7, 32, 47, 40, 59, 50, 37, 32, 33, 43, 24, 28, 16, 22, 20, -49, -53, -64, -40, -64, -63, -53, -60, -65, -78, -83, -82, -72, 32, 19, 14, 15, 25, 41, 22, 15, 11, 14, 19, 24, 17, 41, 26, 22, 11, 35, 11, 12, 22, 15, 27, 25, 42, 39, 45, 43, 29, 36, -24, -19, -26, -18, -13, -22, -23, -28, -23, -30, -22, -17, -26, -27, -32, -22, -18, -30, -24, -26, -25, -20, -27, -19, -14, -23, -24, -29, -6, -19, -24, -23, -13, 26, 41, 34, 21, 30, 47, 24, 40, 31, 26, -50, -35, -42, -55, -45, -41, -53, -47, -49, 39, 54, 47, 34, 57, 44, 39, 40, 50, 37, 41, 29, 35, 33, -26, -30, -41, -17, -41, -40, -30, -37, 61, 48, 43, 44, 54, -44, -57, -62, -61, -51, -67, -54, -61, -65, -62, -57, -52, -59, -67, -50, -54, -65, -41, -65, -64, -54, -61};
    }

    static {
        A01();
    }

    LT(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static LT[] valuesCustom() throws CloneNotSupportedException {
        Object objClone = values().clone();
        String[] strArr = A02;
        if (strArr[7].charAt(31) != strArr[3].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "ymHT22Zq8hAPwyebTDebaq4ICrnV1cmD";
        strArr2[2] = "0dMwzo5EpOMJA";
        return (LT[]) objClone;
    }
}
