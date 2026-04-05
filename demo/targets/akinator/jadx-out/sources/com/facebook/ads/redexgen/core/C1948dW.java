package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.dW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1948dW extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C1950dY A01;

    public C1948dW(C1950dY c1950dY, float f10) {
        this.A01 = c1950dY;
        this.A00 = f10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
