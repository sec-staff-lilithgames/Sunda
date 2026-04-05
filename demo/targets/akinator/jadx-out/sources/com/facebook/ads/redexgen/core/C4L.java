package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.4L, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4L extends DV {
    public final /* synthetic */ C4K A00;

    public C4L(C4K c4k) {
        this.A00 = c4k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1879cO(this));
    }
}
