package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class XU implements Executor {
    public static int A03;
    public static byte[] A04;
    public static String[] A05 = {"uvnoFswQgKsjzwr3iqz20P0mNxal25YN", "BOK6fyYRMOy6Lb8Z6odzTUAxqzIsXRll", "1GcjrCMpoDxZbcTJPp4flsza35E3FHOH", "Q8EknHhwhDHlUg6ZVkO6XJARQOBsEo9A", "lKrFFJxvaHBIh9KU9RDmbthSOvdNTSOe", "dITSoTCgaqh40J1PXoqJ1l8mYaM7YSf3", "Zpgmgw2PULMIQ945sgsvBOXkpNFyy2RR", "22uUhJ3etkiChBnOXQGZ31CB4WVKfXWA"};
    public static final Executor A06;
    public static final Executor A07;
    public static final Executor A08;
    public static final Executor A09;
    public static final ExecutorService A0A;
    public static final ExecutorService A0B;
    public static final ExecutorService A0C;
    public static final AtomicBoolean A0D;
    public static final AtomicBoolean A0E;
    public Executor A00;
    public ThreadPoolExecutor A01;
    public final int A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 100);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{101, 119, 125, 106, 103, 43, 45, 61, 54, 39, 36, 60, 33, 56, 23, 45, 62, 33, 100, 121, 100, 18, 39, 53, 45, 53, 102, 55, 51, 35, 51, 35, 102, 50, 41, 41, 102, 42, 41, 40, 33, 104, 33, 35, 40, 35, 52, 47, 37};
    }

    static {
        A04();
        A08 = new XU(A00(7, 7, 23), 0);
        A06 = new XU(A00(0, 5, 64), 0);
        A07 = new XU(A00(5, 2, 11), 0);
        A03 = 32;
        A0C = Executors.newSingleThreadExecutor();
        A0B = Executors.newFixedThreadPool(5);
        A0D = new AtomicBoolean();
        A0E = new AtomicBoolean();
        A0A = Executors.newCachedThreadPool(new XS());
        A09 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public XU(String str, int i10) {
        this.A02 = i10;
        int CPU_COUNT = Runtime.getRuntime().availableProcessors();
        this.A01 = new ThreadPoolExecutor(Math.max(2, Math.min(CPU_COUNT - 1, 4)), (CPU_COUNT * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new XT(this, str));
        this.A01.allowCoreThreadTimeOut(true);
    }

    public static Executor A01() {
        if (A0E.get()) {
            return A0A;
        }
        return A09;
    }

    public static ExecutorService A02() {
        if (A0D.get()) {
            return A0A;
        }
        ExecutorService executorService = A0B;
        String[] strArr = A05;
        if (strArr[1].charAt(22) != strArr[3].charAt(22)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "6q4tM5jAmY0PAOAy6HwEMe1sj0cj7zQz";
        strArr2[6] = "MhPmFJnLh57p7LL9USZoyjfqJ71dPdnV";
        return executorService;
    }

    public static ExecutorService A03() {
        AtomicBoolean atomicBoolean = A0D;
        String[] strArr = A05;
        if (strArr[7].charAt(15) == strArr[6].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "2Tn7AiJzESRcQwDw62aH6aDmKpqluSmQ";
        strArr2[6] = "4SjpGfk5gALOkzJ9eVK78zFrDbXv3S0x";
        if (atomicBoolean.get()) {
            return A0A;
        }
        return A0C;
    }

    public static void A05(Context context) {
        A0D.set(U7.A2k(context));
        A0E.set(U7.A2j(context));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.A00 == null && Looper.myLooper() == Looper.getMainLooper()) {
            this.A00 = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        if ((this.A00 instanceof ThreadPoolExecutor) && ((ThreadPoolExecutor) this.A00).getQueue().size() < this.A02) {
            this.A00.execute(runnable);
            return;
        }
        int size = this.A01.getQueue().size();
        synchronized (XU.class) {
            int i10 = A03;
            int reservedExecutorQueueSize = A03;
            if (size == reservedExecutorQueueSize) {
                int reservedExecutorQueueSize2 = A03;
                A03 = reservedExecutorQueueSize2 * 2;
                C1911cu c1911cuA00 = SP.A00();
                if (c1911cuA00 != null) {
                    c1911cuA00.A08().AAy(A00(42, 7, 34), AbstractC1550Sv.A1d, new C1551Sw(A00(21, 21, 34), A00(14, 7, 32) + i10));
                }
            }
        }
        this.A01.execute(runnable);
    }
}
