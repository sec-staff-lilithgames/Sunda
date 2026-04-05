package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: assets/audience_network.dex */
public final class XS implements ThreadFactory {
    public static byte[] A02;
    public final AtomicLong A01 = new AtomicLong();
    public int A00 = Thread.currentThread().getPriority();

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{25, 21, 23, 84, 28, 27, 25, 31, 24, 21, 21, 17, 84, 27, 30, 9, 90, 14, 18, 8, 31, 27, 30, 87, 95, 30, 90, 95, 14, 60, 90, 95, 70, 14, 46, 5, 25, 3, 20, 16, 21, 2, 46, 18, 30, 4, 31, 5, 20, 3, 46, 2, 21, 26, 46, 23, 16, 18, 5, 30, 3, 8};
    }

    private final String A00() {
        return String.format(Locale.US, A01(0, 35, 38), Long.valueOf(this.A01.incrementAndGet()), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        T1.A00(A01(35, 27, 45));
        Thread thread = new Thread(null, runnable, A00(), 0L);
        thread.setPriority(this.A00);
        return thread;
    }
}
