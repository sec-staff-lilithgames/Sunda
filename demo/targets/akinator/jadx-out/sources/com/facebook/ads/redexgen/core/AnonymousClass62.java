package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.62, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass62 extends DV {
    public final /* synthetic */ C1376Lz A00;

    public AnonymousClass62(C1376Lz c1376Lz) {
        this.A00 = c1376Lz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw2) {
        new Handler(Looper.getMainLooper()).post(new Y4(this));
    }
}
