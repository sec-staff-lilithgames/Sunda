package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.4p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C09414p extends DV {
    public final /* synthetic */ C09394n A00;

    public C09414p(C09394n c09394n) {
        this.A00 = c09394n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1863c8(this));
    }
}
