package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: com.facebook.ads.redexgen.X.gY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2132gY extends C1432Og {
    @Override // com.facebook.ads.redexgen.core.C1432Og
    public final View.AccessibilityDelegate A00(AbstractC1433Oh abstractC1433Oh) {
        return new C1430Oe(this, abstractC1433Oh);
    }

    @Override // com.facebook.ads.redexgen.core.C1432Og
    public final PU A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new PU(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C1432Og
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
    }
}
