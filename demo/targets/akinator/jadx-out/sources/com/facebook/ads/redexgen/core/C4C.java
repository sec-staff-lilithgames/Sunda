package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.ads.redexgen.X.4C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4C extends BroadcastReceiver {
    public final /* synthetic */ C4D A00;

    public C4C(C4D c4d) {
        this.A00 = c4d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iA00 = C4D.A00(context);
        if (AbstractC09264a.A02 >= 31 && iA00 == 5) {
            C4A.A02(context, this.A00);
        } else {
            this.A00.A07(iA00);
        }
    }
}
