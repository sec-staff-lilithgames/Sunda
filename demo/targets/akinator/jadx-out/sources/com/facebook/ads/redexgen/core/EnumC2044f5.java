package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.f5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2044f5 {
    A03,
    A04;

    public static byte[] A00;
    public static String[] A01 = {"xrpFqliwvTmrUeY9fA", "WQofXYOtPOfcZVcnLB6jDFevspEJYzJo", "xmcQ51qE3IL5CD3g", "vqfe6L9tI0UCZhHJZZILisyG0KCy4R", "fiUEN16u3MZCpDGCMqSf2x4N5Q5QlPxX", "5xn2ImkHS4ATQgLTDfLLcMPpUWGwzNh4", "NsPZM3725QIioQriGr2vh8z8GZ7DcYd3", "wIDfTgN4CVihAS6ZHyHagF8TJWsTJSVw"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[1].length() == 22) {
                throw new RuntimeException();
            }
            A01[1] = "aO5t2";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 98);
            String[] strArr = A01;
            if (strArr[0].length() != strArr[2].length()) {
                A01[3] = "tB3IEJBlHxhWtpYKuvAk87dclmwGEs";
                i13++;
            } else {
                i13++;
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{58, 53, 48, 60, 55, 45, 38, 54, 46, 55, 60, 61, 85, 67, 84, 80, 67, 84, 89, 73, 81, 72, 67, 66};
    }

    static {
        A01();
    }
}
