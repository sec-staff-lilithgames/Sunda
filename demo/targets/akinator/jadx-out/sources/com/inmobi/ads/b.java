package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C2676a1;
import com.inmobi.media.C2693b1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f10, float f11) {
        e0.checkNotNullParameter(animationType, "animationType");
        int i10 = a.f31583a[animationType.ordinal()];
        if (i10 == 1) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i10 == 2) {
            C2676a1 c2676a1 = new C2676a1(f10 / 2.0f, f11 / 2.0f);
            c2676a1.setDuration(500L);
            c2676a1.setFillAfter(false);
            c2676a1.setInterpolator(new AccelerateInterpolator());
            return c2676a1;
        }
        if (i10 != 3) {
            return null;
        }
        C2693b1 c2693b1 = new C2693b1(f10 / 2.0f, f11 / 2.0f);
        c2693b1.setDuration(500L);
        c2693b1.setFillAfter(false);
        c2693b1.setInterpolator(new AccelerateInterpolator());
        return c2693b1;
    }
}
