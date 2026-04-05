package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1109Bq extends BroadcastReceiver {
    public final /* synthetic */ C1114Bv A00;

    public C1109Bq(C1114Bv c1114Bv) {
        this.A00 = c1114Bv;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.A00.A03();
    }
}
