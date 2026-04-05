package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class LW implements InterfaceC1686Yf {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ AbstractC1684Yd A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, 13, 15, 76, 4, 3, 1, 7, 0, 13, 13, 9, 76, 3, 6, 17, 76, 3, 6, 16, 7, 18, 13, 16, 22, 11, 12, 5, 76, 36, 43, 44, 43, 49, 42, 61, 35, 38, 61, 48, 39, 50, 45, 48, 54, 43, 44, 37, 61, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public LW(AbstractC1684Yd abstractC1684Yd) {
        this.A00 = abstractC1684Yd;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686Yf
    public final void A4v() {
        if (this.A00.A07 == null) {
            return;
        }
        this.A00.A07.A4b(A00(0, 53, 115));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686Yf
    public final void A4w() {
        this.A00.A0O();
        if (this.A00.A08 != null) {
            this.A00.A08.AF0(true);
        }
        this.A00.A0D();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686Yf
    public final void A9U() {
        if (this.A00.A03 == null) {
            A4w();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        AbstractC1684Yd.A03(this.A00);
        if (this.A00.A03.A02() == null) {
            this.A00.A0E();
        } else {
            this.A00.A0G(this.A00.A03.A02());
        }
        if (U7.A2S(this.A00.A05)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686Yf
    public final void AAg() {
        if (!TextUtils.isEmpty(this.A00.A04.A0I())) {
            WN.A0O(new WN(), this.A00.A05, WQ.A00(this.A00.A04.A0I()), this.A00.A09);
        }
        this.A00.A02.A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686Yf
    public final void AAh() {
        this.A00.A0O();
        if (this.A00.A08 != null) {
            this.A00.A08.AF0(true);
        }
        if (!TextUtils.isEmpty(this.A00.A04.A0C())) {
            WN.A0O(new WN(), this.A00.A05, WQ.A00(this.A00.A04.A0C()), this.A00.A09);
        }
        this.A00.A02.A06();
        this.A00.A0D();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686Yf
    public final void AEC(O4 o42) {
        O6 o6A0B;
        AbstractC1684Yd.A02(this.A00);
        this.A00.A01 = o42;
        if (this.A00.A01 != O4.A04) {
            AbstractC1684Yd abstractC1684Yd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                o6A0B = abstractC1684Yd.A04.A0B();
            } else {
                o6A0B = abstractC1684Yd.A04.A0B();
            }
        } else {
            o6A0B = this.A00.A04.A0A();
        }
        AbstractC1684Yd abstractC1684Yd2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC1684Yd2.A0G(o6A0B);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686Yf
    public final void AEP(O6 o62) {
        AbstractC1684Yd.A02(this.A00);
        this.A00.A02.A07(o62.A01());
        if (!o62.A05().isEmpty()) {
            AbstractC1684Yd abstractC1684Yd = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC1684Yd.A0G(o62);
            return;
        }
        this.A00.A0F(o62);
    }
}
