package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1684Yd extends FrameLayout {
    public static String[] A0C = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public O4 A01;
    public O5 A02;
    public O6 A03;
    public final O2 A04;
    public final C1937dL A05;
    public final US A06;
    public final InterfaceC1668Xn A07;
    public final InterfaceC1669Xo A08;
    public final String A09;
    public final N9 A0A;
    public final InterfaceC1686Yf A0B;

    public abstract void A0N();

    public abstract void A0O();

    public abstract void A0P(O6 o62, O4 o42);

    public abstract void A0Q(O6 o62, O4 o42);

    public abstract boolean A0R();

    public AbstractC1684Yd(C1937dL c1937dL, US us, String str) {
        this(c1937dL, us, str, null, null, null);
    }

    public AbstractC1684Yd(C1937dL c1937dL, US us, String str, N9 n9, InterfaceC1669Xo interfaceC1669Xo, InterfaceC1668Xn interfaceC1668Xn) {
        super(c1937dL);
        this.A00 = 0;
        this.A01 = O4.A05;
        this.A03 = null;
        this.A0B = new LW(this);
        this.A05 = c1937dL;
        this.A06 = us;
        this.A08 = interfaceC1669Xo;
        this.A07 = interfaceC1668Xn;
        this.A09 = str;
        this.A0A = n9;
        this.A04 = O3.A00(this.A05.A02());
    }

    public static /* synthetic */ int A02(AbstractC1684Yd abstractC1684Yd) {
        int i10 = abstractC1684Yd.A00;
        abstractC1684Yd.A00 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A03(AbstractC1684Yd abstractC1684Yd) {
        int i10 = abstractC1684Yd.A00;
        abstractC1684Yd.A00 = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        if (this.A02.A0A()) {
            this.A06.AAp(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        this.A03 = null;
        this.A02.A05();
        A0N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(O6 o62) {
        this.A02.A08(this.A01);
        A0P(o62, this.A01);
        MW.A01(this.A05).A0L();
        if (A0R()) {
            A0D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(O6 o62) {
        this.A03 = o62;
        this.A02.A09(this.A01, this.A00);
        A0Q(o62, this.A01);
    }

    public final void A0L() {
        A0D();
    }

    public final void A0M() {
        this.A02 = new O5(new C1580Ua(this.A09, this.A06));
        if (this.A08 != null) {
            InterfaceC1669Xo interfaceC1669Xo = this.A08;
            if (A0C[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0C[7] = "FLAi4P2";
            interfaceC1669Xo.AEV(true);
        }
        A0E();
    }
}
