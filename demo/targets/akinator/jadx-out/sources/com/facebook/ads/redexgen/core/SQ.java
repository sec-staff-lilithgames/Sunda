package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public class SQ extends ContextWrapper {
    public final SS A00;
    public final AtomicReference<String> A01;

    public SQ(Context context, SS ss) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = ss;
    }

    public final LL A00(SQ sq2) {
        return this.A00.A84(sq2);
    }

    public final SJ A01() {
        return this.A00.A78();
    }

    public final C1911cu A02() {
        return this.A00.A8r(this);
    }

    public final SR A03() {
        return this.A00.A6w(this);
    }

    public final ST A04() {
        return this.A00.A7p(this);
    }

    public final SV A05() {
        return this.A00.A8q(this);
    }

    public final SW A06() {
        return this.A00.A97();
    }

    public final InterfaceC1536Sh A07() {
        return this.A00.A7d(this);
    }

    public final InterfaceC1549Su A08() {
        return this.A00.A7f(this);
    }

    public final TP A09() {
        return this.A00.A8y();
    }

    public final US A0A() {
        return this.A00.A6f(A02());
    }

    public final InterfaceC1584Ue A0B() {
        return this.A00.A8s(A02());
    }

    public final String A0C() {
        return this.A01.get();
    }

    public final void A0D(String str) {
        this.A01.set(str);
    }
}
