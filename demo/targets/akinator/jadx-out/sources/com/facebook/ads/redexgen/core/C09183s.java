package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.3s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C09183s extends DV {
    public final /* synthetic */ C09173r A00;

    public C09183s(C09173r c09173r) {
        this.A00 = c09173r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1893cc(this));
    }
}
