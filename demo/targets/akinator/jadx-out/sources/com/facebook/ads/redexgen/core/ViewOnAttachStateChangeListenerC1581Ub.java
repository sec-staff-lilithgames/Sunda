package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ub, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC1581Ub implements View.OnAttachStateChangeListener {
    public final /* synthetic */ UZ A00;
    public final /* synthetic */ C1580Ua A01;

    public ViewOnAttachStateChangeListenerC1581Ub(C1580Ua c1580Ua, UZ uz) {
        this.A01 = c1580Ua;
        this.A00 = uz;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
