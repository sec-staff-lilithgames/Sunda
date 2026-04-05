package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.c8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1863c8 implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"CXh9IgKc", "O7eitgLXwuQabaJwawISN5vHvLm6eCHh", "CD1jo8Ha", "FPDId41ZEfoYhMJr4YCyxsIaRA1sy82M", "v53i6y7e6", "iQAdLEQn", "ZcZ8pescI", "Z1kdPveD"};
    public final /* synthetic */ C09414p A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 77, 72, 73, 83, 52, 80, 69, 93, 70, 69, 71, 79, 41, 86, 86, 83, 86};
    }

    static {
        A01();
    }

    public RunnableC1863c8(C09414p c09414p) {
        this.A00 = c09414p;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0M.AFg(A00(0, 18, 126));
        } catch (Throwable th2) {
            String[] strArr = A02;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "CbmYJDHc";
            strArr2[5] = "9BNL1g6R";
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
