package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ZM implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ ZO A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, 16, 29, 19, 33, 30, 24, 19, -35, 24, 29, 35, 20, 29, 35, -35, 16, 18, 35, 24, 30, 29, -35, 5, -8, -12, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A00.A07) && !A00(0, 11, 12).equals(this.A00.A07)) {
                Intent intent = new Intent(A00(22, 26, 51), WQ.A00(this.A00.A07));
                intent.addFlags(268435456);
                this.A00.A0A.A0F().A9q();
                try {
                    WB.A0D(this.A00.A0A, intent);
                    this.A00.A05.AEL();
                } catch (W9 e10) {
                    Throwable cause = e10.getCause();
                    Throwable cause2 = e10;
                    if (cause != null) {
                        cause2 = e10.getCause();
                    }
                    this.A00.A0A.A08().AAy(A00(11, 11, 3), AbstractC1550Sv.A00, new C1551Sw(cause2));
                }
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    public ZM(ZO zo2) {
        this.A00 = zo2;
    }
}
