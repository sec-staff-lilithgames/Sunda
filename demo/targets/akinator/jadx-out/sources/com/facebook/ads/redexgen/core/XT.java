package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: assets/audience_network.dex */
public class XT implements ThreadFactory {
    public static byte[] A03;
    public final AtomicInteger A00 = new AtomicInteger(1);
    public final /* synthetic */ XU A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{121, 116, -127, 109, 88, -90, 83, 86, 88, -105, -111, -123, -113, -126, 126, -127, -112, 124, -128, -116, -110, -117, -111, -126, -113, 124, -112, -123, -116, -113, -111, 124, -111, 126, -112, -120, 124, -126, -107, -126, -128, -110, -111, -116, -113};
    }

    public XT(XU xu2, String str) {
        this.A01 = xu2;
        this.A02 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        T1.A00(A00(10, 35, 22));
        return new Thread(runnable, String.format(Locale.US, A00(0, 10, 44), this.A02, Integer.valueOf(this.A00.getAndIncrement())));
    }
}
