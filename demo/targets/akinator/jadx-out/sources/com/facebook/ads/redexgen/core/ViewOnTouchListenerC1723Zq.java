package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1723Zq implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC1724Zr A00;

    public ViewOnTouchListenerC1723Zq(ViewOnClickListenerC1724Zr viewOnClickListenerC1724Zr) {
        this.A00 = viewOnClickListenerC1724Zr;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
