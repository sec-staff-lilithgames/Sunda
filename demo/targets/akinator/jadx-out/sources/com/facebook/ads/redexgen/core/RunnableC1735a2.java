package com.facebook.ads.redexgen.core;

import android.animation.ObjectAnimator;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1735a2 implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C09685q A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{12, 1, 29, 5, 12};
    }

    public RunnableC1735a2(C09685q c09685q) {
        this.A00 = c09685q;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA00 = A00(0, 5, 64);
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0T.A0F().AJx();
            ObjectAnimator.ofFloat(this.A00.A0Q, strA00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator.ofFloat(this.A00.A0P, strA00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator duration = ObjectAnimator.ofFloat(((AbstractC1728Zv) this.A00).A09, strA00, 1.0f, 0.0f).setDuration(100L);
            duration.addListener(new C1734a1(this));
            duration.start();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
