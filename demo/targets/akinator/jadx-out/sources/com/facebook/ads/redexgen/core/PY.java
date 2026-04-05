package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class PY extends AccessibilityNodeProvider {
    public final /* synthetic */ PZ A00;

    public PY(PZ pz) {
        this.A00 = pz;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        return (AccessibilityNodeInfo) this.A00.A58(i10);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
        return this.A00.A6Q(str, i10);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        return (AccessibilityNodeInfo) this.A00.A6R(i10);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        return this.A00.AGB(i10, i11, bundle);
    }
}
