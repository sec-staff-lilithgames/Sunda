package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.g1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2101g1 extends AbstractC1433Oh {
    public final AbstractC1433Oh A00 = new C2102g2(this);
    public final C09846g A01;

    public C2101g1(C09846g c09846g) {
        this.A01 = c09846g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1433Oh
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C09846g.class.getName());
        if ((view instanceof C09846g) && !A0B()) {
            C09846g c09846g = (C09846g) view;
            if (c09846g.getLayoutManager() != null) {
                c09846g.getLayoutManager().A1v(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1433Oh
    public final void A08(View view, PS ps) {
        super.A08(view, ps);
        ps.A0O(C09846g.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1H(ps);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1433Oh
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1X(i10, bundle);
        }
        return false;
    }

    public final AbstractC1433Oh A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
