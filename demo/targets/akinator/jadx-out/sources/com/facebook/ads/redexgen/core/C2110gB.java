package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.gB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2110gB extends Q8 {
    public C2110gB(QO qo2) {
        super(qo2, null);
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A06() {
        return this.A02.A0Z();
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A07() {
        return this.A02.A0Z() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A09() {
        return this.A02.A0a();
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A0A() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A0B() {
        return (this.A02.A0Z() - this.A02.A0i()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A0C(View view) {
        return this.A02.A0l(view) + ((QP) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A0D(View view) {
        QP qp2 = (QP) view.getLayoutParams();
        return this.A02.A0n(view) + qp2.topMargin + qp2.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A0E(View view) {
        QP qp2 = (QP) view.getLayoutParams();
        return this.A02.A0o(view) + qp2.leftMargin + qp2.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A0F(View view) {
        return this.A02.A0q(view) - ((QP) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A0G(View view) {
        this.A02.A1G(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final int A0H(View view) {
        this.A02.A1G(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.core.Q8
    public final void A0J(int i10) {
        this.A02.A12(i10);
    }
}
