package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1941dP implements View.OnTouchListener {
    public final /* synthetic */ E1 A00;

    public ViewOnTouchListenerC1941dP(E1 e12) {
        this.A00 = e12;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0C.A02(new DH(view, motionEvent));
        return false;
    }
}
