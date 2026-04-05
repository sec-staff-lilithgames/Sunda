package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1763aW implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"OcC8Yw10ta4EzUHryW8qF9f8Kw9JuvuB", "8f8LYzxOMmLQdsAhKRfNVONBERHkcGt2", "CzyGp", "2PtxVvqYppmcLS4cwbsjetyeZ5i3nCKD", "x35AdtEajADMGuwsONv03k5bW5eRm", "TNmYMyEiRrCRNh2BAihsQXhXdDRTY", "KzXNDxf0CUBsvqnb9B4FND8KZCDQkeqp", "bZ2905qMAeosph8FN3SjH9j5ipegj0aG"};
    public final /* synthetic */ C1322Jx A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 58, 54, 48, 50};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1763aW(C1322Jx c1322Jx) {
        this.A00 = c1322Jx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 85));
            if (((AbstractC1771ae) this.A00).A06.A0E() != null) {
                ((AbstractC1771ae) this.A00).A06.A0E().ABr();
            }
        } catch (Throwable th2) {
            if (A02[1].charAt(21) != 'O') {
                throw new RuntimeException();
            }
            A02[2] = "i9GBCPULPHC1kq3f4RL3YMSEVPUJV";
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
