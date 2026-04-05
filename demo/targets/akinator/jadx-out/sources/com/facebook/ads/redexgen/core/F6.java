package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.ads.androidx.media3.exoplayer.video.DummySurface;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class F6 extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"6kuie4aYgPB75l0BZDCG97Ci8L2oTJru", "l6cPtwgabkjuGz5CGYDwVz25JELI4cH1", "ZWx6OKWQHSAUUpB5i", "EzrPiu1XHV7NearbxEmg0OLwBftw8IiR", "WDaMG3q3woavC04Kn8C74ndkvxFOsuJP", "mphQp1xRvmcoCppqdKDkA9aBwN9eJkVD", "Bip3dWfDJBluF0z6EYAQ2tUBnuWGs1iH", "Qe"};
    public Handler A00;
    public RunnableC09043e A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            String[] strArr = A06;
            if (strArr[6].charAt(1) == strArr[4].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "ZYchz1gCfuPSGZN7lZw97cRKorp74rZl";
            strArr2[4] = "DndbQji8K3ZDCB5sBvfJw1HHxvL19lCS";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{13, 60, 36, 36, 48, 26, 60, 59, 47, 40, 42, 44, 58, 29, 21, 16, 25, 24, 92, 8, 19, 92, 21, 18, 21, 8, 21, 29, 16, 21, 6, 25, 92, 24, 9, 17, 17, 5, 92, 15, 9, 14, 26, 29, 31, 25, 94, 121, 113, 116, 125, 124, 56, 108, 119, 56, 106, 125, 116, 125, 121, 107, 125, 56, 124, 109, 117, 117, 97, 56, 107, 109, 106, 126, 121, 123, 125, 49, 32, 56, 56, 44, 6, 32, 39, 51, 52, 54, 48};
    }

    static {
        A02();
    }

    public F6() {
        super(A00(77, 12, 62));
    }

    private void A01() {
        C3M.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i10) {
        C3M.A01(this.A01);
        this.A01.A09(i10);
        this.A02 = new DummySurface(this, this.A01.A07(), i10 != 0);
    }

    public final DummySurface A04(int i10) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new RunnableC09043e(this.A00);
        boolean z10 = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i10, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (this.A04 == null) {
            if (this.A03 == null) {
                return (DummySurface) C3M.A01(this.A02);
            }
            throw this.A03;
        }
        throw this.A04;
    }

    public final void A05() {
        C3M.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            int r0 = r7.what
            r5 = 1
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L7;
                default: goto L6;
            }
        L6:
            return r5
        L7:
            r6.A01()     // Catch: java.lang.Throwable -> Lb
            goto L22
        Lb:
            r4 = move-exception
            r2 = 0
            r1 = 12
            r0 = 34
            java.lang.String r1 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> L26
            r3 = 46
            r2 = 31
            r0 = 115(0x73, float:1.61E-43)
            java.lang.String r0 = A00(r3, r2, r0)     // Catch: java.lang.Throwable -> L26
            com.facebook.ads.redexgen.core.AnonymousClass44.A08(r1, r0, r4)     // Catch: java.lang.Throwable -> L26
        L22:
            r6.quit()
            return r5
        L26:
            r0 = move-exception
            r6.quit()
            throw r0
        L2b:
            int r0 = r7.arg1     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L5b java.lang.Throwable -> L7d
            r6.A03(r0)     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L5b java.lang.Throwable -> L7d
            monitor-enter(r6)
            r6.notify()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L36
            goto L79
        L36:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L36
            throw r0
        L39:
            r4 = move-exception
            r2 = 0
            r1 = 12
            r0 = 34
            java.lang.String r1 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> L7d
            r3 = 12
            r2 = 34
            r0 = 23
            java.lang.String r0 = A00(r3, r2, r0)     // Catch: java.lang.Throwable -> L7d
            com.facebook.ads.redexgen.core.AnonymousClass44.A08(r1, r0, r4)     // Catch: java.lang.Throwable -> L7d
            r6.A03 = r4     // Catch: java.lang.Throwable -> L7d
            monitor-enter(r6)
            r6.notify()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L58
            goto L79
        L58:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L58
            throw r0
        L5b:
            r4 = move-exception
            r2 = 0
            r1 = 12
            r0 = 34
            java.lang.String r1 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> L7d
            r3 = 12
            r2 = 34
            r0 = 23
            java.lang.String r0 = A00(r3, r2, r0)     // Catch: java.lang.Throwable -> L7d
            com.facebook.ads.redexgen.core.AnonymousClass44.A08(r1, r0, r4)     // Catch: java.lang.Throwable -> L7d
            r6.A04 = r4     // Catch: java.lang.Throwable -> L7d
            monitor-enter(r6)
            r6.notify()     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
        L79:
            return r5
        L7a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
            throw r0
        L7d:
            r0 = move-exception
            monitor-enter(r6)
            r6.notify()     // Catch: java.lang.Throwable -> L84
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L84
            throw r0
        L84:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L84
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.F6.handleMessage(android.os.Message):boolean");
    }
}
