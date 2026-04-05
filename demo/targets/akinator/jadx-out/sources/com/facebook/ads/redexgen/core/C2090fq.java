package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2090fq extends MQ {
    public static byte[] A03;
    public static String[] A04 = {"G2rh", "Fb5x", "6CyVQJjLjUxkB4NOtEwwqOuY7kB2daf", "v2svMG5ZVzKjVXyH1MXvdM9krQWCKsNq", "oRWr7RpHwOoI3beQIRyDA09DO9LlUwST", "SjgxBMhR0kRV74MEQavsGpgIJGrbvWLl", "8l9W", "lapvzpZuNASF"};
    public View A00;
    public final C1503Qz A01;
    public final C6M A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {69, 103, 104, 104, 105, 114, 38, 118, 116, 99, 117, 99, 104, 114, 38, 104, 115, 106, 106, 38, 103, 98, 80, 111, 99, 113};
        if (A04[7].length() == 31) {
            throw new RuntimeException();
        }
        A04[0] = "ScK1";
        A03 = bArr;
    }

    static {
        A03();
    }

    public C2090fq(C1503Qz c1503Qz) {
        this.A02 = c1503Qz.A09();
        this.A01 = c1503Qz;
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0C() {
        this.A02.A0F().A4M();
        AbstractC1615Vk.A00(new C2092fs(this));
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0D() {
        this.A02.A0F().A4P();
        AbstractC1615Vk.A00(new C2091fr(this));
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0E(View view) {
        if (view != null) {
            C6M c6m = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A04[0] = "eqHc";
            c6m.A0F().A4O();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if ((this.A00 instanceof C1333Ki) || (this.A00 instanceof Y9)) {
                V8.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            AnonymousClass72 controller = this.A01.A08();
            if (controller != null) {
                controller.A0L();
            }
            AbstractC1615Vk.A00(new C2093ft(this));
            this.A01.A0B(this.A01.A07(), this.A00);
            if (U7.A1B(this.A01.A07().getContext())) {
                C1719Zm c1719Zm = new C1719Zm();
                this.A01.A0D(c1719Zm);
                c1719Zm.A0C(this.A01.getPlacementId());
                c1719Zm.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0J() != null) {
                    c1719Zm.A09(this.A01.A08().A0J().A0C());
                }
                if (this.A00 instanceof C1333Ki) {
                    c1719Zm.A0A(((C1333Ki) this.A00).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new R7(this, c1719Zm));
                this.A00.getOverlay().add(c1719Zm);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 22));
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0F(MP mp2) {
        this.A02.A0F().A4N(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0G(V1 v12) {
        this.A02.A0F().A3F(XG.A01(this.A01.A04()), v12.A03().getErrorCode(), v12.A04());
        AbstractC1615Vk.A00(new C2094fu(this, v12));
    }
}
