package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0K extends C08310h {
    public C09705s A00;
    public List<C1904cn> A01;

    public C0K(C1937dL c1937dL) {
        super(c1937dL);
        this.A00 = new C09705s(this, 1, null, null, null);
    }

    public final void A20(C2010eX c2010eX) {
        if (this.A00 != null) {
            this.A00.A0c(c2010eX);
        }
    }

    public C09705s getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
