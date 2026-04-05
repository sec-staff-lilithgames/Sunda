package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* loaded from: assets/audience_network.dex */
public abstract class EK {
    public EJ A00;
    public EU A01;

    public abstract boolean A0Y();

    public abstract EL A0b(C7D[] c7dArr, C2451mA c2451mA, C2461mL c2461mL, Timeline timeline) throws C9Y;

    public abstract void A0c(Object obj);

    public final EU A00() {
        return (EU) C3M.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AFT();
        }
    }

    public final void A02(EJ ej2, EU eu2) {
        this.A00 = ej2;
        this.A01 = eu2;
    }
}
