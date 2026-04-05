package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.applovin.shadow.okio.Segment;

/* renamed from: com.facebook.ads.redexgen.X.gV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2129gV extends AbstractC1433Oh {
    public static String[] A01 = {"gP5iRBNUcEm4", "hagqDV25a6ynaoYCoJf0l9z0sKG8jhWl", "ooYhQl9ZMyV9UByvd6u2ZbJwINTXZRCk", "quE", "9rQMt62DD9QRN345Nnq0LTFFdDUm2qAK", "qEkkF74LDRYf2iXVehyp9KJG4XjlQH4Q", "6Z5psXCaQYJ6H", "E0d3lf1uFrHxpWzWCxHKFqknJeusaBoL"};
    public final /* synthetic */ PH A00;

    public C2129gV(PH ph2) {
        this.A00 = ph2;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A01() > 1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1433Oh
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(PH.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A01());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1433Oh
    public final void A08(View view, PS ps) {
        super.A08(view, ps);
        ps.A0O(PH.class.getName());
        ps.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            if (A01[3].length() != 3) {
                throw new RuntimeException();
            }
            A01[1] = "jglgbim5NCizxs0Sda1mccX23gBCKHWl";
            ps.A0N(4096);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            ps.A0N(Segment.SIZE);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1433Oh
    public final boolean A09(View view, int i10, Bundle bundle) throws Resources.NotFoundException {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        switch (i10) {
            case 4096:
                if (!this.A00.canScrollHorizontally(1)) {
                    return false;
                }
                this.A00.setCurrentItem(this.A00.A00 + 1);
                return true;
            case Segment.SIZE /* 8192 */:
                if (!this.A00.canScrollHorizontally(-1)) {
                    return false;
                }
                this.A00.setCurrentItem(this.A00.A00 - 1);
                return true;
            default:
                return false;
        }
    }
}
