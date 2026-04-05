package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* loaded from: assets/audience_network.dex */
public class SE implements Callable<Boolean> {
    public static byte[] A02;
    public final SD A00;
    public final /* synthetic */ SF A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-35, -31, -43, -37, -39};
    }

    public SE(SF sf2, SD sd2) {
        this.A01 = sf2;
        this.A00 = sd2;
    }

    private final Boolean A00() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            C1346Kv c1346Kv = new C1346Kv(this.A00.A08, this.A00.A07, this.A00.A06, A01(0, 5, 114), this.A00.A02, this.A00.A03);
            c1346Kv.A01 = this.A00.A05;
            c1346Kv.A00 = this.A00.A04;
            if (SI.A06(this.A01.A04)) {
                SF.A0F.put(this.A00.A08, c1346Kv);
            }
            boolean precacheResult = false;
            if (this.A01.A08) {
                precacheResult = SF.A03(this.A01.A04.A02()).AHu(c1346Kv, false).A01();
            } else if (this.A01.A03.A0F(this.A00) != null) {
                precacheResult = true;
            }
            SL sl2 = this.A00.A01;
            if (sl2 != null && sl2.A02()) {
                int iA00 = sl2.A00();
                int iA01 = sl2.A01();
                if (iA00 <= 0 || iA01 <= 0) {
                    if (this.A01.A08) {
                        A04(this.A00.A08, c1346Kv);
                    } else {
                        A03(this.A00.A04, this.A00.A05);
                    }
                } else if (this.A01.A08) {
                    c1346Kv.A00 = iA00;
                    c1346Kv.A01 = iA01;
                    A04(this.A00.A08, c1346Kv);
                } else {
                    A03(iA00, iA01);
                }
            }
            return Boolean.valueOf(precacheResult);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return null;
        }
    }

    private void A03(int i10, int i11) {
        Bitmap bitmapA0G = this.A01.A03.A0G(this.A01.A04, this.A00.A08, i10, i11, this.A00.A02);
        if (bitmapA0G == null) {
            return;
        }
        this.A01.A07.put(this.A00.A08, bitmapA0G);
    }

    private void A04(String str, C1346Kv c1346Kv) {
        Bitmap bitmapA00 = SF.A03(this.A01.A04.A02()).AHu(c1346Kv, true).A00();
        if (bitmapA00 == null) {
            return;
        }
        this.A01.A07.put(str, bitmapA00);
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (AbstractC1616Vl.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return null;
        }
    }
}
