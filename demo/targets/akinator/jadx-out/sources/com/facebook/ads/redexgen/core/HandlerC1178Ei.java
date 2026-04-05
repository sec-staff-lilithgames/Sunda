package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.redexgen.core.InterfaceC1179Ej;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ei, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class HandlerC1178Ei<T extends InterfaceC1179Ej> extends Handler implements Runnable {
    public static byte[] A0C;
    public static String[] A0D = {"YmYVw2S8DUZhSIJBKV9mYTBB1tKcIZso", "NDdcnO0NsMMFHF2bezmvYcIUkVZ5OtU8", "8rmJYKaybwW0Gr1XfrD6wU0k3D4t0vPA", "YmCBBtrMVj6S7IBVYd0tuHNRqLOHp", "BNlgZVMbySVAlN8KpxiSIEQEMbKarpeH", "QLj0CyLyWcLoHh5we5tUZrDrecYjAsKC", "eBbXtTNPiPKoehNQThYFNgHDUWIcJfTE", "1Eh"};
    public boolean A00;
    public int A01;
    public InterfaceC1176Eg<T> A02;
    public C1177Eh A03;
    public IOException A04;
    public Thread A05;
    public boolean A06;
    public final int A07;
    public final long A08;
    public final T A09;
    public volatile boolean A0A;
    public final /* synthetic */ C2417lc A0B;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Customized to support load retries")
    private void A02() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.A02.AE3(this.A09, jElapsedRealtime, jElapsedRealtime - this.A08, this.A01);
        this.A04 = null;
        this.A0B.A02.execute((Runnable) C3M.A01(this.A0B.A00));
    }

    public static void A04() {
        A0C = new byte[]{-122, -87, -101, -98, -114, -101, -83, -91, -99, -61, -62, -99, -76, -101, -77, -69, -67, -64, -57, 110, -77, -64, -64, -67, -64, 110, -70, -67, -81, -78, -73, -68, -75, 110, -63, -62, -64, -77, -81, -69, -28, -3, -12, 7, -1, -12, -14, 3, -12, -13, -81, -12, 1, 1, -2, 1, -81, -5, -2, -16, -13, -8, -3, -10, -81, 2, 3, 1, -12, -16, -4, 5, 30, 21, 40, 32, 21, 19, 36, 21, 20, -48, 21, 40, 19, 21, 32, 36, 25, 31, 30, -48, 24, 17, 30, 20, 28, 25, 30, 23, -48, 28, 31, 17, 20, -48, 19, 31, 29, 32, 28, 21, 36, 21, 20, -63, -38, -47, -28, -36, -47, -49, -32, -47, -48, -116, -47, -28, -49, -47, -36, -32, -43, -37, -38, -116, -40, -37, -51, -48, -43, -38, -45, -116, -33, -32, -34, -47, -51, -39, 25, 28, 14, 17, -25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    @MetaExoPlayerCustomization("enableContinueLoadingLogging and currentLoadErrorAction saving are custom")
    public final void handleMessage(Message message) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        String[] strArr = A0D;
        if (strArr[3].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0D[6] = "QgUPNZuYIqR5G6UUc33KVEWLFVIzbhR6";
        try {
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
        if (this.A0A) {
            return;
        }
        if (message.what == 0) {
            A02();
            this.A00 = false;
            return;
        }
        if (message.what == 3) {
            throw ((Error) message.obj);
        }
        A03();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.A08;
        InterfaceC1176Eg interfaceC1176Eg = (InterfaceC1176Eg) C3M.A01(this.A02);
        if (this.A06) {
            interfaceC1176Eg.ADx(this.A09, jElapsedRealtime, j10, false);
            return;
        }
        switch (message.what) {
            case 1:
                try {
                    interfaceC1176Eg.ADz(this.A09, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    AnonymousClass44.A08(A01(0, 8, 0), A01(71, 44, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), e10);
                    this.A0B.A01 = new C1183En(e10);
                    return;
                }
            case 2:
                this.A04 = (IOException) message.obj;
                this.A01++;
                C1177Eh c1177EhAE0 = interfaceC1176Eg.AE0(this.A09, jElapsedRealtime, j10, this.A04, this.A01);
                this.A03 = c1177EhAE0;
                if (c1177EhAE0.A00 == 3) {
                    this.A0B.A01 = this.A04;
                    return;
                } else {
                    if (c1177EhAE0.A00 != 2) {
                        if (c1177EhAE0.A00 == 1) {
                            this.A01 = 1;
                        }
                        this.A00 = true;
                        A06(c1177EhAE0.A01 != C.TIME_UNSET ? c1177EhAE0.A01 : A00());
                        return;
                    }
                    return;
                }
            default:
                return;
        }
        AbstractC1616Vl.A00(th2, this);
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eg != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Ej> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    public HandlerC1178Ei(C2417lc c2417lc, Looper looper, T loadable, InterfaceC1176Eg<T> interfaceC1176Eg, int i10, long j10) {
        super(looper);
        this.A0B = c2417lc;
        this.A09 = loadable;
        this.A02 = interfaceC1176Eg;
        this.A07 = i10;
        this.A08 = j10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    @MetaExoPlayerCustomization("D36993743 Customized Hero Retry Delay Values")
    private long A00() {
        return AbstractC2191hY.A00(this.A01, 0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    private void A03() {
        this.A0B.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    public final void A05(int i10) throws IOException {
        if (this.A04 == null || this.A01 <= i10) {
        } else {
            throw this.A04;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    public final void A06(long j10) {
        C3M.A08(this.A0B.A00 == null);
        this.A0B.A00 = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    public final void A07(boolean z10) {
        this.A0A = z10;
        this.A04 = null;
        if (hasMessages(0)) {
            this.A06 = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.A06 = true;
                this.A09.A4j();
                Thread thread = this.A05;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            A03();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((InterfaceC1176Eg) C3M.A01(this.A02)).ADx(this.A09, jElapsedRealtime, jElapsedRealtime - this.A08, true);
            this.A02 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z10;
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        synchronized (this) {
                            z10 = !this.A06;
                            this.A05 = Thread.currentThread();
                        }
                        if (z10) {
                            C4S.A02(A01(150, 5, 115) + this.A09.getClass().getSimpleName());
                            try {
                                this.A09.AAi();
                            } finally {
                                C4S.A00();
                            }
                        }
                        synchronized (this) {
                            this.A05 = null;
                            Thread.interrupted();
                        }
                        if (!this.A0A) {
                            sendEmptyMessage(1);
                        }
                    } catch (Throwable th2) {
                        AbstractC1616Vl.A00(th2, this);
                    }
                } catch (Error e10) {
                    if (!this.A0A) {
                        AnonymousClass44.A08(A01(0, 8, 0), A01(40, 31, 85), e10);
                        obtainMessage(3, e10).sendToTarget();
                    }
                    throw e10;
                }
            } catch (Exception e11) {
                if (!this.A0A) {
                    AnonymousClass44.A08(A01(0, 8, 0), A01(115, 35, 50), e11);
                    obtainMessage(2, new C1183En(e11)).sendToTarget();
                }
            }
        } catch (IOException e12) {
            if (!this.A0A) {
                obtainMessage(2, e12).sendToTarget();
            }
        } catch (OutOfMemoryError e13) {
            if (!this.A0A) {
                AnonymousClass44.A08(A01(0, 8, 0), A01(8, 32, 20), e13);
                obtainMessage(2, new C1183En(e13)).sendToTarget();
            }
        }
    }
}
