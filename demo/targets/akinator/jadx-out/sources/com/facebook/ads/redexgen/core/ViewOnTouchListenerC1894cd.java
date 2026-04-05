package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1894cd implements View.OnTouchListener {
    public final /* synthetic */ C09173r A00;

    public ViewOnTouchListenerC1894cd(C09173r c09173r) {
        this.A00 = c09173r;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getX() >= this.A00.A0H.getX() && motionEvent.getX() <= this.A00.A0H.getX() + this.A00.A0H.getWidth() && motionEvent.getY() >= this.A00.A0H.getY() && motionEvent.getY() <= this.A00.A0H.getY() + this.A00.A0H.getHeight()) {
            if (this.A00.A03 != null) {
                this.A00.A03.dispatchTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }
}
