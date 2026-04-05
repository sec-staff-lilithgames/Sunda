package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class S4 {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final S5 A00;
    public final S6 A01;
    public final C1911cu A02;
    public final InterfaceC2041f2 A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = S4.class.getSimpleName();
    }

    public S4(C1911cu c1911cu, InterfaceC1107Bn interfaceC1107Bn, S5 s52, S6 s62) {
        this.A02 = c1911cu;
        this.A03 = interfaceC1107Bn.A5M(EnumC2042f3.A06);
        this.A00 = s52;
        this.A01 = s62;
        this.A03.A3t(new C1972dv(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (!this.A03.AAV()) {
                this.A02.A05().AAF();
                return;
            }
            String btExtras = this.A03.A7a().optString(A00(0, 9, 7));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || U7.A0j(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
