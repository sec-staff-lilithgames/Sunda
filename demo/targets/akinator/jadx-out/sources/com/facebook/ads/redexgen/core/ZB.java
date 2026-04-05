package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZB implements View.OnTouchListener {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                XP.A0K(view, ZH.A0H);
                return false;
            case 1:
                XP.A0K(view, 0);
                return false;
            default:
                return false;
        }
    }
}
