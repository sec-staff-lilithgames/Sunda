package com.inmobi.media;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.b9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2701b9 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f32688a;

    public C2701b9(C2735d9 view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f32688a = new WeakReference(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        C2735d9 c2735d9 = (C2735d9) this.f32688a.get();
        if (c2735d9 == null) {
            return;
        }
        int visibility = c2735d9.getVisibility();
        if (visibility == 4 || visibility == 8) {
            kotlin.jvm.internal.e0.checkNotNull(animation.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            if (((Float) r6).floatValue() >= 1.0d) {
                c2735d9.a();
                return;
            }
            return;
        }
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.e0.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c2735d9.f32777l = 360 * ((Float) animatedValue).floatValue();
        c2735d9.invalidate();
    }
}
