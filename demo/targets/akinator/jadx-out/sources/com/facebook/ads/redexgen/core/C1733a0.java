package com.facebook.ads.redexgen.core;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.a0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1733a0 implements LayoutTransition.TransitionListener {
    public final /* synthetic */ C1734a1 A00;

    public C1733a0(C1734a1 c1734a1) {
        this.A00 = c1734a1;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        ((AbstractC1728Zv) this.A00.A00.A00).A09.setAlpha(1.0f);
        this.A00.A00.A00.A0Q.setAlpha(1.0f);
        this.A00.A00.A00.A0P.setAlpha(1.0f);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
    }
}
