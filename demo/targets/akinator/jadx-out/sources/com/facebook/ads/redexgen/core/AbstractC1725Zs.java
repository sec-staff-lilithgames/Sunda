package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1725Zs {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC1724Zr viewOnClickListenerC1724Zr = new ViewOnClickListenerC1724Zr(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1724Zr);
            view.setOnTouchListener(new ViewOnTouchListenerC1723Zq(viewOnClickListenerC1724Zr));
        }
    }
}
