package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1866cB implements View.OnTouchListener {
    public static byte[] A01;
    public static String[] A02 = {"1JwnbZc", "kkmIQJqvWiBwk9jfILYgPIrgQCS38owh", "N8yLaPVokkuJ1YkIyuCF7aIX6VfLiVBd", "jm5vdlZ72Lbf6a1gReW0ha76qwb04vv", "DCC4I5JAGBbf78VQRaqWv8G", "3hSFZU1sfTZMtq4oO1UMPPTcQg0VdY6I", "fV1nhS4pYMKgLfTP54XPcsPXLQx3eWXA", "qgSXXDY"};
    public final /* synthetic */ C4Z A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 14, 0, 13, -6, -2, 7, 4, -2, 6, -6, 4, -4, -3, -12, -14, -28, -15, -34, -22, -28, -8, -17, -32, -29, -34, -30, -21, -24, -30, -22, -34, -24, -32, -31};
    }

    static {
        A01();
    }

    public ViewOnTouchListenerC1866cB(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.A00.A0O || this.A00.A09 == null) {
                    return false;
                }
                C4Z c4z = this.A00;
                if (A02[6].charAt(16) == 'R') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[0] = "d6v6uEk";
                strArr[7] = "mdHpVNv";
                if (c4z.A09.isAcceptingText()) {
                    this.A00.A0O = true;
                    this.A00.A0i(A00(14, 21, 98));
                    return false;
                }
                return false;
            case 1:
                C4Z.A07(this.A00);
                boolean z10 = this.A00.A0N;
                if (A02[2].charAt(15) != 'o') {
                    String[] strArr2 = A02;
                    strArr2[0] = "JX78O96";
                    strArr2[7] = "bIdbL9K";
                    if (!z10 && this.A00.A07 >= 5) {
                        this.A00.A0N = true;
                        this.A00.A0i(A00(0, 14, 126));
                        return false;
                    }
                    return false;
                }
                throw new RuntimeException();
            default:
                return false;
        }
    }
}
