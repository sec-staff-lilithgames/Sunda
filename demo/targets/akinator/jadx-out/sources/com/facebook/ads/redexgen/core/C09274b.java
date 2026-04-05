package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.4b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C09274b extends DV {
    public final /* synthetic */ C4Z A00;

    public C09274b(C4Z c4z) {
        this.A00 = c4z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1871cG(this));
    }
}
