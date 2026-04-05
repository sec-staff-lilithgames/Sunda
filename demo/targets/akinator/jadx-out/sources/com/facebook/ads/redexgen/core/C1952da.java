package com.facebook.ads.redexgen.core;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.da, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1952da extends ContentObserver {
    public final C1146Dc A00;

    public C1952da(Handler handler, C1146Dc c1146Dc) {
        super(handler);
        this.A00 = c1146Dc;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0f();
    }
}
