package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: assets/audience_network.dex */
public class OL extends Handler {
    public final /* synthetic */ OO A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OL(OO oo2, Looper looper) {
        super(looper);
        this.A00 = oo2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.A00.A02();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
