package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1915cy implements View.OnTouchListener {
    public final /* synthetic */ C1916cz A00;

    public ViewOnTouchListenerC1915cy(C1916cz c1916cz) {
        this.A00 = c1916cz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1916cz.A00(this.A00);
            this.A00.A07.ABJ(this.A00.A04.A25(), new C1722Zp().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
