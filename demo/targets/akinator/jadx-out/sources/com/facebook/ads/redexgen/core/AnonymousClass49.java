package com.facebook.ads.redexgen.core;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: com.facebook.ads.redexgen.X.49, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass49 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C4D A00;

    public AnonymousClass49(C4D c4d) {
        this.A00 = c4d;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean is5gNsa = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        this.A00.A07(is5gNsa ? 10 : 5);
    }
}
