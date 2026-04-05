package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FX implements Choreographer.FrameCallback, Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"Ji4vVtod0Ep", "W5pwMDw99nCrpy5B8Iazhudwtzilx0sf", "l9PcuhV5rMDGvrbUwzG7Ad0pcijuAzEV", "FaS8ZCu9j", "WXQRpxbn1d9lZaxATvqBiewtSAO2HDxs", "C8Lc0W9XaE3EYGTHQvU7O2Sqynab", "ekEDpZpPHDqqTKsf7TQP9QgqpYa1Ma72", "eyWJ27kKq0QXLQpZZcF977maBzKu"};
    public static final FX A07;
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public volatile long A04 = C.TIME_UNSET;
    public final HandlerThread A03 = new HandlerThread(A01(0, 26, 52));

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{-109, -72, -65, -62, -75, -65, -73, -62, -79, -64, -72, -75, -62, -97, -57, -66, -75, -62, -118, -104, -79, -66, -76, -68, -75, -62};
        if (A06[0].length() == 21) {
            throw new RuntimeException();
        }
        A06[3] = "MvmtMBVRs";
    }

    static {
        A05();
        A07 = new FX();
    }

    public FX() {
        this.A03.start();
        this.A02 = AbstractC09264a.A0c(this.A03.getLooper(), this);
        this.A02.sendEmptyMessage(0);
    }

    public static FX A00() {
        return A07;
    }

    private void A02() {
        this.A00++;
        if (this.A00 == 1) {
            this.A01.postFrameCallback(this);
        }
    }

    private void A03() {
        this.A01 = Choreographer.getInstance();
    }

    private void A04() {
        this.A00--;
        if (this.A00 == 0) {
            this.A01.removeFrameCallback(this);
            this.A04 = C.TIME_UNSET;
        }
    }

    public final void A06() {
        this.A02.sendEmptyMessage(1);
    }

    public final void A07() {
        this.A02.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.A04 = j10;
        this.A01.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A03();
                break;
            case 1:
                A02();
                break;
            case 2:
                A04();
                break;
        }
        return true;
    }
}
