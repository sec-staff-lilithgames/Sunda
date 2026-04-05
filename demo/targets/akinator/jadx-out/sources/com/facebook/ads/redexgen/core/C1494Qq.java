package com.facebook.ads.redexgen.core;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1494Qq extends Thread {
    public static byte[] A07;
    public static final String A08;
    public final int A00;
    public final Handler A01;
    public final C1496Qs A02;
    public final C1937dL A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, 12, 96, 111, 115, 12, 101, 68, 85, 68, 66, 85, 78, 83, 10, 8, 3, 8, 31, 4, 14};
    }

    static {
        A02();
        A08 = C1494Qq.class.getName();
    }

    public C1494Qq(C1937dL c1937dL, C1496Qs c1496Qs) {
        this(c1937dL, c1496Qs, U7.A08(c1937dL));
    }

    public C1494Qq(C1937dL c1937dL, C1496Qs c1496Qs, int i10) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new RunnableC1493Qp(this);
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i10;
        this.A03 = c1937dL;
        this.A02 = c1496Qs;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            long j10 = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z10 = interval == 0;
                this.A05 = j10;
                if (z10) {
                    this.A01.post(this.A04);
                }
                try {
                    Thread.sleep(j10);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                        if (this.A02.A05()) {
                            this.A03.A08().AAy(A01(15, 7, 8), AbstractC1550Sv.A1D, new C1551Sw(this.A02.A04()));
                        }
                        this.A06 = true;
                    }
                } catch (InterruptedException unused) {
                    BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
