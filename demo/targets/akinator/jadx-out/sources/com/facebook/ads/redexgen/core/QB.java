package com.facebook.ads.redexgen.core;

import android.view.animation.Interpolator;

/* loaded from: assets/audience_network.dex */
public class QB implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        float f11 = f10 - 1.0f;
        return (f11 * f11 * f11 * f11 * f11) + 1.0f;
    }
}
